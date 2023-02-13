/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaTamañoFuente;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Mirela
 */
public class Ventana extends JFrame {
    
    Container c;
    JLabel etiqueta1;
    JTextField cuadroTexto;
    JLabel texto;
    ButtonGroup tamaño;
    JRadioButton tamaño12,tamaño18,tamaño24;
    JCheckBox estilo;
    GridBagConstraints gbc;
    JPanel tamañoP,estiloP;
    
    
    public static void main(String[] args) {
        Ventana miVentana=new Ventana();
         miVentana.setTitle("Ejemplo de uso de JCheckBox");
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        miVentana.setSize(400, 300);
        miVentana.setVisible(true);
    }
    
    Ventana(){
        c=this.getContentPane();
        c.setLayout(new GridBagLayout());
        gbc=new GridBagConstraints();
        
       //etiqueta
       
       etiqueta1=new JLabel("Introduce cualquier texto");
       etiqueta1.setFont(new Font("Serif",Font.BOLD,18));
       etiqueta1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
       
       gbc.fill=GridBagConstraints.HORIZONTAL;
       gbc.anchor=GridBagConstraints.CENTER;
       gbc.gridx=0;
       gbc.gridy=0;
       gbc.weightx=1.0;
       gbc.weighty=0.4;
       gbc.gridheight=1;
       gbc.gridwidth=3;
       gbc.insets=new Insets(2,10,2,10);
       
       c.add(etiqueta1,gbc);
       
       
        cuadroTexto=new JTextField("Texto de prueba");
        
       gbc.fill=GridBagConstraints.CENTER;
       gbc.anchor=GridBagConstraints.CENTER;
       gbc.gridx=0;
       gbc.gridy=1;
       gbc.weightx=0.4;
       gbc.weighty=0.4;
       gbc.gridheight=1;
       gbc.gridwidth=3;
       gbc.insets=new Insets(2,10,10,10);
       
       c.add(cuadroTexto,gbc);
        
        texto=new JLabel(cuadroTexto.getText());
        texto.setFont(new Font("SansSerif",Font.PLAIN,12));
        texto.setAlignmentX(CENTER_ALIGNMENT);
        
       gbc.fill=GridBagConstraints.NONE;
       gbc.anchor=GridBagConstraints.NORTHWEST;
       gbc.gridx=0;
       gbc.gridy=2;
       gbc.weightx=0.4;
       gbc.weighty=0.4;
       gbc.gridheight=1;
       gbc.gridwidth=1;
       gbc.insets=new Insets(2,10,2,1);
       
       c.add(texto,gbc);
       
        estiloP=new JPanel();
	estiloP.setLayout(new GridLayout(2,1));
	estiloP.setBorder(BorderFactory.createTitledBorder("Estilo"));
	estilo=new JCheckBox("Cursiva");
	estiloP.add(estilo);
        
       gbc.fill=GridBagConstraints.HORIZONTAL;
       gbc.anchor=GridBagConstraints.NORTHWEST;
       gbc.gridx=0;
       gbc.gridy=3;
       gbc.weightx=0.4;
       gbc.weighty=0.4;
       gbc.insets=new Insets(2,10,10,10);
       
       c.add(estiloP,gbc);
       
                tamañoP=new JPanel();
		tamañoP.setLayout(new GridLayout(3,1));
		tamañoP.setBorder(BorderFactory.createTitledBorder("Tamaño"));
		tamaño12=new JRadioButton("12",true);
		tamaño18=new JRadioButton("18",false);
		tamaño24=new JRadioButton("24",false);
		tamaño=new ButtonGroup();
		tamaño.add(tamaño12);
		tamaño.add(tamaño18);
		tamaño.add(tamaño24);
		
		tamañoP.add(tamaño12);
		tamañoP.add(tamaño18);
		tamañoP.add(tamaño24);
                
                 gbc.gridx=2;
                 gbc.gridy=3;
                 gbc.weightx=0.2;
                 gbc.weighty=0.4;
                
               
        c.add(tamañoP,gbc);
        
        
        
    }
    
}
