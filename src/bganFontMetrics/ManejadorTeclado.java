
package bganFontMetrics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Mirela
 */
public class ManejadorTeclado implements KeyListener {

    PanelMetrica panelT;

    ManejadorTeclado() {
        this.panelT = new PanelMetrica();
    }

    ManejadorTeclado(PanelMetrica panelT) {
        this.panelT = panelT;
    }

    // Si se pulsa "Intro" se muestra el nuevo texto
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() != 10) {
            System.out.println("Tecla " + e.getKeyChar() + " pulsada");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            panelT.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}
