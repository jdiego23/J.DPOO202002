package com.alejandro.app;

import com.alejandro.tvdomain.Televisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTelevisores {
    public static void main(String[] args) {
//        short variableControl = 1;
//
//        do {
//            System.out.println("El valor es " + variableControl);
//            variableControl++;
//        } while (variableControl < 1);

        List<Integer> numeros = Arrays.asList(1, 5, 8, 14, 10);

//        numeros.add(17);

        numeros.forEach(x -> System.out.println("El valor es de " + x));

        // TODO Explorar todo lo que tenga Televisor y jugar con la clase ArrayList

        Televisor tv = new Televisor();
        tv.marca = "Samsung";
        tv.prender();

        Televisor tv2 = new Televisor();
        tv2.marca = "Sony";
        tv2.prender();

        Televisor tv3 = new Televisor();
        tv3.marca = "Challenger";
        tv3.apagar();

        ArrayList<Televisor> televisores = new ArrayList<>();
        televisores.add(tv);
        televisores.add(tv2);
        televisores.add(tv3);

        televisores.forEach(televisor -> {
            // TODO Reemplazar el boolean por el texto en cuestión "Apagado" ó "Prendido"
            System.out.println(televisor.marca + " está " + televisor.prendido);
        });

    }
}
