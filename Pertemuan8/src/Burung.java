/* Nama File    : Burung.java 
 * Deskripsi    : Berisi implementasi subclass Burung dari kelas Anabul
 *                yang merepresentasikan hewan peliharaan burung.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

public class Burung extends Anabul {
    
    // Konstruktor untuk membuat objek Burung dengan nama tertentu
    public Burung(String nama) {
        super(nama);
    }

    // Method untuk merepresentasikan gerak Burung
    public void gerak() {
        System.out.println("Gerak : Terbang");
    }

    // Method untuk merepresentasikan suara Burung
    public void suara() {
        System.out.println("Suara : Cuit");
    }

}
