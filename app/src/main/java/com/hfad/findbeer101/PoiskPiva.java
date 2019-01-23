package com.hfad.findbeer101;

import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PoiskPiva {
    List <String> getCvetPiva (String cvet) {
        List <String> rezultat = new ArrayList<>();
        if (cvet.equals("Светлое")) {
            rezultat.add("Жигулёвское");
        }
        else if (cvet.equals("Тёмное")){
            rezultat.add("Велкопоповицкий козел");
        }
        else if (cvet.equals("Янтарное")) {
            rezultat.add("Ярпиво");
        }
     return rezultat;}

}
