package com.example.fidgetspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_id);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
         String position, nombreSeleccion;

        position = spinner.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this, "Seleccionaste " + position, Toast.LENGTH_SHORT).show();
    }
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });
    }
}