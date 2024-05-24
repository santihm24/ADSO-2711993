package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormularioObtener extends javax.swing.JPanel {

    DefaultTableModel modelo;

    public FormularioObtener() {
        initComponents();
        initAlterComponents();
        llenarTabla();
        ConsumoAPI consumo = new ConsumoAPI();

    }

    // 
    public void initAlterComponents() {

        modelo = (DefaultTableModel) table.getModel();

    }
    public void llenarTabla() {

        //EndPoint obtener
        ConsumoAPI consumo = new ConsumoAPI();

        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        System.out.println("Respuesta obtener: " + respuesta01);

        //Extrayendo datos de un texto JSON
        JsonArray listado = JsonParser.parseString(respuesta01).getAsJsonArray();

        for (int i = 0; i < listado.size(); i++) {

            JsonObject temp = listado.get(i).getAsJsonObject();

            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String direccion = temp.get("direccion").getAsString();
            String email = temp.get("email").getAsString();

            Object[] data = {cedula, nombres, apellidos, telefono, direccion, email};

            modelo.addRow(data);

            System.out.println(cedula + " - " + nombres);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenido = new javax.swing.JPanel();
        jLabel1Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        PanelContenido.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1Titulo.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1Titulo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("Obtener Personas");

        table.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
