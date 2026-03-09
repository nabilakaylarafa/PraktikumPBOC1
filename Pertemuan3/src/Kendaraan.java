/* Nama File    : Kendaraan.java 
 * Deskripsi    : Berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 5 Maret 2026 */

public class Kendaraan {
    /************************ ATRIBUT ************************/
    private String noPlat;
    private String jenis;

    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek kendaraan dengan nilai default (tanpa parameter)
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    //membuat objek kendaraan dengan nilai tertentu (dengan parameter)
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai nomor plat kendaraan
    public String getNoPlat() {
        return noPlat;
    }

    //mengembalikan nilai jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    /************************ MUTATOR ************************/
    //mengubah nilai nomor plat kendaraan
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //mengubah nilai jenis kendaraan
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /********************** METHOD LAIN **********************/
    //menampilkan informasi kendaraan
    public void printKendaraan() {
        System.out.println("\nData Kendaraan");
        System.out.println("No. Plat        : " + noPlat);
        System.out.println("Jenis           : " + jenis);
    }
}