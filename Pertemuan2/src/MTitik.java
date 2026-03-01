/* Nama File    : MTitik.java 
 * Deskripsi    : main driver untuk menguji class Titik
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Februari 2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        System.out.print("Titik T1 (awal): ");
        T1.printTitik();
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 2
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        System.out.print("T1 setelah setAbsis(3) & setOrdinat(4): ");
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        System.out.print("T1 setelah digeser(3, 4): ");
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        System.out.print("Titik T2 (T2 = T1): ");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.print("Titik T1 setelah setAbsis(10) & setOrdinat(10): ");
        T1.printTitik();
        System.out.print("Titik T2: ");
        T2.printTitik();

        // Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        // Titik T2 = new Titik(3,5); //membuat objek titik T2 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        
        Titik T3 = new Titik(5, 6);
        System.out.print("Titik T3 (awal): ");
        T3.printTitik();
        System.out.println("Titik T3 ada di kuadran: " + T3.getKuadran());
        System.out.println("Jarak T3 dengan pusat (0,0): " + T3.getJarakPusat());
        System.out.println("Jarak T1 dengan T3: " + T1.getJarak(T3));
        
        T3.refleksiX();
        System.out.println("T3 setelah refleksiX: ");
        T3.printTitik();

        T3.refleksiY();
        System.out.println("T3 setelah refleksiY: ");
        T3.printTitik();

        Titik T4 = T3.getRefleksiX();
        System.out.println("Hasil getRefleksiX (T4): ");
        T4.printTitik();

        Titik T5 = T4.getRefleksiY();
        System.out.println("Hasil getRefleksiY (T5): ");
        T5.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    } 
}