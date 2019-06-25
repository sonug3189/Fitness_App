package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Armeasyplanstart extends AppCompatActivity {
    ListView eastplanlist;
    String[] values = new String[]{"JUMPING JACKS", "STEP-UP ONTO CHIAR", "PUSHS-UPS", "ABDOMINAL CRUNCHES", "PLANK"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyplanstart);


        eastplanlist = (ListView) findViewById(R.id.easyplanlist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, values);
        eastplanlist.setAdapter(adapter);
        eastplanlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent=new Intent(Armeasyplanstart.this,Armeasyplanstartitems.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }

            //Toast.makeText(getApplicationContext(),"lisyview",Toast.LENGTH_LONG).show();            }
        });
    }
}