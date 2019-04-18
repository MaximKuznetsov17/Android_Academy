package com.example.maks.lesson_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static void start(Activity activity) {
        Intent secondActivityIntent = new Intent(activity, SecondActivity.class);
        activity.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView author = findViewById(R.id.author);
        author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(v);
            }
        });
    }

    public void openSecondActivity(View view) {
        SecondActivity.start(this);
    }
}
