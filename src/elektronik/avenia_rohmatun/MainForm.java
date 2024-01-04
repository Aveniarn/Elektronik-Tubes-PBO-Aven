package elektronik.avenia_rohmatun;

/*
 * Author   : Avenia Rohmatun
 * NIM      : 32602200047
 *
 * Berikut adalah penjelasan lengkap kode MainForm baris perbaris dengan komentar:
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainForm extends JFrame {
    private JButton btnTambahElektronik; // Deklarasi JButton untuk menambah produk elektronik
    private ArrayList<Produk> daftarProduk; // ArrayList untuk menyimpan daftar produk elektronik

    public MainForm() {
        daftarProduk = new ArrayList<>(); // Inisialisasi ArrayList saat objek MainForm dibuat
        initComponents(); // Panggil metode untuk menginisialisasi komponen GUI
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Menetapkan operasi default ketika jendela ditutup
        setTitle("Sistem Manajemen Toko Elektronik"); // Menetapkan judul jendela

        btnTambahElektronik = new JButton("Tambah Elektronik"); // Membuat tombol "Tambah Elektronik"
        btnTambahElektronik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnTambahElektronikActionPerformed(evt);
            }
        }); // Menambahkan ActionListener untuk menanggapi aksi tombol "Tambah Elektronik"

        GroupLayout layout = new GroupLayout(getContentPane()); // Menggunakan GroupLayout untuk mengatur tata letak
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnTambahElektronik)
                                .addContainerGap(30, Short.MAX_VALUE))
        ); // Mengatur tata letak horizontal menggunakan GroupLayout

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnTambahElektronik)
                                .addContainerGap(30, Short.MAX_VALUE))
        ); // Mengatur tata letak vertikal menggunakan GroupLayout

        pack(); // Mengatur ukuran jendela berdasarkan komponen yang ada
    }

    // Metode yang akan dijalankan saat tombol "Tambah Elektronik" ditekan.
    private void btnTambahElektronikActionPerformed(ActionEvent evt) {
        ElektronikForm elektronikForm = new ElektronikForm(this, true, daftarProduk);
        elektronikForm.setVisible(true);
    }

    //Metode untuk menambahkan produk ke dalam ArrayList 
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}
