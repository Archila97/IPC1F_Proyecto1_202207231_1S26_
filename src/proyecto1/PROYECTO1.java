package proyecto1;

/**
 *
 * @202207231 Jenifer Archila
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PROYECTO1 {

    static Scanner scanner = new Scanner(System.in);

    static String nombreCompleto = "";
    static String miId = "";
    static String miCorreo = "";

    static final int CANTIDAD_MAXIMA = 100;

    //Arreglos
    // Arreglos paralelos para el inventario (máximo 100 productos)    
    static String[] codigos = new String[CANTIDAD_MAXIMA];
    static String[] nombres = new String[CANTIDAD_MAXIMA];
    static String[] categorias = new String[CANTIDAD_MAXIMA];
    static double[] precios = new double[CANTIDAD_MAXIMA];
    static int[] stocks = new int[CANTIDAD_MAXIMA];
    static int cantidadProductos = 0;

    // Arreglos paralelos para el historial de ventas    
    static String[] ventasCodigos = new String[CANTIDAD_MAXIMA];
    static int[] ventasCantidades = new int[CANTIDAD_MAXIMA];
    static String[] ventasFechas = new String[CANTIDAD_MAXIMA];
    static double[] ventasTotales = new double[CANTIDAD_MAXIMA];
    static int cantidadVentas = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println();
            System.out.println("*********************************************");
            System.out.println("*** Inventario Productos ***");
            System.out.println("Maximo de productos: " + CANTIDAD_MAXIMA);
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Generar Reportes");
            System.out.println("6. Ver Datos del Estudiante");
            System.out.println("7. Salir");
            System.out.println("8. Mostrar productos");
            System.out.println("9. Mostrar ventas");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); //Para capturar el enter que no captura nextInt()

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    buscarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    registrarVenta();
                    break;
                case 5:
                    generarReportes();
                    break;
                case 6:
                    verDatosEstudiante();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                case 8:
                    mostrarProductos();
                    break;
                case 9:
                    mostrarVentas();
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println("*********************************************");
        } while (opcion != 7);
    }

    //Agregar productos
    private static void agregarProducto() {

        String codigoProducto, nombreProducto, categoriaProducto;
        int cantidadStock = 0;
        float precioProducto = 0;
        boolean codigoExiste = false;

        /*
            Valido que la cantidad de productos sea menor 
            a la cantidad maxima de productos
         */
        if (cantidadProductos < CANTIDAD_MAXIMA) {

            System.out.println("*** Ingresar datos del producto ***");

            System.out.println("Ingrese el codigo");
            codigoProducto = scanner.nextLine();

            for (int i = 0; i < cantidadProductos; i++) {
                if (codigos[i].equalsIgnoreCase(codigoProducto)) {
                    codigoExiste = true;
                }
            }

            //Valido que el del producto no exista
            if (codigoExiste) {
                System.out.println("El codigo ya existe, debe ser unico");
            } else {
                System.out.println("Ingrese el nombre");
                nombreProducto = scanner.nextLine();

                System.out.println("Ingresa la categoria");
                categoriaProducto = scanner.nextLine();

                System.out.println("Ingrese el precio");
                precioProducto = scanner.nextFloat();
                scanner.nextLine();

                //Valido precio
                if (precioProducto <= 0) {
                    System.out.println("Precio invalido, debe ser positivo");
                } else {
                    System.out.println("Ingrese cantidad en stock (disponible)");
                    cantidadStock = scanner.nextInt();
                    scanner.nextLine();

                    //Valido stock
                    if (cantidadStock <= 0) {
                        System.out.println("Cantidad de stock invalida, debe "
                                + "ser positivo");
                    } else {
                        /*
                            Registrar producto en arreglos
                         */
                        nombres[cantidadProductos] = nombreProducto;
                        categorias[cantidadProductos] = categoriaProducto;
                        precios[cantidadProductos] = precioProducto;
                        stocks[cantidadProductos] = cantidadStock;
                        codigos[cantidadProductos] = codigoProducto;

                        //Incremento cantidad de arreglos
                        cantidadProductos++;
                        System.out.println("... Producto agregado correctamente ...");

                    }

                }
            }
        } else {
            System.out.println("Inventario completo, registro "
                    + CANTIDAD_MAXIMA + " productos....");
        }
    }

    //Buscar productos
    private static void buscarProducto() {

        String criterioBusqueda = "", datoBusqueda = "";
        int opcion;
        boolean opcionCorrecta = false, productoEncontrado = false;

        if (cantidadProductos > 0) {

            System.out.println("*** Buscar productos ***");
            System.out.println("Ingresa el criterio para tu busqueda: ");
            System.out.println("1. Nombre");
            System.out.println("2. Categoria");
            System.out.println("3. Codigo");
            System.out.print("Ingresa la opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                criterioBusqueda = "Nombre";
                opcionCorrecta = true;
            } else if (opcion == 2) {
                criterioBusqueda = "Categoria";
                opcionCorrecta = true;
            } else if (opcion == 3) {
                criterioBusqueda = "Codigo";
                opcionCorrecta = true;
            } else {
                opcionCorrecta = false;
            }

            if (opcionCorrecta) {

                System.out.print("Ingresa " + criterioBusqueda + " : ");
                datoBusqueda = scanner.nextLine().trim().toLowerCase();

                /*
                printf sirve para mostrar los datos formateados con espacios
                entre cada columna
                el % es cada valo que se incluirá,
                -25 indica que son 25 espacios entre cada dato o columna el menos indica que esté alineado a la izquierda
                s indica que es un String
                .2f indica que es un decimal con 2 numeros decimales
                d indica que es un entero
                \n indica un salto de línea, es un enter
                 */
                //Encabezados
                System.out.printf("%-25s %-20s %-20s %-20s %-20s \n",
                        "Nombre",
                        "Codigo",
                        "Categoria",
                        "Precio",
                        "Cantidad Disponible");

                switch (opcion) {
                    case 1:
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (nombres[i].toLowerCase().contains(datoBusqueda)) {
                                System.out.printf("%-25s %-20s %-20s %-20.2f %-20d \n",
                                        nombres[i],
                                        codigos[i],
                                        categorias[i],
                                        precios[i],
                                        stocks[i]);
                                productoEncontrado = true;
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (categorias[i].toLowerCase().contains(datoBusqueda)) {
                                System.out.printf("%-25s %-20s %-20s %-20.2f %-20d \n",
                                        nombres[i],
                                        codigos[i],
                                        categorias[i],
                                        precios[i],
                                        stocks[i]);
                                productoEncontrado = true;
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (codigos[i].toLowerCase().equals(datoBusqueda)) {
                                System.out.printf("%-25s %-20s %-20s %-20.2f %-20d \n",
                                        nombres[i],
                                        codigos[i],
                                        categorias[i],
                                        precios[i],
                                        stocks[i]);
                                productoEncontrado = true;
                            }
                        }
                        break;
                }

                //si no se encuentra el producto
                if (!productoEncontrado) {
                    System.out.println("No se encontro ningun producto con "
                            + "ese criterio de busqueda.....");
                }

            } else {
                System.out.println("Opcion invalida, debe ser entre 1 y 3");
            }

        } else {
            System.out.println("No existen productos en el inventario....");
        }
    }

    //Eliminar producto
    private static void eliminarProducto() {

        String codigoEliminar, confirmacion;
        boolean productoEncontrado = false;
        int indiceEliminar = -1; //inicia en numero negativo porque ese indice no existe

        if (cantidadProductos > 0) {

            System.out.println("*** Eliminar producto ***");
            System.out.print("Ingresa el codigo a eliminar: ");
            codigoEliminar = scanner.nextLine().trim().toLowerCase();

            for (int i = 0; i < cantidadProductos; i++) {
                if ((!productoEncontrado)
                        && (codigos[i].toLowerCase().equals(codigoEliminar))) {
                    productoEncontrado = true;

                    //asigno indice en el que se encontro el codigo
                    indiceEliminar = i;
                }
            }

            if (productoEncontrado) {
                System.out.print("Estas seguro de eliminar el producto con "
                        + "el codigo: " + codigoEliminar + " SI / NO : ");
                confirmacion = scanner.nextLine();

                //Valido confirmacion para eliminar
                if (confirmacion.equalsIgnoreCase("SI")) {

                    /*
                        eliminar producto
                        porque tengo una variable que lleva el conteo de los
                        productos, entonces corro los datos en los arreglos
                        y disminuyo una del total
                        resto uno a cantidadProductos porque el arreglo empieza en cero, es su primer indice el 0
                     */
                    for (int i = indiceEliminar; i < (cantidadProductos - 1); i++) {
                        nombres[i] = nombres[i + 1];
                        codigos[i] = codigos[i + 1];
                        categorias[i] = categorias[i + 1];
                        precios[i] = precios[i + 1];
                        stocks[i] = stocks[i + 1];
                    }

                    cantidadProductos--; //resto el producto eliminado al total de productos

                    System.out.println("Producto eliminado......");

                } else {
                    System.out.println("Eliminacion ha sido cancelada....");
                }

            } else {
                System.out.println("El producto con el codigo: " + codigoEliminar
                        + " no ha sido encontrado.");
            }

        } else {
            System.out.println("No existen productos en el inventario....");
        }
    }

    //Registrar ventas en arreglo y archivo de texto
    private static void registrarVenta() {

        String codigoVender;
        boolean productoEncontrado = false;
        int cantidad = 0, indiceVender = -1;
        double total = 0;

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraString = fechaHoraActual.format(formato);

        //Para manejo de archivos
        FileWriter fileWriter;

        if (cantidadProductos > 0) {

            System.out.println("*** Registra ventas de producto ***");
            System.out.print("Ingresa el codigo a vender: ");
            codigoVender = scanner.nextLine().trim().toLowerCase();

            for (int i = 0; i < cantidadProductos; i++) {
                if ((!productoEncontrado)
                        && (codigos[i].toLowerCase().equals(codigoVender))) {
                    productoEncontrado = true;

                    //asigno indice en el que se encontro el codigo
                    indiceVender = i;
                }
            }

            if (productoEncontrado) {
                System.out.print("Ingresa la cantidad a vender del producto con "
                        + "el codigo: " + codigoVender + " : ");
                cantidad = scanner.nextInt();
                scanner.nextLine();

                //Valido cantidad de productos valida
                if (cantidad > 0) {

                    //Valido que tenga stock en el inventario
                    if (cantidad <= stocks[indiceVender]) {

                        //descontamos el stock
                        stocks[indiceVender] -= cantidad;

                        //calculamos total a pagar
                        total = cantidad * precios[indiceVender];

                        //Validar ventas
                        if (cantidadVentas < CANTIDAD_MAXIMA) {

                            fechaHoraActual = LocalDateTime.now();
                            fechaHoraString = fechaHoraActual.format(formato);

                            ventasCantidades[cantidadVentas] = cantidad;
                            ventasCodigos[cantidadVentas] = codigoVender;
                            ventasFechas[cantidadVentas] = fechaHoraString;
                            ventasTotales[cantidadVentas] = total;
                            cantidadVentas++;

                            System.out.println("Venta registrada......");

                            /*
                                Crear y escribir en archivo
                            
                                el try tiene el codigo que puede generar error
                                el catch captura el error
                                con estos bloques se evita que el programa colapse
                             */
                            try {
                                fileWriter = new FileWriter("Ventas.txt", true); //true hace que si el archivo existe se agregue al final, despues de la ultima linea
                                fileWriter.write("Codigo: " + codigoVender + " Canitdad vendida: " + cantidad
                                        + " Fecha y hora transaccion: " + fechaHoraString + " Total venta: Q. " + total + "\n");

                                //Cerrar archivo
                                fileWriter.close();

                                System.out.println("Venta registrada en el archivo...");

                            } catch (IOException e) {
                                System.out.println("*** Error ***");
                                System.out.println("Error al guardar en archivo "
                                        + e.toString() + "\n"
                                        + e.getMessage());
                            }

                        } else {
                            System.out.println("Cantidad de ventas superada....");
                        }

                    } else {
                        System.out.println("No hay suficiente stock del producto...");
                    }

                } else {
                    System.out.println("Cantidad invalida, debe ser positiva y mayor a cero....");
                }

            } else {
                System.out.println("El producto con el codigo: " + codigoVender
                        + " no ha sido encontrado.");
            }

        } else {
            System.out.println("No existen productos en el inventario....");
        }

    }

    private static void generarReportes() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
        String fechaHoraString = fechaHoraActual.format(formato);

        String nombreArchivoStock = fechaHoraString + "_Stock.html";
        String nombreArchivoVentas = fechaHoraString + "_Venta.html";

        //Para manejo de archivos
        FileWriter fileWriterStock, fileWriterVenta;

        /*
            Para generar archivo de disponibilidad de inventario
            uso cantidad productos
         */
        if (cantidadProductos > 0) {

            try {
                fileWriterStock = new FileWriter(nombreArchivoStock);
                fileWriterStock.write("<html><head><title>Reporte de Stock</title><meta charset=\"UTF-8\"></head><body>");
                fileWriterStock.write("<h2>Reporte de Inventario (Stock)</h2>");
                fileWriterStock.write("<table border='1'><tr><th>Nombre</th><th>Código</th><th>Categoría</th><th>Precio</th><th>Cantidad disponible</th></tr>");

                for (int i = 0; i < cantidadProductos; i++) {
                    fileWriterStock.write("<tr><td>" + nombres[i] + "</td><td>" + codigos[i] + "</td><td>" + categorias[i] + "</td><td>" + precios[i] + "</td><td>" + stocks[i] + "</td></tr>");
                }

                fileWriterStock.write("</table></body></html>");
                fileWriterStock.close();
                System.out.println("Reporte de stock en html generado: " + nombreArchivoStock);
            } catch (IOException e) {
                System.out.println("*** Error ***");
                System.out.println("Error al guardar en archivo de Stock"
                        + e.toString() + "\n"
                        + e.getMessage());
            }

        } else {
            System.out.println("No existen productos en el inventario...");
        }

        //validar si hay ventas
        if (cantidadVentas > 0) {
            /*
                Para generar archivo de ventas
                uso cantidad ventas
             */
            try {
                fileWriterVenta = new FileWriter(nombreArchivoVentas);
                fileWriterVenta.write("<html><head><title>Reporte de Ventas</title><meta charset=\"UTF-8\"></head><body>");
                fileWriterVenta.write("<h2>Historial de Ventas Realizadas</h2>");
                fileWriterVenta.write("<table border='1'><tr><th>Fecha</th><th>Código</th><th>Cantidad</th><th>Total</th></tr>");

                for (int i = 0; i < cantidadVentas; i++) {
                    fileWriterVenta.write("<tr><td>" + ventasFechas[i] + "</td><td>" + ventasCodigos[i] + "</td>"
                            + "<td>" + ventasCantidades[i] + "</td><td>" + ventasTotales[i] + "</td></tr>");
                }

                fileWriterVenta.write("</table></body></html>");
                fileWriterVenta.close();
                System.out.println("Reporte de ventas en html generado: " + nombreArchivoVentas);
            } catch (IOException e) {
                System.out.println("*** Error ***");
                System.out.println("Error al guardar en archivo de Ventas"
                        + e.toString() + "\n"
                        + e.getMessage());
            }

        } else {
            System.out.println("No existen ventas registradas...");
        }

    }

    private static void mostrarProductos() {
        //Encabezados
        System.out.printf("%-25s %-20s %-20s %-20s %-20s \n",
                "Nombre",
                "Codigo",
                "Categoria",
                "Precio",
                "Cantidad Disponible");

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.printf("%-25s %-20s %-20s %-20.2f %-20d \n",
                    nombres[i],
                    codigos[i],
                    categorias[i],
                    precios[i],
                    stocks[i]);
        }
    }
    
    //mostrar ventas
    private static void mostrarVentas() {
        //Encabezados
        System.out.printf("%-20s %-25s %-20s %-20s \n",
                "Codigo",                
                "Cantidad",
                "Fecha",
                "Total");

        for (int i = 0; i < cantidadVentas; i++) {
            System.out.printf("%-20s %-25d %-20s %-20.2f \n",
                    ventasCodigos[i],                    
                    ventasCantidades[i],
                    ventasFechas[i],
                    ventasTotales[i]);
        }
    }

    private static void verDatosEstudiante() {
        System.out.println("*************************");
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Id: " + miId);
        System.out.println("Correo: " + miCorreo);
        System.out.println("*************************");
    }

}