package com.nurtaz.dev.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView t1,t2;
    Animation animation;
    Animation animationTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        animation = AnimationUtils.loadAnimation(this,R.anim.animate_btn);
        animationTxt = AnimationUtils.loadAnimation(this,R.anim.anme_txt);
        btn.setAnimation(animation);
        t1.setAnimation(animationTxt);
        t2.setAnimation(animationTxt);

    }
}