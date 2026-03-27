/* Nama File    : Persegi.java 
 * Deskripsi    : Berisi atribut dan method dalam class Persegi
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Maret 2026 */

public class Persegi extends BangunDatar implements IResize {
    
    /************ ATRIBUT ************/
    private double sisi;

    /************ METHOD *************/
    
    // konsruktor untuk membuat objek persegi dengan nilai default (tanpa parameter)
    public Persegi() {
        setJmlSisi(4); 
    }

    // konstruktor untuk membuat objek persegi dengan nilai tertentu (dengan parameter)
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // selektor untuk mengembalikan nilai sisi persegi
    public double getSisi() { 
        return sisi; 
    }

    // method abstract (BangunDatar) untuk menghitung dan mengembalikan luas persegi
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // method abstract (BangunDatar) untuk menghitung dan mengembalikan keliling persegi
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // selektor untuk menghitung dan mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // mutator untuk mengubah nilai sisi persegi
    public void setSisi(double sisi) { 
        this.sisi = sisi;
    }

    // method interface (IResize) untuk memperbesar ukuran persegi
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    // method interface (IResize) untuk memperkecil ukuran persegi
    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    // method interface (IResize) untuk menskalakan ukuran persegi sesuai input percent
    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * (percent / 100.0);
    }

    // method menampilkan informasi detail persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi persegi     : " + sisi);
        System.out.println("Luas persegi     : " + getLuas());
        System.out.println("Keliling persegi : " + getKeliling());
        System.out.println("Diagonal persegi : " + getDiagonal());
    }
}