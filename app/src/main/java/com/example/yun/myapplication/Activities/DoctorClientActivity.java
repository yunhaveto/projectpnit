package com.example.yun.myapplication.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.yun.myapplication.Entities.Medic;
import com.example.yun.myapplication.R;
import com.example.yun.myapplication.Retrofit.NetworkService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorClientActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorclient);

        Typeface font = Typeface.createFromAsset(getAssets(), "Montserrat-Italic.ttf");
//        ((TextView) findViewById(R.id.docorclientDoctorText)).setTypeface(font);
//        ((TextView) findViewById(R.id.docorclientPatientText)).setTypeface(font);

        findViewById(R.id.whitePanelDoctor).setOnClickListener(v -> {
            Intent intent = new Intent(this, EditProfileActivity.class);
            startActivity(intent);
        });

        /*findViewById(R.id.docorclientBottomFrameLayout).setOnClickListener(v -> {
            Intent intent = new Intent(this, EditPatientProfileActivity.class);
            startActivity(intent);
        });*/
    }
}
