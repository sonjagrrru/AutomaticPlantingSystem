// Generated by view binder compiler. Do not edit!
package com.example.smartgarden.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.smartgarden.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyPlantBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final ConstraintLayout frameLayout5;

  @NonNull
  public final Button myPlantButton;

  @NonNull
  public final TextView plantCaption;

  @NonNull
  public final ImageView plantImage;

  @NonNull
  public final TextView plantName;

  private FragmentMyPlantBinding(@NonNull ConstraintLayout rootView, @NonNull View divider,
      @NonNull View divider2, @NonNull ConstraintLayout frameLayout5, @NonNull Button myPlantButton,
      @NonNull TextView plantCaption, @NonNull ImageView plantImage, @NonNull TextView plantName) {
    this.rootView = rootView;
    this.divider = divider;
    this.divider2 = divider2;
    this.frameLayout5 = frameLayout5;
    this.myPlantButton = myPlantButton;
    this.plantCaption = plantCaption;
    this.plantImage = plantImage;
    this.plantName = plantName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_plant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyPlantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider2;
      View divider2 = ViewBindings.findChildViewById(rootView, id);
      if (divider2 == null) {
        break missingId;
      }

      ConstraintLayout frameLayout5 = (ConstraintLayout) rootView;

      id = R.id.myPlantButton;
      Button myPlantButton = ViewBindings.findChildViewById(rootView, id);
      if (myPlantButton == null) {
        break missingId;
      }

      id = R.id.plantCaption;
      TextView plantCaption = ViewBindings.findChildViewById(rootView, id);
      if (plantCaption == null) {
        break missingId;
      }

      id = R.id.plantImage;
      ImageView plantImage = ViewBindings.findChildViewById(rootView, id);
      if (plantImage == null) {
        break missingId;
      }

      id = R.id.plantName;
      TextView plantName = ViewBindings.findChildViewById(rootView, id);
      if (plantName == null) {
        break missingId;
      }

      return new FragmentMyPlantBinding((ConstraintLayout) rootView, divider, divider2,
          frameLayout5, myPlantButton, plantCaption, plantImage, plantName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}