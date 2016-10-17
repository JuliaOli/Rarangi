package com.example.w8.rarangi;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import saveme.Save;

public class ShoppingItem extends AppCompatActivity implements Save {

    FloatingActionButton fabAdd, fabSave;
    String master;
    TextView text1;
    EditText text2;
    EditText text3;
    EditText text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        fabAdd = (FloatingActionButton) findViewById(R.id.fabAdd);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text1 = (EditText)findViewById(R.id.textName);
                text2 = (EditText)findViewById(R.id.editText6);
                text3 = (EditText)findViewById(R.id.editText7);
                text4 = (EditText)findViewById(R.id.editText5);
                saveAll();
                Toast.makeText(getApplicationContext(),"Item added to the list",Toast.LENGTH_SHORT).show();

            }
        });

        fabSave = (FloatingActionButton)findViewById(R.id.fabSave);
        fabSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"List created",Toast.LENGTH_SHORT).show();
                Intent inten = new Intent(ShoppingItem.this, ListActivity.class);
                startActivity(inten);
            }
        });
    }

    @Override
    public void saveAll() {

        master = text1.getText().toString().concat( ", " + text2.getText().toString() + ", ").concat(text3.getText().toString() + ",")
                .concat(text4.getText().toString() + "!!");

    }
}
