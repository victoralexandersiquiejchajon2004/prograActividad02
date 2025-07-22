/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratarea3;

/**
 *
 * @author Sayda
 */
public class Conejo extends Mascota implements AtencionEspecial {
    
    @Override
    public void hacerSonido(){
        System.out.println("el conejo come zanahoria y hace sonido ");
    }
    @Override
    public void recibirAtencionEspecial(){
       System.out.println("el conejo si recibe atencion especial ");
    }
}
