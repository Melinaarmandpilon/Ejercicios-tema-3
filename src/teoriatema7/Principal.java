package teoriatema7;

public class Principal {

    public static void main(String[] args){
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);

        System.out.println(coche.velocidadActual);
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        coche.desacelerar();

        Coche coche2 = new Coche();
        System.out.println(coche2.velocidadActual);
    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche (){
        numeroDePuertas=5;
        velocidadMaxima=120;
        System.out.println("Estoy en el constructor ***sin nada***");
    }
    public Coche(int puertas, int velocidad){
        numeroDePuertas= puertas;
        velocidadMaxima=velocidad;
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }

    public void acelerar(){
        velocidadActual+=15;
    }
    public void desacelerar(){}
}
