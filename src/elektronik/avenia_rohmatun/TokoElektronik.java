
package elektronik.avenia_rohmatun;

/*


author : avenia rohmatun
nim :  32602200047

package elektronik.avenia_rohmatun;: Mendefinisikan package atau paket dari kelas ini, yaitu elektronik.avenia_rohmatun.

SwingUtilities.invokeLater(...): Memastikan bahwa pembuatan dan tampilan GUI (Graphical User Interface)
dilakukan di EDT (Event Dispatch Thread) untuk menghindari potensi masalah concurrency.

new MainForm().setVisible(true);: Membuat objek dari kelas MainForm (antarmuka utama program) dan menampilkannya ke layar.
public static void main(String[] args) { ... }: Metode utama yang akan dijalankan saat program dimulai.

*/

import javax.swing.*;

public class TokoElektronik {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
