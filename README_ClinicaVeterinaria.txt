Clínica Veterinaria - Proyecto de Programación Orientada a Objetos



Diseño de Clases

- Mascota (abstracta): clase base con comportamiento común y un método abstracto.
- Perro, Gato, Conejo, Tortuga: extienden Mascota, cada uno con su propio sonido.
- AtencionEspecial (interfaz): implementada por aquellas mascotas que requieren cuidados especiales.
- Vacunable (interfaz): comportamiento adicional para mascotas que pueden recibir vacunas.
- ConsultaVeterinaria (clase principal): simula una consulta veterinaria, utilizando polimorfismo, instanceof y aplicación del principio de sustitución.

Principios aplicados

- Herencia y abstracción (Mascota).
- Polimorfismo y principio de sustitución (lista Mascota con diferentes tipos de objetos).
- Interfaces para comportamientos adicionales (AtencionEspecial, Vacunable).
- Uso de @Override en métodos sobrescritos.
