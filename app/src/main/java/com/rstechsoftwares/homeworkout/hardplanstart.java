package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hardplanstart extends AppCompatActivity {
    ListView eastplanlist;
    String[] values = new String[]{"KNEE PUSH-UPS","CROSS ARM CRUNCHES","PUSH-UPS","JUMPING SQUATS","LEFT SIDE LUNGES","PUSH-UP & ROTATION","RIGHT SIDE LUNGES","PLANK","BACKWARD LUNGE WITH FRONT KICK RIGHT ","HIGH STEPPING","PLANK","BRIDGE"};
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
                Intent intent=new Intent(hardplanstart.this,hardplanstartitems.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }

            //Toast.makeText(getApplicationContext(),"lisyview",Toast.LENGTH_LONG).show();            }
        });
    }
}