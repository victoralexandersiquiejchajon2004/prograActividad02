Clínica Veterinaria - Proyecto de Programación Orientada a Objetos

Este proyecto es una simulación orientada a objetos del sistema básico de una clínica veterinaria. 
Se modelan diferentes tipos de mascotas y sus comportamientos durante la consulta veterinaria.

Diseño de Clases
----------------
- Mascota (abstracta): clase base con comportamiento común y un método abstracto hacerSonido().
- Perro, Gato, Conejo, Tortuga: extienden Mascota, cada uno con su propio sonido.
- AtencionEspecial (interfaz): implementada por aquellas mascotas que requieren cuidados especiales (por ejemplo, Conejo).
- Vacunable (interfaz): comportamiento adicional para mascotas que pueden recibir vacunas (por ejemplo, Perro).
- ConsultaVeterinaria (clase principal): simula una consulta veterinaria, utilizando polimorfismo, instanceof y aplicación del principio de sustitución.

Principios aplicados
---------------------
- Herencia y abstracción (Mascota).
- Polimorfismo y principio de sustitución (lista Mascota con diferentes tipos de objetos).
- Interfaces para comportamientos adicionales (AtencionEspecial, Vacunable).
- Uso de @Override en métodos sobrescritos.
- Diseño extensible, modular y limpio.

Repositorio público
-------------------
Pega aquí el enlace a tu repositorio de GitHub:
https://github.com/TuUsuario/ClinicaVeterinaria
