//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prakpbo.js04.java.khalilul_afwan;

/**
 *
 * @author KHALILUL
 */
public class AritmatikaDemo {

    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variable values...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        //Penjumlahan angka
        System.out.println("Adding..");
        System.out.println("i + j = " + (i + j));
        System.out.println("x + y = " + (x + y));
        
        //Pengurangan angka
        System.out.println("Substracting...");
        System.out.println("i - j = " + (i - j));
        System.out.println("x - y = " + (x - y));
        
        //Perkalian angka
        System.out.println("Multiplying...");
        System.out.println("i * j = " + (i * j));
        System.out.println("x * y = " + (x * y));
        
        //Pembagian angka
        System.out.println("Dividing...");
        System.out.println("i / j = " + ((float)i / j));
        System.out.println("x / y = " + (x / y));
        
        //Menghitung hasil modulus dari pembagian
        System.out.println("Computing the reminder...");
        System.out.println("i % j = " + (i % j));
        System.out.println("x % y = " + (x % y));
        
        //Tipe pemnggabungan
        System.out.println("Mixing tapes...");
        System.out.println("j + y = " + (j + y));
        System.out.println("i * x = " + (i * x));
    }
}