/* Nama File    : Kucing.java 
 * Deskripsi    : Berisi implementasi subclass Kucing dari class Anabul
 *                yang merepresentasikan hewan peliharaan jenis kucing.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package hewanpeliharaan;

public class Kucing extends Anabul {
    
    // Konstruktor untuk membuat objek Kucing dengan nama tertentu
    public Kucing(String nama) {
        super(nama);
    }

    // Method untuk merepresentasikan gerak Kucing
    public void gerak() {
        System.out.println("Gerak : Melata");
    }

    // Method untuk merepresentasikan suara Kucing
    public void suara() {
        System.out.println("Suara : Meong");
    }

}
