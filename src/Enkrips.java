

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Enkripsi extends javax.swing.JFrame {
    private JFileChooser dialog = new JFileChooser();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuka; //Private button buka
    private javax.swing.JButton btDekrip; //Private button dekrip
    private javax.swing.JButton btEnkrip; //Private button enkrip
    private javax.swing.JButton btKeluar; //Private button keluar
    private javax.swing.JButton btSimpan; //Private button simpan
    private javax.swing.JLabel jLabel1; //Private label label1
    private javax.swing.JLabel jLabel2; //Private label label2
    private javax.swing.JLabel jLabel3; //Private label label3
    private javax.swing.JLabel jLabel4; //Private label label4
    private javax.swing.JLabel jLabel6; //Private label label6
    private javax.swing.JScrollPane jScrollPane1; //Private scrollpane scrollpane1
    private javax.swing.JScrollPane jScrollPane3; //Private scrollpane scrollpane3
    private javax.swing.JScrollPane jScrollPane4; //Private scrollpane scrollpane4
    private javax.swing.JTextArea jTextArea1; //Private jtextArea textarea1
    private javax.swing.JTextArea txtChiperText; //Private jtextArea textChiperText
    private javax.swing.JTextField txtKey;  //Private jtextField txtKey
    private javax.swing.JTextArea txtPlaintext; //Private jtextArea txtPlaintext
    public Enkripsi() {
        initComponents(); //Memanggil method initComponents
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Enkripsi().setVisible(true);//Menjalankan fungsi konstraktor Enkripsi
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane(); //GUI jscrollPane
        jTextArea1 = new javax.swing.JTextArea(); //GUI jtextArea
        jLabel1 = new javax.swing.JLabel(); //GUI jtextLabel
        btBuka = new javax.swing.JButton(); //GUI button buka
        btSimpan = new javax.swing.JButton(); //GUI button simpan
        btKeluar = new javax.swing.JButton(); //GUI button keluar
        jScrollPane3 = new javax.swing.JScrollPane(); //GUI jscrollPane
        txtChiperText = new javax.swing.JTextArea(); //GUI jtextArea
        jScrollPane4 = new javax.swing.JScrollPane(); //GUI jscrollPane
        txtPlaintext = new javax.swing.JTextArea(); //GUI jtextArea
        jLabel2 = new javax.swing.JLabel(); //GUI jtextLabel
        jLabel3 = new javax.swing.JLabel(); //GUI jtextLabel
        jLabel4 = new javax.swing.JLabel(); //GUI jtextLabel
        btEnkrip = new javax.swing.JButton(); //GUI jtextLabel
        btDekrip = new javax.swing.JButton(); //GUI jtextLabel
        txtKey = new javax.swing.JTextField(); //GUI jtextField
        jLabel6 = new javax.swing.JLabel(); //GUI jtextLabel

        jTextArea1.setColumns(20); //Mengatur lebar kolom jTextArea1
        jTextArea1.setRows(5); //Mengatur lebar baris jTextArea1
        jScrollPane1.setViewportView(jTextArea1); //Mengatur scroll untuk jTextArea1

        jLabel1.setText("===>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //fungsi close window di java
        setTitle("Program Enkripsi"); //mengatur nama title halaman window program
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //mengatur cursor di window program
        setFont(new java.awt.Font("Tahoma", 0, 10)); // mengatur jenis di window program
        setModalExclusionType(null);
        setResizable(false); // mengatur ukuran/size agar tidak bisa di rubah ukurannya atau ukurannya tetap

        btBuka.setText("Buka File"); //Membuat label button buka
        btBuka.addActionListener(new java.awt.event.ActionListener() { //Action button saat di cliick
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBukaActionPerformed(evt);//Aksi yang dilakukan ialah button buka actionPerformed
            }
        });

        btSimpan.setText("Simpan"); //Membuat label button simpan
        btSimpan.addActionListener(new java.awt.event.ActionListener() { //Action button saat di cliick
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);//Aksi yang dilakukan ialah button simpan actionPerformed
            }
        });

        btKeluar.setText("Keluar"); //Membuat label button keluuar
        btKeluar.addActionListener(new java.awt.event.ActionListener() { //Action button saat di cliick
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt); //Aksi yang dilakukan ialah button keluar actionPerformed
            }
        });

        txtChiperText.setColumns(20); //mengatur kolom textChiperText
        txtChiperText.setRows(5); //mengatur baris textChiperText
        jScrollPane3.setViewportView(txtChiperText); //mengatur srcolling textChiperText

        txtPlaintext.setColumns(20); //mengatur kolom textPlainText
        txtPlaintext.setRows(5); //mengatur baris textPlainText
        jScrollPane4.setViewportView(txtPlaintext); //mengatur srcolling textPlainText

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); //mengatur font jlabel2
        jLabel2.setText("ENKRIPSI "); //mengatur nama label jlabel2

        jLabel3.setText("Plaintext"); //mengatur nama label jlabel3

        jLabel4.setText("Chipertext"); //mengatur nama label jlabel4

        btEnkrip.setText("Enkirpsi"); //mengatur nama button btnEnkrip
        btEnkrip.addActionListener(new java.awt.event.ActionListener() {//Action button saat di cliick
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnkripActionPerformed(evt);//Aksi yang dilakukan ialah button enkrip actionPerformed
            }
        });

        btDekrip.setText("Dekripsi"); //mengatur nama button btnDekrip
        btDekrip.addActionListener(new java.awt.event.ActionListener() {//Action button saat di cliick
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDekripActionPerformed(evt);//Aksi yang dilakukan ialah button dekrip actionPerformed
            }
        });

        txtKey.addKeyListener(new java.awt.event.KeyAdapter() { //Action button saat di ketik
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyKeyPressed(evt); //Aksi yang dilakukan saat user mengetik
            }
        });

       /* jLabel6.setText("Masukan Key"); //mengatur nama label jlabel6*/

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); //membuat group layout yang berisi getContentPane
        getContentPane().setLayout(layout); // Mengatur getContentPane ke dalam setLayout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btBuka)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel3)
                                                .addGap(188, 188, 188)
                                                .addComponent(jLabel4)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btEnkrip)
                                        .addComponent(btDekrip)
                                        .addComponent(jLabel6))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btSimpan)
                                        .addComponent(btBuka)
                                        .addComponent(btKeluar)
                                        .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack(); // Melaukuan pack swing
        setLocationRelativeTo(null); // Mengatur agar tampilan window swing berada ditengah
    }// </editor-fold>//GEN-END:initComponents

    //Program BUTTON untuk melakukan OPEN
    private void btBukaActionPerformed(java.awt.event.ActionEvent evt) {//Aksi pertama:event_btBukaActionPerformed
        txtChiperText.setText(null); //Text Chiper di set dengan null
        int isi = dialog.showOpenDialog(this); //memberikan nilai showMessageDialog ke isi

        if (isi == JFileChooser.APPROVE_OPTION) {   //jika file dipilih open
            File file = dialog.getSelectedFile(); // Set getSelectedFile ke dalam Class File
            try{
                FileInputStream fstream = new FileInputStream(file); // Mengambil data file menggunakan file input stream
                DataInputStream in = new DataInputStream(fstream); // Mengirim data fstream ke dalam Data Input StreamCorruptedException
                BufferedReader br = new BufferedReader(new InputStreamReader(in)); // Data input stream in di baca menggunakan class buffred reader
                String strLine; // Inisialisasi Sring strLine
                while ((strLine = br.readLine()) != null){ // Melakukan Perulangan dari buffredReader
                    StringTokenizer st = new StringTokenizer(strLine, ","); //Menyimpan nilai strLine ke dalam StringTokenizer
                    txtChiperText.setText(txtChiperText.getText() + st.nextToken() +"\n"); // menampilkan hasil ke dalam textChiperText
                }
                in.close(); //Data Input Berakhir
            }catch (Exception e){
                System.err.println("Error: " + e.getMessage()); //Catch Error Program
            }
        }
    }//GEN-LAST:event_btBukaActionPerformed

    //Program BUTTON untuk melakukan SIMPAN
    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//Aksi pertama:event_btSimpanActionPerformed
        int isi = dialog.showSaveDialog(this); //Text Chiper di set dengan null
        if (isi == JFileChooser.APPROVE_OPTION) {    // jika file di pilih untuk di simpan
            File file = dialog.getSelectedFile(); // Set getSelectedFile ke dalam Class File
            try {
                file.createNewFile(); //Menuliskan program ke dalam file
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file))); // Mencetak hasilnya ke dalam file yang suda dipilih
                out.print(txtChiperText.getText()); // Hasil Cetakan di simpan ke folder
                out.flush();
            }
            catch (IOException ex) {
                System.err.println("Error: " + ex.getMessage()); //Catch Error Program
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    // Program BUTTON untuk melakukan KELUAR Program
    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//Program Pertama:event_btKeluarActionPerformed
        System.exit(1); //Keluar dari program
    }//GEN-LAST:event_btKeluarActionPerformed

    // Program BUTTON untuk melakukan ENKRIPSI
    private void btEnkripActionPerformed(java.awt.event.ActionEvent evt) {//Program Pertama:event_btEnkripActionPerformed
        String key = txtKey.getText(); //Mendapatkan key dari textKey
        String isitext = (key.length())+key+txtPlaintext.getText(); // menggabungkan panjang key, key dan text yang mau dienkrip
        String out= "" ;
        for (int i = 0; i < isitext.length(); i++) { //Melakukan perulangan
            int index = isitext.charAt(i); // menghitung nilai angka dari huruf satu persatu
            char s = (char)(index+1) ; // menyimpan satu karakter dari nilai angka index
            out = out+ String.valueOf(s); //menyimpan ke dalam varibel out yang berisi nilai dari variabel s
        }
        txtChiperText.setText(out); //menampilkan out ke dalam text chiper
        txtPlaintext.setText(""); // menghapus isi dari text plain text
        txtKey.setText(""); // menghapus isi dari text key
    }//GEN-LAST:event_btEnkripActionPerformed

    // Program BUTTON untuk melakukan DEKRIP
    private void btDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDekripActionPerformed
        String isitext = txtChiperText.getText(); //Mengamil nilai textChiperText
        char k = (char)(isitext.charAt(0)); //isi data dari isiText di ambil dan di letakkan di char k
        String key = "",out = ""; //Inisialisasi key, dan out
        int   jumKey = Integer.parseInt(String.valueOf(k))-1; //menghitung banyyaknya jumlah text key
        //   JOptionPane.showMessageDialog(null,jumKey);
        // buka password
        for (int i = 1 ; i <= jumKey; i++) { //Melakuan perulangan jumlahKey
            int index = isitext.charAt(i); // mengambil nilai angka dari isiText
            char s = (char)(index-1) ; // mengambil nilai karakter index dan mengisinya ke dalam char s
            key = key + String.valueOf(s); // memberikan nilai key dari data key ditambah nilai dari variabel s
        }
        //   JOptionPane.showMessageDialog(null,key);

        //Mengecek key benar atau tidak
        if (key.equals(txtKey.getText())){  // jika key hasil benar
            for (int i = (jumKey+1) ; i < isitext.length(); i++) { //Melakukan perulangan untuk membaca data
                int index = isitext.charAt(i); // menyimpan nilai angka da
                char s = (char)(index-1) ; // Mengambil nila index dan meletakkannya kedalam variabel char s
                out = out + String.valueOf(s); // menyimpan hasilnya ke dalam variabel out
            }
            txtPlaintext.setText(out); //menampilkan hasil out ke dalam textplaintext
        }

        else{ //jika key hasil salah
            JOptionPane.showMessageDialog(null,"Key tidak cocok \nSilahkan coba lagi");
        }
    }//GEN-LAST:event_btDekripActionPerformed

    private void txtKeyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyKeyPressed
    // End of variables declaration//GEN-END:variables
}
