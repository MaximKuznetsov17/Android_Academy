package com.example.maks.lesson_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    public static void start(Activity activity) {
        Intent secondActivityIntent = new Intent(activity, SecondActivity.class);
        activity.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openMainActivity(View view) {
        MainActivity.start(this);
    }
}
