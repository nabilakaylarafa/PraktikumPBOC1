/* Nama File    : MAnabul.java 
 * Deskripsi    : Berisi main driver untuk menguji implementasi polimorfisme universal
                  inclusion pada class Anabul beserta class turunannya.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package hewanpeliharaan;

public class MAnabul {
    public static void main(String[] args) {
        
        // Membuat objek tipe Anabul
        Anabul A1 = new Anjing("Golden Retriever");
        Anabul A2 = new Kucing("Ragdoll");
        Anabul A3 = new Burung("Lovebird");

        // Uji objek A1
        System.out.println("===== Anabul A1 =====");
        System.out.println(A1.getNama());
        A1.gerak();
        A1.suara();
        System.out.println();

        // Uji objek A2
        System.out.println("===== Anabul A2 =====");
        System.out.println(A2.getNama());
        A2.gerak();
        A2.suara();
        System.out.println();

        // Uji objek A3
        System.out.println("===== Anabul A3 =====");
        System.out.println(A3.getNama());
        A3.gerak();
        A3.suara();
        System.out.println();

    }
}
