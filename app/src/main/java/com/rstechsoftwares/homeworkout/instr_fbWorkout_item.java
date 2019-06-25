package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class instr_fbWorkout_item extends AppCompatActivity {

    ImageView imageView1;
    TextView textView1,textView2;
    Button buttonfbwokout;
    AdView adViewlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instr_fb_workout_item);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textView1 = (TextView) findViewById(R.id.fbWorkout_t_item);
        textView2 = (TextView) findViewById(R.id.fbWorkout_t1_item);
        imageView1=(ImageView)findViewById(R.id.fbWorkout_i_item);
        buttonfbwokout = (Button) findViewById(R.id.buttonfbworkout);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            int image=bundle.getInt("image");
            imageView1.setImageResource(image);
        }

        Intent intent = getIntent();
        String data = intent.getStringExtra("value");
        final String youtubeurl=intent.getStringExtra("url");
        String information=intent.getStringExtra("information");
        textView1.setText(data);

        textView2.setText(information);
        buttonfbwokout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeurl)));
            }
        });

        setTitle(data);

        adViewlist = (AdView) findViewById(R.id.adViewlist);

        AdRequest adRequest = new AdRequest.Builder().build();

        adViewlist.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(getApplicationContext(), "Ad is closed!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "Ad failed to load! error code: " + errorCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(getApplicationContext(), "Ad left application!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });

        adViewlist.loadAd(adRequest);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }


}

