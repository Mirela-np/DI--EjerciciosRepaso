package bganFontMetrics;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Mirela
 */
public class ManejadorMetrica implements ItemListener {

    PanelMetrica panelC;

    //Constructor 
    ManejadorMetrica() {
        this.panelC = new PanelMetrica();
    }

    ManejadorMetrica(PanelMetrica panelC) {
        this.panelC = panelC;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("'" + e.getItem() + "' seleccionado");
            panelC.repaint();
        }

    }

}
