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
    private TextView rezultat;
    private Spinner cvetPiva;
    private Spinner proizvodstvo;
    private Button poiskPiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.rezultat = (TextView) findViewById(R.id.idArray);
        this.cvetPiva = (Spinner) findViewById(R.id.idSpinner);
        this.proizvodstvo = (Spinner) findViewById(R.id.idSpinner2);
        this.poiskPiva = (Button) findViewById(R.id.idButton);
    }

    public void onClickPoisk(View view) {
        
        String vibranniyCvetPiva = String.valueOf(cvetPiva.getSelectedItem());
        String vibrannayaStrana = String.valueOf(proizvodstvo.getSelectedItem());


        List <String> rezultatPiva = robot.getMark(vibranniyCvetPiva,vibrannayaStrana);
        StringBuilder vivodMarok = new StringBuilder();
        for (String brand: rezultatPiva) {
            vivodMarok.append(brand).append('\n');

        }

        rezultat.setText(vivodMarok);


    }
}
