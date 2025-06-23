package com.maquinacafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Vaso vasospequenos = new Vaso(5, 3); 
        Vaso vasosmedianos = new Vaso(5, 5); 
        Vaso vasosgrandes = new Vaso(5, 7); 
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(20); 

        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setvasospequenos(vasospequenos);
        maquina.setvasosmedianos(vasosmedianos);
        maquina.setvasosgrandes(vasosgrandes);
        maquina.setcafetera(cafetera);
        maquina.setazucarero(azucarero);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, esta es la maquina de cafe!");

        while (true) {
            System.out.println("\nselecciona el tamaño de vaso (pequeno, mediano, grande) o escribe 'salir' para terminar:");
            String tipoVaso = scanner.nextLine().toLowerCase();

            if (tipoVaso.equals("salir")) {
                System.out.println("Gracias por usar la maquina de cafe!!");
                break;
            }

            if (!tipoVaso.equals("pequeno") && !tipoVaso.equals("mediano") && !tipoVaso.equals("grande")) {
                System.out.println("Este tamaño de vaso no es valido, elije entre pequeno, mediano o grande");
                continue;
            }

            System.out.println("Cuantas cucharadas de azucar quieres? (del 0-20):");
            int cantidadAzucar;
            try {
                cantidadAzucar = Integer.parseInt(scanner.nextLine());
                if (cantidadAzucar < 0 || cantidadAzucar > 20) {
                    System.out.println("Esa cantidad de azcucar no es valida, ingresa un numero del 0 al 20.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida para la cantidad de azcucar, ingresa un numero!");
                continue;
            }

            String mensaje = maquina.getvasodecafe(tipoVaso, 1, cantidadAzucar);
            System.out.println(mensaje);

            
            System.out.println("\n------ Estado actual de los recursos ------");
            System.out.println("Vasos pequeños disponibles: " + vasospequenos.getcantidadvasos());
            System.out.println("Vasos medianos disponibles: " + vasosmedianos.getcantidadvasos());
            System.out.println("Vasos grandes disponibles: " + vasosgrandes.getcantidadvasos());
            System.out.println("Cafe disponible: " + cafetera.getcantidaddecafe() + " oz");
            System.out.println("Azucar disponible: " + azucarero.getcantidaddeazucar() + " cucharadas");
            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}

