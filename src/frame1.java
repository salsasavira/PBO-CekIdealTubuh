
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class frame1 extends javax.swing.JFrame {

    String temp="";
    Double t1, bt, h1;
    
    public frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfbb = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tftinggi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rblk = new javax.swing.JRadioButton();
        rbp = new javax.swing.JRadioButton();
        bkeluar = new javax.swing.JButton();
        bhitung = new javax.swing.JButton();
        bcoba = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saran = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 243, 170));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Square721 Cn BT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CEK IDEAL TUBUH");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 340, 70);

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 90, 100, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel3.setText("Tinggi");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 90, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 210, 110, 30);
        jPanel1.add(tfbb);
        tfbb.setBounds(190, 170, 50, 30);

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });
        jPanel1.add(tfnama);
        tfnama.setBounds(190, 90, 150, 30);
        jPanel1.add(tftinggi);
        tftinggi.setBounds(190, 130, 50, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel5.setText("Berat Badan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 170, 120, 30);

        buttonGroup1.add(rblk);
        rblk.setText("Laki - laki");
        jPanel1.add(rblk);
        rblk.setBounds(310, 220, 100, 23);

        buttonGroup1.add(rbp);
        rbp.setText("Perempuan");
        rbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpActionPerformed(evt);
            }
        });
        jPanel1.add(rbp);
        rbp.setBounds(190, 220, 110, 23);

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(bkeluar);
        bkeluar.setBounds(300, 260, 80, 40);

        bhitung.setText("Hitung");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });
        jPanel1.add(bhitung);
        bhitung.setBounds(100, 260, 70, 40);

        bcoba.setText("Coba Lagi");
        bcoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcobaActionPerformed(evt);
            }
        });
        jPanel1.add(bcoba);
        bcoba.setBounds(190, 260, 90, 40);

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel6.setText("Berat badan ideal anda adalah");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 300, 190, 40);
        jPanel1.add(ideal);
        ideal.setBounds(250, 310, 50, 30);

        jLabel7.setText("kg");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 310, 34, 14);

        jLabel8.setText("cm");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 130, 30, 30);

        jLabel9.setText("kg");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 180, 40, 14);

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Hasil Diagnosa Kesehatan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 340, 180, 30);
        jPanel1.add(saran);
        saran.setBounds(110, 420, 250, 30);

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        jPanel1.add(hasil);
        hasil.setBounds(110, 380, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void rbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbpActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        // TODO add your handling code here:
        if (tfnama.getText().equals("") || tfbb.getText().equals("") || tftinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data masuka harus diisi semua!");
        }else if(rbp.isSelected() || rblk.isSelected())
            try{
                Proses();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Inputan Salah");
            }else {
            JOptionPane.showMessageDialog(null, "Radio Button harus dipilih");
        }
    }//GEN-LAST:event_bhitungActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcobaActionPerformed
      tfnama.setText("");
      tftinggi.setText("");
      tfbb.setText("");
      ideal.setText("");
      hasil.setText("");
      saran.setText("");
      buttonGroup1.clearSelection();
      
    }//GEN-LAST:event_bcobaActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcoba;
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkeluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rblk;
    private javax.swing.JRadioButton rbp;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tfbb;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
       t1 = Double.parseDouble(tftinggi.getText());
       bt = Double.parseDouble(tfbb.getText());
       
       if (rbp.isSelected()) {
           h1 = (t1 - 100) * 1;
       } else if (rblk.isSelected()) {
           h1 = (t1 - 104) * 1;
       }
       temp = h1+"";
       
       if (h1 < bt) {
           ideal.setText(temp);
           hasil.setText("Maaf " + tfnama.getText() + " , Sepertinya anda Over");
           saran.setText("Maaf " + tfnama.getText() + "Banyaklah berolahraga dan hindari makanan berkolestrol");
       } else if (h1 > bt) {
           ideal.setText(temp);
           hasil.setText("Maaf " + tfnama.getText() + " , Sepertinya anda under");
           saran.setText("Maaf " + tfnama.getText() + "Banyaklah mengkonsumsi makanan yang berkarbohidrat");
       } else{
           ideal.setText(temp);
           hasil.setText("Halo " + tfnama.getText() + " , Berat badan badan and sudah");
           saran.setText("Lanjutkan pola makan teratus dan gaya hidup sehat:");
       }
    }
}
