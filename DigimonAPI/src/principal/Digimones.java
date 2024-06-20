package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.MenuComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import utils.ConsumoAPI;


public class Digimones extends javax.swing.JFrame {
    
    int pagina;
   
    
    public Digimones() {
        
        this.pagina = 0;
        initComponents();
        initAlternComponents();
        cargarDigimones();

    }
    
    public void initAlternComponents(){
        setVisible(true);
        setTitle("API Digimones");  
        setSize(new Dimension(761,577));
        setPreferredSize(new Dimension(761,577));
        setResizable(false);
        setLocationRelativeTo(null);
        
        contentItems.setLayout(new GridBagLayout());
        
    }
    
    
    public void cargarDigimones(){
        
        ConsumoAPI consumo = new ConsumoAPI();
        
        String endpoint = "https://digi-api.com/api/v1/digimon?page="+this.pagina;
        String respuesta = consumo.consumoGET(endpoint);
        
        JsonObject data = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray digimones = data.getAsJsonArray("content");
        
        GridBagConstraints restriccion = new GridBagConstraints();
        contentItems.removeAll();
        
        int contx = 0;
        int conty = 0;
        
        for(int i = 0; i < digimones.size(); i++){
            
            JsonObject temp = digimones.get(i).getAsJsonObject();
            
            ItemDigimon item = new ItemDigimon(temp);
            restriccion.gridx = contx;
            restriccion.gridy = conty;
            restriccion.gridwidth = 1;
            restriccion.gridheight = 1;
            restriccion.weightx = 1;
            restriccion.weighty = 1;
            restriccion.fill = GridBagConstraints.BOTH;
            contentItems.add(item, restriccion);
            
            if(contx == 2){
                
                contx = 0;
                conty ++;
            }else{
                
                contx ++;
            }
        }
        
        cargarPaginador();
        revalidate();
        repaint();
        
    }
    
    public void cargarPaginador(){
        
        contentPaginador.removeAll();
        
      
        //Crear boton pagina 1
        JButton btnPrimera = new JButton("<<");
        contentPaginador.add(btnPrimera);
        btnPrimera.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            pagina = 0;
            cargarDigimones();
        }
        
        });
        
        //Crear boton de pagina anterior
        JButton btnAnterior = new JButton("<");
        contentPaginador.add(btnAnterior);
        btnAnterior.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           if(pagina > 0){
               
               pagina --;
               cargarDigimones();
           }
        }
        
        });
        
        //Crear boton de las paginas con el metodo math para 
        int inicio = Math.max(0, pagina - 2);
        int fin = Math.min(292, pagina + 4);
        
        for(int i = inicio; i <= fin; i++){
            
           JButton btnIntermedio = new JButton("" + i);
           contentPaginador.add(btnIntermedio);

             
            if((i-1) == pagina){
            
                btnIntermedio.setBackground(Color.red);
                btnIntermedio.setForeground(Color.white);
            }else{
                btnIntermedio.setBackground(null);
                btnIntermedio.setForeground(null);
            }
            
            final int posicion = i;
            
            if(posicion == 0){
                contentPaginador.remove(btnIntermedio);
            }
            
            btnIntermedio.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
             
                 pagina = posicion - 1;
                 cargarDigimones();
             
             }
                
            
            });
            
        }
        
        //Crear boton pagina siguiente
        JButton btnSiguiente = new JButton(">");
        contentPaginador.add(btnSiguiente);
        
        btnSiguiente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            
        if(pagina < 291){
            pagina ++;
            cargarDigimones();
        }
            }
        });
        
        //Crear boton ultima pagina
        JButton btnUltima = new JButton(">>");
        contentPaginador.add(btnUltima);
        
        btnUltima.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        
            pagina = 291;
            cargarDigimones();
        
        }
        
        
        
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        contentItems = new javax.swing.JPanel();
        contentPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contentItems.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentItemsLayout = new javax.swing.GroupLayout(contentItems);
        contentItems.setLayout(contentItemsLayout);
        contentItemsLayout.setHorizontalGroup(
            contentItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentItemsLayout.setVerticalGroup(
            contentItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        contentPaginador.setLayout(new javax.swing.BoxLayout(contentPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(contentItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentItems;
    private javax.swing.JPanel contentPaginador;
    private javax.swing.JPanel contentPrincipal;
    // End of variables declaration//GEN-END:variables
}
