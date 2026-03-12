/* Nama File    : Lingkaran.java 
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran (Subclass)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 12 Maret 2026 */

public class Lingkaran extends BangunDatar {
    /************************ ATRIBUT ************************/
    private double jari;

    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek lingkaran dengan nilai default (tanpa parameter)
    public Lingkaran() {
        setJmlSisi(1);
    }

    //membuat objek lingkaran dengan nilai tertentu (dengan parameter)
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai jari-jari lingkaran
    public double getJari() { 
        return jari;
    }
    
    //menghitung dan mengembalikan luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    //menghitung dan mengembalikan keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /************************ MUTATOR ************************/
    //mengubah nilai jari-jari lingkaran
    public void setJari(double jari) { 
        this.jari = jari; 
    }

    /********************** METHOD LAIN **********************/
    // Menampilkan informasi detail lingkaran
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil printInfo milik BangunDatar
        System.out.println("Jari-jari lingkaran : " + jari);
        System.out.println("Luas lingkaran      : " + getLuas());
        System.out.println("Keliling lingkaran  : " + getKeliling());
    }
}