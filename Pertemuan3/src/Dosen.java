/* Nama File    : Dosen.java 
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 5 Maret 2026 */

public class Dosen {
    /************************ ATRIBUT ************************/
    private String nip;
    private String nama;
    private String prodi;

    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek dosen dengan nilai default (tanpa parameter)
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    //membuat objek dosen dengan nilai tertentu (dengan parameter)
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai nip dosen
    public String getNip() {
        return nip;
    }

    //mengembalikan nilai nama dosen
    public String getNama() {
        return nama;
    }

    //mengembalikan nilai prodi (program studi) dosen
    public String getProdi() {
        return prodi;
    }

    /************************ MUTATOR ************************/
    //mengubah nilai nip dosen
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mengubah nilai nama dosen
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengubah nilai prodi dosen
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    /********************** METHOD LAIN **********************/
    //menampilkan informasi dosen
    public void printDosen() {
        System.out.println("\nData Dosen");
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Prodi           : " + prodi);
    }
}