/* Nama File    : Pengusaha.java 
 * Deskripsi    : Berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Jumat, 27 Maret 2026 */

package PelaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {

    /************ ATRIBUT ************/
    protected String npwp;

    // counter jumlah objek Pengusaha
    private static int counterPengusaha = 0;

    /************ METHOD *************/

    // konstruktor untuk membuat objek Pengusaha
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // selektor untuk mengembalikan nilai npwp Pengusaha
    public String getNpwp() {
        return npwp;
    }

    // selektor untuk mengambil jumlah objek Pengusaha yang telah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // mutator untuk mengubah nilai npwp Pengusaha
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // method abstract untuk menghitung masa kerja Pengusaha
    // rumus = (now - tglMulaiKerja) + B
    // B adalah digit nim ke-13 dari 24060124120022 yaitu 0
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    // method interface untuk menghitung pajak Pengusaha
    // rumus = 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    // method untuk menampilkan informasi lengkap Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                   : " + npwp);
        System.out.println("Masa Kerja             : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak                  : " + formatRupiah(hitungPajak()));
    }

}