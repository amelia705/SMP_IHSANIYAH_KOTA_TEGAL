package com.example.smpihsaniyahkotategal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
    public void profil(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, guruActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

    public void google(View view) {
        goToUrl("https://smpihsaniyahkotategal.sch.id/");
    }
    public void facebook(View view) {
        goToUrl("https://www.facebook.com/SMPIHSANIYAHTEGAL/");
    }

    public void instagram(View view) {
        goToUrl("https://www.instagram.com/smpihsaniyah/");
    }

    public void youtube(View view) {
        goToUrl("https://www.youtube.com/channel/UC3Vui9Wn7t9f-ZfOE_kP7yA");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

