package elektronik.avenia_rohmatun;
/*
 * Author   : Avenia Rohmatun
 * NIM      : 32602200047
 *
 * Berikut adalah penjelasan lengkap kode ElektronikForm baris perbaris dengan komentar:
 */

import javax.swing.*;
import java.util.ArrayList;

public class ElektronikForm extends JDialog {
    private JLabel lblNama, lblHarga, lblJenis; // Deklarasi JLabel untuk nama, harga, dan jenis produk
    private JTextField txtNama, txtHarga, txtJenis; // Deklarasi JTextField untuk input nama, harga, dan jenis produk
    private JButton btnSimpan; // Deklarasi JButton untuk tombol simpan
    private ArrayList<Produk> daftarProduk; // ArrayList untuk menyimpan daftar produk

    // Konstruktor dengan parameter untuk menerima referensi ke MainForm dan daftarProduk
    public ElektronikForm(java.awt.Frame parent, boolean modal, ArrayList<Produk> daftarProduk) {
        super(parent, modal);
        this.daftarProduk = daftarProduk; // Inisialisasi daftarProduk dengan ArrayList yang diterima sebagai parameter
        initComponents(); // Panggil metode untuk menginisialisasi komponen GUI
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Menetapkan operasi default ketika jendela ditutup
        setTitle("Tambah Produk Elektronik"); // Menetapkan judul jendela

        lblNama = new JLabel("Nama:"); // Membuat label "Nama"
        lblHarga = new JLabel("Harga:"); // Membuat label "Harga"
        lblJenis = new JLabel("Jenis:"); // Membuat label "Jenis"

        txtNama = new JTextField(); // Membuat JTextField untuk input nama
        txtHarga = new JTextField(); // Membuat JTextField untuk input harga
        txtJenis = new JTextField(); // Membuat JTextField untuk input jenis

        btnSimpan = new JButton("Simpan"); // Membuat tombol "Simpan"
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        }); // Menambahkan ActionListener untuk menanggapi aksi tombol "Simpan"

        GroupLayout layout = new GroupLayout(getContentPane()); // Menggunakan GroupLayout untuk mengatur tata letak
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNama)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNama, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblHarga)
                                                        .addComponent(lblJenis))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtHarga)
                                                        .addComponent(txtJenis))))
                                .addContainerGap(30, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSimpan)
                                .addGap(30, 30, 30))
        ); // Mengatur tata letak horizontal menggunakan GroupLayout

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNama)
                                        .addComponent(txtNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblHarga)
                                        .addComponent(txtHarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblJenis)
                                        .addComponent(txtJenis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSimpan)
                                .addContainerGap(30, Short.MAX_VALUE))
        ); // Mengatur tata letak vertikal menggunakan GroupLayout

        pack(); // Mengatur ukuran jendela berdasarkan komponen yang ada
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        String nama = txtNama.getText(); // Mengambil nilai input nama
        double harga = Double.parseDouble(txtHarga.getText()); // Mengambil nilai input harga
        String jenis = txtJenis.getText(); // Mengambil nilai input jenis

        Elektronik elektronik = new Elektronik(nama, harga, jenis); // Membuat objek Elektronik dengan nilai yang diambil
        daftarProduk.add(elektronik); // Menambahkan objek Elektronik ke dalam daftarProduk

        // Membuat StringBuilder untuk menampilkan daftar produk yang telah dipesan
        StringBuilder daftar = new StringBuilder("Daftar Produk yang Telah Dipesan:\n");
        for (Produk produk : daftarProduk) {
            daftar.append(produk.getInfo()).append("\n");
        }

        JOptionPane.showMessageDialog(this, daftar.toString(), "Daftar Produk", JOptionPane.INFORMATION_MESSAGE);

        this.dispose(); // Menutup form setelah proses selesai
    }
}
