/* Nama File    : Pegawai.java 
 * Deskripsi    : Berisi atribut dan method dalam class Pegawai
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {

    /************ ATRIBUT ************/
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /************ METHOD *************/

    // konstruktor tanpa parameter untuk inisialisasi objek pegawai
    public Pegawai() {
    }

    // konstruktor dengan parameter untuk inisialisasi objek pegawai
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // selektor untuk mengambil nilai NIP pegawai
    public String getNip() {
        return nip;
    }

    // selektor untuk mengambil nilai nama pegawai
    public String getNama() {
        return nama;
    }

    // selektor untuk mengambil nilai tanggal lahir pegawai
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    // selektor untuk mengambil nilai TMT (Terhitung Mulai Tanggal)
    public LocalDate getTmt() {
        return tmt;
    }

    // selektor untuk mengambil nilai gaji pokok pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }

    // mutator untuk mengubah nilai NIP pegawai
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mutator untuk mengubah nilai nama pegawai
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mutator untuk mengubah nilai tanggal lahir pegawai
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    // mutator untuk mengubah nilai TMT (tanggal mulai kerja)
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    // mutator untuk mengubah nilai gaji pokok pegawai
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // methond untuk menghitung masa kerja pegawai dari TMT sampai tanggal saat ini
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // method untuk memformat tanggal ke bentuk <tanggal> <bulan> <tahun>
    public String formatTanggal(LocalDate date) {
        DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatTgl);
    }

    // method untuk memformat nilai uang menjadi rupiah 
    public String formatRupiah(double nominal) {
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRp.format(nominal).replace("Rp", "Rp ");
    }

    // method untuk memformat masa kerja pegawai ke bentuk X tahun Y bulan
    public String formatMasaKerja() {
        Period mk = getMasaKerja();
        return mk.getYears() + " tahun " + mk.getMonths() + " bulan";
    }

    // method untuk menampilkan informasi dasar pegawai
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    }
}