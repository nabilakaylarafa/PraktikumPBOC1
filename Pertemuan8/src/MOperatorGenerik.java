/* Nama File    : MOperatorGenerik.java 
 * Deskripsi    : Berisi main driver untuk menguji prosedur generik Tukar dan fungsi Bobot2 pada kelas OperatorGenerik
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class MOperatorGenerik {
    public static void main(String[] args) {

        // Tukar sesama Integer
        System.out.println("===== Tukar Integer =====");
        Integer[] arrInteger = {3, 6};
        System.out.println("Sebelum : a = " + arrInteger[0] + ", b = " + arrInteger[1]);
        OperatorGenerik.Tukar(arrInteger);
        System.out.println("Setelah : a = " + arrInteger[0] + ", b = " + arrInteger[1]);
        System.out.println();

        // Tukar sesama String 
        System.out.println("===== Tukar String =====");
        String[] arrString = {"Kucing", "Anjing"};
        System.out.println("Sebelum : a = " + arrString[0] + ", b = " + arrString[1]);
        OperatorGenerik.Tukar(arrString);
        System.out.println("Setelah : a = " + arrString[0] + ", b = " + arrString[1]);
        System.out.println();

        // Tukar sesama keluarga Anabul Anjing 
        System.out.println("===== Tukar Anjing =====");
        Anjing anjing1 = new Anjing("Chihuahua");
        Anjing anjing2 = new Anjing("Beagle");
        Anjing[] arrAnjing = {anjing1, anjing2};
        System.out.println("Sebelum:");
        System.out.println(" a = " + arrAnjing[0].getNama());
        System.out.println(" b = " + arrAnjing[1].getNama());
        OperatorGenerik.Tukar(arrAnjing);
        System.out.println("Setelah:");
        System.out.println(" a = " + arrAnjing[0].getNama());
        System.out.println(" b = " + arrAnjing[1].getNama());
        System.out.println();

        // Tukar sesama keluarga Anabul Kucing 
        System.out.println("===== Tukar Kucing =====");
        Kucing kucing1 = new Kucing("Sphynx", 3.5);
        Kucing kucing2 = new Kucing("Scottish Fold", 4.0);
        Kucing[] arrKucing = {kucing1, kucing2};
        System.out.println("Sebelum:");
        System.out.println(" a = " + arrKucing[0].getNama() + ", Bobot = " + arrKucing[0].getBobot() + " kg");
        System.out.println(" b = " + arrKucing[1].getNama() + ", Bobot = " + arrKucing[1].getBobot() + " kg");
        OperatorGenerik.Tukar(arrKucing);
        System.out.println("Setelah:");
        System.out.println(" a = " + arrKucing[0].getNama() + ", Bobot = " + arrKucing[0].getBobot() + " kg");
        System.out.println(" b = " + arrKucing[1].getNama() + ", Bobot = " + arrKucing[1].getBobot() + " kg");
        System.out.println();

        // Tukar sesama keluarga Anabul Burung
        System.out.println("===== Tukar Burung =====");
        Burung burung1 = new Burung("Elang");
        Burung burung2 = new Burung("Gagak");
        Burung[] arrBurung = {burung1, burung2};
        System.out.println("Sebelum:");
        System.out.println(" a = " + arrBurung[0].getNama());
        System.out.println(" b = " + arrBurung[1].getNama());
        OperatorGenerik.Tukar(arrBurung);
        System.out.println("Setelah:");
        System.out.println(" a = " + arrBurung[0].getNama());
        System.out.println(" b = " + arrBurung[1].getNama());
        System.out.println();

        // Fungsi Bobot2 
        System.out.println("===== Fungsi Bobot2 =====");

        // Jumlah bobot 2 Kucing 
        Kucing kc1 = new Kucing("Kucing Maine Coon", 12.5);
        Kucing kc2 = new Kucing("Kucing Munchkin", 3.2);
        double total1 = OperatorGenerik.Bobot2(kc1, kc2);
        System.out.println("Kucing 1        : " + kc1.getNama() + ", Bobot = " + kc1.getBobot() + " kg");
        System.out.println("Kucing 2        : " + kc2.getNama() + ", Bobot = " + kc2.getBobot() + " kg");
        System.out.println("Total Bobot     : " + total1 + " kg");
        System.out.println();

        // Jumlah bobot 2 Kucing Anggora
        Anggora ag1 = new Anggora("Anggora Putih", 3.0);
        Anggora ag2 = new Anggora("Anggora Abu", 3.8);
        double total2 = OperatorGenerik.Bobot2(ag1, ag2);
        System.out.println("Anggora 1       : " + ag1.getNama() + ", Bobot = " + ag1.getBobot() + " kg");
        System.out.println("Anggora 2       : " + ag2.getNama() + ", Bobot = " + ag2.getBobot() + " kg");
        System.out.println("Total Bobot     : " + total2 + " kg");
        System.out.println();

        // Jumlah bobot 2 Kucing Kembang Telon
        KembangTelon kt1 = new KembangTelon("Belang Tiga", 2.8);
        KembangTelon kt2 = new KembangTelon("Calico", 3.2);
        double total3 = OperatorGenerik.Bobot2(kt1, kt2);
        System.out.println("Kembang Telon 1 : " + kt1.getNama() + ", Bobot = " + kt1.getBobot() + " kg");
        System.out.println("Kembang Telon 2 : " + kt2.getNama() + ", Bobot = " + kt2.getBobot() + " kg");
        System.out.println("Total Bobot     : " + total3 + " kg");
        System.out.println();

        // Jumlah bobot 2 Kucing Mix 
        Anggora ag3 = new Anggora("Anggora Hitam", 3.7);
        KembangTelon kt3 = new KembangTelon("Calico Kecil", 3.0);
        double total4 = OperatorGenerik.Bobot2(ag3, kt3);
        System.out.println("Anggora 1       : " + ag3.getNama() + ", Bobot = " + ag3.getBobot() + " kg");
        System.out.println("Kembang Telon 2 : " + kt3.getNama() + ", Bobot = " + kt3.getBobot() + " kg");
        System.out.println("Total Bobot     : " + total4 + " kg");
        System.out.println();
    }
}