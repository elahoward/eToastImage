package com.ejh.elaimageview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void change(View view){
        ImageView i=findViewById(R.id.orca);
        i.setImageResource(R.drawable.shrimp);
        Toast.makeText(MainActivity.this, "L'océan est pleine de biodiversité.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}