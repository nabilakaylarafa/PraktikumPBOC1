public class Kendaraan {
    /***************ATRIBUT***************/
    private String noPlat;
    private String jenis;

    /***************METHOD***************/
    //konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    //konstruktor dengan parameter nip, nama, dan prodi
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor dan mutator untuk masing-masing atribut
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void printKendaraan() {
        System.out.println("No. Plat : " + noPlat);
        System.out.println("Jenis    : " + jenis);
    }
}
