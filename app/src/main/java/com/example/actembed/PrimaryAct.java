package com.example.actembed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import androidx.window.embedding.SplitInfo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class PrimaryAct extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_act);
        findViewById(R.id.second1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimaryAct.this,Secondary1.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        findViewById(R.id.second2).setOnClickListener(this);
        findViewById(R.id.secondarySub1).setOnClickListener(this);

        SplitController.getInstance()
                .addSplitListener(this, ContextCompat.getMainExecutor(this), new Consumer<List<SplitInfo>>() {
                    @Override
                    public void accept(List<SplitInfo> splitInfos) {
                        Log.i("ycc-aa", "");
                    }
                });

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.second2:
                intent = new Intent(PrimaryAct.this,Secondary2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.secondarySub1:
                intent = new Intent(PrimaryAct.this,SecondarySub1.class);
                startActivity(intent);
                break;
        }
    }
}