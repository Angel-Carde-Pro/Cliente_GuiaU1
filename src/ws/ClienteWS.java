package ws;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ClienteWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean otraOperacion = true;

        while (otraOperacion) {
            System.out.println("---------- GUIA 1 - ANGEL CARDENAS - M5A ----------");
            System.out.print("Por favor, ingrese el nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Por favor, ingrese la contraseña: ");
            String contrasenia = scanner.nextLine();

            WSOperations_Service servicio = new WSOperations_Service();
            WSOperations cliente = servicio.getWSOperationsPort();

            if (cliente.login(usuario, contrasenia)) {
                System.out.println("------ Bienvenido " + usuario + "--------");
                System.out.println(" ");

                do {
                    System.out.println("----- MENU ---- \n1. Funciones Matematicas.\n2. Formulas Fisicas\n3. Salir");
                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            FuncionesMatematicas(cliente);
                            break;
                        case 2:
                            FormulaFisica(cliente);
                            break;
                        case 3:
                            System.out.println("--- Hasta luego ---");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Ingrese una opción valida");
                            break;
                    }

                    System.out.println("¿Desea realizar otra operación? (S/N): ");
                    String respuesta = scanner.next();
                    otraOperacion = respuesta.equalsIgnoreCase("S");
                } while (otraOperacion);

            } else {
                System.out.println("El usuario o la contraseña estan incorrectos");
                System.out.println("\nIntente nuevamente:");
            }
        }
        scanner.close();
    }

    public static void FuncionesMatematicas(WSOperations cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Funciones matematicas");
        System.out.println("1.SUMA / 2.RESTA / 3.MULTIPLICACION / 4.DIVISION");

        int funcion = scanner.nextInt();
        System.out.println("");
        switch (funcion) {
            case 1:
                System.out.println("SUMA");
                System.out.print("Ingrese primer numero: ");
                int a = scanner.nextInt();
                System.out.print("Ingrese segundo numero: ");
                int b = scanner.nextInt();

                int resultado = cliente.suma(a, b);
                System.out.println("El resultado de la suma es: " + resultado);
                System.out.println(" ");

                break;
            case 2:
                System.out.println("RESTA");
                System.out.print("Ingrese primer numero: ");
                int ar = scanner.nextInt();
                System.out.print("Ingrese segundo numero: ");
                int br = scanner.nextInt();

                int resultador = cliente.resta(ar, br);
                System.out.println("El resultado de la resta es: " + resultador);

                break;
            case 3:
                System.out.println("MULTIPLICACION");
                System.out.print("Ingrese primer numero: ");
                int a1 = scanner.nextInt();
                System.out.print("Ingrese segundo numero: ");
                int b1 = scanner.nextInt();

                int resultado1 = cliente.multiplicacion(a1, b1);
                System.out.println("El resultado de la multiplicacion es: " + resultado1);
                System.out.println("");
                break;

            case 4:
                System.out.println("DIVISION");
                System.out.print("Ingrese primer numero: ");
                int ad = scanner.nextInt();
                System.out.print("Ingrese segundo numero: ");
                int bd = scanner.nextInt();

                double resultad = cliente.division(ad, bd);
                System.out.println("El resultado de la division es: " + resultad);
                System.out.println("");

                break;
            default:
                System.out.println("No existe opcion.Ingrese un numero valido");
                break;
        }
    }

    public static void FormulaFisica(WSOperations cliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Formulas fisicas");
        System.out.println("1.DISTANCIA RECORRIDA / 2.GRADOS KELVIN A CELCIUS/ 3.CALCULAR ENERGIA POTENCIAL GRAVITATORIA");
        int c = scanner.nextInt();
        System.out.println("");
        switch (c) {
            case 1:
                System.out.println("Calcular la distancia recorrida por un carro que va una velocidad de 100km durante 2h.");
                System.out.print("Por favor, ingrese velocidad (km/h): ");
                int a = scanner.nextInt();
                System.out.print("Por favor, ingrese el tiempo: ");
                int b = scanner.nextInt();

                int distancia = cliente.distanciaCarro(a, b);
                System.out.println("Distancia rrecorrida por el carro es: " + distancia + "km");
                break;

            case 2:
                System.out.println("Kelvin a celcius");
                System.out.print("Para transforma de kelvin a celcius. \n Por favor, ingrese el valor a transformar:\n ");
                System.out.print("Grados kelvin: ");
                int kelvin = scanner.nextInt();

                double intensidad = cliente.kelvinToCelsiusConverter(kelvin);
                System.out.println("En grados celcius son " + intensidad + " grados");

                break;
            case 3:
                System.out.println("Determina la energia potencial gravitatoria de objeto de 80kg que cae desde una altura de 10m");
                System.out.print("Para calcular la energia  potencial gravitatoria de un objeto que se encuentra a cierta altura \n Por favor, ingrese:\n");
                System.out.print("La masa (kg): ");
                int a1 = scanner.nextInt();
                System.out.print("La altura (h): ");
                int b1 = scanner.nextInt();

                double energiapotencial = cliente.energiaPotencial(a1, b1);

                System.out.println("La energia potencial es de " + energiapotencial + " Julios");
                System.out.println("");

                break;

            default:
                System.out.println("No existe opcion.Ingrese un numero valido");
                break;
        }
    }
}
