package com.visll_k.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String selected;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp = findViewById(R.id.sp1);

        ArrayAdapter<CharSequence> aa= ArrayAdapter.createFromResource(this,R.array.options, android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(this);

        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selected == "1"){
                    Intent i2= new Intent(MainActivity.this, option1.class);
                    startActivity(i2);
                } else if (selected == "2") {
                    Intent i2= new Intent(MainActivity.this, option2.class);
                    startActivity(i2);
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String str = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),"selected: "+ str,Toast.LENGTH_SHORT).show();
        if (parent.getItemAtPosition(position).equals("Section A")){
            selected = "1";
        }
        if (parent.getItemAtPosition(position).equals("Section B")){
            selected = "2";
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}