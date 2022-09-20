//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js04.java.khalilul_afwan;

/**
 *
 * @author KHALILUL
 */
public class Tugas2JS4 {
    public static void main (String[] args){
        int angka1 = 10;
        int angka2 = 23;
        int angka3 = 5;
        //Mencari Angka terbesar
        int terbesar = angka3 > (angka1 > angka2 ? angka1 : angka2) ? angka3 : ((angka1 > angka2) ? angka1 : angka2);
        
        System.out.println("Number 1 = " + angka1);
        System.out.println("Number 2 = " + angka2);
        System.out.println("Number 3 = " + angka3);
        System.out.println("Nilai tertingginya adalah angka = " + terbesar);
      
    }
}
