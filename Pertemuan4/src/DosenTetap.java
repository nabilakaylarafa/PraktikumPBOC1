/* Nama File    : DosenTetap.java 
 * Deskripsi    : Berisi atribut dan method dalam class DosenTetap (turunan dari Dosen)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {

    /************ ATRIBUT ************/
    private String nidn;

    /************ METHOD *************/

    // konstruktor dengan parameter untuk inisialisasi objek dosen tetap
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // selektor untuk mengambil nilai NIDN dosen tetap
    public String getNidn() {
        return nidn;
    }

    // mutator untuk mengubah nilai NIDN
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // method untuk menghitung tanggal pensiun dosen tetap
    // rumus = (tanggal lahir + BUP 65 tahun) + 1 bulan, tanggal = 1
    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    // method untuk menghitung tunjangan dosen tetap
    // rumus = 2% × masa kerja (tahun) × gaji pokok
    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    // method untuk menampilkan informasi lengkap dosen tetap
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 2% x " + getMasaKerja().getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}