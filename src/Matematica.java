/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mirela
 */
public class Matematica {
    
    private int num;

    public Matematica() {
    }

    public Matematica(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num=" + num + '}';
    }
    
    public int Sumar(int num1){
        return this.num+num1;
        
      
    }
    public int Multiplicar(int num1){
        return this.num*num1;
    }
    
    
    
    
}
