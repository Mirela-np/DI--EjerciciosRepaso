/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racional;

import javax.swing.JFrame;

/**
 *
 * @author Mirela
 */
public class Principal {
    
    
    public static void main(String[] args) {
        VentanaRacional miVentana=new VentanaRacional();
        miVentana.setSize(600,500);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}
