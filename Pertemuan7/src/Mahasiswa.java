/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi implementasi polimorfisme ad-hoc overloading pada class Mahasiswa
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

public class Mahasiswa {
    
    /********** ATRIBUT **********/
    private String nim;
    private String nama;
    private String programStudi;

    /********** METHOD ***********/

    // 2c) Konstruktor tanpa parameter
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // 2d) Konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // 2e) Konstruktor cloning 
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // 2a) Realisasi class Mahasiswa dengan atribut dan operator yang relevan

    // Selektor untuk mengembalikan nilai nim
    public String getNim() {
        return nim;
    }

    // Selektor untuk mengembalikan nilai nama
    public String getNama() {
        return nama;
    }

    // Selektor untuk mengembalikan nilai program studi
    public String getProgramStudi() {
        return programStudi;
    }

    // Mutator untuk mengubah nilai nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mutator untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator untuk mengubah nilai program studi (menggunakan Overloading)
    
    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        programStudi = "Kosong";
    }

    // Varian 2: satu parameter String
    public void setProgramStudi(String prodi) {
        programStudi = prodi;
    }

    // Varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    // Menampilkan informasi Mahasiswa
    public void cetak() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
    }
}
