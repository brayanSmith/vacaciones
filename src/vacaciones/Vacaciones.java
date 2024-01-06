package vacaciones;

import java.util.Scanner;

public class Vacaciones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        String nombre = "";
        int clave = 0;
        int antiguedad;
        int reiniciar = 0;
        do {
            System.out.println("*******************************************************");
            System.out.println("*Bienvenido al simulador de sistema vacacional*");
            System.out.println("*******************************************************");

            System.out.println("¿Cuál es el nombre del trabajador?");
            do {
                nombre = in.nextLine().trim();
            } while (nombre.isEmpty());

            System.out.println("¿Cual es la clave de su departamento?");
            clave = in.nextInt();

            System.out.println("¿Cuantos años de servicio tiene el trabajador?");
            antiguedad = in.nextInt();

            if (clave == 1) {

                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + " Tiene 6 días de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 14 días de vacaciones");
                } else if (antiguedad > 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 20 días de vacaciones");
                } else {
                    System.out.println("Aún no tiene derecho a vacaciones :(");
                }

            } else if (clave == 2) {

                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + " Tiene 7 días de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 15 días de vacaciones");
                } else if (antiguedad > 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 22 días de vacaciones");
                } else {
                    System.out.println("Aún no tiene derecho a vacaciones :(");
                }

            } else if (clave == 3) {

                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + " Tiene 10 días de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 20 días de vacaciones");
                } else if (antiguedad > 6) {
                    System.out.println("El trabajador " + nombre + " Tiene 30 días de vacaciones");
                } else {
                    System.out.println("Aún no tiene derecho a vacaciones :(");
                }

            } else {
                System.out.println("Revise que no halla digitado mal algun dato");
            }

            System.out.println("[1] reiniciar / [2] salir");
            reiniciar = in.nextInt();

        } while (reiniciar == 1);

    }

}
