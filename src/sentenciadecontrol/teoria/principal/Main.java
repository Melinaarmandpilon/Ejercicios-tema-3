package sentenciadecontrol.teoria.principal;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        //si pasa esto, haz esto
        String estacion = "otro";

        if( estacion == "verano"){
            System.out.println(" Es verano" );
        } else if (estacion == "primavera") {
            System.out.println(" Es primavera" );
        }else {
            System.out.println(" Es otra estacion...." );
        }


        /**
            * bucle WHILE: se va a ejecutar mientras se cumpla esa condicion
            * var contador=10
            * mientras el contador mayor a cero
            * resta uno al contador
            * hasta que rompamos el bucle
         */

        int contador =10;
        while(contador>10){
            System.out.println(" Contador vale:" + contador );
            //contador=contador-1;
            //contador-=1;
            //contador--;
            contador-=5;
        }
        //Mi codigo sigue por aqui


        /**
            BUCLE DO-WHILE

            HAZ
                RESTA UNO AL CONTADOR
            MIENTRAS (CONTADOR SEA MATOR QUE 10)

         */
        int contadorDoWhile =10;
        do {
            System.out.println(" contadorDoWhile vale:" + contadorDoWhile );
            contadorDoWhile-=1;
        }while ((contadorDoWhile>10));

        /**
         * BUCLES
         * FOR -->PARA
         * SE DIVIDE EN TRES PARTES
         * for (INICIALIZACION; COMPARACION;ACCION)
         */
        for (int contadorFor=1;contadorFor<=10; contadorFor++){
            System.out.println(" contadorFor vale:" + contadorFor );
        }

        int valores[]= new int[5];
        valores= new int[]{10, 20, 50, 40, 45};

        for (int i=0;i<valores.length;i++){
            System.out.println(" valores vale:" + valores[i] );
        }

        /**
         * Interruptores: switch
         * var estacion ="verano"
         * discierne(estacion)
         *      caso "verano"
         *          imprime "Es verano"
          *      caso "iNVIERNO"
         *          imprime "Es iNVIERNO"
         */

        String dia = "Lunes";
        switch (dia){
            case "Lunes":
                System.out.println("Es Lunes" );
                break; // para que corte acá cuando entra, sino entra al próximo
            case "Martes":
                System.out.println("Es Martes" );
                break;
            case "Miércoles":
                System.out.println("Es Miércoles" );
                break;
            case "jueves":
                System.out.println("Es jueves" );
                break;
            default:
                System.out.println("Estoy en default");
        }
    }



}
