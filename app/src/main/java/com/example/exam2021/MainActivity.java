package com.example.exam2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayAdapter adapter;

    int[] img = {R.drawable.correr, R.drawable.levantar_pesas, R.drawable.deporte, R.drawable.aros};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listView);


    }
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this, TrainingInfoActivity.class);
            startActivity(intent);
        }


}