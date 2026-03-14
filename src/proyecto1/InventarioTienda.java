package proyecto1;

/**
 *
 * @Jenifer Archila 202207231
 */
public class InventarioTienda extends javax.swing.JFrame {

    String nombreCompleto = "JENIFER ARCHILA ";
    String miId = "202207231";
    String secc = "PC1 - PRIMER SEMESTRE 2026";

    final int CANTIDAD_MAXIMA = 100;

    // Arreglos paralelos para el inventario
    String[] codigos = new String[CANTIDAD_MAXIMA];
    String[] nombres = new String[CANTIDAD_MAXIMA];
    String[] categorias = new String[CANTIDAD_MAXIMA];
    double[] precios = new double[CANTIDAD_MAXIMA];
    int[] stocks = new int[CANTIDAD_MAXIMA];
    int cantidadProductos = 0;

    // Arreglos paralelos para el historial de ventas    
    String[] ventasCodigos = new String[CANTIDAD_MAXIMA];
    int[] ventasCantidades = new int[CANTIDAD_MAXIMA];
    String[] ventasFechas = new String[CANTIDAD_MAXIMA];
    double[] ventasTotales = new double[CANTIDAD_MAXIMA];
    int cantidadVentas = 0;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InventarioTienda.class.getName());

  
    public InventarioTienda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnagregar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDatos = new javax.swing.JButton();
        btnVerInventario = new javax.swing.JButton();
        btnVerVentas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(this::btnagregarActionPerformed);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(this::btnbuscarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnReporte.setText("Reportes");
        btnReporte.addActionListener(this::btnReporteActionPerformed);

        btnVentas.setText("Vender");
        btnVentas.addActionListener(this::btnVentasActionPerformed);

        jLabel1.setText("MENU ");

        jLabel2.setText(" JENIFER ARCHILA_ 202207231");

        btnDatos.setText("Mis datos");
        btnDatos.addActionListener(this::btnDatosActionPerformed);

        btnVerInventario.setText("Ver Inventario");
        btnVerInventario.addActionListener(this::btnVerInventarioActionPerformed);

        btnVerVentas.setText("Ver ventas");
        btnVerVentas.addActionListener(this::btnVerVentasActionPerformed);

        jLabel3.setText("Código");

        jLabel4.setText("Nombre");

        jLabel5.setText("Categoría");

        jLabel6.setText("Precio");

        jLabel7.setText("Stock");

        txtStock.addActionListener(this::txtStockActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodigo)
                        .addComponent(txtNombre)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar)
                            .addComponent(btnReporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerVentas)
                            .addComponent(btnVentas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerInventario)
                            .addComponent(btnDatos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String codigoProducto, nombreProducto, categoriaProducto;
        int cantidadStock = 0;
        float precioProducto = 0;
        boolean codigoExiste = false;

        if (cantidadProductos < CANTIDAD_MAXIMA) {
            // tomamos los datos ingresados
            codigoProducto = txtCodigo.getText();

            // Ciclo para ver si el código ya existe
            for (int i = 0; i < cantidadProductos; i++) {
                if (codigos[i].equalsIgnoreCase(codigoProducto)) {
                    codigoExiste = true;
                }
            }

            if (codigoExiste) {
                javax.swing.JOptionPane.showMessageDialog(null, "El codigo ya existe, debe ser unico");
            } else {
                nombreProducto = txtNombre.getText();
                categoriaProducto = txtCategoria.getText();
                precioProducto = Float.parseFloat(txtPrecio.getText());

                if (precioProducto <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Precio invalido, debe ser positivo");
                } else {
                    cantidadStock = Integer.parseInt(txtStock.getText());

                    if (cantidadStock <= 0) {
                        javax.swing.JOptionPane.showMessageDialog(null, "Cantidad de stock invalida, debe ser positivo");
                    } else {
                        // Guardar en los arreglos paralelos
                        nombres[cantidadProductos] = nombreProducto;
                        categorias[cantidadProductos] = categoriaProducto;
                        precios[cantidadProductos] = precioProducto;
                        stocks[cantidadProductos] = cantidadStock;
                        codigos[cantidadProductos] = codigoProducto;

                        cantidadProductos++;
                        javax.swing.JOptionPane.showMessageDialog(null, "... Producto agregado correctamente ...");
                    }
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Inventario completo, registro " + CANTIDAD_MAXIMA + " productos....");
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String datoBusqueda = txtCodigo.getText().trim().toLowerCase();
        boolean productoEncontrado = false;
        String reporte = "Resultado de busqueda:\n";

        if (cantidadProductos > 0) {
            for (int i = 0; i < cantidadProductos; i++) {
                if (codigos[i].toLowerCase().equals(datoBusqueda) || nombres[i].toLowerCase().contains(datoBusqueda)) {
                    reporte += "Nombre: " + nombres[i] + " | Codigo: " + codigos[i] + " | Precio: " + precios[i] + " | Stock: " + stocks[i] + "\n";
                    productoEncontrado = true;
                }
            }
            if (productoEncontrado) {
                javax.swing.JOptionPane.showMessageDialog(this, reporte);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontro ningun producto");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No existen productos en el inventario");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoEliminar = txtCodigo.getText().trim().toLowerCase();
        boolean productoEncontrado = false;
        int indiceEliminar = -1;

        if (cantidadProductos > 0) {
            // Buscar el producto
            for (int i = 0; i < cantidadProductos; i++) {
                if (codigos[i].toLowerCase().equals(codigoEliminar)) {
                    productoEncontrado = true;
                    indiceEliminar = i;
                    break;
                }
            }

            if (productoEncontrado) {
                int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Seguro de eliminar el producto: " + codigoEliminar + "?");

                if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
                    // Correr los datos en los arreglos para eliminar
                    for (int i = indiceEliminar; i < (cantidadProductos - 1); i++) {
                        nombres[i] = nombres[i + 1];
                        codigos[i] = codigos[i + 1];
                        categorias[i] = categorias[i + 1];
                        precios[i] = precios[i + 1];
                        stocks[i] = stocks[i + 1];
                    }
                    cantidadProductos--; // Restar uno al total
                    javax.swing.JOptionPane.showMessageDialog(this, "Producto eliminado......");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontro el producto.");
            }
}    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            java.time.LocalDateTime fechaHoraActual = java.time.LocalDateTime.now();
            java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
            String fechaHoraString = fechaHoraActual.format(formato);
            String nombreArchivoStock = fechaHoraString + "_Stock.html";

            if (cantidadProductos > 0) {
                java.io.FileWriter fileWriterStock = new java.io.FileWriter(nombreArchivoStock);
                fileWriterStock.write("<html><head><title>Reporte de Stock</title></head><body>");
                fileWriterStock.write("<h2>Reporte de Inventario (Stock)</h2>");
                fileWriterStock.write("<table border='1'><tr><th>Nombre</th><th>Código</th><th>Categoría</th><th>Precio</th><th>Cantidad disponible</th></tr>");

                // Ciclo para llenar la tabla HTML
                for (int i = 0; i < cantidadProductos; i++) {
                    fileWriterStock.write("<tr><td>" + nombres[i] + "</td><td>" + codigos[i] + "</td><td>" + categorias[i] + "</td><td>" + precios[i] + "</td><td>" + stocks[i] + "</td></tr>");
                }

                fileWriterStock.write("</table></body></html>");
                fileWriterStock.close();
                javax.swing.JOptionPane.showMessageDialog(null, "Reporte generado: " + nombreArchivoStock);
            }
        } catch (java.io.IOException e) {
            // Manejo de error simple
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        String codigoVender = txtCodigo.getText().trim().toLowerCase();
        boolean productoEncontrado = false;
        int indiceVender = -1;

        for (int i = 0; i < cantidadProductos; i++) {
            if (codigos[i].toLowerCase().equals(codigoVender)) {
                productoEncontrado = true;
                indiceVender = i;
                break;
            }
        }

        if (productoEncontrado) {
            int cantidadAVender = Integer.parseInt(txtStock.getText());
            if (cantidadAVender <= stocks[indiceVender]) {
                // Descontar stock y registrar venta
                stocks[indiceVender] -= cantidadAVender;
                double totalVenta = cantidadAVender * precios[indiceVender];

                java.time.LocalDateTime ahora = java.time.LocalDateTime.now();
                String fecha = ahora.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                ventasCodigos[cantidadVentas] = codigos[indiceVender];
                ventasCantidades[cantidadVentas] = cantidadAVender;
                ventasTotales[cantidadVentas] = totalVenta;
                ventasFechas[cantidadVentas] = fecha;
                cantidadVentas++;

                javax.swing.JOptionPane.showMessageDialog(this, "Venta registrada. Total: Q" + totalVenta);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay suficiente stock.");
            }
}    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Estudiante: " + nombreCompleto + "\nCARNET: " + miId + "\n: " + secc);    }//GEN-LAST:event_btnDatosActionPerformed

    private void btnVerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInventarioActionPerformed
        String lista = "--- INVENTARIO ACTUAL ---\n";
        for (int i = 0; i < cantidadProductos; i++) {
            lista += codigos[i] + " - " + nombres[i] + " (Q" + precios[i] + ") - Stock: " + stocks[i] + "\n";
        }
        javax.swing.JOptionPane.showMessageDialog(this, lista);     }//GEN-LAST:event_btnVerInventarioActionPerformed

    private void btnVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasActionPerformed
        String codigoVender = txtCodigo.getText(); // Usamos el cuadro de código
        boolean productoEncontrado = false;
        int cantidad = Integer.parseInt(txtStock.getText()); // Usamos el de stock para la cantidad a vender
        int indiceVender = -1;
        double total = 0;

        if (cantidadProductos > 0) {
            // Buscar el producto por código
            for (int i = 0; i < cantidadProductos; i++) {
                if (codigos[i].equalsIgnoreCase(codigoVender)) {
                    productoEncontrado = true;
                    indiceVender = i;
                }
            }

            if (productoEncontrado) {
                if (cantidad > 0) {
                    if (cantidad <= stocks[indiceVender]) {
                        // Descontar y calcular total
                        stocks[indiceVender] -= cantidad;
                        total = cantidad * precios[indiceVender];

                        if (cantidadVentas < CANTIDAD_MAXIMA) {
                            // Formato de fecha igual al tuyo
                            java.time.LocalDateTime fechaHoraActual = java.time.LocalDateTime.now();
                            java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                            String fechaHoraString = fechaHoraActual.format(formato);

                            ventasCantidades[cantidadVentas] = cantidad;
                            ventasCodigos[cantidadVentas] = codigoVender;
                            ventasFechas[cantidadVentas] = fechaHoraString;
                            ventasTotales[cantidadVentas] = total;
                            cantidadVentas++;

                            javax.swing.JOptionPane.showMessageDialog(null, "Venta registrada......");
                        }
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "No hay suficiente stock del producto...");
                    }
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "El producto con el codigo: " + codigoVender + " no ha sido encontrado.");
            }
}    }//GEN-LAST:event_btnVerVentasActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new InventarioTienda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVerInventario;
    private javax.swing.JButton btnVerVentas;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
