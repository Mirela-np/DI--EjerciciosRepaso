/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaColores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

/**
 *
 * @author Mirela
 */
public class Colores extends JFrame{
    
    Container c;
    JButton[]boton;
    JPanel panelD,panelI,panelS;
    JScrollBar bara1,bara2,bara3;
    JButton et1,et2,et3,et4,et5,et6;
    String[]textoColores={"Negro","Gris oscuro","Gris","Gris claro","Blanco","Magenta","Azul","Cian","Verde","Amarillo","Naranja","Rojo","Rosa"};

    
    
    
    
    
    public static void main(String[] args) {
        Colores miVentana=new Colores();
        miVentana.setTitle("Ejemplo de uso de JCheckBox");
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        miVentana.setSize(600, 700);
        miVentana.setVisible(true);
    }
    
    Colores(){
        
        boton= new JButton[13];
        panelS= new JPanel();
        c=this.getContentPane();
        c.setLayout(new BorderLayout());
         panelD=new JPanel();
         panelD.setLayout(new GridLayout(13,1));
         Color[]colores={Color.black,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};

          for(int i=0;i<textoColores.length;i++){
              boton[i]=new JButton();
              
            	boton[i].setFont(new Font("arial",Font.BOLD,18));
            	boton[i].setOpaque(true);
            	boton[i].setBackground(colores[i]);
            	if (i <3 )
            		boton[i].setForeground(Color.white);
            	else
            		boton[i].setForeground(Color.gray);
            	
               	boton[i].setText(textoColores[i]);
               
               	
            	panelD.add(boton[i]);
            }
              
         
         c.add(panelD,BorderLayout.EAST);
         
         
         //panel izquierda
         
        panelI=new JPanel();
        panelI.setLayout(new GridLayout(1,3));
        bara1=new JScrollBar();
        bara2=new JScrollBar();
        bara3=new JScrollBar();
        panelI.add(bara1);
        panelI.add(bara2);
        panelI.add(bara3);
        c.add(panelI,BorderLayout.WEST);
        
        
        //panel sur
        
        panelS=new JPanel();
        panelS.setLayout(new GridLayout(1,6));
        et1=new JButton("rojo");
        et1.setBackground(Color.red);
        et2=new JButton("179");
        et3=new JButton("verde");
        et3.setBackground(Color.GREEN);
        et4=new JButton("215");
        et5=new JButton("azul");
        et5.setBackground(Color.blue);
        et6=new JButton("148");
        panelS.add(et1);
        panelS.add(et2);
        panelS.add(et3);
        panelS.add(et4);
        panelS.add(et5);
        panelS.add(et6);
        c.add(panelS,BorderLayout.SOUTH);
        
         
      
       

                
    }
    
    
//   private void Boton() {
//
//        for (int i = 0; i < textoColores.length; i++) {
//
//            boton[i] = new JButton(String.valueOf(i));
//            panelS.add(boton[i]);
//        
//        
//    }
   }
