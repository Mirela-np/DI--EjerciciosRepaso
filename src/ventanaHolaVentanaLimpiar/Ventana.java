/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaHolaVentanaLimpiar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mirela
 */
public class Ventana  extends JFrame implements ActionListener{
    
    Container c;
    JTextField texto;
    JButton hola,limpiar,ventana;
    JPanel panel;
    
    
    
    public static void main(String[] args) {
        Ventana miVentana=new Ventana();
         miVentana.setTitle("Ejemplo de uso de JCheckBox");
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        miVentana.setSize(400, 300);
        miVentana.setVisible(true);
        
    }
    
    Ventana(){
        
        c=this.getContentPane();
        c.setLayout(new BorderLayout());
        hola=new JButton("Hola");
        ventana=new JButton("Ventana");
        limpiar=new JButton("Limpiar");
        texto=new JTextField(40);
        panel=new JPanel();
     
        c.add(texto,BorderLayout.NORTH);
        c.add(panel,BorderLayout.CENTER);
        panel.add(hola);
        panel.add(ventana);
        panel.add(limpiar);
        
        hola.addActionListener(this);
        ventana.addActionListener(this);
        limpiar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
                texto.setText(e.getActionCommand());
                
                System.out.println("este objeto es un boton");
                System.out.println("Mi boton [" + this.getHeight() + "x" + this.getWidth() + ", label = " + this.getName() + "]");
      
    }
        
    }
    

