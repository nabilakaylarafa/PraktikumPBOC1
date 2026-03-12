/* Nama File    : MBangunDatar.java 
 * Deskripsi    : Main driver untuk menguji class BangunDatar, Persegi dan Lingkaran
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Minggu, 12 Maret 2026 */

public class MBangunDatar {
    public static void main(String[] args) {

        System.out.println("\n");

        System.out.println("\n***** PENGUJIAN CLASS PERSEGI *****");
        
        //uji konstruktor tanpa parameter P1
        Persegi P1 = new Persegi();
        System.out.println("Data Persegi P1");
        P1.printInfo();
        
        //uji mutator pada P1
        P1.setSisi(5.0);
        P1.setWarna("Biru");
        P1.setBorder("Hitam");
        
        //uji selektor pada P1
        System.out.println("Warna persegi P1    : " + P1.getWarna());
        System.out.println("Sisi persegi P1     : " + P1.getSisi());
        System.out.println("Border persegi P1   : " + P1.getBorder());
        System.out.println("Luas persegi P1     : " + P1.getLuas());
        System.out.println("Keliling persegi P1 : " + P1.getKeliling());
        System.out.println("Diagonal persegi P1 : " + P1.getDiagonal());

        //uji konstruktor dengan parameter P2
        Persegi P2 = new Persegi(8.0, "Pink", "Kuning");
        System.out.println("\nData Persegi P2");
        P2.printInfo();


        System.out.println("\n***** PENGUJIAN CLASS LINGKARAN *****");
        
        //uji konstruktor tanpa parameter L1
        Lingkaran L1 = new Lingkaran();
        System.out.println("Data Lingkaran L1");
        L1.printInfo();
        
        //uji mutator pada L1
        L1.setJari(7.0);
        L1.setWarna("Merah");
        L1.setBorder("Hijau");
        
        //uji selektor pada L1
        System.out.println("Jari-jari Lingkaran L1  : " + L1.getJari());
        System.out.println("Warna Lingkaran L1      : " + L1.getWarna());
        System.out.println("Border Lingkaran L1     : " + L1.getBorder());
        System.out.println("Luas Lingkaran L1       : " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1   : " + L1.getKeliling());

        //uji konstruktor dengan parameter L2
        Lingkaran L2 = new Lingkaran(14.0, "Ungu", "Putih");
        System.out.println("\nData Lingkaran L2");
        L2.printInfo();


        System.out.println("\n***** PENGUJIAN METHOD STATIK *****");
        //memanggil counter untuk melihat total objek yang sudah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}
