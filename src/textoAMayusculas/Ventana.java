/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textoAMayusculas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mirela
 */
public class Ventana extends JFrame implements ActionListener {
    
    
    Container c;
    JLabel etiqueta;
    JTextField texto;
    JCheckBox casilla;
    
    public static void main(String[] args) {
        
        Ventana miVentana=new Ventana();
        miVentana.setTitle("Ejemplo de uso de JCheckBox");
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        miVentana.setSize(300, 400);
        miVentana.setVisible(true);
        
        
    }
    
    
    Ventana(){
        c=this.getContentPane();
        
        JPanel panel=new JPanel();
      etiqueta=new JLabel("Introduce un texto cualquiera");
      etiqueta.setFont(new Font("Arial",Font.BOLD,18));
      panel.add(etiqueta);
      texto=new JTextField(20);
      panel.add(texto);
      casilla=new JCheckBox("Convertir el texto a mayusculas");
      panel.add(casilla);
      casilla.setMnemonic('c');
        c.add(panel);
        
        casilla.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       texto.setText(texto.getText().toUpperCase());
    }
    
}
