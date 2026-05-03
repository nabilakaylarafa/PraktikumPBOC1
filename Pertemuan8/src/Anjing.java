/* Nama File    : Anjing.java 
 * Deskripsi    : Berisi implementasi subclass Anjing dari kelas Anabul
 *                yang merepresentasikan hewan peliharaan jenis anjing.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

public class Anjing extends Anabul {
    
    // Konstruktor untuk membuat objek Anjing dengan nama tertentu
    public Anjing(String nama) {
        super(nama);
    }

    // Method untuk merepresentasikan gerak Anjing
    public void gerak() {
        System.out.println("Gerak : Melata");
    }

    // Method untuk merepresentasikan suara Anjing
    public void suara() {
        System.out.println("Suara : Guk-guk");
    }

}
