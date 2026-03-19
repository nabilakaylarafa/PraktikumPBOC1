/* Nama File    : Dosen.java 
 * Deskripsi    : Berisi atribut dan method dalam class Dosen (turunan Pegawai)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;

public class Dosen extends Pegawai {

    /************ ATRIBUT ************/
    protected String fakultas;

    /************ METHOD *************/

    // konstruktor dengan parameter untuk inisialisasi objek dosen
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // selektor untuk mengambil nilai fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    // mutator untuk mengubah nilai fakultas dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

}