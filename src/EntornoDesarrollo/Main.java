package EntornoDesarrollo;
import funciones.Coche;

public class Main {

    public static void main(String[] args) {

        suma ( 10, 5, 10);

        Coche miCoche = new Coche(); //instancia, paso por referencia
        miCoche.IncrementoNumeroPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}