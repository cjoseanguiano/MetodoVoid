package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String cadena;
        System.out.printf("Introduce cadena de texto :");
        cadena = scanner.nextLine();
        cajaDeTexto(cadena);

    }

    public static void cajaDeTexto(String str) {
        int n = str.length();
        for (int i = 0; i < n + 4; i++) {
            System.out.println("#");
        }
        System.out.println();
        System.out.println("# " + str + " #");
        for (int i = 0; i < n + 4; i++) {
            System.out.println("#");
        }
        System.out.println();
    }
}
