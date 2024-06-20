package principal;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class ItemDigimon extends javax.swing.JPanel {
    
    JsonObject digimon;

   
    public ItemDigimon(JsonObject digimon ) {
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
            etqNombre.setText(nombre);
                    
        } catch (MalformedURLException ex) {
            System.out.println("Error en URL: "+ex.getMessage());
        }
        
        contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        contentPrincipal.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e){
                
                contentPrincipal.setCursor(new Cursor (Cursor.HAND_CURSOR));
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqImagen = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();

        contentPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPrincipalMouseClicked(evt);
            }
        });

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("------------------");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contentPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentPrincipalMouseClicked
        
        InfoDigimon ventana = new InfoDigimon(digimon);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Info Digimon");
        
        
    }//GEN-LAST:event_contentPrincipalMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombre;
    // End of variables declaration//GEN-END:variables

  
}
