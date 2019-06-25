package com.rstechsoftwares.homeworkout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class chall_armworkout extends AppCompatActivity
{
    Integer[] images = {R.drawable.fullbody,R.drawable.fullbody,R.drawable.fullbody};

    String[] version = {"Easy Plan 1", "Medium Plan 1", "Hard Plan 1"};


    ListView lView;
    AdView adView1;

    instrution_fbwokout lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chall_fb_workout);

        lView = (ListView) findViewById(android.R.id.list);

        lAdapter = new instrution_fbwokout(chall_armworkout.this, version, images);

        lView.setAdapter(lAdapter);

        adView1= (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);


        lView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)

                    {

                        if(i==0)
                        {
                            Intent intent=new Intent(chall_armworkout.this,Armeasyplan1.class);
                            startActivity(intent);
                        }

//                        if(i==1)
//                        {
//                            Intent intent=new Intent(chall_fbWorkout.this,mediumplan1.class);
//                            startActivity(intent);
//                        }
//
//                        if(i==2)
//                        {
//                            Intent intent=new Intent(chall_fbWorkout.this,hardplan1.class);
//                            startActivity(intent);
//                        }


                    }
                });


    }
}
