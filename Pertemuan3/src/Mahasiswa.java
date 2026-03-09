/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 5 Maret 2026 */

import java.util.ArrayList;

public class Mahasiswa {
    /************************ ATRIBUT ************************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    /************************ METHOD *************************/
    
    /********************** KONSTRUKTOR **********************/
    //membuat objek mahasiwa dengan nilai default (tanpa parameter)
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    //membuat objek dosen dengan nilai tertentu (dengan parameter)
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    /*********************** SELEKTOR ************************/
    //mengembalikan nilai nim mahasiswa
    public String getNim() {
        return nim; 
    }
    
    //mengembalikan nilai nama mahasiswa
    public String getNama() {
        return nama;
    }
    
    //mengembalikan nilai program studi mahasiswa
    public String getProdi() {
        return prodi;
    }
    
    //mengembalikan nilai objek dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }
    
    //mengembalikan nilai objek kendaraan mahasiswa */
    public Kendaraan getKendaraan() {
        return kendaraan; 
    }

    /************************ MUTATOR ************************/
    //mengubah nilai nim mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    //mengubah nilai nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }
    
   //mengubah nilai program studi mahasiswa
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    //mengubah objek dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    
    // mengubah objek kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    /********************** METHOD LAIN **********************/
    //menambahkan sebuah mata kuliah ke list mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    //mendapatkan jumlah sks mata kuliah yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            totalSKS += listMatKul.get(i).getSks();
        }
        return totalSKS;
    }
    
    //mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    //menampilkan informasi (nim, nama, prodi) mahasiswa
    public void printMhs() {
        System.out.println("\nData Mahasiswa");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Prodi           : " + prodi);
    }

    //menampilkan informasi (nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, kendaraan) mahasiswa
    public void printDetailMhs() {
        System.out.println("Nama               : " + nama);
        System.out.println("NIM                : " + nim);
        System.out.println("Prodi              : " + prodi);
        System.out.println("Daftar Mata Kuliah : ");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println((i + 1) + ". " + listMatKul.get(i).getNama());
        }
        System.out.println("Jumlah Mata Kuliah : " + getJumlahMatKul());
        System.out.println("Total SKS          : " + getJumlahSKS());
        System.out.println("Dosen Wali         : " + dosenWali.getNama() + " (" + dosenWali.getNip() + ")");
        System.out.println("Kendaraan          : " + kendaraan.getJenis() + " (" + kendaraan.getNoPlat() + ")");
    }
}