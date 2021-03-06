package com.example.oppelsa.sound2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.oppelsa.sound2.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity_main2 (View view) {
       Intent myIntent = new Intent(this,Main2Activity.class);
       startActivity(myIntent);
    }

    public void sound (View view) {
        MediaPlayer piano = MediaPlayer.create(getApplicationContext(), R.raw.piano);
        piano.start();
    }

    public void email(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        //Below adds to the email to me
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sjoppel@gmail.com"}); // recipients
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sound App");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Listen to my groovy sound!");

        startActivity(emailIntent);
    }
}
