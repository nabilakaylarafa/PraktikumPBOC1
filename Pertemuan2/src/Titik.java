/* Nama File    : Titik.java 
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Februari 2026 */
 
public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan kuadran (1, 2, 3, 4) tempat titik berada 
    int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //mengembalikan jarak titik dari titik pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //mengembalikan jarak antara 2 titik
    double getJarak(Titik T) {
        double selisihX = T.absis - this.absis;
        double selisihY = T.ordinat - this.ordinat;
        return Math.sqrt((selisihX * selisihX) + (selisihY * selisihY));
    }

    //melakukan refleksi titik terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    //melakukan refleksi titik terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    //menghasilkan titik baru hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    //menghasilkan titik baru hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

} //end class Titik