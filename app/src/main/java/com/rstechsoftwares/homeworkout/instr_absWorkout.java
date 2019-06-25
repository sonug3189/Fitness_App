package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class instr_absWorkout extends AppCompatActivity {

    Integer[] images = {R.drawable.abdominalcrunch,R.drawable.legraises,R.drawable.situps,R.drawable.plank,R.drawable.rightsidelunges,R.drawable.longarmrunches,R.drawable.crossarmcrunches,R.drawable.leftsidelunges,R.drawable.birddog,R.drawable.bridge,R.drawable.mountainclimber,R.drawable.crossarmcrunches,R.drawable.sideplankleft,R.drawable.jumpingjacks ,R.drawable.pushupandrotate,R.drawable.leftsidelunges,R.drawable.abdominalcrunch,R.drawable.legraises,R.drawable.situps,
            R.drawable.plank,R.drawable.rightsidelunges,R.drawable.longarmrunches,R.drawable.crossarmcrunches,R.drawable.leftsidelunges,R.drawable.birddog,R.drawable.bridge,R.drawable.mountainclimber,R.drawable.crossarmcrunches,R.drawable.sideplankleft,R.drawable.jumpingjacks ,R.drawable.pushupandrotate,R.drawable.leftsidelunges};

    String[] version = {"ABDOMINAL CRUNCHES", "LEG RAISES", "SIT-UPS", "PLANK", "REVERSE CRUNCHES", "LONG ARM CRUNCHES", "RUSSIAN TWIST", "BICYCLE CRUNCHES", "BIRD DOG", "BRINGE",
            "MOUNTAIN CLIMBER", "CROSS ARM CRUNCHES", "ONE LEG BRIDGE", "JUMPING JACKS","STRAIGHT-ARM PLANK","WALL PUSH-UPS","ABDOMINAL CRUNCHES",
            "LEG RAISES", "SIT-UPS", "PLANK", "REVERSE CRUNCHES", "LONG ARM CRUNCHES", "RUSSIAN TWIST", "BICYCLE CRUNCHES", "BIRD DOG", "BRINGE",
            "MOUNTAIN CLIMBER", "CROSS ARM CRUNCHES", "ONE LEG BRIDGE", "JUMPING JACKS","STRAIGHT-ARM PLANK","WALL PUSH-UPS"};

    String[] youtubelink={"https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds",
            "https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds","https://www.youtube.com/watch?v=7v2fh00L0Ds"};

    String[] information={"Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity",
            "Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity","Thanks bro i got it with your help.As i am new to java the thing i was doing wrong was initialising the String url of the second activity"};

    ListView lView;
    AdView adViewfbworkout;

    instrution_fbwokout lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instr_fb_workout);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lView = (ListView) findViewById(android.R.id.list);
        adViewfbworkout=(AdView)findViewById(R.id.adViewfbworkout);
        AdRequest adRequest= new AdRequest.Builder().build();
        adViewfbworkout.loadAd(adRequest);

        lAdapter = new instrution_fbwokout(instr_absWorkout.this, version, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                if(i==0)
                {
                    function(i);
                }

                if(i==1)
                {
                    function(i);
                }
                if(i==2)
                {
                    function(i);
                }
                if(i==3)
                {
                    function(i);
                }
                if(i==4)
                {
                    function(i);
                }
                if(i==5)
                {
                    function(i);
                }
                if(i==6)
                {
                    function(i);
                }
                if(i==7)
                {
                    function(i);
                }
                if(i==8)
                {
                    function(i);
                }
                if(i==9)
                {
                    function(i);
                }
                if(i==10)
                {
                    function(i);
                }
                if(i==11)
                {
                    function(i);
                }
                if(i==12)
                {
                    function(i);
                }
                if(i==13)
                {
                    function(i);
                }
                if(i==14)
                {
                    function(i);
                }
                if(i==15)
                {
                    function(i);
                }
                if(i==16)
                {
                    function(i);
                }
                if(i==17)
                {
                    function(i);
                }
                if(i==18)
                {
                    function(i);
                }
                if(i==19)
                {
                    function(i);
                }
                if(i==20)
                {
                    function(i);
                }
                if(i==21)
                {
                    function(i);
                }
                if(i==22)
                {
                    function(i);
                }
                if(i==23)
                {
                    function(i);
                }
                if(i==24)
                {
                    function(i);
                }
                if(i==25)
                {
                    function(i);
                }
                if(i==26)
                {
                    function(i);
                }
                if(i==27)
                {
                    function(i);
                }
                if(i==28)
                {
                    function(i);
                }
                if(i==29)
                {
                    function(i);
                }
                if(i==30)
                {
                    function(i);
                }
                if(i==31)
                {
                    function(i);
                }



            }
        });


    }

    public void function(int i)
    {
        Intent intent = new Intent(instr_absWorkout.this, instr_fbWorkout_item.class);
        intent.putExtra("value", version[i]);
        intent.putExtra("image",images[i]);
        intent.putExtra("url",youtubelink[i]);
        intent.putExtra("information",information[i]);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

}
