package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment
{
    CardView fbworkout,armworkout;
    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view= inflater.inflate(R.layout.activity_fragment1, container, false);
        fbworkout=(CardView)view.findViewById(R.id.android_card_view_example1);
        armworkout=(CardView)view.findViewById(R.id.android_card_view_example4);

        fbworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), chall_fbWorkout.class);
                startActivity(intent);
            }
        });



        armworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            Intent intent=new Intent(getActivity(),chall_armworkout.class);
            startActivity(intent);
            }
        });
        return  view;
    }


}
