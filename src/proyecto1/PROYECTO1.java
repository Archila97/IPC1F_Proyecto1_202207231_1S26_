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
    static int contador = 0;

    static String[] nombres = new String[100];
    static String[] categorias = new String[100];
    static double[] precios = new double[100];
    static int[] stock = new int[100];
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
                reporte();
            } else if (opcion == 6) {
                verDatos();
            }
        } while (opcion != 7);
        System.out.println("***********************************");
        System.out.println(" Cerrando sesión... ");
        System.out.println("***********************************");
    }

    public static void verDatos() {
        System.out.println("****** DATOS DEL ESTUDIANTE *******");
        System.out.println("Primer semestre 2026");
        System.out.println("Jenifer Archila - 202207231");
        System.out.println("Seccion F - PC1");
        System.out.println("");

    }

    public static void reporte() {
        try {
            FileWriter fw = new FileWriter("DD_MM_YYYY_HH_mm_ss_Venta.html");
            fw.write("<html><center><head><title> Reporte de Stock - PC1202207231</title></head><body>");
            fw.write("<h1> Inventario de Tienda de Ropa </h1><table border='2' style='border: 2px solid black; border-radius: 15px; border-collapse: separate; border-spacing: 2; overflow: hidden; padding: 10px;' >");
            fw.write("<tr><th> Codigo </th>"
                    + "<th> Nombre </th>"
                    + "<th> Cantidad </th>"
                    + "<th> Precio </th>"
                    + "<th> fecha </th></tr>");
            for (int i = 0; i < contador; i++) {
                fw.write("<tr><td>" + codigos[i] + "</td><td>" + nombres[i] + "</td><td>"
                        + categorias[i] + "</td><td>" + precios[i] + "</td><td>" + stock[i] + "</td></tr>");
            }
            fw.write("</table></body><center></html>");
            fw.close();
            System.out.println("******************");
            System.out.println("Reporte generado...");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("No se pudo generar el reporte");
        }
    }

}
