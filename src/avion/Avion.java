package avion;

import java.util.Scanner;

public class Avion {

    public static void main(String[] args) {

        double valorkm = 35.00, km, dias, desc, valorviaje, valordesc, total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la distancia la que va a vijar en kilometros: ");
        km = entrada.nextDouble();

        System.out.println("Ingrese los días de estacia en destino: ");
        dias = entrada.nextDouble();

        if (km > 1000 && dias > 7) {
            desc = 0.30;
            System.out.println("Tienes descuento de 30%");
        } else {
            desc = 0;
        }

        valorviaje = valorkm * km;
        valordesc = valorviaje * desc;

        System.out.println("Valor total neto: $" + valorviaje);
        System.out.println("Valor descuento : -$" + valordesc);
        total = valorviaje - valordesc;

        System.out.println("Valor a pagar : $" + total);

    }

}
