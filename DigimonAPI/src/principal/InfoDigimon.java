package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

public class InfoDigimon extends javax.swing.JFrame {

    JsonObject digimon;
    
    public InfoDigimon(com.google.gson.JsonObject digimon) {
        

        this.digimon = digimon;
        
        initComponents();
        initAlternComponents();
    }

 
    public void initAlternComponents(){
           String image_url = this.digimon.get("image").getAsString();
        try {
            URL url = new URL(image_url);
            
            Image imagen = getToolkit().createImage(url);
            
            imagen = imagen.getScaledInstance(180, 190, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));
            String nombre = this.digimon.get("name").getAsString();
            if(nombre.length() > 14){
            
                nombre = nombre.substring(0,14)+"...";
            }
            etqName.setText(nombre);
                    
        } catch (MalformedURLException ex) {
            System.out.println("Error en URL: "+ex.getMessage());
        }
        
       
 
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ContentInfo = new javax.swing.JPanel();
        etqName = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        Table = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();
        etqFields = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etqName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqName.setText("-----------");

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nivel", "Atributo", "Tipo"
            }
        ));
        Table.setViewportView(tablaInfo);

        etqFields.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ContentInfoLayout = new javax.swing.GroupLayout(ContentInfo);
        ContentInfo.setLayout(ContentInfoLayout);
        ContentInfoLayout.setHorizontalGroup(
            ContentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentInfoLayout.createSequentialGroup()
                .addGroup(ContentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentInfoLayout.createSequentialGroup()
                        .addGroup(ContentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentInfoLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(etqName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentInfoLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContentInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentInfoLayout.setVerticalGroup(
            ContentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etqName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqFields, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentInfo;
    private javax.swing.JScrollPane Table;
    private javax.swing.JLabel etqFields;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaInfo;
    // End of variables declaration//GEN-END:variables
}
