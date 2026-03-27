/* Nama File    : Petani.java 
 * Deskripsi    : Berisi atribut dan method dalam class Petani
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Jumat, 27 Maret 2026 */

package PelaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    
    /************ ATRIBUT ************/
    protected String asalKota;

    // counter jumlah objek Petani
    private static int counterPetani = 0;

    /************ METHOD *************/

    // konstruktor untuk membuat objek Petani
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // selektor untuk mengembalikan nilai asal kota Petani
    public String getAsalKota() {
        return asalKota;
    }

    // selektor untuk mengambil jumlah objek Petani yang telah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    // mutator untuk mengubah nilai asal kota Petani
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    // method abstract untuk menghitung masa kerja Petani
    // rumus = (now - tglMulaiKerja) + C
    // C adalah digit nim ke-12 dari 24060124120022 yaitu 0
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    // method interface untuk menghitung pajak Petani
    // rumus = 0
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    // method untuk menampilkan informasi lengkap Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota              : " + asalKota);
        System.out.println("Masa Kerja             : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak                  : " + formatRupiah(hitungPajak()));
    }

}