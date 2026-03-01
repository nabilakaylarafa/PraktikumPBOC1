/* Nama File    : Garis.java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Minggu, 1 Maret 2026 */

public class Garis {
    /***************ATRIBUT***************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /***************METHOD***************/
    //konstruktor tanpa parameter, titik awal (0,0) & titik akhir (1,1)
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    //mengembalikan titik awal garis
    Titik getTitikAwal() {
        return titikAwal;
    }

    //mengembalikan titik akhir garis
    Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    //mengubah titik awal garis dengan titik yang baru
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    //mengubah titik akhir garis dengan titik yang baru
    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    //menghitung panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    //mengembalikan gradien garis
    double getGradien() {
        return (titikAkhir.ordinat - titikAwal.ordinat) / (titikAkhir.absis - titikAwal.absis);
    }

    //mengembalikan titik tengah garis
    Titik getTitikTengah() {
        double tengahAbsis = (titikAwal.absis + titikAkhir.absis) / 2;
        double tengahOrdinat = (titikAwal.ordinat + titikAkhir.ordinat) / 2;
        return new Titik(tengahAbsis, tengahOrdinat);
    }

    //mengecek apakah garis sejajar dengan garis lainnya
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    //mengecek apakah garis tegak lurus dengan garis lainnya
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("<(" + titikAwal.absis + "," + titikAwal.ordinat + "), (" + titikAkhir.absis + "," + titikAkhir.ordinat + ")>");
    }

    //menampilkan persamaan garis dalam bentuk y = mx + c
    void getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.ordinat - (m * titikAwal.absis);
        System.out.println("y = " + m + "x + " + c);
    }

} //end Class Garis