/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaFontMetrics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Mirela
 */
public class manejadorTeclado implements KeyListener{
    fontMetrics panelT;
    
    
    manejadorTeclado(){
        this.panelT=new fontMetrics();
    }

    manejadorTeclado(fontMetrics panelT){
        this.panelT=panelT;
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        if (arg0.getKeyCode() == 10)
			panelT.repaint();

    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
