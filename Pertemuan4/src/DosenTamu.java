/* Nama File    : DosenTamu.java 
 * Deskripsi    : Berisi atribut dan method dalam class DosenTamu (turunan dari Dosen)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    /************ ATRIBUT ************/
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    /************ METHOD *************/

    // konstruktor dengan parameter untuk inisialisasi objek dosen tamu
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // selektor untuk mengambil nilai NIDK dosen tamu
    public String getNidk() {
        return nidk;
    }

    // selektor untuk mengambil tanggal akhir kontrak dosen tamu
    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    // mutator untuk mengubah nilai NIDK dosen tamu
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    // mutator untuk mengubah tanggal akhir kontrak dosen tamu
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // method untuk menghitung tunjangan dosen tamu
    // rumus = 2.5% × gajiPokok
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    // method untuk menampilkan informasi lengkap dosen tamu
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Akhir Kontrak   : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 2.5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(getTunjangan()));
    }
}