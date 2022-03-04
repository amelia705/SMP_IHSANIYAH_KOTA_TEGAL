package com.example.smpihsaniyahkotategal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.headerihs,
            R.drawable.headergaleri1,
            R.drawable.headerihs2,
            R.drawable.poster1,
            R.drawable.poster2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void pramuka(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, VollyActivity.class);
        startActivity(intent);
    }

    public void karate(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, KarateActivity.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(com.example.smpihsaniyahkotategal.EkskulActivity.this, BasketActivity.class);
        startActivity(intent);
    }
}