/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import javax.swing.JOptionPane;

//Created by 21343032_Muhammad Rizky Sandyra

public class UTS3 {
    public static void main(String[] args){
        String a = "",msg = "";
        int bilangan;
        
        a = JOptionPane.showInputDialog("Bilangan: ");
        bilangan = Integer.parseInt(a);
        
        if(bilangan<0)
            msg = "Bilangan "+ bilangan +" adalah negatif";
        else if (bilangan>0)
            msg = "Bilangan "+ bilangan +" adalah positif";
        else
            msg = "Bilangan "+ bilangan +" adalah nol";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(msg);
    }
}
