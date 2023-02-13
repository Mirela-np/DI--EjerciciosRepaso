
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mirela
 */
public class Practica extends JFrame implements ActionListener, ItemListener {

    JLabel etiqueta1, etiqueta2, numero1, numero2, resultado, inic;
    Boton[] numeros, egal, resulta;
    Boton sumar;
    JPanel panelN, panelC, panelS;
    JTextField texto, texto1, texto2, texto3;
    JComboBox operacion;
    Container c;
    JFrame ventana;
    GridLayout hojaC;
    GridBagLayout hojaRes;
    Matematica calculadora = new Matematica();

    // metodo main
    
    public static void main(String[] args) {
        Practica ventana = new Practica();
        ventana.setTitle("tabla multiplicar");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
    
       //constructor clase

    Practica() {

        c = this.getContentPane();
        c.setLayout(new BorderLayout());

        // panel norte
        
        panelN = new JPanel();
        panelN.setLayout(new GridLayout(2, 1));
        etiqueta2 = new JLabel("Tabla de Multiplicar");
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 20));
        operacion = new JComboBox();
        c.add(panelN, BorderLayout.NORTH);
        panelN.add(etiqueta2);
        panelN.add(operacion);
        generarBox();

        //panel central
        
        panelC = new JPanel(hojaC);
        c.add(panelC, BorderLayout.CENTER);
        panelC.setLayout(new GridLayout(10, 3, 8, 8));
        hojaC = new GridLayout();
        numeros = new Boton[10];
        egal = new Boton[10];
        resulta = new Boton[10];
        Boton();

        
        //panel sur
        
        
        panelS = new JPanel(hojaRes);
        c.add(panelS, BorderLayout.SOUTH);
        panelS.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        numero1 = new JLabel("Numero 1:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panelS.add(numero1, gbc);

        numero2 = new JLabel("Numero 2:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelS.add(numero2, gbc);

        resultado = new JLabel("Resultado");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelS.add(resultado, gbc);

        texto1 = new JTextField("", 10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelS.add(texto1, gbc);

        texto2 = new JTextField("", 10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelS.add(texto2, gbc);

        texto3 = new JTextField("", 10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panelS.add(texto3, gbc);

        sumar = new Boton("Sumar");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 4;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;

        panelS.add(sumar, gbc);

        inic = new JLabel("Subprograma iniciado");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelS.add(inic, gbc);

        
       // llamar a los listener de los eventos
       
        operacion.addItemListener(this);
        sumar.addActionListener(this);
           

    }

    private void generarBox() {
        for (int i = 0; i < 11; i++) {
            operacion.addItem(String.valueOf(i));

        }
    }

    private void Boton() {

        for (int i = 0; i < 10; i++) {

            numeros[i] = new Boton(String.valueOf(i));
            panelC.add(numeros[i]);
            egal[i] = new Boton("=");
            panelC.add(egal[i]);
            resulta[i] = new Boton("");
            panelC.add(resulta[i]);

        }
    }

    
      //eventos 
    
    @Override
    public void actionPerformed(ActionEvent e) {
      try {
         int n1 = Integer.parseInt(texto1.getText());
         int n2 = Integer.parseInt(texto2.getText());
      
        Matematica suma = new Matematica(n1);  
        int resultado = suma.Sumar(n2);
        texto3.setText(String.valueOf(resultado));
        System.out.println(resultado);  
        
          } catch (NumberFormatException num) {
            num.getStackTrace();
          
            System.out.println("Tiene que introducir un numero correcto");   
                    }  

    }

   
    

    @Override
    public void itemStateChanged(ItemEvent e) {

        
        operacion.addItemListener(this);
        int val = operacion.getSelectedIndex();
        calculadora.setNum(val);
        for (int i = 0; i < resulta.length; i++) {
            resulta[i].setText(String.valueOf(calculadora.Multiplicar(i)));
        }

    }

}
