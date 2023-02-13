/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metrica;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Mirela
 */
public class ManejadorMetrica implements ItemListener{
    
    PanelMetrica panelC;
    
    ManejadorMetrica(){
        this.panelC=new PanelMetrica();
        
    }

    public ManejadorMetrica(PanelMetrica panelC) {
        this.panelC = panelC;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if(e.getStateChange()==ItemEvent.SELECTED){
            panelC.repaint();
            
        }
    }
    
}
