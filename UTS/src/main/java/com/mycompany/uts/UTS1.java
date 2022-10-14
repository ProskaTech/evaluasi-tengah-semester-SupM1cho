/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts;

//Created by 21343032_Muhammad Rizky Sandyra

public class UTS1 {
    public static void main(String[] args) {
        int i, j, k;
                
        for (i=1; i<=1; i++)
        {
            System.out.print(" ");
            for (j=2; j<=3; j++)
            {
                System.out.print(j);
            }
            System.out.print("   ");
            for (j=4; j<=5; j++)
            {
                System.out.print(j);
            }
                System.out.println();
            for (j=1; j<=4; j++)
            {
                System.out.print(j);
            }
            System.out.print(" ");
            for (j=5; j<=8; j++)
            {
                System.out.print(j);
            }
             System.out.println();
        }
        for(i=1; i<=5; i++)
        {
            for(k=1; k<=i-1; k++)
            {
                System.out.print(" ");
            } 
            for(j=1; j<=2*(5-i+1)-1; j++)
            {
                System.out.print(j);
            } 
            System.out.println();
        }
    }
}
