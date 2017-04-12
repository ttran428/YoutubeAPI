package com.example.theodorebear428.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = (Button) findViewById(R.id.btnPlaySingle);
        Button btnStandalone = (Button) findViewById(R.id.btnStandAlone);
        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);//needs context, and class literal
                break;
            case R.id.btnStandAlone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:

        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}