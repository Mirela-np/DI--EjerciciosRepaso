/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaFontMetrics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author a21nicoletamt
 */
public class fontMetrics extends JFrame {

    Container c;
    
    JPanel panelN, panelS, panelV,panelM;
    
    JComboBox tipoLetra, estilo, tamano;
    
    JTextField cajaTexto, alt, asc, maxA, maxAdv, lead, desc, maxD, stringW;
    
    JLabel altura, ascent, maxAsc, maxAdvance, leading, descend, maxDesc, stringWidth;
    
    JLabel ascenso, lineaBase, descenso;
    
    Font sf = new Font("Helvetica", Font.PLAIN, 12);

    public static void main(String[] args) {

        fontMetrics ventana = new fontMetrics();
        ventana.setSize(1000, 600);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    fontMetrics() {
        c = this.getContentPane();
        c.setLayout(new BorderLayout());

        panelN = new JPanel();
        tipoLetra = new JComboBox();
        estilo = new JComboBox();
        tamano = new JComboBox();

        String[] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (int i = 0; i < nombreFuentes.length; i++) {
            tipoLetra.addItem(nombreFuentes[i]);
        }

        String[] estilos = {"Normal", "Negrita", "Cursiva", "Negrita+Cursiva"};
        for (int j = 0; j < estilos.length; j++) {
            estilo.addItem(estilos[j]);
            estilo.setSelectedItem("Normal");
        }

        Integer[] tamanios = {12, 16, 18, 20, 30, 40, 60, 80};
        for (int k = 0; k < tamanios.length; k++) {
            tamano.addItem(tamanios[k]);
            tamano.setSelectedItem(80);
        }
        cajaTexto = new JTextField("Alpino");
        panelN.add(tipoLetra);
        panelN.add(estilo);
        panelN.add(tamano);
        panelN.add(cajaTexto);
        panelN.setLayout(new GridLayout(1, 4));
        c.add(panelN, BorderLayout.NORTH);

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

        panelS = new JPanel();
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
        panelS.setLayout(new GridLayout(4, 2));
        c.add(panelS, BorderLayout.SOUTH);
        
        panelM=new JPanel();
        c.add(panelM);
        
          tipoLetra.addItemListener(new manejadorMetrica(this));
          estilo.addItemListener(new manejadorMetrica(this));
          tamano.addItemListener(new manejadorMetrica(this));
          cajaTexto.addKeyListener(new manejadorTeclado(this));

    }


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

    Font createFont() {
        String fuente = tipoLetra.getSelectedItem().toString();
        String estiloFuente = estilo.getSelectedItem().toString();
        String tamanio = tamano.getSelectedItem().toString();
        return new Font(fuente, FontStyle(estiloFuente), Integer.parseInt(tamanio));
    }

   
        public void actionPerformed(ActionEvent e) {
            
            System.out.println("Evento en: "+e.getSource().toString());
            
            
            
            repaint();
        }

    


        public void paint(Graphics g) {

            super.paint(g);

            // Asignar valores inciales para dibujar las lineas
            int x0 = 10, xi = 100, y0 = 130, xf = 370;

            // Sumar el tamaño de la altura del panel Norte
            y0 = panelN.getHeight() + y0;
            // Obtiene el punto final en función del tamaño de la ventana
            xf = this.getWidth();

            Font font = createFont();
            g.setFont(font);
            FontMetrics fm = g.getFontMetrics();
            actualize(fm);

            int h = fm.getHeight();
            int y = y0;
            // Asignar el color al texto
            g.setColor(Color.blue);
            g.drawString(cajaTexto.getText(), xi + 20, y);
            g.setFont(sf);

            // Asignar el color a las lineas
            g.setColor(Color.red);

            g.drawString("linea base", x0, y);
            g.drawLine(xi, y, xf, y);

            y = y0 - fm.getAscent();
            g.drawString("Ascenso", x0, y);
            g.drawLine(xi, y, xf, y);

            y = y0 + fm.getDescent();
            g.drawString("Descenso", x0, y);
            g.drawLine(xi, y, xf, y);

            y = y0 - fm.getMaxAscent() - fm.getLeading();
            g.drawString("Leading", xf + 10, y);
            g.drawLine(xi, y, xf, y);
            
            
            
            
        }

    }

