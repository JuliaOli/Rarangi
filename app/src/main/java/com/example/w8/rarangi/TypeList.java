package com.example.w8.rarangi;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;

public class TypeList extends AppCompatActivity {

    public Button but;
    public void init(){
        but = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               Intent intent = new Intent(TypeList.this,NewItem.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_list);
        init();
    }
}
