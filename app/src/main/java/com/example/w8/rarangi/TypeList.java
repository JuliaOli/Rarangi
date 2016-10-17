package com.example.w8.rarangi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import saveme.SaveMe;

public class TypeList extends AppCompatActivity implements View.OnClickListener {

    private Button but;
    private RadioGroup radio;
    private RadioButton shop;
    private RadioButton places;
    private RadioButton toDo;
    EditText title;
    String aux;
    SaveMe superString;

    public void init(){

        but = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;

                if(shop.isChecked()){

                    setContentView(R.layout.activity_shopping);
                    intent= getIntent();
                    aux = title.getText().toString();
                    TextView titleAux = (TextView) findViewById(R.id.title1);
                    titleAux.setText(aux);
                }
                else if(places.isChecked()){
                    intent= new Intent(TypeList.this, Places.class);
                }
                else{
                    intent= new Intent(TypeList.this,ToDo.class);
                }


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
        places = (RadioButton)findViewById(R.id.places);
        places.setOnClickListener(this);
        toDo = (RadioButton)findViewById(R.id.toDo);
        toDo.setOnClickListener(this);
        title = (EditText)findViewById(R.id.editText);

        init();

    }

    @Override
    public void onClick(View v) {

        int checkRadioButtonid = radio.getCheckedRadioButtonId();
        switch (checkRadioButtonid){
            case R.id.shopping:
                if(shop.isChecked()){

                }
                break;

            case R.id.places:
                if(places.isChecked()){

                }
                break;

            case R.id.toDo:
                if(toDo.isChecked()){

                    //Toast.makeText(getApplicationContext(),"Select type of new list",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
