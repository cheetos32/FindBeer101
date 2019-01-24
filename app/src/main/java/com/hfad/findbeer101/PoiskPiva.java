package com.hfad.findbeer101;

import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PoiskPiva {
    List <String> getMark (String cvet,String strana) {
        List <String> rezultat = new ArrayList<>();
        if (cvet.equals("Светлое")&strana.equals("Россия")) {
            rezultat.add("Жигулёвское");
        }
        else if (cvet.equals("Светлое")) {

            rezultat.add("Miller");
            rezultat.add("Gosser");
            rezultat.add("Korona");
            rezultat.add("Колос");
            rezultat.add("Три медведя");
            rezultat.add("Heineken");
            rezultat.add("Халзан");
            rezultat.add("Amstel");
            rezultat.add("Охота");
            rezultat.add("Zlaty Bazant");
            rezultat.add("Lowenbrau");
            rezultat.add("Faxe");
            rezultat.add("Bavaria");
            rezultat.add("Krucovice Imperial");
            rezultat.add("Stella Artois");
            rezultat.add("Балтика");
            rezultat.add("Krombacher");
            rezultat.add("Leffe Blonde");

        }
        else if (cvet.equals("Тёмное")){
            rezultat.add("Velkopopovicky Kozel Cerny");
            rezultat.add("Tuborg Black");
            rezultat.add("Krusovice Cerne");
            rezultat.add("Guinness Original");
            rezultat.add("Paulaner Hefe-Weissbier");
            rezultat.add("Genevieve deBrabant Double");
            rezultat.add("Grimbergen Double-Ambree");
            rezultat.add("Belhaven Black Scottish Stout");
            rezultat.add("AndechsWeissbier Dunkel");
            rezultat.add("Пензенское Премиум");






        }
        else if (cvet.equals("Янтарное")) {
            rezultat.add("Ярпиво");
            rezultat.add("Хамовники Пшеничное");
            rezultat.add("Menabrea La 150° Ambrata");
            rezultat.add("Alpkonig Weitnauer Marzen");
            rezultat.add("Bruegel Amber Ale");



        }
     return rezultat;}

}
