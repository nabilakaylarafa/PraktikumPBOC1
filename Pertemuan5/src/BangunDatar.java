/* Nama File    : BangunDatar.java 
 * Deskripsi    : Berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Maret 2026 */

public abstract class BangunDatar {

    /************ ATRIBUT ************/
    protected int jmlSisi;
    protected String warna;
    protected String border;

    // atribut statik untuk menghitung jumlah objek yang dibuat
    private static int counterBangunDatar = 0;
    
    /************ METHOD *************/
    
    // konstruktor untuk membuat objek bangun datar dengan nilai default (tanpa parameter)
    public BangunDatar() {
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar++;
    }
    
    // konstruktor untuk membuat objek bangun datar dengan nilai tertentu (dengan parameter)
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // selektor untuk mengembalikan nilai jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }
    
    // selektor untuk mengembalikan nilai warna
    public String getWarna() {
        return warna;
    }

    // selektor untuk mengembalikan nilai border
    public String getBorder() {
        return border;
    }

    // mutator untuk mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    // mutator untuk mengubah nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    // mutator untuk mengubah nilai border
    public void setBorder(String border) {
        this.border = border;
    }
    
    // abstract method untuk menghitung luas bangun datar
    public abstract double getLuas();

    // abstract method untuk menghitung keliling bangun datar
    public abstract double getKeliling();

    // method untuk membandingkan luas dua bangun datar
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // method untuk membandingkan keliling dua bangun datar
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // method untuk menampilkan jumlah total objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
    
    // method untuk menampilkan informasi dasar bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }
}