/* Nama File    : Kucing.java 
 * Deskripsi    : Berisi implementasi subclass Kucing dari class Anabul
 *                yang merepresentasikan hewan peliharaan jenis kucing.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class Kucing extends Anabul {

    /********** ATRIBUT **********/
    private double bobot;
    
    /********** METHOD ***********/

    // Konstruktor untuk membuat objek Kucing
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Selektor untuk mengambil nilai bobot
    public double getBobot() {
        return bobot;
    }

    // Mutator untuk mengubah nilai bobot
    public void setBobot(double bobot) {
        this.bobot = bobot; 
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
