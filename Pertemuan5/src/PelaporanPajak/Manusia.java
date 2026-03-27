/* Nama File    : Manusia.java 
 * Deskripsi    : Berisi atribut dan method dalam class abstract Manusia
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Jumat, 27 Maret 2026 */

package PelaporanPajak;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {

    /************ ATRIBUT ************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;

    // counter jumlah objek Manusia
    private static int counterMns = 0;

    /************ METHOD *************/

    // konstruktor untuk membuat objek Manusia
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // selektor untuk mengembalikan nilai nama 
    public String getNama() {
        return nama;
    }

    // selektor untuk mengembalikan nilai tglMulaiKerja
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    // selektor untuk mengembalikan nilai alamat
    public String getAlamat() {
        return alamat;
    }

    // selektor untuk mengembalikan nilai pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // selektor untuk mengambil jumlah objek Manusia yang telah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    // mutator untuk mengubah nilai alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // mutator untuk mengubah nilai pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // abstract method untuk menghitung masa kerja
    public abstract int hitungMasaKerja();

    // method untuk mengubah format input tanggal menjadi dd-mm-yyyy
    public static LocalDate parseTanggal(String tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tanggal, formatter);
    }

    // method untuk mengubah format output tanggal menjadi dd-mm-yyyy
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return tanggal.format(formatter);
    }

    // method untuk mengubah angka menjadi format Rupiah
    public String formatRupiah(double nominal) {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return rupiah.format(nominal);
    }

    // method untuk menampilkan informasi dasar manusia
    public void cetakInfo() {
        System.out.println("Nama                   : " + nama);
        System.out.println("Tanggal Mulai Kerja    : " + formatTanggal(tglMulaiKerja));
        System.out.println("Alamat                 : " + alamat);
        System.out.println("Pendapatan             : " + formatRupiah(pendapatan));
    }

}