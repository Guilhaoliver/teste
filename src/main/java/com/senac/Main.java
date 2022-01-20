package com.senac;

import com.senac.models.Android;
import com.senac.models.Aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        Aplicativo netflix = new Aplicativo("Netflix", 14, "Icone Netflix");
        Aplicativo instagram = new Aplicativo("Instagram" , 28, "Icone Insta");
        Aplicativo youtube = new Aplicativo("Youtube", 64, "Icone Youtube");


        List<Aplicativo> aplicativos = new ArrayList<>();

        aplicativos.add(netflix);
        aplicativos.add(instagram);
        aplicativos.add(youtube);

        Android android = new Android();
        android.setAplicativos(aplicativos);


        System.out.println();



    }
}