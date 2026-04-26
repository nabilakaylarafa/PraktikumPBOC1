/* Nama File    : Dosen.java 
 * Deskripsi    : Kelas turunan dari Civitasakademika yang merepresentasikan Dosen
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package akademik;

public class Dosen extends Civitasakademika {

    /********** ATRIBUT **********/
    private String nip;

    /********** METHOD ***********/

    // Konstruktor untuk membuat objek Dosen
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    // Selektor untuk mengambil NIP (implementasi getNomor)
    public String getNomor() {
        return nip;
    }
}