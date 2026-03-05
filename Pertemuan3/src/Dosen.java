public class Dosen {
    /***************ATRIBUT***************/
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;

    /***************METHOD***************/
    //konstruktor tanpa parameter
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
        counterDosen++;
    }

    //konstruktor dengan parameter nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        counterDosen++;
    }

    //mengembalikan nilai counterDosen
    public static int getCounterDosen() {
        return counterDosen;
    }

    //selektor dan mutator untuk masing-masing atribut
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    //mencetak dosen
    public void printDosen() {
        System.out.println("NIP   : " + nip);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}