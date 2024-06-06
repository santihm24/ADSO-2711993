
package principal;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

public class Digimon extends javax.swing.JFrame {
    
    JsonObject digimon;
    String listaImagenes[];
    int posActual;

    public Digimon(JsonObject data) {
        ConsumoAPI consumo = new ConsumoAPI();
        String respuesta = consumo.consumoGET( data.get("url").getAsString() );
        this.digimon = JsonParser.parseString(respuesta).getAsJsonObject();
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        
        etqAtras.setText("");
        etqSiguiente.setText("");
        
        Image iconoAtras = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/atras.png"));
        iconoAtras = iconoAtras.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etqAtras.setIcon(new ImageIcon(iconoAtras));
        
        Image iconoSiguiente = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        iconoSiguiente = iconoSiguiente.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etqSiguiente.setIcon(new ImageIcon(iconoSiguiente));
        
        etqNombre.setText( this.pokemon.get("name").getAsString() );
        
        DefaultTableModel modelo = (DefaultTableModel) tablaHabilidades.getModel();
        JsonArray habilidades = this.digimon.getAsJsonArray("abilities");
        for (int i=0; i<habilidades.size(); i++) {
            JsonObject temp = habilidades.get(i).getAsJsonObject().getAsJsonObject("ability");
            Object[] fila = new Object[]{ i, temp.get("name").getAsString(), temp.get("url").getAsString()};
            modelo.addRow(fila);
        }
        
        this.listaImagenes = new String[3];
        this.listaImagenes[0] = this.digimon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_default").getAsString();
        this.listaImagenes[1] = this.digimon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_shiny").getAsString();
        this.listaImagenes[2] = this.digimon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
        this.posActual = 0;
        cargarImagenDigimon();
        
        
        revalidate();
        repaint();
    }
    
    public void cargarImagenDigimon(){
        try {
            String url = this.listaImagenes[posActual];
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etqImagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Digimon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (posActual==0) {
            etqAtras.setEnabled(false);
        }
        
        if (posActual==2) {
            etqSiguiente.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        etqNombre = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        etqAtras = new javax.swing.JLabel();
        etqSiguiente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        etqNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("-------");

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqImagen.setText("jLabel1");

        etqAtras.setText("jLabel2");
        etqAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqAtrasMouseClicked(evt);
            }
        });

        etqSiguiente.setText("jLabel2");
        etqSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqSiguienteMouseClicked(evt);
            }
        });

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad", "Url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaHabilidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(etqAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etqSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void etqAtrasMouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (this.posActual>0) {
            this.posActual--;
            cargarImagenDigimon();
            etqSiguiente.setEnabled(true);
        }
    }                                     

    private void etqSiguienteMouseClicked(java.awt.event.MouseEvent evt) {                                          
        if (this.posActual<2) {
            this.posActual++;
            cargarImagenDigimon();
            etqAtras.setEnabled(true);
        }
    }                              
    }

    
    @SuppressWarnings("unchecked");{}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqSiguiente = new javax.swing.JLabel();
        etqAtras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etqNombre.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("------------------");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("label");

        etqSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqSiguiente.setText("label b");

        etqAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqAtras.setText("label a");

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nivel", "Atributo", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaHabilidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(etqAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etqSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(etqAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqAtras;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables
}
