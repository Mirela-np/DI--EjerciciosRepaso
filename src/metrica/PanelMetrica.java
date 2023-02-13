/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metrica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 *
 * @author a21nicoletamt
 */
public class PanelMetrica extends JPanel {

    JPanel panelN, panelS;

    JComboBox tipoLetra, estilo, tamano;

    JTextField cajaTexto, alt, asc, maxA, maxAdv, lead, desc, maxD, stringW;

    JLabel altura, ascent, maxAsc, maxAdvance, leading, descend, maxDesc, stringWidth;

    Font sf;

    
    // Constructor de la clase
    PanelMetrica() {

        this.setLayout(new BorderLayout());
        
        this.setBackground(Color.WHITE);
        
        // Inicializa el panel norte
        panelN = new JPanel();
        
        // Rellena el combobox del tipo de letra con las fuentes disponibles en el sistema y selecciona "Arial" por defecto
        tipoLetra = new JComboBox();
        String[] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombreFuente : nombreFuentes) {
            tipoLetra.addItem(nombreFuente);
            tipoLetra.setSelectedItem("Arial");
        }

        // Rellena el combobox de los estilos de letra y selecciona "Normal" por defecto
        estilo = new JComboBox();
        String[] estilos = {"Normal", "Negrita", "Cursiva", "Negrita+Cursiva"};
        for (String estilo1 : estilos) {
            estilo.addItem(estilo1);
            estilo.setSelectedItem("Normal");
        }

        // Rellena el combobox de los posibles tamaños de letra y selecciona "80" por defecto
        tamano = new JComboBox();
        Integer[] tamanios = {12, 16, 18, 20, 30, 40, 60, 80};
        for (Integer tamanio : tamanios) {
            tamano.addItem(tamanio);
            tamano.setSelectedItem(80);
        }
        
        // Rellena el campo de texto con la palabra "Alpino" por defecto
        cajaTexto = new JTextField("Alpino");
        
        // Añade los elementos anteriores al panel norte
        panelN.add(tipoLetra);
        panelN.add(estilo);
        panelN.add(tamano);
        panelN.add(cajaTexto);
        
        // Establece el layout del panel norte
        panelN.setLayout(new GridLayout(1, 4));
        
        // Añade el panel norte al contenedor
        this.add(panelN, BorderLayout.NORTH);

        // Inicializa el panel sur
        panelS = new JPanel();
        
        // Inicializa los componentes del panel sur
        altura = new JLabel("Height");
        altura.setHorizontalAlignment(JLabel.CENTER);
        ascent = new JLabel("Ascent");
        ascent.setHorizontalAlignment(JLabel.CENTER);
        maxAsc = new JLabel("MaxAscent");
        maxAsc.setHorizontalAlignment(JLabel.CENTER);
        maxAdvance = new JLabel("MaxAdvance");
        maxAdvance.setHorizontalAlignment(JLabel.CENTER);
        leading = new JLabel("Leading");
        leading.setHorizontalAlignment(JLabel.CENTER);
        descend = new JLabel("Descent");
        descend.setHorizontalAlignment(JLabel.CENTER);
        maxDesc = new JLabel("MaxDescend");
        maxDesc.setHorizontalAlignment(JLabel.CENTER);
        stringWidth = new JLabel("stringWidth");
        stringWidth.setHorizontalAlignment(JLabel.CENTER);
        alt = new JTextField();
        asc = new JTextField();
        maxA = new JTextField();
        maxAdv = new JTextField();
        lead = new JTextField();
        desc = new JTextField();
        maxD = new JTextField();
        stringW = new JTextField();
        
        // Añade los componentes al panel sur
        panelS.add(altura);
        panelS.add(alt);
        panelS.add(ascent);
        panelS.add(asc);
        panelS.add(maxAsc);
        panelS.add(maxA);
        panelS.add(maxAdvance);
        panelS.add(maxAdv);
        panelS.add(leading);
        panelS.add(lead);
        panelS.add(descend);
        panelS.add(desc);
        panelS.add(maxDesc);
        panelS.add(maxD);
        panelS.add(stringWidth);
        panelS.add(stringW);
        
        // Establece el layout del panel sur
        panelS.setLayout(new GridLayout(4, 4));
        
        // Añade el panel sur al contenedor
        this.add(panelS, BorderLayout.SOUTH);

        // Inicializa la fuente
        sf = new Font("Helvetica", Font.PLAIN, 12);
    }

    // Actualiza los valores de los componentes del panel sur
    void actualize(FontMetrics fm) {
        alt.setText(Integer.toString(fm.getHeight()));
        asc.setText(Integer.toString(fm.getAscent()));
        maxA.setText(Integer.toString(fm.getMaxAscent()));
        maxAdv.setText(Integer.toString(fm.getMaxAdvance()));
        lead.setText(Integer.toString(fm.getLeading()));
        desc.setText(Integer.toString(fm.getDescent()));
        maxD.setText(Integer.toString(fm.getMaxDescent()));
        stringW.setText(Integer.toString(fm.stringWidth(cajaTexto.getText())));
    }

    // Devuelve el enumerado correspondiente al tipo de fuente elegida
    int FontStyle(String estiloFuente) {

        if (estiloFuente.equals("Normal")) {
            return Font.PLAIN;
        }
        if (estiloFuente.equals("Negrita")) {
            return Font.BOLD;
        }
        if (estiloFuente.equals("Cursiva")) {
            return Font.ITALIC;
        }
        if (estiloFuente.equals("Negrita+Cursiva")) {
            return Font.ITALIC + Font.BOLD;
        }
        return Font.PLAIN;

    }

    // Crea un objeto de tipo Font partiendo de los valores introducidos en el panel norte
    Font createFont() {
        
        String fuente = tipoLetra.getSelectedItem().toString();
        String estiloFuente = estilo.getSelectedItem().toString();
        String tamanio = tamano.getSelectedItem().toString();
        
        return new Font(fuente, FontStyle(estiloFuente), Integer.parseInt(tamanio));
        
    }
    
    
    public void PaintComponent(Graphics g){
        
        
        
    }
}
