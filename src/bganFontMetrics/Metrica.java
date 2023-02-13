package bganFontMetrics;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author Mirela
 */
public class Metrica extends JFrame {

    // Panel de esta ventana
    PanelMetrica panelM;

    // Constructor
    public Metrica() {
        
        // Inicializa el panel
        panelM = new PanelMetrica();
        
        // Asigna el panel a esta ventana
        this.add(panelM);

        // Añade los manejadores de eventos
        panelM.tipoLetra.addItemListener(new ManejadorMetrica(panelM));
        panelM.estilo.addItemListener(new ManejadorMetrica(panelM));
        panelM.tamano.addItemListener(new ManejadorMetrica(panelM));
        panelM.cajaTexto.addKeyListener(new ManejadorTeclado(panelM));
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {

        Metrica ventana = new Metrica();

        ventana.setTitle("Ventana Metrica");
        ventana.setSize(1000, 600);
        ventana.setVisible(true);

    }

}
