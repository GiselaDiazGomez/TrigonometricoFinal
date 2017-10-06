/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometricofinal;


/**
 *
 * @author gisel
 */
public class Trigonometrico extends Calculador{
    
    
    void Transformar(){
        operando1=(float) Math.toRadians(operando1);
    }
    void Seno(){
        Transformar();
        resultado=(float) Math.sin(operando1);
    }
    void Coseno(){
        Transformar();
        resultado=(float) Math.cos(operando1);
    }
    void Tangent(){
        Transformar();
        resultado=(float) Math.tan(operando1);
    }
}

