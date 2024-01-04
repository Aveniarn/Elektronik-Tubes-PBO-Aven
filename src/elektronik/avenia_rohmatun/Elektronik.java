package elektronik.avenia_rohmatun;

/*
 * Author   : Avenia Rohmatun
 * NIM      : 32602200047
 *
 *  Di kode ini, terdapat implementasi konsep inheritance, polymorphism, dan encapsulation.
 *  Berikut adalah penjelasan bagiannya:
 */

public class Elektronik extends Produk { // (1) Inheritance
    private String jenis; // Encapsulation: Atribut jenis dienkapsulasi (private) di dalam kelas Elektronik.

    public Elektronik(String nama, double harga, String jenis) {
        super(nama, harga); // (2) Memanggil konstruktor superclass (Produk) menggunakan super().
        this.jenis = jenis; // Encapsulation: Melakukan inisialisasi atribut jenis di dalam konstruktor.
    }

    // Getter dan setter untuk atribut jenis
    public String getJenis() { // (3) Polymorphism: Menggunakan polimorfisme dengan membuat metode getJenis().
        return jenis;
    }

    public void setJenis(String jenis) { // (3) Polymorphism: Menggunakan polimorfisme dengan membuat metode setJenis().
        this.jenis = jenis;
    }

    @Override
    public String getInfo() { // (3) Polymorphism: Menggunakan polimorfisme dengan melakukan overriding metode getInfo().
        return super.getInfo() + ", Jenis: " + jenis; // (3) Polymorphism: Memanggil metode getInfo() dari superclass (Produk).
    }
}
