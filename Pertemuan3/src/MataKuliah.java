public class MataKuliah {
    /***************ATRIBUT***************/
    private String idMatKul;
    private String nama;
    private int sks;

    /***************METHOD***************/
    //konstruktor tanpa parameter
    public MataKuliah() {
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    //konstruktor dengan parameter idMatKul, nama, dan sks
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor dan mutator untuk masing-masing atribut
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    //mencetak mata kuliah
    public void printMataKuliah() {
        System.out.println("idMatKul : " + idMatKul);
        System.out.println("Nama     : " + nama);
        System.out.println("SKS      : " + sks);
    }
}
