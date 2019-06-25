package com.rstechsoftwares.homeworkout;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mediumplanstartitems extends AppCompatActivity
{
    String[] values = new String[]{"JUMPING JACKS", "PUSHS-UPS", "SUPERMAN", "CURTSY LUNGES","CROSS ARM CRUNCHES","KNEE PUSH-UPS","SIDE PLANK LEFT","LONG ARM CRUNCHES","SIDE PLANK RIGHT"};
    Integer[] epimages=new Integer[]{R.drawable.jumpingjacks,R.drawable.pushups,R.drawable.superman,R.drawable.curtsylunge,R.drawable.crossarmcrunches,R.drawable.kneepushups,R.drawable.sideplankleft,R.drawable.longarmrunches,R.drawable.sideplankright};


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

        if (position == 5) {
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

        if (position == 6) {
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


        if (position == 7) {
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

        if (position == 8) {
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