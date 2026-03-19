/* Nama File    : MPegawai.java 
 * Deskripsi    : Main driver untuk menguji class Pegawai, Dosen (Tetap & Tamu), dan Tendik
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Rabu, 18 Maret 2026 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {

        System.out.println("\n");

        // pengujian pegawai
        System.out.println("********** UJI PEGAWAI **********");

        Pegawai P1 = new Pegawai("1221344567", "Doni", LocalDate.of(1997, 8, 27), LocalDate.of(2020, 1, 1), 3000000);
        System.out.println("\n------ Data Pegawai P1 ------");
        System.out.println("NIP             : " + P1.getNip());
        System.out.println("Nama            : " + P1.getNama());
        System.out.println("Tanggal Lahir   : " + P1.formatTanggal(P1.getTanggalLahir()));
        System.out.println("TMT             : " + P1.formatTanggal(P1.getTmt()));
        System.out.println("Masa Kerja      : " + P1.formatMasaKerja());
        System.out.println("Gaji Pokok      : " + P1.formatRupiah(P1.getGajiPokok()));

        System.out.println("\n------ Data Pegawai P2 ------");
        Pegawai P2 = new Pegawai();
        P2.setNip("0987654321");
        P2.setNama("Ella");
        P2.setTanggalLahir(LocalDate.of(1998, 4, 10));
        P2.setTmt(LocalDate.of(2022, 1, 1));
        P2.setGajiPokok(4000000);
        P2.printInfo();

        System.out.println("\n");

        // pengujian dosen tetap
        System.out.println("********** UJI DOSEN TETAP **********");
        DosenTetap DTP = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");
        DTP.printInfo();

        System.out.println("\n");

        // pengujian dosen tamu
        System.out.println("********** UJI DOSEN TAMU **********");
        DosenTamu DTM = new DosenTamu("1234567890", "99887766", "Budi", LocalDate.of(1985, 3, 10), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Teknik", LocalDate.of(2027, 12, 31));
        DTM.printInfo();

        System.out.println("\n");

        // pengujian tendik
        System.out.println("********** UJI TENDIK **********");
        Tendik T = new Tendik("6578904312", "Citra", LocalDate.of(1992, 7, 15), LocalDate.of(2018, 6, 1), 3500000, "Akademik");
        T.printInfo();
    }
}