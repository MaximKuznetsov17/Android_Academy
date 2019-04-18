package com.example.maks.lesson_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maks.lesson_1.Adapter.Adapter;

import java.util.Arrays;
import java.util.Collection;

public class ThirdActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;

    ImageView authorImage;
    ImageView flagImage;
    TextView authorName;
    TextView authorPosition;
    TextView authorLocation;
    Button viewProfile;

    public static void start(Activity activity) {
        Intent secondActivityIntent = new Intent(activity, SecondActivity.class);
        activity.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        authorImage = findViewById(R.id.authorImage);
        flagImage = findViewById(R.id.flagImage);
        authorName = findViewById(R.id.authorName);
        authorPosition = findViewById(R.id.authorPosition);
        authorLocation = findViewById(R.id.authorLocation);
        viewProfile = findViewById(R.id.viewProfile);

        initRecyclerView();
        loadReports();
    }

    public void openMainActivity(View view) {
        MainActivity.start(this);
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
    }

    private void loadReports() {
        Collection<Report> reports = getReports();
        adapter.setItems(reports);
    }

    private Collection<Report> getReports() {
        return Arrays.asList(
                new Report(getResources().getIdentifier("arturvasilov" , "drawable", getPackageName()),
                        getResources().getIdentifier("flag" , "drawable", getPackageName()),
                        "Artur Vasilov", "Senior Android Developer at Яндекс", "St. Petersburg, Russia"),
                new Report(getResources().getIdentifier("tanaypant" , "drawable", getPackageName()),
                        getResources().getIdentifier("flaggermany" , "drawable", getPackageName()),
                        "Tanay Pant", "Engineering Communications Manager at Research Gate", " Berlin, Germany"),
                new Report(getResources().getIdentifier("alexanderefremenko" , "drawable", getPackageName()),
                        getResources().getIdentifier("flag" , "drawable", getPackageName()),
                        "Alexander Efremenkov", "System Android developer at Yandex.Taxi", "Moscow, Russia"),
                new Report(getResources().getIdentifier("doramilitaru" , "drawable", getPackageName()),
                        getResources().getIdentifier("flaggb" , "drawable", getPackageName()),
                        "Dora Militaru", "Senior developer at the Financial Times", "London, The UK"),
                new Report(getResources().getIdentifier("ilyaklymov" , "drawable", getPackageName()),
                        getResources().getIdentifier("flagukraine" , "drawable", getPackageName()),
                        "Ilya Klymov", "CEO at Javascript.Ninja", "Kharkov, Ukraine"),
                new Report(getResources().getIdentifier("ruslankalabaev" , "drawable", getPackageName()),
                        getResources().getIdentifier("flag" , "drawable", getPackageName()),
                        "Ruslan Kalabaev", "Android Developer at Redmadrobot", "St. Petersburg, Russia"),
                new Report(getResources().getIdentifier("sergeyryabov" , "drawable", getPackageName()),
                        getResources().getIdentifier("flag" , "drawable", getPackageName()),
                        "Sergey Ryabov", "Mobile Consultant", "Digital Nomad, Russia"),
                new Report(getResources().getIdentifier("dougsillars" , "drawable", getPackageName()),
                        getResources().getIdentifier("flagusa" , "drawable", getPackageName()),
                        "Doug Sillars", "Performance Engineer (Freelance)", "Digital Nomad, USA"));
    }
}
