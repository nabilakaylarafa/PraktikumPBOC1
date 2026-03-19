/* Nama File    : Tendik.java 
 * Deskripsi    : Berisi atribut dan method dalam class Tendik (turunan Pegawai)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;

public class Tendik extends Pegawai {

    /************ ATRIBUT ************/
    private String bidang;

    /************ METHOD *************/

    // konstruktor dengan parameter untuk inisialisasi objek tendik
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // selektor untuk mengambil nilai bidang kerja
    public String getBidang() {
        return bidang;
    }

    // mutator untuk mengubah nilai bidang kerja
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // method untuk menghitung tanggal pensiun tendik
    // rumus = (tanggal lahir + BUP 55 tahun) + 1 bulan, tanggal = 1
    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    // method untuk menghitung tunjangan tendik
    // rumus = 1% x masa kerja (tahun) x gaji pokok
    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    // method untuk menampilkan informasi lengkap tendik
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 1% x " + getMasaKerja().getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}