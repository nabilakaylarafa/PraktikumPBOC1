/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Kelas turunan dari Civitasakademika yang merepresentasikan Mahasiswa
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package akademik;

public class Mahasiswa extends Civitasakademika {

    /********** ATRIBUT **********/
    private String nim;
    private Dosen dosenWali;

    /********** METHOD ***********/

    // Konstruktor untuk membuat objek Mahasiswa
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    // Selektor untuk mengambil NIM (implementasi getNomor)
    public String getNomor() {
        return nim;
    }

    // Mutator untuk mengubah dosen wali
    public void setWali(Dosen dw) {
        this.dosenWali = dw;
    }

    // Menampilkan data Mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Dosen Wali  : " + dosenWali.getNama());
    }
}