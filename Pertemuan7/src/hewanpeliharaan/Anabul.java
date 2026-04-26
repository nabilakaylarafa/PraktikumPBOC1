/* Nama File    : Anabul.java 
 * Deskripsi    : Berisi implementasi polimorfisme universal inclusion pada
                  kelas induk (superclass) Anabul yang merepresentasikan
                  hewan peliharaan.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package hewanpeliharaan;

public class Anabul {

    /********** ATRIBUT **********/
    private String nama;

    /********** METHOD ***********/
    
    // Konstruktor untuk membuat objek Anabul dengan nama tertentu
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nilai nama Anabul
    public String getNama() {
        return "Nama  : " + nama;
    }

    // Method untuk merepresentasikan gerak Anabul
    public void gerak() {}

    // Method untuk merepresentasikan suara Anabul
    public void suara() {}

}
