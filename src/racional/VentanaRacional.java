/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import racional.Racional2;

/**
 *
 * @author Mirela
 */
public class VentanaRacional extends JFrame implements ActionListener{
    
    Container c;
    JPanel panelN,panelC,panelS,panelRB,panelCentral;
    JLabel num1,num2,den1,den2;
    JTextField textonum1,textonum2,textoden1,textoden2;
    JRadioButton suma,resta,multiplicacion,division;
    ButtonGroup grupo;
    JTextArea areaTexto;
    JButton calcular,limpiar;
    GridBagConstraints gbc=new GridBagConstraints();
    
    
    VentanaRacional(){
        c=this.getContentPane();
        c.setLayout(new GridBagLayout());
        panelN=new JPanel();
        num1=new JLabel("Numerador1");
        num1.setFont(new Font("Arial",Font.BOLD,16));
        num2=new JLabel("Numerador2");
        num2.setFont(new Font("Arial",Font.BOLD,16));
        den1=new JLabel("Denominador1");
        den1.setFont(new Font("Arial",Font.BOLD,16));
        den2=new JLabel("Denominador2");
        den2.setFont(new Font("Arial",Font.BOLD,16));
        
        textonum1=new JTextField();
        textonum2=new JTextField();
        textoden1=new JTextField();
        textoden2=new JTextField();
        
       panelN.setLayout(new GridLayout(2,2,10,10));
       panelN.add(num1);
       panelN.add(textonum1);
       panelN.add(den1);
       panelN.add(textoden1);
       panelN.add(num2);
       panelN.add(textonum2);
       panelN.add(den2);
       panelN.add(textoden2);
       gbc.gridx=0;
        gbc.gridy=0;
       gbc.gridheight=2;
       gbc.gridwidth=4;
       gbc.weightx=1.0;
       gbc.weighty=1.0;
       
       
       
       c.add(panelN,gbc);  
       panelC=new JPanel();
      

       
       areaTexto=new JTextArea(15,15);
       Font fuente=new Font("Arial",Font.BOLD,16);
      // areaTexto.setSize();
       //areaTexto.setBackground(Color.red);
       areaTexto.setBorder(BorderFactory.createTitledBorder("RESULTADOS"));
       panelC.add(areaTexto);
      
      
       gbc.gridx=0;
       gbc.gridy=3;
       gbc.gridheight=3;
       gbc.gridwidth=2;
       gbc.weightx=0.5;
       gbc.weighty=0.4;
       
        c.add(panelC,gbc);
      
      
      
      
      panelRB=new JPanel();
      suma=new JRadioButton("Suma");
      suma.setFont(new Font("Arial",Font.BOLD,14));
      resta=new JRadioButton("Resta");
      resta.setFont(new Font("Arial",Font.BOLD,14));
      multiplicacion=new JRadioButton("Multiplicacion");
      multiplicacion.setFont(new Font("Arial",Font.BOLD,14));
      division=new JRadioButton("Division");
      division.setFont(new Font("Arial",Font.BOLD,14));
      grupo=new ButtonGroup();
      
      grupo.add(suma);
      grupo.add(resta);
      grupo.add(multiplicacion);
      grupo.add(division);
      panelRB.add(suma);
      panelRB.add(resta);
      panelRB.add(multiplicacion);
      panelRB.add(division);
      panelRB.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Operacion"));
      panelRB.setLayout(new GridLayout(4,1));
      
       gbc.gridx=3;
       gbc.gridy=4;
       gbc.gridheight=2;
       gbc.gridwidth=1;
       gbc.weightx=0.5;
       gbc.weighty=0.4;
        c.add(panelRB,gbc);
        
  
        
       panelS=new JPanel();
       
       calcular=new JButton("Calcular");
       calcular.setFont(new Font("Arial",Font.BOLD,14));
       limpiar=new JButton("Limpiar");
        limpiar.setFont(new Font("Arial",Font.BOLD,14));
       panelS.add(calcular);
       panelS.add(limpiar);
       
         gbc.gridx=0;
       gbc.gridy=6;
       gbc.gridheight=1;
       gbc.gridwidth=4;
       gbc.weightx=0.5;
       gbc.weighty=0.4;
       
       
       c.add(panelS,gbc);
       
      calcular.addActionListener(this);
      limpiar.addActionListener(this);
      suma.addActionListener(this);
      resta.addActionListener(this);
      multiplicacion.addActionListener(this);
      division.addActionListener(this);
       
   
    } 
     
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==calcular){
            System.out.println("seleccionaste el boton calcular");
            if(suma.isSelected()){
                System.out.println("suma");
                 Racional2 f1 = new Racional2(Integer.parseInt(textonum1.getText()), Integer.parseInt(textoden1.getText()));
                 Racional2 f2 = new Racional2(Integer.parseInt(textonum2.getText()), Integer.parseInt(textoden2.getText()));
        
                 Racional2 f3 = new Racional2();
                 f3.sumar(f1, f2);

                areaTexto.append (f3.mostrar()+"=" + f2.mostrar() + "+" + f1.mostrar()+"\n");
       
          
        
            }
            if(resta.isSelected()){
                
                    
                 Racional2 f1 = new Racional2(Integer.parseInt(textonum1.getText()), Integer.parseInt(textoden1.getText()));
                 Racional2 f2 = new Racional2(Integer.parseInt(textonum2.getText()), Integer.parseInt(textoden2.getText()));
        
                 Racional2 f3 = new Racional2();
                 f3.restar(f1, f2);

                areaTexto.append (f3.mostrar()+"=" + f2.mostrar() + "-" + f1.mostrar()+ "\n");
    
            }
            if(multiplicacion.isSelected()){
         
                 Racional2 f1 = new Racional2(Integer.parseInt(textonum1.getText()), Integer.parseInt(textoden1.getText()));
                 Racional2 f2 = new Racional2(Integer.parseInt(textonum2.getText()), Integer.parseInt(textoden2.getText()));
        
                 Racional2 f3 = new Racional2();
                 f3.multiplicar(f1, f2);

                areaTexto.append (f3.mostrar()+"=" + f2.mostrar() + "*" + f1.mostrar()+"\n");
                
            }
            if(division.isSelected()){
                 Racional2 f1 = new Racional2(Integer.parseInt(textonum1.getText()), Integer.parseInt(textoden1.getText()));
                 Racional2 f2 = new Racional2(Integer.parseInt(textonum2.getText()), Integer.parseInt(textoden2.getText()));
        
                 Racional2 f3 = new Racional2();
                 f3.dividir(f1, f2);

                //areaTexto.setText (f3.mostrar()+"=" + f2.mostrar() + "/" + f1.mostrar());
                areaTexto.append(f3.mostrar()+"=" + f2.mostrar() + "/" + f1.mostrar());
               
            }
        }
           
            
         if(e.getSource()==limpiar) {
             System.out.println("seleccionaste el boton limpiar");
            areaTexto.setText("");
         }
            
        }
    }
    


       
    

   

  
        
    
    
    
    
    

