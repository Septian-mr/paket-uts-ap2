/*
 * Ini adalah simulasi program konversi file TXT kedalam DOC maupun DOCX, sebagai salah satu
 * pengumpulan tugas UTS mata kuliah Algoritma & Pemrograman 2
 */
package uts_ke1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class txt2docX extends javax.swing.JFrame {

    /**
     * Definisi baru untuk JForm txt2docX
     */
    
    public File theFile = null;
    public FileReader baca = null;
    public BufferedReader ambil;
    public String alamat;
    public String line;
    public int docu = 0;
    
    
    public txt2docX() {
        initComponents();
        this.setTitle("Konversi TXT - DOCX");
        this.setLocationRelativeTo(this);
        simpan.setEnabled(false);
        reset.setEnabled(false);
        preview.setEnabled(false);
        path.setEnabled(false);
        path.setText("---lokasi file---");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titl1 = new javax.swing.JLabel();
        titl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doc = new javax.swing.JRadioButton();
        docx = new javax.swing.JRadioButton();
        simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        preview = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titl1.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        titl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titl1.setText("SIMULASI PROGRAM JAVA");

        titl2.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        titl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titl2.setText("KONVERSI FILE TXT KE DOC & DOCX");

        jLabel1.setText("Pratinjau teks (Silahkan edit sesuka hati di bawah ini) :");

        jLabel2.setText("Simpan kedalam :");

        doc.setText("DOC");
        doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docActionPerformed(evt);
            }
        });

        docx.setText("DOCX");
        docx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docxActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jLabel4.setText("Pilih File       :");

        cari.setText("Pilih");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        path.setEditable(false);
        path.setText("---lokasi file---");
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        preview.setColumns(20);
        preview.setRows(5);
        jScrollPane1.setViewportView(preview);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Septian_MR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titl2, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(path))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(doc)
                                            .addComponent(docx))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titl1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titl2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cari)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(docx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docActionPerformed
        //Berfungsi apabila USER memilih bullet "DOC" untuk menyimpan file
        docu = 1;
        simpan.setEnabled(true);
        docx.setEnabled(false);
        cari.setEnabled(false);
        System.out.println("----------------------------------");
        System.out.println("Log : Memilih ekstensi DOC untuk menyimpan");
    }//GEN-LAST:event_docActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        //Berfungsi apabila USER mencari dan memilih file TXT
        FileFilter filter = new FileNameExtensionFilter("Text files", "txt"); //Filter file, hanya file ekstensi TXT yang muncul
        JFileChooser pilihan = new JFileChooser("C:\\Document"); //Titik awal file yang ingin dicari
        pilihan.addChoosableFileFilter(filter); //Proses filter file ekstensi tersebut
        
        //Berfungsi apabila USER berhasil memilih file TXT
        int buka01 = pilihan.showOpenDialog(txt2docX.this);
        if (buka01 == JFileChooser.APPROVE_OPTION){
            theFile = pilihan.getSelectedFile();
            alamat = theFile.getPath();
            System.out.println("----------------------------------");
            System.out.println("Log : File sudah masuk");
            System.out.println("Log : Sumber file = " + alamat);
            System.out.println("----------------------------------");
            path.setText(alamat);
        }
        
        //Berfungsi apabila PROGRAM mulai membaca file TXT
        try {
            baca = new FileReader(theFile); //mulai membaca isi file
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File tidak ditemukan!");
        }
        ambil = new BufferedReader(baca); //proses pembacaan isi file
        try {
            System.out.println("----------------------------------");
            System.out.println("Log : Tampilkan teks");
            System.out.println("----------------------------------");
            int jumlahbaris = 0;
            while ((line=ambil.readLine()) != null) {
                System.out.println(line);
                preview.setEnabled(true);
                preview.append(line + "\n"); //Isinya tampil di textarea
            jumlahbaris++;
            }
            
            ambil.close(); //selesai membaca file
            System.out.println("----------------------------------");
            System.out.println("Log : Teks sudah ditampilkan");
            System.out.println("----------------------------------");
            reset.setEnabled(true);
            cari.setEnabled(false);
            path.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
        }
    }//GEN-LAST:event_cariActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // Gak ada :P
    }//GEN-LAST:event_pathActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        //Berfungsi apabila USER mennyimpan file TXT kedalam DOC atau DOCX
        try {
            String kalimat = preview.getText();
            if (docu==1){
                //Simpan kedalam DOC
                String lokasi_file = alamat+".doc";
                XWPFDocument file_doc = new XWPFDocument();
                FileOutputStream tampil;
                tampil = new FileOutputStream(new File(lokasi_file));
                
                XWPFParagraph teks_prgrf = file_doc.createParagraph();
                XWPFRun jalankan = teks_prgrf.createRun();
                jalankan.setText(kalimat);
                file_doc.write(tampil);
                tampil.close();
        
                System.out.println("----------------------------------");
                System.out.println("Log : File sudah tersimpan kedalam DOC");
                simpan.setEnabled(false);
                doc.setEnabled(true);
                docx.setEnabled(true);
                cari.setEnabled(false);
            } else {
                //Simpan kedalam DOCX
                String lokasi_file = alamat+".docx";
                XWPFDocument file_docx = new XWPFDocument();
                FileOutputStream tampil; 
                tampil = new FileOutputStream(new File(lokasi_file));
                
                XWPFParagraph teks_prgrf = file_docx.createParagraph();
                XWPFRun jalankan = teks_prgrf.createRun();
                jalankan.setText(kalimat);
                file_docx.write(tampil);
                tampil.close();
        
                System.out.println("----------------------------------");
                System.out.println("Log : File sudah tersimpan kedalam DOCX");
                simpan.setEnabled(false);
                doc.setEnabled(true);
                docx.setEnabled(true);
                cari.setEnabled(false);
            }
           
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Maaf ada kesalahan. Coba lagi.");
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void docxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docxActionPerformed
        //Berfungsi apabila USER memilih bullet "DOCX" untuk menyimpan file
        docu = 0;
        simpan.setEnabled(true);
        doc.setEnabled(false);
        cari.setEnabled(false);
        System.out.println("----------------------------------");
        System.out.println("Log : Memilih ekstensi DOCX untuk menyimpan");
    }//GEN-LAST:event_docxActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        //Berfungsi apabila USER me-reset semua data dan kembali ke awal
        docu = 0;
        line = null;
        baca = null;
        theFile = null;
        alamat = null;
        simpan.setEnabled(false);
        reset.setEnabled(false);
        preview.setEnabled(false);
        doc.setEnabled(false);
        docx.setEnabled(false);
        cari.setEnabled(true);
        path.setText("---lokasi file---");
        preview.setText("");
        System.out.println("----------------------------------");
        System.out.println("Log : Data di-reset");
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(txt2docX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(txt2docX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(txt2docX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(txt2docX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new txt2docX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JRadioButton doc;
    private javax.swing.JRadioButton docx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField path;
    private javax.swing.JTextArea preview;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel titl1;
    private javax.swing.JLabel titl2;
    // End of variables declaration//GEN-END:variables
}
