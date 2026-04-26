/* Nama File    : Civitasakademika.java 
 * Deskripsi    : Berisi kelas induk (superclass) yang merepresentasikan civitas akademika
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package akademik;

public class Civitasakademika {

    /********** ATRIBUT **********/
    protected String nama;

    /********** METHOD ***********/

    // Konstruktor untuk membuat objek Civitasakademika dengan nama tertentu
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Selektor untuk mengambil nomor identitas
    public String getNomor() {
        return " ";
    }
    
}