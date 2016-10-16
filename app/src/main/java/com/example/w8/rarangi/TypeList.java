package com.example.w8.rarangi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TypeList extends AppCompatActivity implements View.OnClickListener {

    private Button but;
    private RadioGroup radio;
    private RadioButton shop;
    private RadioButton wishes;
    private RadioButton places;
    private RadioButton toDo;

    public void init(){
        but = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                if(shop.isChecked()){
                    intent= new Intent(TypeList.this, ShoppingItem.class);
                }
                else if(wishes.isChecked()){
                    intent= new Intent(TypeList.this, ShoppingItem.class);
                }
                else if(places.isChecked()){
                    intent= new Intent(TypeList.this, ShoppingItem.class);
                }
                else{
                    intent= new Intent(TypeList.this, ShoppingItem.class);
                }

                startActivity(intent);

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_list);
        radio = (RadioGroup)findViewById(R.id.radio);
        shop = (RadioButton)findViewById(R.id.shopping);
        shop.setOnClickListener(this);
        wishes = (RadioButton)findViewById(R.id.wishes);
        wishes.setOnClickListener(this);
        places = (RadioButton)findViewById(R.id.places);
        places.setOnClickListener(this);
        toDo = (RadioButton)findViewById(R.id.toDo);
        toDo.setOnClickListener(this);
        init();

    }

    @Override
    public void onClick(View v) {

        int checkRadioButtonid = radio.getCheckedRadioButtonId();
        switch (checkRadioButtonid){
            case R.id.shopping:
                if(shop.isChecked()){
                  //  intent = new Intent(TypeList.this, ShoppingItem.class);
                }
                break;
            case R.id.wishes:
                if(wishes.isChecked()){
                    //intent = new Intent(TypeList.this, ShoppingItem.class);
                }
                break;

            case R.id.places:
                if(places.isChecked()){
                    //intent = new Intent(TypeList.this, ShoppingItem.class);
                }
                break;

            case R.id.toDo:
                if(toDo.isChecked()){
                    //intent = new Intent(TypeList.this, ShoppingItem.class);
                    Toast.makeText(getApplicationContext(),"Select type of new list",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
