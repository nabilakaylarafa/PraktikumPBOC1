/* Nama File    : MData.java 
 * Deskripsi    : Berisi main driver untuk menguji kelas generik Data
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class MData {
    public static void main(String[] args) {

        // Membuat objek Data dengan Integer
        System.out.println("===== Data Integer =====");
        Data<Integer> dataInt = new Data<>();
        System.out.println("Kapasitas   : " + dataInt.getKapasitas() + " elemen");
        System.out.println("Ukuran awal : " + dataInt.getSize() + " elemen");

        // Uji setIsi
        dataInt.setIsi(1, 5);
        dataInt.setIsi(2, 10);
        dataInt.setIsi(3, 15);
        dataInt.setIsi(5, 25);

        // Uji getIsi
        System.out.println("Setelah setIsi beberapa nilai");
        System.out.println("Ukuran      : " + dataInt.getSize() + " elemen");
        System.out.println("Nilai posisi 1 : " + dataInt.getIsi(1));
        System.out.println("Nilai posisi 2 : " + dataInt.getIsi(2));
        System.out.println("Nilai posisi 3 : " + dataInt.getIsi(3));
        System.out.println("Nilai posisi 4 : " + dataInt.getIsi(4));
        System.out.println("Nilai posisi 5 : " + dataInt.getIsi(5));
        System.out.println();

        // Uji getSize
        System.out.println("Jumlah elemen dalam Data Integer : " + dataInt.getSize());
        System.out.println();

        // Membuat objek Data dengan String
        System.out.println("===== Data String =====");
        Data<String> dataStr = new Data<>();
        System.out.println("Kapasitas   : " + dataStr.getKapasitas() + " elemen");
        System.out.println("Ukuran awal : " + dataStr.getSize() + " elemen");

        // Uji setIsi
        dataStr.setIsi(1, "Kucing");
        dataStr.setIsi(2, "Anjing");
        dataStr.setIsi(3, "Burung");

        // Uji getIsi
        System.out.println("Setelah setIsi beberapa nilai");
        System.out.println("Ukuran      : " + dataStr.getSize() + " elemen");
        System.out.println("Nilai posisi 1 : " + dataStr.getIsi(1));
        System.out.println("Nilai posisi 2 : " + dataStr.getIsi(2));
        System.out.println("Nilai posisi 3 : " + dataStr.getIsi(3));
        System.out.println();

        // Uji getSize
        System.out.println("Jumlah elemen dalam Data String : " + dataStr.getSize());
        System.out.println();

        // Membuat objek Data dengan Anabul
        System.out.println("===== Data Anabul =====");
        Data<Anabul> dataAnb = new Data<>();
        System.out.println("Kapasitas   : " + dataAnb.getKapasitas() + " elemen");
        System.out.println("Ukuran awal : " + dataAnb.getSize() + " elemen");
        System.out.println();

        // Membuat objek Anabul
        Anabul A1 = new Anjing("Golden Retriever");
        Anabul A2 = new Kucing("Ragdoll", 4.5);
        Anabul A3 = new Burung("Lovebird");

        // Uji setIsi 
        dataAnb.setIsi(1, A1);
        dataAnb.setIsi(2, A2);
        dataAnb.setIsi(3, A3);

        // Uji getIsi 
        System.out.println("Nilai posisi 1:");
        System.out.println(dataAnb.getIsi(1).getNama());
        dataAnb.getIsi(1).gerak();
        dataAnb.getIsi(1).suara();
        System.out.println();

        System.out.println("Nilai posisi 2:");
        System.out.println(dataAnb.getIsi(2).getNama());
        dataAnb.getIsi(2).gerak();
        dataAnb.getIsi(2).suara();
        System.out.println();

        System.out.println("Nilai posisi 3:");
        System.out.println(dataAnb.getIsi(3).getNama());
        dataAnb.getIsi(3).gerak();
        dataAnb.getIsi(3).suara();
        System.out.println();

        // Uji getSize
        System.out.println("Jumlah elemen dalam Data Anabul : " + dataAnb.getSize());
        System.out.println();
    }
}
