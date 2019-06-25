package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class fragment2 extends Fragment
{
    ListView intruction_list;
    AdView adViewfragment2;
    String[] values = new String[] { "Full Body Workout","Abs Workout"," Butt Workout","Arm Workout","Leg Workout"};


    public fragment2() {
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
        View view= inflater.inflate(R.layout.activity_fragment2, container, false);

        adViewfragment2= (AdView)view.findViewById(R.id.adViewfragment2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adViewfragment2.loadAd(adRequest);


        intruction_list=(ListView)view.findViewById(R.id.instructions_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, values);
        intruction_list.setAdapter(adapter);
        intruction_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Intent intent= new Intent(getContext(),instr_fbWorkout.class);
                    startActivity(intent);
                }

                if(position==1)
                {
                    Intent intent= new Intent(getContext(),instr_absWorkout.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent= new Intent(getContext(),instr_buttWorkout.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent= new Intent(getContext(),instr_armWorkout.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent= new Intent(getContext(),instr_legWorkout.class);
                    startActivity(intent);
                }
            }

        });

        return view;
    }
}
