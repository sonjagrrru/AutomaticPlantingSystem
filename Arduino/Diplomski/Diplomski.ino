#include <LiquidCrystal.h>
#include <DHT.h>

const int rs = 12, en = 11, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
DHT dht(7, DHT11);

int secondCounter = 0;
bool isWatered = false;
int lightPin = 8;
int waterPin = 6;
String command;
bool autoWatering = false;
bool autoBrightness = false;
int counter = 0;
bool lightOn = false;
int displayText = 0;

int optimalSoilmoisture = 50;
int optimalBrightness = 50;

bool firstDigit = false;
bool secondDigit = false;
bool lightOperation = false;

void setup() {
  // initialize serial communication at 9600 bits per second:
  Serial.begin(9600);
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 2);
  pinMode(lightPin, OUTPUT);
  pinMode(waterPin, OUTPUT);
  dht.begin();
}

void loop() {
  double sensorValue = analogRead(A0);
  sensorValue = sensorValue / 1023 * 100;
  int brightness = 100 - (int)sensorValue;
  float hum = dht.readHumidity();
  float temp = dht.readTemperature();
  int tempInCelsius = (int)dht.computeHeatIndex(temp, hum, false);
  sensorValue = analogRead(A1);
  sensorValue = sensorValue / 1023 * 100;
  int soilMoisture = 100 - (int)sensorValue;

  if(Serial.available()>0){
    command = Serial.read();
    if(firstDigit){
      if(lightOperation){
        optimalBrightness = command.toInt() - 48;
      }
      else{
        optimalSoilmoisture = command.toInt() - 48;
      }
      firstDigit = false;
      secondDigit = true;
    }
    else if (secondDigit){
      if(lightOperation){
        optimalBrightness = optimalBrightness + (command.toInt() - 48)*10;
        autoBrightness = true;
      }
      else{
        optimalSoilmoisture = optimalSoilmoisture + (command.toInt() - 48)*10;
        autoWatering = true;
      }
      secondDigit = false;
      lightOperation = false;
    }
    else if(command.equals("49")){ //auto watering
      firstDigit = true;
    }
    else if(command.equals("50")){ //water now
      autoWatering = false;
      isWatered = true;
      digitalWrite(waterPin, HIGH);
      delay(4000);
      digitalWrite(waterPin, LOW);
    }
    else if(command.equals("51")){ //auto lightening
      firstDigit = true;
      lightOperation = true;
    }
    else if(command.equals("52")){//light now
      autoBrightness = false;
      if(!lightOn){
        lightOn = true;
        digitalWrite(lightPin, HIGH);
      }
      else{
        lightOn = false;
        digitalWrite(lightPin, LOW);
      }
    }
    else if(command.equals("48")){
      Serial.write("123456");
    }
  }

  if(autoWatering){
    if(optimalSoilmoisture-soilMoisture>20 && !isWatered){
        digitalWrite(waterPin, HIGH);
        delay(2000);
        digitalWrite(waterPin, LOW);
        isWatered = true;
    }
  }

  if(autoBrightness){
    if(optimalBrightness-brightness>20){
        digitalWrite(lightPin, HIGH);
        lightOn = true;
    }
    else if(optimalBrightness - brightness < -20){
      digitalWrite(lightPin, LOW);
      lightOn = false;
    }
  }

  counter = counter + 1;
  if(counter==5000){
    counter = 0;
    secondCounter = secondCounter + 1;
    displayText = (displayText + 1) % 3;
    printOnDisplay(brightness, tempInCelsius, soilMoisture);
  }
  if(secondCounter==17280){//a day
    secondCounter = 0;
    isWatered = false;
  }
}

void printOnDisplay(int brightness, int tempInCelsius, int soilMoisture){
  lcd.clear();
  lcd.home();
  if(displayText == 0){
    lcd.print("Osvetljenje: ");
    lcd.print(brightness);
    lcd.print("%");
  }
  else if(displayText == 1){
    lcd.print("Temperatura:");
    lcd.print(tempInCelsius);
    lcd.print((char)223);
    lcd.print("C");
  }
  else if(displayText == 2){
    lcd.print("Vlaznost: ");
    lcd.print(soilMoisture);
    lcd.print("%");
  }
}
