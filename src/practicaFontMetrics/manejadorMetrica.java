/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaFontMetrics;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Mirela
 */
public class manejadorMetrica implements ItemListener{
    
    fontMetrics panelC;

    //Constructor 

    manejadorMetrica(){
        this.panelC=new fontMetrics();
    }

    manejadorMetrica(fontMetrics panelC){
        this.panelC=panelC;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
         if (e.getStateChange()==e.SELECTED) {
            System.out.println("estoy aqui");
			panelC.repaint();
		}
      
    }
    
}
