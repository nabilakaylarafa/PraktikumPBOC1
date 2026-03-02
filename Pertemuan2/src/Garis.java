/* Nama File    : Garis.java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Minggu, 1 Maret 2026 */

public class Garis {
    /***************ATRIBUT***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***************METHOD***************/
    //konstruktor tanpa parameter, titik awal (0,0) & titik akhir (1,1)
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    //mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    //mengubah titik awal garis dengan titik yang baru
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    //mengubah titik akhir garis dengan titik yang baru
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    //menghitung panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    //mengembalikan gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        double tengahAbsis = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahOrdinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahAbsis, tengahOrdinat);
    }

    //mengecek apakah garis sejajar dengan garis lainnya
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah garis tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("<(" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + "), (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")>");
    }

    //menampilkan persamaan garis dalam bentuk y = mx + c
    public void getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("y = " + m + "x + " + c);
    }

} //end Class Garis