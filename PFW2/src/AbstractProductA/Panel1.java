package AbstractProductA;



import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JTextField;


// Promenljivo!!!
public class Panel1 extends Panel{

    /**
     * Creates new form Panel1
     */
    public Panel1() {
        initComponents();
        prepared();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbVoce = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SifraProrudzbine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Kreiraj = new javax.swing.JButton();
        Promeni = new javax.swing.JButton();
        Obrisi = new javax.swing.JButton();
        Nadji = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Poruka = new javax.swing.JTextField();
        cmbPreliv = new javax.swing.JComboBox<>();
        cmbPalacinka = new javax.swing.JComboBox<>();
        TekuciLog = new javax.swing.JButton();

        cmbVoce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10" }));
        cmbVoce.setEditor(null);
        cmbVoce.setName("cmbVoce"); // NOI18N
        cmbVoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVoceActionPerformed(evt);
            }
        });
        cmbVoce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbVoceKeyPressed(evt);
            }
        });

        jLabel1.setText("Palacinka:");

        jLabel2.setText("Preliv:");

        jLabel3.setText("Voce:");

        SifraProrudzbine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifraProrudzbineActionPerformed(evt);
            }
        });
        SifraProrudzbine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SifraProrudzbineKeyPressed(evt);
            }
        });

        jLabel4.setText("Sifra porudzbine:");

        Kreiraj.setText("Kreiraj");

        Promeni.setText("Promeni");

        Obrisi.setText("Obrisi");

        Nadji.setText("Nadji");
        Nadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NadjiActionPerformed(evt);
            }
        });

        jLabel6.setText("Poruka:");

        Poruka.setForeground(new java.awt.Color(255, 0, 0));
        Poruka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorukaActionPerformed(evt);
            }
        });

        cmbPreliv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10" }));
        cmbPreliv.setEditor(null);
        cmbPreliv.setName("Ocena"); // NOI18N
        cmbPreliv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPrelivKeyPressed(evt);
            }
        });

        cmbPalacinka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10" }));
        cmbPalacinka.setEditor(null);
        cmbPalacinka.setName("Ocena"); // NOI18N
        cmbPalacinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPalacinkaKeyPressed(evt);
            }
        });

        TekuciLog.setText("TekuciLog");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SifraProrudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nadji))
                            .addComponent(cmbPalacinka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPreliv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbVoce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(TekuciLog))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kreiraj)
                        .addGap(18, 18, 18)
                        .addComponent(Promeni)
                        .addGap(18, 18, 18)
                        .addComponent(Obrisi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SifraProrudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Nadji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPalacinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPreliv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbVoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TekuciLog))
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kreiraj)
                    .addComponent(Obrisi)
                    .addComponent(Promeni))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Poruka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbVoceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbVoceKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                SifraProrudzbine.requestFocus();
          } // TODO add your handling code here:
    }//GEN-LAST:event_cmbVoceKeyPressed

    private void SifraProrudzbineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifraProrudzbineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SifraProrudzbineActionPerformed

    private void NadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NadjiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NadjiActionPerformed

    private void PorukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorukaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorukaActionPerformed

    private void SifraProrudzbineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SifraProrudzbineKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                SifraProrudzbine.requestFocusInWindow();
          }
    }//GEN-LAST:event_SifraProrudzbineKeyPressed

    private void cmbPrelivKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPrelivKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                SifraProrudzbine.requestFocus();
          }
    }//GEN-LAST:event_cmbPrelivKeyPressed

    private void cmbPalacinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPalacinkaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                SifraProrudzbine.requestFocus();
          }
    }//GEN-LAST:event_cmbPalacinkaKeyPressed

    private void cmbVoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVoceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVoceActionPerformed

          
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kreiraj;
    private javax.swing.JButton Nadji;
    private javax.swing.JButton Obrisi;
    private javax.swing.JTextField Poruka;
    private javax.swing.JButton Promeni;
    private javax.swing.JTextField SifraProrudzbine;
    private javax.swing.JButton TekuciLog;
    private javax.swing.JComboBox<String> cmbPalacinka;
    private javax.swing.JComboBox<String> cmbPreliv;
    private javax.swing.JComboBox<String> cmbVoce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getSifraPorudzbine() {
        return SifraProrudzbine.getText();
    }

    @Override
    public JTextField getSifraPorudzbine1() {
        return SifraProrudzbine;
    }

    @Override
    public String getPalacinka() {
        return cmbPalacinka.getSelectedItem().toString();
    }

    @Override
    public String getPreliv() {
        return cmbPreliv.getSelectedItem().toString();
    }

    @Override
    public String getVoce() {
        return cmbVoce.getSelectedItem().toString();
    }

    @Override
    public void setSifraPorudzbine(String sifraPorudzbine) {
        SifraProrudzbine.setText(sifraPorudzbine);
    }

    @Override
    public void setPalacinka(String Palacinka) {
        cmbPalacinka.setSelectedItem(Palacinka);
    }

    @Override
    public void setPreliv(String Preliv) {
        cmbPreliv.setSelectedItem(Preliv);
    }

    @Override
    public void setVoce(String Voce) {
       cmbVoce.setSelectedItem(Voce);
    }

    @Override
    public void setPoruka(String Poruka) {
        this.Poruka.setText(Poruka);
    }

    @Override
    public JButton getKreiraj() {
        return Kreiraj;
    }

    @Override
    public JButton getPromeni() {
        return Promeni;
    }

    @Override
    public JButton getObrisi() {
        return Obrisi;
    }

    @Override
    public JButton getNadji() {
        return Nadji;
    }

    private void prepared() {
        cmbPalacinka.removeAllItems();
        cmbPalacinka.addItem("COKO");
        cmbPalacinka.addItem("KLASICNA");
        cmbPalacinka.addItem("RED VELVET");
        cmbPalacinka.addItem("nista");

        
        cmbVoce.removeAllItems();
        cmbVoce.addItem("banana");
        cmbVoce.addItem("visnje");
        cmbVoce.addItem("sumsko voce");
        cmbVoce.addItem("nista");
        
        cmbPreliv.removeAllItems();
        cmbPreliv.addItem("Nutela");
        cmbPreliv.addItem("Ala Kinder Bueno");
        cmbPreliv.addItem("Gold bela cokolada");
        cmbPreliv.addItem("nista");

        
    }

        @Override
    public javax.swing.JButton getTekuciLog(){return TekuciLog;}
}
