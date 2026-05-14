/* Nama File    : Anabul.java 
 * Deskripsi    : Berisi superclass Anabul yang merepresentasikan hewan peliharaan.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class Anabul {

    /********** ATRIBUT **********/
    private String nama;


    /********** METHOD ***********/
    // Konstruktor untuk membuat objek Anabul
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nama Anabul
    public String getNama() {
        return nama;
    }

    // Mutator untuk mengubah nama Anabul
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method gerak
    public void gerak() {}

    // Method suara
    public void suara() {}
}