package com.example.smpihsaniyahkotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FasilitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);
    }

    public void Kelas(View view) {
        Intent intent = new Intent(FasilitasActivity.this, KelasActivity.class);
        startActivity(intent);
    }

    public void lapanganbasket(View view) {
        Intent intent = new Intent(FasilitasActivity.this, LapanganbasketActivity.class);
        startActivity(intent);
    }
}