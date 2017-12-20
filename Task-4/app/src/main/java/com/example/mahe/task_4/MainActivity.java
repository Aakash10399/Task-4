package com.example.mahe.task_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.switchButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchAct = new Intent(MainActivity.this,DisplayActivity.class);
                if(((EditText)findViewById(R.id.movieName)).getText().toString().length()==0 || ((EditText)findViewById(R.id.leadActor)).getText().toString().length()==0)
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.required),Toast.LENGTH_SHORT).show();
                }
                else {
                    switchAct.putExtra("movieNameArg", ((EditText) findViewById(R.id.movieName)).getText().toString());
                    switchAct.putExtra("leadActorArg", ((EditText) findViewById(R.id.leadActor)).getText().toString());
                    startActivity(switchAct);
                }
            }
        });
    }
}
