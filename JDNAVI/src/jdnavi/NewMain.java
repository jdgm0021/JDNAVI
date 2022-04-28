
package jdnavi;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.print("Introduce un nombre para tu fruteria: ");
        Fruteria fruteria = new Fruteria(scanner.nextLine());
        System.out.println("");
        System.out.println("");
        System.out.println("BIENVENIDO A TU NUEVA FRUTERIA '" + fruteria.getNombre() + "'.");
        do {
            System.out.println("");
            imprimirMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("ERROR: Selecciona una opción correcta...");
                    break;
            }
            
        } while (!salir);
        
    }
    
    public static void imprimirMenu(){
        System.out.println("Selecciona una opción:");
        System.out.println("1.- Crear un cliente");
        System.out.println("2.- Añadir un cliente a la cola");
        System.out.println("3.- Atender un cliente");
        System.out.println("4.- Adelantar un cliente");
        System.out.println("5.- Atrasar un cliente");
        System.out.println("6.- Mostrar los clientes atendidos");
        System.out.println("7.- Mostrar los clientes no atendidos");
    }
}
