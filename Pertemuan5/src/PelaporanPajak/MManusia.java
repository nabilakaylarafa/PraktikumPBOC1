/* Nama File    : MManusia.java 
 * Deskripsi    : Main driver untuk menguji class Manusia, PNS, Pengusaha, dan Petani, serta Interface Pajak
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Jumat, 27 Maret 2026 */

package PelaporanPajak;

public class MManusia {
    public static void main(String[] args) {

        System.out.println("\n");

        // membuat objek PNS
        PNS p1 = new PNS("Satriyo", Manusia.parseTanggal("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");

        // membuat objek Pengusaha
        Pengusaha pe1 = new Pengusaha("Adhy", Manusia.parseTanggal("01-01-2000"), "Jl. Air", 55000000, "000-556-773-212-000-5");

        // membuat objek Petani
        Petani pt1 = new Petani("Nugraha", Manusia.parseTanggal("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");

        // membuat objek PNS tanpa alamat
        PNS p2 = new PNS("Panji", Manusia.parseTanggal("01-04-2010"), "", 10000000, "198004212010041002");

        // uji mutator alamat
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("\n********** COUNTER OBJEK **********");

        System.out.println("Jumlah Manusia      : " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS          : " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha    : " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani       : " + Petani.getCounterPetani());

        System.out.println("\n********** PAJAK **********");

        System.out.println("Pajak PNS p1        : " + p1.formatRupiah(p1.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 : " + pe1.formatRupiah(pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1    : " + pt1.formatRupiah(pt1.hitungPajak()));

        System.out.println("\n********** MASA KERJA **********");

        System.out.println("Masa Kerja p1       : " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1      : " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1      : " + pt1.hitungMasaKerja() + " tahun");

        System.out.println("\n********** DATA PNS **********");
        p1.cetakInfo();

        System.out.println("\n********** DATA PENGUSAHA **********");
        pe1.cetakInfo();

        System.out.println("\n********** DATA PETANI **********");
        pt1.cetakInfo();
    }
    
}