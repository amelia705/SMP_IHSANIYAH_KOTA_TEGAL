package com.example.smpihsaniyahkotategal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class GaleriActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }

    public void albumpelantikanosis(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumOsisActivity.class);
        startActivity(intent);
    }

    public void albumperpisahan(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumPerpisahanActivity.class);
        startActivity(intent);
    }

    public void albumkegiatankemahbudaya(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumKemahBudayaActivity.class);
        startActivity(intent);
    }

    public void albumkegiatanhutpgri(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumHutPgriActivity.class);
        startActivity(intent);
    }

    public void albumkegiatanvaksinisasi(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumVaksinActivity.class);
        startActivity(intent);
    }
}