/* Nama File    : MTeman.java 
 * Deskripsi    : Berisi main driver untuk menguji kelas Teman.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 7 Mei 2026 */

public class MTeman {
    public static void main(String[] args) {

        // Membuat objek Teman
        Teman T = new Teman();

        // Uji addNama
        T.addNama("Tinker Bell");
        T.addNama("Silvermist");
        T.addNama("Rosetta");
        T.addNama("Fawn");
        T.addNama("Iridessa");

        // Uji showTeman
        System.out.println("===== Daftar Teman =====");
        T.showTeman();
        System.out.println();

        // Uji getNbelm
        System.out.println("Jumlah teman : " + T.getNbelm());
        System.out.println();

        // Uji getNama
        System.out.println("Nama pada indeks 1 : " + T.getNama(1));
        System.out.println();

        // Uji setNama
        System.out.println("===== Set Nama =====");
        T.setNama(1, "Periwinkle");
        T.showTeman();
        System.out.println();

        // Uji isMember
        System.out.println("===== Cek Member =====");
        System.out.println("Apakah Rosetta anggota list? : " + T.isMember("Rosetta"));
        System.out.println("Apakah Vidia anggota? list?  : " + T.isMember("Vidia"));
        System.out.println();

        // Uji countNama
        System.out.println("===== Count Nama =====");
        System.out.println("Jumlah Silvermist : " + T.countNama("Silvermist"));
        System.out.println();

        // Uji gantiNama
        System.out.println("===== Ganti Nama =====");
        T.gantiNama("Tinker Bell", "Miss Bell");
        T.showTeman();
        System.out.println();

        // Uji delNama
        System.out.println("===== Hapus Nama =====");
        T.delNama("Fawn");
        T.showTeman();
        System.out.println();

        // Uji delNama yang tidak ada
        System.out.println("===== Hapus Nama Tidak Ada =====");
        T.delNama("Vidia");
        System.out.println();

        // Uji jumlah akhir
        System.out.println("\nJumlah teman akhir : " + T.getNbelm());
        System.out.println();
    }
}