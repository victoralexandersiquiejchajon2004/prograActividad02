/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratarea3;

import java.util.ArrayList;

/**
 *
 * @author Sayda
 */
public class ConsultaVeterinaria {
    public static void main(String[] args){
    
     ArrayList<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());

        for (Mascota m : mascotas) {
            m.hacerSonido();
            m.descansar();

            if (m instanceof AtencionEspecial) {
                ((AtencionEspecial) m).recibirAtencionEspecial();
            }

            System.out.println(); 
        }
        for (Mascota m : mascotas) {
    m.hacerSonido();
    m.descansar();

    if (m instanceof AtencionEspecial) {
        ((AtencionEspecial) m).recibirAtencionEspecial();
    }

    if (m instanceof Vacunable) {
        ((Vacunable) m).vacunar();
    }

    System.out.println();
}

    }
    
}
