package com.rstechsoftwares.homeworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class easyplan1 extends AppCompatActivity {

    Button buttonc1,easyplans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyplan1);

        buttonc1=(Button)findViewById(R.id.buttonc1);
        easyplans1=(Button)findViewById(R.id.easyplans1);
        buttonc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        easyplans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent =new Intent(easyplan1.this,easyplanstart.class);
                startActivity(intent);
            }
        });

    }
}
