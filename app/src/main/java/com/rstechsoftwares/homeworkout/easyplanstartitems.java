package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class easyplanstartitems extends AppCompatActivity
{
    String[] values = new String[]{"JUMPING JACKS", "STEP-UP ONTO CHIAR", "PUSHS-UPS", "ABDOMINAL CRUNCHES", "PLANK"};
    Integer[] epimages=new Integer[]{R.drawable.jumpingjacks,R.drawable.chairstepups,R.drawable.pushups,R.drawable.abdominalcrunch,R.drawable.plank};


    TextView easyplanitem1,easyplanitem2,easyplanitem3;
    Button easyplanbutton1;
    ImageView easyplanimage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyplanstartitems);

        easyplanitem1=(TextView)findViewById(R.id.easyplanstartitemtext1);
        easyplanitem2=(TextView)findViewById(R.id.easyplanstartitemtext2);
        easyplanitem3=(TextView)findViewById(R.id.easyplanstartitemtext3);

        easyplanbutton1=(Button)findViewById(R.id.easyplanstartitembutton1);
        easyplanimage1=(ImageView)findViewById(R.id.easyplanstartitemimage1);

        Intent intent=getIntent();
        int position=intent.getIntExtra("position",0);

        if(position==0)
        {
            easyplanitem1.setText(values[position]);
            easyplanimage1.setImageResource(epimages[position]);
            easyplanitem2.setText("FULL BODY");

            String s="Start with your feet together and your arms by your sides, then jump up with your feet apart and your hand overhead ./n Return " +
                    "to the start position then do the next rep .This exercise provides a full body workout and works all your large muscle groups";
            easyplanitem3.setText(s);
            easyplanbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")));
                }
            });

        }

        if(position==1) {
            easyplanitem1.setText(values[position]);
            easyplanimage1.setImageResource(epimages[position]);
            easyplanitem2.setText("FULL BODY");

            String s = "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hand overhead ./n Return " +
                    "to the start position then do the next rep .This exercise provides a full body workout and works all your large muscle groups";
            easyplanitem3.setText(s);
            easyplanbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")));
                }
            });
        }

            if(position==2) {
                easyplanitem1.setText(values[position]);
                easyplanimage1.setImageResource(epimages[position]);
                easyplanitem2.setText("FULL BODY");

                String s = "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hand overhead ./n Return " +
                        "to the start position then do the next rep .This exercise provides a full body workout and works all your large muscle groups";
                easyplanitem3.setText(s);
                easyplanbutton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")));
                    }
                });
            }


                if (position == 3) {
                    easyplanitem1.setText(values[position]);
                    easyplanimage1.setImageResource(epimages[position]);
                    easyplanitem2.setText("FULL BODY");

                    String s = "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hand overhead ./n Return " +
                            "to the start position then do the next rep .This exercise provides a full body workout and works all your large muscle groups";
                    easyplanitem3.setText(s);
                    easyplanbutton1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")));
                        }
                    });
                }


                    if (position == 4) {
                        easyplanitem1.setText(values[position]);
                        easyplanimage1.setImageResource(epimages[position]);
                        easyplanitem2.setText("FULL BODY");

                        String s = "Start with your feet together and your arms by your sides, then jump up with your feet apart and your hand overhead ./n Return " +
                                "to the start position then do the next rep .This exercise provides a full body workout and works all your large muscle groups";
                        easyplanitem3.setText(s);
                        easyplanbutton1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")));
                            }
                        });
                    }


    }
}