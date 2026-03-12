/* Nama File    : Persegi.java 
 * Deskripsi    : Berisi atribut dan method dalam class Persegi (Subclass)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 12 Maret 2026 */

public class Persegi extends BangunDatar {
    /************************ ATRIBUT ************************/
    private double sisi;

    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek persegi dengan nilai default (tanpa parameter)
    public Persegi() {
        setJmlSisi(4); 
    }

    //membuat objek persegi dengan nilai tertentu (dengan parameter)
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai sisi persegi
    public double getSisi() { 
        return sisi; 
    }

    //menghitung dan mengembalikan luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    //menghitung dan mengembalikan keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    //menghitung dan mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    /************************ MUTATOR ************************/
    //mengubah nilai sisi persegi
    public void setSisi(double sisi) { 
        this.sisi = sisi;
    }

    /********************** METHOD LAIN **********************/
    //menampilkan informasi detail persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi persegi     : " + sisi);
        System.out.println("Luas persegi     : " + getLuas());
        System.out.println("Keliling persegi : " + getKeliling());
        System.out.println("Diagonal persegi : " + getDiagonal());
    }
}