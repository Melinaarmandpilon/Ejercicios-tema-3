package ejerciciotema8.principal;

import ejerciciotema8.clase.Persona;

/**
 * Para practicar la encapsulación:
 *
 * Crear clase Persona.
 *
 * Crear variables las privadas edad, nombre y telefono de la clase Persona.
 *
 * Crear gets y sets de cada propiedad.
 *
 * Crear un objeto persona en el main.
 *
 * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */
public class Principal {

    public static void main (String[] args){
        Persona persona = new Persona();

        persona.setNombre("Melina");
        String nombre = persona.getNombre();

        persona.setEdad(25);
        int edad = persona.getEdad();

        persona.setTelefono("+549374579425");
        String telefono = persona.getTelefono();
        System.out.println("Su nombre es " + nombre + " tiene " + edad +" años y su numero de telefono es "+ telefono );
    }
}
