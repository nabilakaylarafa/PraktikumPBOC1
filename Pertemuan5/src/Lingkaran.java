/* Nama File    : Lingkaran.java 
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Maret 2026 */

public class Lingkaran extends BangunDatar implements IResize {

    /************ ATRIBUT ************/
    private double jari;

    /************ METHOD *************/

    // konstruktor untuk membuat objek lingkaran dengan nilai default (tanpa parameter)
    public Lingkaran() {
        setJmlSisi(1);
    }

    // konstruktor untuk membuat objek lingkaran dengan nilai tertentu (dengan parameter)
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
    }

    // selektor untuk mengembalikan nilai jari-jari lingkaran
    public double getJari() { 
        return jari;
    }

    // method abstract (BangunDatar) untuk menghitung dan mengembalikan luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // method abstract (BangunDatar) untuk menghitung dan mengembalikan keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // mutator untuk mengubah nilai jari-jari lingkaran
    public void setJari(double jari) { 
        this.jari = jari; 
    }

    // method interface (Iresize) untuk memperbesar ukuran lingkaran
    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }

    // method interface (Iresize) untuk memperkecil ukuran lingkaran
    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }

    // method interface (Iresize) untuk menskalakan ukuran lingkaran sesuai persentase
    @Override
    public void zoom(int percent) {
        // percent: 100 = tetap, >100 = perbesar, <100 = perkecil
        this.jari = this.jari * percent / 100.0;
    }

    // method untuk menampilkan informasi detail lingkaran
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil printInfo milik BangunDatar
        System.out.println("Jari-jari lingkaran : " + jari);
        System.out.println("Luas lingkaran      : " + getLuas());
        System.out.println("Keliling lingkaran  : " + getKeliling());
    }
}