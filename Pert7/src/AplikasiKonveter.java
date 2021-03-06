/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AplikasiKonveter extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiKonveter
     */
    public Double input;
    public Double celcius;
    public Double fahrenheit;
    public Double reamur;
    public Double kelvin;
    public String hasilCelcius;
    public String hasilFahrenheit;
    public String hasilReamur;
    public String hasilkelvin;
    
    public AplikasiKonveter() {
        initComponents();
    }
    
    private void celcius(){
        input=Double.parseDouble(txtAwal.getText());
        
        celcius=input;
        fahrenheit=celcius*1.8+32;
        reamur=celcius*0.8;
        kelvin=celcius+273.15;
        
        hasilCelcius=Double.toString(celcius);
        txtCelcius.setText(hasilCelcius);
        
        hasilFahrenheit=Double.toString(fahrenheit);
        txtFahrenheit.setText(hasilFahrenheit);
        
        hasilReamur=Double.toString(reamur);
        txtReamur.setText(hasilReamur);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
    }
    
    private void fahrenheit(){
        input=Double.parseDouble(txtAwal.getText());
        
        fahrenheit=input;
        celcius=(fahrenheit-32)/1.8;
        reamur=(fahrenheit-32)/2.25;
        kelvin=(fahrenheit+459.57)/1.8;
        
        hasilCelcius=Double.toString(celcius);
        txtCelcius.setText(hasilCelcius);
        
        hasilFahrenheit=Double.toString(fahrenheit);
        txtFahrenheit.setText(hasilFahrenheit);
        
        hasilReamur=Double.toString(reamur);
        txtReamur.setText(hasilReamur);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
    }
    
    private void reamur(){
        input=Double.parseDouble(txtAwal.getText());
        
        reamur=input;
        celcius=reamur/0.8;
        fahrenheit=(reamur*2.25)+32;
        kelvin=reamur/0.8+237.15;
        
        hasilCelcius=Double.toString(celcius);
        txtCelcius.setText(hasilCelcius);
        
        hasilFahrenheit=Double.toString(fahrenheit);
        txtFahrenheit.setText(hasilFahrenheit);
        
        hasilReamur=Double.toString(reamur);
        txtReamur.setText(hasilReamur);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
    }
    
    private void kelvin(){
        input=Double.parseDouble(txtAwal.getText());
        
        kelvin=input;
        celcius=kelvin-273.15;
        fahrenheit=kelvin*1.8-459.67;
        reamur=(kelvin-273.15)*0.8;
        
        hasilCelcius=Double.toString(celcius);
        txtCelcius.setText(hasilCelcius);
        
        hasilFahrenheit=Double.toString(fahrenheit);
        txtFahrenheit.setText(hasilFahrenheit);
        
        hasilReamur=Double.toString(reamur);
        txtReamur.setText(hasilReamur);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAwal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();
        txtReamur = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Suhu Awal :");

        rbCelcius.setText("Celcius");

        rbFahrenheit.setText("Fahrenheit");
        rbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitActionPerformed(evt);
            }
        });

        rbReamur.setText("Reamur");

        rbKelvin.setText("Kelvin");

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel2.setText("Hasil Konversi");

        jLabel3.setText("Fahrenheit");

        jLabel4.setText("Reamur");

        jLabel5.setText("Kelvin");

        jLabel6.setText("Celcius");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCelcius)
                        .addGap(18, 18, 18)
                        .addComponent(rbFahrenheit)
                        .addGap(18, 18, 18)
                        .addComponent(rbReamur)
                        .addGap(18, 18, 18)
                        .addComponent(rbKelvin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKonversi)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal))
                            .addComponent(txtCelcius)
                            .addComponent(txtFahrenheit)
                            .addComponent(txtReamur)
                            .addComponent(txtKelvin))))
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbReamur)
                    .addComponent(rbKelvin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnClear)
                    .addComponent(btnBatal))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtReamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFahrenheitActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        // TODO add your handling code here:
        
        if(rbCelcius.isSelected()){
            celcius();
        }
        else if(rbFahrenheit.isSelected()){
            fahrenheit();
        }
        else if(rbReamur.isSelected()){
            reamur();
        }
        else if(rbKelvin.isSelected()){
            kelvin();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtAwal.setText("");
        txtCelcius.setText("");
        txtFahrenheit.setText("");
        txtReamur.setText("");
        txtKelvin.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonveter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonveter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonveter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonveter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKonveter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextField txtFahrenheit;
    private javax.swing.JTextField txtKelvin;
    private javax.swing.JTextField txtReamur;
    // End of variables declaration//GEN-END:variables
}
