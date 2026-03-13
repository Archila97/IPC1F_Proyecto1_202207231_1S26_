package proyecto1;

/**
 *
 * @202207231 Jenifer Archila
 */
import java.util.Scanner;
import java.io.FileWriter;

public class PROYECTO1 {

    // Vectores para guardar la info (Máximo 100 posiciones)
    static String[] codigos = new String[100];
    static String[] nombres = new String[100];
    static String[] categorias = new String[100];
    static double[] precios = new double[100];
    static int[] stock = new int[100];
    static int contador = 0;

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println(" ******* MENU ********* ");
            System.out.println("1. Agregar ");
            System.out.println("2. Buscar ");
            System.out.println("3. Eliminar ");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Generar Reportes");
            System.out.println("6. Ver Datos de Estudiante");
            System.out.println("7. Salir");
            System.out.println("Seleccione un numero:");

            opcion = leer.nextInt();
            leer.nextLine();

            if (opcion == 1) {
                //agregar();
            } else if (opcion == 2) {
                //buscar();
            } else if (opcion == 3) {
                //eliminar();
            } else if (opcion == 4) {
                // venta();
            } else if (opcion == 5) {
                //reporte();
            } else if (opcion == 6) {
                verDatos();
            }
        }while (opcion != 7);
        System.out.println("***********************************");
        System.out.println(" Cerrando sesión... ");
        System.out.println("***********************************");
    }

    public static void verDatos() {
        System.out.println("****** DATOS DEL ESTUDIANTE *******");
        System.out.println("Jenifer Archila - 202207231");
        System.out.println("Seccion F");
        System.out.println("");

    }

}
