/* Nama File    : PNS.java 
 * Deskripsi    : Berisi atribut dan method dalam class PNS
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Jumat, 27 Maret 2026 */

package PelaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    
    /************ ATRIBUT ************/
    protected String nip;

    // counter jumlah objek PNS
    private static int counterPNS = 0;

    /************ METHOD *************/

    // konstruktor untuk membuat objek PNS
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // selektor untuk mengembalikan nilai nip PNS
    public String getNip() {
        return nip;
    }

    // selektor untuk mengambil jumlah objek PNS yang telah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    // mutator untuk mengubah nilai nip PNS
    public void setNip(String nip) {
        this.nip = nip;
    }

    // method abstract untuk menghitung masa kerja PNS
    // rumus = (now - tglMulaiKerja) + A
    // A adalah digit nim ke-14 dari 24060124120022 yaitu 2
    @Override
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears() + 2;
    }

    // method interface untuk menghitung pajak PNS
    // rumus = 10% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // method untuk menampilkan informasi lengkap PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                    : " + nip);
        System.out.println("Masa Kerja             : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak                  : " + formatRupiah(hitungPajak()));
    }

}