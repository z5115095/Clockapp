package com.example.worldclockmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();

    public Button twelvee;
    public Button twentyfoure;
    public ConstraintLayout cit1;
    public ConstraintLayout cit2;
    public ConstraintLayout cit3;
    public ConstraintLayout cit5;
    public ConstraintLayout cit6;
    public ConstraintLayout cit7;
    public TextClock textClock;

//Setting default timezones for each city

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
        String syd12hr = "" + sdf.format(calendar.getTime());
        TextView textView = findViewById(R.id.time1);
        textView.setText(syd12hr);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(etTimeZone);
        String NYTime = "" + sdf.format(calendar.getTime());
        TextView textView2 = findViewById(R.id.time2);
        textView2.setText(NYTime);


        TimeZone berlinTimeZone = TimeZone.getTimeZone("Europe/Berlin");
        sdf.setTimeZone(berlinTimeZone);
        String berlinTime = "" + sdf.format(calendar.getTime());
        TextView textView4 = findViewById(R.id.time5);
        textView4.setText(berlinTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        sdf.setTimeZone(londonTimeZone);
        String londonTime = "" + sdf.format(calendar.getTime());
        TextView textView7 = findViewById(R.id.time6);
        textView7.setText(londonTime);

        TimeZone singaporeTimeZone = TimeZone.getTimeZone("Asia/Singapore");
        sdf.setTimeZone(singaporeTimeZone);
        String singaporeTime = "" + sdf.format(calendar.getTime());
        TextView textView6 = findViewById(R.id.time7);
        textView6.setText(singaporeTime);

        TimeZone shanghaiTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        sdf.setTimeZone(shanghaiTimeZone);
        String shanghaiTime = "" + sdf.format(calendar.getTime());
        TextView textView8 = findViewById(R.id.time8);
        textView8.setText(shanghaiTime);

        TimeZone torontoTimeZone = TimeZone.getTimeZone("Canada/Eastern");
        sdf.setTimeZone(torontoTimeZone);
        String torontoTime = "" + sdf.format(calendar.getTime());
        TextView textView9 = findViewById(R.id.time9);
        textView9.setText(torontoTime);

        TimeZone aucklandTimeZone = TimeZone.getTimeZone("Pacific/Auckland");
        sdf.setTimeZone(aucklandTimeZone);
        String aucklandTime = "" + sdf.format(calendar.getTime());
        TextView textView10 = findViewById(R.id.time10);
        textView10.setText(aucklandTime);
    }

    //button method for setting to twentyfour hour time
    public void twentyfourhrTime (View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String syd12hr = "" + sdf.format(calendar.getTime());
        TextView textView = findViewById(R.id.time1);
        textView.setText(syd12hr);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(etTimeZone);
        String NYTime = "" + sdf.format(calendar.getTime());
        TextView textView2 = findViewById(R.id.time2);
        textView2.setText(NYTime);


        TimeZone berlinTimeZone = TimeZone.getTimeZone("Europe/Berlin");
        sdf.setTimeZone(berlinTimeZone);
        String berlinTime = "" + sdf.format(calendar.getTime());
        TextView textView4 = findViewById(R.id.time5);
        textView4.setText(berlinTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        sdf.setTimeZone(londonTimeZone);
        String londonTime = "" + sdf.format(calendar.getTime());
        TextView textView7 = findViewById(R.id.time6);
        textView7.setText(londonTime);

        TimeZone singaporeTimeZone = TimeZone.getTimeZone("Asia/Singapore");
        sdf.setTimeZone(singaporeTimeZone);
        String singaporeTime = "" + sdf.format(calendar.getTime());
        TextView textView6 = findViewById(R.id.time7);
        textView6.setText(singaporeTime);

        TimeZone shanghaiTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        sdf.setTimeZone(shanghaiTimeZone);
        String shanghaiTime = "" + sdf.format(calendar.getTime());
        TextView textView8 = findViewById(R.id.time8);
        textView8.setText(shanghaiTime);

        TimeZone torontoTimeZone = TimeZone.getTimeZone("Canada/Eastern");
        sdf.setTimeZone(torontoTimeZone);
        String torontoTime = "" + sdf.format(calendar.getTime());
        TextView textView9 = findViewById(R.id.time9);
        textView9.setText(torontoTime);

        TimeZone aucklandTimeZone = TimeZone.getTimeZone("Pacific/Auckland");
        sdf.setTimeZone(aucklandTimeZone);
        String aucklandTime = "" + sdf.format(calendar.getTime());
        TextView textView10 = findViewById(R.id.time10);
        textView10.setText(aucklandTime);
    }

    //button method for setting to twelve hour time
    public void twelvehrTime (View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
        String syd12hr = "" + sdf.format(calendar.getTime());
        TextView textView = findViewById(R.id.time1);
        textView.setText(syd12hr);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(etTimeZone);
        String NYTime = "" + sdf.format(calendar.getTime());
        TextView textView2 = findViewById(R.id.time2);
        textView2.setText(NYTime);


        TimeZone berlinTimeZone = TimeZone.getTimeZone("Europe/Berlin");
        sdf.setTimeZone(berlinTimeZone);
        String berlinTime = "" + sdf.format(calendar.getTime());
        TextView textView4 = findViewById(R.id.time5);
        textView4.setText(berlinTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        sdf.setTimeZone(londonTimeZone);
        String londonTime = "" + sdf.format(calendar.getTime());
        TextView textView7 = findViewById(R.id.time6);
        textView7.setText(londonTime);

        TimeZone singaporeTimeZone = TimeZone.getTimeZone("Asia/Singapore");
        sdf.setTimeZone(singaporeTimeZone);
        String singaporeTime = "" + sdf.format(calendar.getTime());
        TextView textView6 = findViewById(R.id.time7);
        textView6.setText(singaporeTime);

        TimeZone shanghaiTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        sdf.setTimeZone(shanghaiTimeZone);
        String shanghaiTime = "" + sdf.format(calendar.getTime());
        TextView textView8 = findViewById(R.id.time8);
        textView8.setText(shanghaiTime);

        TimeZone torontoTimeZone = TimeZone.getTimeZone("Canada/Eastern");
        sdf.setTimeZone(torontoTimeZone);
        String torontoTime = "" + sdf.format(calendar.getTime());
        TextView textView9 = findViewById(R.id.time9);
        textView9.setText(torontoTime);

        TimeZone aucklandTimeZone = TimeZone.getTimeZone("Pacific/Auckland");
        sdf.setTimeZone(aucklandTimeZone);
        String aucklandTime = "" + sdf.format(calendar.getTime());
        TextView textView10 = findViewById(R.id.time10);
        textView10.setText(aucklandTime);
    }


}

