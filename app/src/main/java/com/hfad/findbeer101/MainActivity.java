package com.hfad.findbeer101;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private PoiskPiva robot = new PoiskPiva();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPoisk(View view) {
        TextView rezultat = (TextView) findViewById(R.id.idArray);
        Spinner cvetPiva = (Spinner) findViewById(R.id.idSpinner);
        Button poiskPiva = (Button) findViewById(R.id.idButton);
        String vibranniyCvetPiva = String.valueOf(cvetPiva.getSelectedItem());

        List <String> rezultatPiva = robot.getCvetPiva(vibranniyCvetPiva);
        StringBuilder rezultatkonechniy = new StringBuilder();
        for (String brand: rezultatPiva) {
            rezultatkonechniy.append(brand).append('\n');

        }

        rezultat.setText(rezultatkonechniy);


    }
}
