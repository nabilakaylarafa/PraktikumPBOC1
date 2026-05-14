/* Nama File    : MPiaraan.java 
 * Deskripsi    : Berisi main driver untuk menguji kelas Piaraan.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 7 Mei 2026 */

public class MPiaraan {
    public static void main(String[] args) {

        // Membuat objek Piaraan
        Piaraan P = new Piaraan();

        // Membuat objek Anabul
        Anabul A1 = new Anjing("Rocky");
        Anabul A2 = new Kucing("Oreo", 4.5);
        Anabul A3 = new Burung("Pico");
        Anabul A4 = new Anggora("Casper", 3.2);
        Anabul A5 = new KembangTelon("Calico", 2.8);

        // Uji enqueueAnabul
        P.enqueueAnabul(A1);
        P.enqueueAnabul(A2);
        P.enqueueAnabul(A3);
        P.enqueueAnabul(A4);
        P.enqueueAnabul(A5);

        // Uji showAnabul
        System.out.println("===== Daftar Anabul =====");
        P.showAnabul();
        System.out.println();

        // Uji getNbelm
        System.out.println("Jumlah anabul : " + P.getNbelm());
        System.out.println();

        // Uji isMember
        System.out.println("A2 member antrean : " + P.isMember(A2));
        System.out.println();

        // Uji getAnabul
        System.out.println("Anabul pertama : " + P.getAnabul().getNama());
        System.out.println();

        // Uji showJenisAnabul
        System.out.println("===== Jenis Anabul =====");
        P.showJenisAnabul();
        System.out.println();

        // Uji countKucing
        System.out.println("Jumlah keluarga kucing : " + P.countKucing());

        // Uji bobotKucing
        System.out.println("Total bobot kucing : " + P.bobotKucing() + " kg");
        System.out.println();

        // Uji dequeueAnabul
        System.out.println("===== Dequeue =====");
        P.dequeueAnabul();
        System.out.println();

        // Uji showAnabul setelah dequeue
        System.out.println("===== Antrean Sekarang =====");
        P.showAnabul();
        System.out.println();
    }
}