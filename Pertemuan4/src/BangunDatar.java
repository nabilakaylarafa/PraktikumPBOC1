/* Nama File    : BangunDatar.java 
 * Deskripsi    : Berisi atribut dan method dalam class BangunDatar (Superclass)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 12 Maret 2026 */

public class BangunDatar {
    /************************ ATRIBUT ************************/
    protected int jmlSisi;
    protected String warna;
    protected String border;

    //atribut statik untuk menghitung jumlah objek yang dibuat
    private static int counterBangunDatar = 0;
    
    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek bangun datar dengan nilai default (tanpa parameter)
    public BangunDatar() {
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar++;
    }
    
    //membuat objek bangun datar dengan nilai tertentu (dengan parameter)
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }
    
    //mengembalikan nilai warna
    public String getWarna() {
        return warna;
    }

    //mengembalikan nilai border
    public String getBorder() {
        return border;
    }

    /************************ MUTATOR ************************/
    //mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    //mengubah nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    //mengubah nilai border
    public void setBorder(String border) {
        this.border = border;
    }
    
    /********************** METHOD LAIN **********************/
    //menampilkan jumlah total objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
    
    //menampilkan informasi dasar bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }
}