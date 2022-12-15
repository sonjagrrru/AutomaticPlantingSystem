package com.example.smartgarden.data.plant;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlantDAO_Impl implements PlantDAO {
  private final RoomDatabase __db;

  public PlantDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public LiveData<List<Plant>> readAllData() {
    final String _sql = "SELECT * FROM plants ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"plants"}, false, new Callable<List<Plant>>() {
      @Override
      public List<Plant> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "caption");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfOptimalMinTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalMinTemperature");
          final int _cursorIndexOfOptimalMaxTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalMaxTemperature");
          final int _cursorIndexOfOptimalSoilMoisture = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalSoilMoisture");
          final int _cursorIndexOfOptimalBrightness = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalBrightness");
          final int _cursorIndexOfStartFlowering = CursorUtil.getColumnIndexOrThrow(_cursor, "startFlowering");
          final int _cursorIndexOfEndFlowering = CursorUtil.getColumnIndexOrThrow(_cursor, "endFlowering");
          final int _cursorIndexOfImgName = CursorUtil.getColumnIndexOrThrow(_cursor, "imgName");
          final int _cursorIndexOfMiniCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "miniCaption");
          final List<Plant> _result = new ArrayList<Plant>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Plant _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpCaption;
            if (_cursor.isNull(_cursorIndexOfCaption)) {
              _tmpCaption = null;
            } else {
              _tmpCaption = _cursor.getString(_cursorIndexOfCaption);
            }
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final int _tmpOptimalMinTemperature;
            _tmpOptimalMinTemperature = _cursor.getInt(_cursorIndexOfOptimalMinTemperature);
            final int _tmpOptimalMaxTemperature;
            _tmpOptimalMaxTemperature = _cursor.getInt(_cursorIndexOfOptimalMaxTemperature);
            final int _tmpOptimalSoilMoisture;
            _tmpOptimalSoilMoisture = _cursor.getInt(_cursorIndexOfOptimalSoilMoisture);
            final int _tmpOptimalBrightness;
            _tmpOptimalBrightness = _cursor.getInt(_cursorIndexOfOptimalBrightness);
            final String _tmpStartFlowering;
            if (_cursor.isNull(_cursorIndexOfStartFlowering)) {
              _tmpStartFlowering = null;
            } else {
              _tmpStartFlowering = _cursor.getString(_cursorIndexOfStartFlowering);
            }
            final String _tmpEndFlowering;
            if (_cursor.isNull(_cursorIndexOfEndFlowering)) {
              _tmpEndFlowering = null;
            } else {
              _tmpEndFlowering = _cursor.getString(_cursorIndexOfEndFlowering);
            }
            final String _tmpImgName;
            if (_cursor.isNull(_cursorIndexOfImgName)) {
              _tmpImgName = null;
            } else {
              _tmpImgName = _cursor.getString(_cursorIndexOfImgName);
            }
            final String _tmpMiniCaption;
            if (_cursor.isNull(_cursorIndexOfMiniCaption)) {
              _tmpMiniCaption = null;
            } else {
              _tmpMiniCaption = _cursor.getString(_cursorIndexOfMiniCaption);
            }
            _item = new Plant(_tmpId,_tmpName,_tmpCaption,_tmpAge,_tmpOptimalMinTemperature,_tmpOptimalMaxTemperature,_tmpOptimalSoilMoisture,_tmpOptimalBrightness,_tmpStartFlowering,_tmpEndFlowering,_tmpImgName,_tmpMiniCaption);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Plant> findById(final int myID) {
    final String _sql = "SELECT * FROM plants WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, myID);
    return __db.getInvalidationTracker().createLiveData(new String[]{"plants"}, false, new Callable<Plant>() {
      @Override
      public Plant call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "caption");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfOptimalMinTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalMinTemperature");
          final int _cursorIndexOfOptimalMaxTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalMaxTemperature");
          final int _cursorIndexOfOptimalSoilMoisture = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalSoilMoisture");
          final int _cursorIndexOfOptimalBrightness = CursorUtil.getColumnIndexOrThrow(_cursor, "optimalBrightness");
          final int _cursorIndexOfStartFlowering = CursorUtil.getColumnIndexOrThrow(_cursor, "startFlowering");
          final int _cursorIndexOfEndFlowering = CursorUtil.getColumnIndexOrThrow(_cursor, "endFlowering");
          final int _cursorIndexOfImgName = CursorUtil.getColumnIndexOrThrow(_cursor, "imgName");
          final int _cursorIndexOfMiniCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "miniCaption");
          final Plant _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpCaption;
            if (_cursor.isNull(_cursorIndexOfCaption)) {
              _tmpCaption = null;
            } else {
              _tmpCaption = _cursor.getString(_cursorIndexOfCaption);
            }
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final int _tmpOptimalMinTemperature;
            _tmpOptimalMinTemperature = _cursor.getInt(_cursorIndexOfOptimalMinTemperature);
            final int _tmpOptimalMaxTemperature;
            _tmpOptimalMaxTemperature = _cursor.getInt(_cursorIndexOfOptimalMaxTemperature);
            final int _tmpOptimalSoilMoisture;
            _tmpOptimalSoilMoisture = _cursor.getInt(_cursorIndexOfOptimalSoilMoisture);
            final int _tmpOptimalBrightness;
            _tmpOptimalBrightness = _cursor.getInt(_cursorIndexOfOptimalBrightness);
            final String _tmpStartFlowering;
            if (_cursor.isNull(_cursorIndexOfStartFlowering)) {
              _tmpStartFlowering = null;
            } else {
              _tmpStartFlowering = _cursor.getString(_cursorIndexOfStartFlowering);
            }
            final String _tmpEndFlowering;
            if (_cursor.isNull(_cursorIndexOfEndFlowering)) {
              _tmpEndFlowering = null;
            } else {
              _tmpEndFlowering = _cursor.getString(_cursorIndexOfEndFlowering);
            }
            final String _tmpImgName;
            if (_cursor.isNull(_cursorIndexOfImgName)) {
              _tmpImgName = null;
            } else {
              _tmpImgName = _cursor.getString(_cursorIndexOfImgName);
            }
            final String _tmpMiniCaption;
            if (_cursor.isNull(_cursorIndexOfMiniCaption)) {
              _tmpMiniCaption = null;
            } else {
              _tmpMiniCaption = _cursor.getString(_cursorIndexOfMiniCaption);
            }
            _result = new Plant(_tmpId,_tmpName,_tmpCaption,_tmpAge,_tmpOptimalMinTemperature,_tmpOptimalMaxTemperature,_tmpOptimalSoilMoisture,_tmpOptimalBrightness,_tmpStartFlowering,_tmpEndFlowering,_tmpImgName,_tmpMiniCaption);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
