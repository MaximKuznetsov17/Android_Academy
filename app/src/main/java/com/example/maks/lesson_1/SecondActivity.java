package com.example.maks.lesson_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    public static void start(Activity activity) {
        Intent secondActivityIntent = new Intent(activity, SecondActivity.class);
        activity.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
