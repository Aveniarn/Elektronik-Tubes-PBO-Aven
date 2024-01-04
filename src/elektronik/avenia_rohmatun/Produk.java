package elektronik.avenia_rohmatun;

/*
 * Author   : Avenia Rohmatun
 * NIM      : 32602200047
 *
 * Berikut adalah penjelasan terkait getter dan setter pada kelas Produk.
 */

public class Produk {
    // Atribut privat untuk nama dan harga produk
    private String nama;
    private double harga;

    // Konstruktor untuk inisialisasi objek Produk dengan nama dan harga
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter untuk mendapatkan nilai atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan nilai atribut harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk mengubah nilai atribut harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode getInfo untuk mendapatkan informasi lengkap tentang produk
    public String getInfo() {
        return "Produk: " + nama + ", Harga: " + harga;
    }
}
