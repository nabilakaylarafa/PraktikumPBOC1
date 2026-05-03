/* Nama File    : MDatum.java 
 * Deskripsi    : Berisi main driver untuk menguji implementasi class generik
                  Datum dengan objek Anabul.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class MDatum {
    public static void main(String[] args) {
        
        // Membuat objek tipe Anabul
        Anabul A1 = new Anjing("Golden Retriever");
        Anabul A2 = new Kucing("Ragdoll", 4.5);
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
        if (A2 instanceof Kucing) {
            Kucing K = (Kucing) A2;
            System.out.println("Bobot awal : " + K.getBobot());
            K.setBobot(5.0);
            System.out.println("Bobot setelah diubah : " + K.getBobot());
        }
        System.out.println();

        // Uji objek A3
        System.out.println("===== Anabul A3 =====");
        System.out.println(A3.getNama());
        A3.gerak();
        A3.suara();
        System.out.println();

        // Membuat objek generik Datum
        Datum<Anabul> D1 = new Datum<>();
        Datum<Anabul> D2 = new Datum<>();
        Datum<Anabul> D3 = new Datum<>();

        // Uji objek generik Datum
        System.out.println("===== Datum D1 =====");
        D1.setIsi(A1);
        System.out.println(D1.getIsi().getNama());
        D1.getIsi().gerak();
        D1.getIsi().suara();
        System.out.println();

        System.out.println("===== Datum D2 =====");
        D2.setIsi(A2);
        System.out.println(D2.getIsi().getNama());
        D2.getIsi().gerak();
        D2.getIsi().suara();
        System.out.println();

        System.out.println("===== Datum D3 =====");
        D3.setIsi(A3); 
        System.out.println(D3.getIsi().getNama());
        D3.getIsi().gerak();
        D3.getIsi().suara();
        System.out.println();

    }
}
