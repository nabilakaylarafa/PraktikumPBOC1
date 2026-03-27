/* Nama File    : MBangunDatar.java 
 * Deskripsi    : Main driver untuk menguji class BangunDatar, Persegi, Lingkaran, dan interface IResize
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Maret 2026 */

public class MBangunDatar {
    public static void main(String[] args) {

        System.out.println("\n");

        System.out.println("\n***** PENGUJIAN CLASS PERSEGI *****");
        
        // uji konstruktor tanpa parameter P1
        Persegi P1 = new Persegi();
        System.out.println("Data Persegi P1");
        P1.printInfo();
        
        // uji mutator pada P1
        P1.setSisi(5.0);
        P1.setWarna("Biru");
        P1.setBorder("Hitam");
        
        // uji selektor pada P1
        System.out.println("Warna persegi P1    : " + P1.getWarna());
        System.out.println("Sisi persegi P1     : " + P1.getSisi());
        System.out.println("Border persegi P1   : " + P1.getBorder());
        System.out.println("Luas persegi P1     : " + P1.getLuas());
        System.out.println("Keliling persegi P1 : " + P1.getKeliling());
        System.out.println("Diagonal persegi P1 : " + P1.getDiagonal());

        // uji konstruktor dengan parameter P2
        Persegi P2 = new Persegi(8.0, "Pink", "Kuning");
        System.out.println("\nData Persegi P2");
        P2.printInfo();


        System.out.println("\n***** PENGUJIAN CLASS LINGKARAN *****");
        
        // uji konstruktor tanpa parameter L1
        Lingkaran L1 = new Lingkaran();
        System.out.println("Data Lingkaran L1");
        L1.printInfo();
        
        // uji mutator pada L1
        L1.setJari(7.0);
        L1.setWarna("Merah");
        L1.setBorder("Hijau");
        
        // uji selektor pada L1
        System.out.println("Jari-jari Lingkaran L1  : " + L1.getJari());
        System.out.println("Warna Lingkaran L1      : " + L1.getWarna());
        System.out.println("Border Lingkaran L1     : " + L1.getBorder());
        System.out.println("Luas Lingkaran L1       : " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1   : " + L1.getKeliling());

        // uji konstruktor dengan parameter L2
        Lingkaran L2 = new Lingkaran(14.0, "Ungu", "Putih");
        System.out.println("\nData Lingkaran L2");
        L2.printInfo();


        System.out.println("\n***** PENGUJIAN REFERENCE TYPE BANGUNDATAR *****");

        // uji objek persegi dan lingkaran direferensikan sebagai BangunDatar
        BangunDatar B1 = new Persegi(10, "Merah", "Hitam");
        BangunDatar B2 = new Lingkaran(7, "Biru", "Putih");
        System.out.println("Luas B1     : " + B1.getLuas());
        System.out.println("Keliling B1 : " + B1.getKeliling());
        System.out.println("Luas B2     : " + B2.getLuas());
        System.out.println("Keliling B2 : " + B2.getKeliling());


        System.out.println("\n***** PENGUJIAN METHOD PEMBANDING *****");

        // membandingkan luas persegi P2 dan lingkaran L1 (beda jenis)
        System.out.println("\nMembandingkan Persegi P2 dan Lingkaran L1");
        System.out.println("Luas P2 = " + P2.getLuas()); 
        System.out.println("Luas L1 = " + L1.getLuas());
        System.out.println("Apakah luas sama? " + P2.isEqualLuas(L1));

        // membandingkan keliling persegi P2 dan lingkaran L1 (beda jenis)
        System.out.println("\nMembandingkan Keliling Persegi P2 dan Lingkaran L1");
        System.out.println("Keliling P2 = " + P2.getKeliling());
        System.out.println("Keliling L1 = " + L1.getKeliling());
        System.out.println("Apakah keliling sama? " + P2.isEqualKeliling(L1));

        // membandingkan luas persegi P2 dan persegi P3
        Persegi P3 = new Persegi(8.0, "Hijau", "Hitam");
        System.out.println("\nMembandingkan Luas Persegi P2 dan Persegi P3");
        System.out.println("Luas P2 = " + P2.getLuas());
        System.out.println("Luas P3 = " + P3.getLuas());
        System.out.println("Apakah luas sama? " + P2.isEqualLuas(P3));

        // membandingkan keliling persegi P2 dan persegi P3
        System.out.println("\nMembandingkan Keliling Persegi P2 dan Persegi P3");
        System.out.println("Keliling P2 = " + P2.getKeliling());
        System.out.println("Keliling P3 = " + P3.getKeliling());
        System.out.println("Apakah keliling sama? " + P2.isEqualKeliling(P3));


        System.out.println("\n***** PENGUJIAN INTERFACE *****");

        // uji interface IResize pada persegi P1
        System.out.println("Sisi P1 sebelum zoom: " + P1.getSisi());
        P1.zoomIn();
        System.out.println("Setelah zoomIn    : " + P1.getSisi());
        P1.zoomOut();
        System.out.println("Setelah zoomOut   : " + P1.getSisi());
        P1.zoom(200);
        System.out.println("Setelah zoom 200% : " + P1.getSisi());

        // uji interface IResize pada lingkaran L1
        System.out.println("\nJari L1 sebelum zoom: " + L1.getJari());
        L1.zoomIn();
        System.out.println("Setelah zoomIn    : " + L1.getJari());
        L1.zoomOut();
        System.out.println("Setelah zoomOut   : " + L1.getJari());
        L1.zoom(50);
        System.out.println("Setelah zoom 50%  : " + L1.getJari());


        System.out.println("\n***** PENGUJIAN METHOD STATIK *****");
        //memanggil counter untuk melihat total objek yang sudah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}