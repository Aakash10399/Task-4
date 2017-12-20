package com.example.mahe.task_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent switched = getIntent();
        ((TextView)findViewById(R.id.dispMovieName)).setText(switched.getStringExtra("movieNameArg"));
        ((TextView)findViewById(R.id.dispLeadActor)).setText(switched.getStringExtra("leadActorArg"));
    }
}
