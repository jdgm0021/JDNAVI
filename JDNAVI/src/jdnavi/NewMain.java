
package jdnavi;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int i = 0;
        System.out.print("Introduce un nombre para tu fruteria: ");
        Fruteria fruteria = new Fruteria(scanner.nextLine());
        System.out.println("");
        System.out.println("");
        System.out.println("BIENVENIDO A FRUTERIA " + fruteria.getNombre().toUpperCase() + ".");
        do {
            System.out.println("");
            imprimirMenu();
            opcion = scanner.nextInt();
            System.out.println("");
            
            switch(opcion) {
                case 1:
                    System.out.println("");
                    Persona iPersona;
                    System.out.println("Quieres crear una persona aleatoria?");
                    System.out.print("T -> Si; F -> No  -- ");
                    System.out.println("");
                    if (scanner.next().equals("T")) {
                        iPersona = new Persona();
                    } else {
                        System.out.print("Introduce nombre para el nuevo cliente: ");
                        String nombreCliente = scanner.next();
                        System.out.println("");
                        System.out.print("Introduce la edad: ");
                        int edad = scanner.nextInt();
                        System.out.println("");
                        System.out.println("Introduce el genero.");
                        System.out.print("M -> Hombre; F -> Mujer -- ");
                        boolean genero = scanner.next().equals("M");
                        iPersona = new Persona(nombreCliente, edad, genero);
                    }
                    if(iPersona.genero){
                        System.out.println("Se ha creado el cliente " + iPersona.nombre + ", con " + iPersona.edad + " años y con genero masculino.");
                    }else{
                        System.out.println("Se ha creado el cliente " + iPersona.nombre + ", con " + iPersona.edad + " años y con genero femenino.");
                    }
                    
                    break;
                case 2:
                    System.out.print("Introduce nombre para el nuevo cliente: ");
                    String name = scanner.next();
                    System.out.println("");
                    System.out.print("Introduce la edad: ");
                    int age = scanner.nextInt();
                    System.out.println("");
                    System.out.println("Introduce el genero.");
                    System.out.print("M -> Hombre; F -> Mujer -- ");
                    boolean gen = scanner.next().equals("M");
                    fruteria.añadirCliente(name, age, gen);
                    break;
                case 3:
                    fruteria.atenderCliente();
                    break;
                case 4:
                    System.out.print("Indica la posicion del cliente a adelantar: ");
                    int pos = scanner.nextInt();
                    fruteria.adelantarCliente(pos);
                    break;
                case 5:
                    System.out.print("Indica la posicion del cliente a atrasar: ");
                    int pos2 = scanner.nextInt();
                    fruteria.atrasarCliente(pos2);
                    break;
                case 6:
                    fruteria.mostrarClientesAtendidos();
                    break;
                case 7:
                    fruteria.mostrarClientesNoAtendidos();
                    break;
                case 8:
                    salir = true;
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("Gracias por usar JDNAVI");
                    break;
                default:
                    System.out.println("ERROR: Selecciona una opción correcta...");
                    break;
            }
            
        } while (!salir);
        
    }
    
    public static void imprimirMenu(){
        System.out.println("1.- Crear un cliente");
        System.out.println("2.- Añadir un cliente a la cola");
        System.out.println("3.- Atender un cliente");
        System.out.println("4.- Adelantar un cliente");
        System.out.println("5.- Atrasar un cliente");
        System.out.println("6.- Mostrar los clientes atendidos");
        System.out.println("7.- Mostrar los clientes no atendidos");
        System.out.println("8.- Salir");
        System.out.print("Selecciona una opción: ");
    }
}
