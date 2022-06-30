package com.example.actembed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimaryAct extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_act);
        findViewById(R.id.second1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimaryAct.this,Secondary1.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.second2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.second2:
                Intent intent = new Intent(PrimaryAct.this,Secondary2.class);
                startActivity(intent);
                break;
        }
    }
}