/* Nama File    : MMahasiswa.java 
 * Deskripsi    : Berisi main driver untuk menguji polimorfisme ad-hoc overloading pada class Mahasiswa
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        
        // 2c) Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("===== Mahasiswa m1 (tanpa parameter) =====");
        m1.cetak();
        System.out.println();

        // 2d) Konstruktor dengan parameter 
        Mahasiswa m2 = new Mahasiswa("24060124120022", "Nabila", "Informatika");
        System.out.println("===== Mahasiswa m2 (dengan parameter) =====");
        m2.cetak();
        System.out.println();

        // 2e) Konstruktor cloning 
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("===== Mahasiswa m3 (cloning m2) =====");
        m3.cetak();
        System.out.println();

        // Overloading setProgramStudi

        // Varian 1
        m1.setProgramStudi();
        System.out.println("===== m1 setelah setProgramStudi() =====");
        m1.cetak();
        System.out.println();

        // Varian 2
        m2.setProgramStudi("Sistem Informasi");
        System.out.println("===== m2 setelah setProgramStudi(String) =====");
        m2.cetak();
        System.out.println();

        // Varian 3
        m3.setProgramStudi(m2);
        System.out.println("===== m3 setelah setProgramStudi(Mahasiswa) =====");
        m3.cetak();
        System.out.println();
    }
}
