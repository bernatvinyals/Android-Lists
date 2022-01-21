package com.example.llista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String[] noms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateDades();

        ListView lstNoms = findViewById(R.id.IDList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,noms);

        lstNoms.setAdapter(adapter);
    }

    public void CreateDades() {
        noms = new String[20];
        for (int i = 0; i < 20; i++) {
            noms[i] = "nom"+i;
        }
    }
}