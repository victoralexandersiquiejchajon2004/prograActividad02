/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratarea3;

/**
 *
 * @author Sayda
 */
public class Perro extends Mascota implements Vacunable {
    
    @Override
    public void hacerSonido(){
       System.out.println("el perro hace gua, gua "); 
    }

    @Override
    public void vacunar() {
        System.out.println("el perro ha sido vacunado con exito contra la rabia ");
    }
    
}
