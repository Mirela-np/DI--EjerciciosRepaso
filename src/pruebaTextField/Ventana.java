/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Mirela
 */
public class Ventana extends JFrame implements ActionListener{

   
    
         Container c;
     JTextField t1,t2,t3;
     JPasswordField t4;
     
     
    Ventana(){
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        t1=new JTextField(10);
        t2=new JTextField("Escriba el texto aqui");
        t3=new JTextField("campo de texto no editable");
        t4=new JPasswordField(10);
        t1.setEditable(true);
        t2.setEditable(true);
        t3.setEditable(false);
        
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);
        
        t1.addActionListener(this);
        
        
        
    }
        
      public static void  main(String[]args){
           Ventana prueba=new Ventana();
           prueba.setTitle("prueba de JTextField y JPasswordField");
           
           prueba.setSize(400, 500);
       
           prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
           prueba.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       t2.setText(t1.getText());
     
    }
    
}
