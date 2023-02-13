/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metrica;

import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Mirela
 */
public class Metrica extends JFrame {
    
    PanelMetrica panelM;
    
        public static void main(String[] args) {

        Metrica ventana = new Metrica();

        ventana.setTitle("Ventana Metrica");
        ventana.setSize(1000, 600);
        ventana.setVisible(true);

    }
        
        Metrica(){
            
            panelM=new PanelMetrica();
            this.add(panelM);
            
            
            panelM.estilo.addItemListener(new ManejadorMetrica(panelM));
            panelM.tipoLetra.addItemListener(new ManejadorMetrica(panelM));
            panelM.tamano.addItemListener(new ManejadorMetrica(panelM));
            panelM.cajaTexto.addKeyListener(new ManejadorTeclado(panelM));
            
            
            
            
        }
        
        
        
    
}
