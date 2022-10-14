/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

//Created by 21343032_Muhammad Rizky Sandyra

public class UTS2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int i, j, k;
        
        System.out.println("Masukkan jumlah baris");
        int x = in.nextInt();
        
        for(i = x; i >= 1; i--){
            for(j = x; j > i; j--){
                System.out.print(" ");
            }                
            for(k = 1; k <(2 * i); k++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(i = 1; i <= x; i++){
            for(j = x; j > i; j--){
                System.out.print(" ");
            }
            for(k = 1; k < (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
