/* Nama File    : MataKuliah.java 
 * Deskripsi    : Berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 5 Maret 2026 */

public class MataKuliah {
    /************************ ATRIBUT ************************/
    private String idMatKul;
    private String nama;
    private int sks;

    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek mata kuliah dengan nilai default (tanpa parameter)
    public MataKuliah() {
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    //membuat objek mata kuliah dengan nilai tertentu (dengan parameter)
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai id mata kuliah
    public String getIdMatKul() {
        return idMatKul;
    }

    //mengembalikan nilai nama mata kuliah
    public String getNama() {
        return nama;
    }

    //mengembalikan nilai sks mata kuliah
    public int getSks() {
        return sks;
    }

    /************************ MUTATOR ************************/
    //mengubah nilai id mata kuliah
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    //mengubah nilai nama mata kuliah
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengubah nilai sks mata kuliah
    public void setSks(int sks) {
        this.sks = sks;
    }

    /********************** METHOD LAIN **********************/
    //menampilkan informasi mata kuliah
    public void printMataKuliah() {
        System.out.println("\nData Mata Kuliah");
        System.out.println("ID Mata Kuliah  : " + idMatKul);
        System.out.println("Nama            : " + nama);
        System.out.println("SKS             : " + sks);
    }
}