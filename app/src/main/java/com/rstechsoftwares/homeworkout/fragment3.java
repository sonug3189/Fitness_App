package com.rstechsoftwares.homeworkout;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

public class fragment3 extends Fragment
{
    NativeExpressAdView nativeExpressAdView;
    TextView head1;
   public fragment3() {
        // Required empty public constructo
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.activity_fragment3, container, false);

        head1=(TextView)view.findViewById(R.id.head1);
        nativeExpressAdView=(NativeExpressAdView)view.findViewById(R.id.nativeview1);
        String str="\n\n  WHAT ARE THE BENEFITS? \n" +
                " The 30 Day Fitness Challenge helps you burn " +
                " fat, build strong muscles, and stay in shape in just 30 days. What's more, you can improve your health quickly and efficiently in only a month.  \n\n" +
                "\n\n  WHAT'S THE SCIENTIFIC BASIS?  \n" +
                "  According to the 30-day habit breaking theory from Psycho-Cybernetics by Maxwell Maltz, a person must have an accurate and positive  " +
                " view of his or her self before setting goals; Otherwise he or she will get stuck in a continuing pattern of limiting beliefs. \n\n" +
                " 30 days may be the optimal time for making changes that influence your mental, physical, and emotional state. You will see changes in" +
                " your body and in your life.\n\n "+
                "  WHAT ARE THE HEALTH TIPS? \n" +
                " If you become ill, injured or pregnant, experience high blood pressure, or are unable to exercise due to your personal physical " +
                " condition, we suggest you stop to take the exercise. And please consult your doctor for detailed information" +
                " if you come back to exercise.\n\n" +
                "  We strongly suggest you warm up before exercising. We are not responsible for any injuries you sustain while exercising.\n";


        head1.setText(str);
        head1.setMovementMethod(new ScrollingMovementMethod());

        AdRequest adRequest = new AdRequest.Builder().build();
        nativeExpressAdView.loadAd(adRequest);
        return  view;

   }


}



