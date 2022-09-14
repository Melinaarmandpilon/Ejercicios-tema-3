package ejerciciotema9.principal;

import ejerciciotema9.clase.Cliente;
import ejerciciotema9.clase.Trabajador;

/**
 * Crea una clase Persona con las siguientes variables:
 *
 * La edad
 *
 * El nombre
 *
 * El teléfono
 *
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
 *
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 *
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */
public class Main {

        public static void main (String[] args){
                Cliente cliente = new Cliente();
                cliente.setCredito(45578.54);
                double credito = cliente.getCredito();

                cliente.setEdad(20);
                int edad = cliente.getEdad();

                cliente.setNombre("juana");
                String nombre = cliente.getNombre();

                cliente.setTelefono("4579412347");
                String telefono = cliente.getTelefono();

                System.out.println("Su nombre es " + nombre + " tiene " + edad +" años y su numero de telefono es "+ telefono +" y su credito es "+ credito  );

                Trabajador trabajador = new Trabajador();
                trabajador.setSalario(145026.20);
                Double salarioTrabajador = trabajador.getSalario();

                trabajador.setEdad(30);
                int edadTrabajador = trabajador.getEdad();

                trabajador.setNombre("Martin");
                String nombreTrabajador = trabajador.getNombre();

                trabajador.setTelefono("4578347");
                String telefonoTrabajador = trabajador.getTelefono();

                System.out.println("Su nombre es " + nombreTrabajador + " tiene " + edadTrabajador +" años y su numero de telefono es "+ telefonoTrabajador +" y su salario es "+ salarioTrabajador  );
        }

}
