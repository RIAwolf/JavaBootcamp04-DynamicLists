package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    private ArrayList<Vartotojas> _sarasas; // klases kinta
    private HashMap<String, Vartotojas> _zodynas;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.dirbam();
    }

    public void dirbam() {
        try {
            FileReader failas = new FileReader("duomenys.txt");
            Scanner scanner = new Scanner(failas);

            _sarasas= new ArrayList<Vartotojas>();
            _zodynas = new HashMap<String, Vartotojas>();
            while (scanner.hasNext()){
                Vartotojas temp = new Vartotojas(); // paprasom vietos atmintyje vienam elementui

                temp.vardas= scanner.next();// nuskaitom varda is failo
                temp.amzius = scanner.nextInt(); // nuskaitom aziu is failo

                _zodynas.put(temp.vardas,temp); // padadam elementa i zodyna kur raktas yra vardas
                _sarasas.add(temp); // padedam elementa i saraso gala
            }

            scanner.close();
            failas.close();

            for(Vartotojas elementas : _sarasas){
                System.out.println(elementas.vardas+":"+elementas.amzius);
            }

            System.out.println("=====================================");

            for(Map.Entry<String, Vartotojas> elementas : _zodynas.entrySet()){
                System.out.println(elementas.getValue().vardas+":"+elementas.getValue().amzius);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
