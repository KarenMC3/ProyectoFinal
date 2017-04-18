package proyecto;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/*
 * @author Karen Mendiola Carrillo
 */
public class encuesta extends javax.swing.JFrame {

    preguntas preguntas = new preguntas();
    
    int respuestas = 0;

    int acumulador = 0;
    
    int aux = 0;
    
    public encuesta() {
        
        initComponents();  
        generar();
        
    }
    
    public boolean generar(){
        
        int pregunta = ThreadLocalRandom.current().nextInt(0, 15); 
        int psocicion = ThreadLocalRandom.current().nextInt(1,4);
        
        jLabel1.setText(preguntas.pregunta(pregunta));     
        
        aux = 0;
        
        if(psocicion == 1){
            
            opc1.setText(preguntas.respuesta(pregunta));
            opc2.setText(preguntas.respuestaAleatoria(pregunta));
            opc3.setText(preguntas.respuestaAleatoria(pregunta));
            opc4.setText(preguntas.respuestaAleatoria(pregunta));
            aux = 1;
            
        }
        
        if(psocicion == 2){
            
            opc1.setText(preguntas.respuestaAleatoria(pregunta));
            opc2.setText(preguntas.respuesta(pregunta));
            opc3.setText(preguntas.respuestaAleatoria(pregunta));
            opc4.setText(preguntas.respuestaAleatoria(pregunta));
            aux = 2;
        }
        
        if(psocicion == 3){
            
            opc1.setText(preguntas.respuesta(pregunta));
            opc2.setText(preguntas.respuestaAleatoria(pregunta));
            opc3.setText(preguntas.respuesta(pregunta));
            opc4.setText(preguntas.respuestaAleatoria(pregunta));
            aux = 3;
            
        }
        
        if(psocicion == 4){
            
            opc1.setText(preguntas.respuesta(pregunta));
            opc2.setText(preguntas.respuestaAleatoria(pregunta));
            opc3.setText(preguntas.respuestaAleatoria(pregunta));
            opc4.setText(preguntas.respuesta(pregunta));
            aux = 4;
            
        }
        
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        opc1.setText("jRadioButton1");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc2.setText("jRadioButton2");
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        opc3.setText("jRadioButton3");
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.setText("jRadioButton4");
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc4)
                    .addComponent(opc3)
                    .addComponent(opc2)
                    .addComponent(opc1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opc4)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        
        if (acumulador != 5){
            acumulador++;
            if (aux == 1){
                respuestas++;
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Resultado: " + respuestas);
            respuestas = 0;
            System.exit(0);
        }
        opc1.setSelected(false);
        generar();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        if (acumulador != 5){
            acumulador++;
            if (aux == 2){
                respuestas++;
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Resultado: " + respuestas);
            respuestas = 0;
            System.exit(0);
        }
        opc2.setSelected(false);
        generar();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        if (acumulador != 5){
            acumulador++;
            if (aux == 3){
                respuestas++;
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Resultado: " + respuestas);
            respuestas = 0;
            System.exit(0);
        }
        opc3.setSelected(false);
        generar();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        if (acumulador != 5){
            acumulador++;
            if (aux == 4){
                respuestas++;
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Resultado: " + respuestas);
            respuestas = 0;
            System.exit(0);
        }
        opc4.setSelected(false);
        generar();
    }//GEN-LAST:event_opc4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    // End of variables declaration//GEN-END:variables
}
