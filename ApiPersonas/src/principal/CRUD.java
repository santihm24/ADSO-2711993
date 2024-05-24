
package principal;

import principal.FormularioActualizar;
import java.awt.Image;
import javax.swing.ImageIcon;


public class CRUD extends javax.swing.JFrame { 
    
    
    public CRUD() {
        initComponents();
        
        initAlternComponents();
    }
    
    
    public void  initAlternComponents (){
    
    setTitle("API Personas");
    setLocationRelativeTo(null);
    setVisible(true);
    
    //agregar imagen crear usuario
    setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/crear_usuario.png")));
    
    Image Crear = getToolkit() . createImage(ClassLoader.getSystemResource("Imagenes/crear_usuario.png"));
    Crear = Crear.getScaledInstance(45,40, Image.SCALE_SMOOTH);
    etqCrear.setIcon(new ImageIcon(Crear));
    
    //agregar imagen buscar usuario 
    setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/buscar_usuario.png")));
    
    Image Listar = getToolkit() . createImage(ClassLoader.getSystemResource("Imagenes/buscar_usuario.png"));
    Listar = Listar.getScaledInstance(45,40, Image.SCALE_SMOOTH);
    etqListar.setIcon(new ImageIcon(Listar));
    
    //agregar imagen editar usuario 
    setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/editar_usuario.png")));
    
    Image Editar  = getToolkit() . createImage(ClassLoader.getSystemResource("Imagenes/editar_usuario.png"));
    Editar = Editar.getScaledInstance(45,40, Image.SCALE_SMOOTH);
    etqEditar .setIcon(new ImageIcon(Editar));
    
    //agregar imegen eliminar usuario 
    setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/eliminar_usuario.png")));
    
    Image Eliminar = getToolkit() . createImage(ClassLoader.getSystemResource("Imagenes/eliminar_usuario.png"));
    Eliminar = Eliminar.getScaledInstance(45,40, Image.SCALE_SMOOTH);
    etqEliminar.setIcon(new ImageIcon(Eliminar));
    
    
    setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/iconoUsuario.png")));
    
    Image Icono = getToolkit() . createImage(ClassLoader.getSystemResource("Imagenes/iconoUsuario.png"));
    Icono = Icono .getScaledInstance(80,80, Image.SCALE_SMOOTH);
    jLabelImagenIcono.setIcon(new ImageIcon(Icono));
    
    
    
    
    
    
    setTitle("menu crud");
    setLocationRelativeTo(null);
    setVisible(true);
    
    
    
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botoEliminar = new javax.swing.JButton();
        etqEliminar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonEditar = new javax.swing.JButton();
        etqEditar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botonCrear = new javax.swing.JButton();
        etqCrear = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lisatr = new javax.swing.JButton();
        etqListar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelImagenIcono = new javax.swing.JLabel();
        contenPrincipal = new javax.swing.JPanel();
        JlabelInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenMenu.setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botoEliminar.setBackground(new java.awt.Color(153, 153, 153));
        botoEliminar.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        botoEliminar.setForeground(new java.awt.Color(255, 255, 0));
        botoEliminar.setText("ELIMINAR");
        botoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoEliminarActionPerformed(evt);
            }
        });

        etqEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEliminar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(etqEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        botonEditar.setBackground(new java.awt.Color(102, 102, 102));
        botonEditar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 204, 0));
        botonEditar.setText("EDITAR");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        etqEditar.setBackground(new java.awt.Color(255, 255, 0));
        etqEditar.setForeground(new java.awt.Color(255, 255, 255));
        etqEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botonEditar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etqEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        botonCrear.setBackground(new java.awt.Color(102, 102, 102));
        botonCrear.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        botonCrear.setForeground(new java.awt.Color(255, 255, 0));
        botonCrear.setText("CREAR");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        etqCrear.setBackground(new java.awt.Color(255, 255, 255));
        etqCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etqCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCrear)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lisatr.setBackground(new java.awt.Color(51, 51, 51));
        lisatr.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        lisatr.setForeground(new java.awt.Color(204, 204, 0));
        lisatr.setText("OBTENER");
        lisatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisatrActionPerformed(evt);
            }
        });

        etqListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqListar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lisatr)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lisatr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelImagenIcono.setBackground(new java.awt.Color(0, 102, 102));
        jLabelImagenIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenMenuLayout = new javax.swing.GroupLayout(contenMenu);
        contenMenu.setLayout(contenMenuLayout);
        contenMenuLayout.setHorizontalGroup(
            contenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        contenMenuLayout.setVerticalGroup(
            contenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        contenPrincipal.setBackground(new java.awt.Color(255, 0, 0));

        JlabelInicio.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        JlabelInicio.setForeground(new java.awt.Color(255, 255, 255));
        JlabelInicio.setText("                API Personas");

        javax.swing.GroupLayout contenPrincipalLayout = new javax.swing.GroupLayout(contenPrincipal);
        contenPrincipal.setLayout(contenPrincipalLayout);
        contenPrincipalLayout.setHorizontalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(JlabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        contenPrincipalLayout.setVerticalGroup(
            contenPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenPrincipalLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(JlabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        // Darle una acccion al boton Crear
    private void lisatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisatrActionPerformed
            // TODO add your handling code here:
            //Eliminarr el contenido Actual del principal 
            contenPrincipal.removeAll();
            
            //cada vez que se valla a a introducir con la base de datos se ciera la base de datos para que No aya problemas al istanciarla 
            //para serra cada panel cuando se lo necesita "db.cerrarConexion();"
            //db.cerrarConexion();
            
            //crear una 
            FormularioObtener nuevo = new FormularioObtener();
            
            //ajustar el tamañde un nuevo contenedor ---el mismo tamaño del contenedor ptincipal
            nuevo.setSize(contenPrincipal.getSize());
            
            nuevo.setPreferredSize(contenPrincipal.getPreferredSize() );
            //agregar el nuevo  contenedor 
            contenPrincipal.add(nuevo);
            //<Renderizarmos toda la ventana
          
         
              revalidate();
            repaint();
                   
    }//GEN-LAST:event_lisatrActionPerformed
    // Darle una accion al boton ---Leer--
    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
                        
            //Eliminarr el contenido Actual del principal 
            contenPrincipal.removeAll();
            
            
            //crear una 
            FormularioInsertar nuevo = new FormularioInsertar();
            
            //ajustar el tamañde un nuevo contenedor ---el mismo tamaño del contenedor ptincipal
            nuevo.setSize(contenPrincipal.getSize());
            
            nuevo.setPreferredSize(contenPrincipal.getPreferredSize() );
            //agregar el nuevo  contenedor 
            contenPrincipal.add(nuevo);
            //<Renderizarmos toda la ventana
            
            revalidate();
            repaint();
                    
    }//GEN-LAST:event_botonCrearActionPerformed
            // Darle una acccion al boton Actualizar 
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        
        //Eliminarr el contenido Actual del principal 
            contenPrincipal.removeAll();
            
            
            //crear una 
            FormularioActualizar nuevo = new FormularioActualizar ();
            
            //ajustar el tamañde un nuevo contenedor ---el mismo tamaño del contenedor ptincipal
            nuevo.setSize(contenPrincipal.getSize());
            
            nuevo.setPreferredSize(contenPrincipal.getPreferredSize() );
            //agregar el nuevo  contenedor 
            contenPrincipal.add(nuevo);
            //<Renderizarmos toda la ventana
            
            revalidate();
            repaint();
        
    }//GEN-LAST:event_botonEditarActionPerformed
    // Darle una acccion al boton Eliminar 
    private void botoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoEliminarActionPerformed
        // TODO add your handling code here:
        
        //Eliminarr el contenido Actual del principal 
            contenPrincipal.removeAll();
            
          
            //crear una 
            FormularioEliminar nuevo = new FormularioEliminar ();
            
            //ajustar el tamañde un nuevo contenedor ---el mismo tamaño del contenedor ptincipal
            nuevo.setSize(contenPrincipal.getSize());
            
            nuevo.setPreferredSize(contenPrincipal.getPreferredSize() );
            //agregar el nuevo  contenedor 
            contenPrincipal.add(nuevo);
            //<Renderizarmos toda la ventana
            
            revalidate();
            repaint();  
        
    }//GEN-LAST:event_botoEliminarActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelInicio;
    private javax.swing.JButton botoEliminar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonEditar;
    private javax.swing.JPanel contenMenu;
    private javax.swing.JPanel contenPrincipal;
    private javax.swing.JLabel etqCrear;
    private javax.swing.JLabel etqEditar;
    private javax.swing.JLabel etqEliminar;
    private javax.swing.JLabel etqListar;
    private javax.swing.JLabel jLabelImagenIcono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton lisatr;
    // End of variables declaration//GEN-END:variables
}
