package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int nr=0,i,j;
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o fraza: ");
        String s1=scanner.nextLine();
        Collections.addAll(lista, s1.split("[ ,;.]"));
        System.out.println("Introduceti o fraza: ");
        String s2=scanner.nextLine();
        Collections.addAll(lista, s2.split("[ ,;.]"));
        System.out.println(lista);
        for(i=0;i<lista.size()-1;i++)
            for(j=i+1;j<lista.size();j++)
                if(lista.get(i).compareTo(lista.get(j))==0)
                    nr++;
        System.out.println("Frazele introduse contin "+nr+" cuvinte comune.");
    }
}