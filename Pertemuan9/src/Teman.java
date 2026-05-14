/* Nama File    : Teman.java 
 * Deskripsi    : Berisi implementasi kelas Teman dengan koleksi list
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 7 Mei 2026 */

import java.util.ArrayList;
import java.util.List;

public class Teman {

    /********** ATRIBUT *********/
    private int nbelm;
    private List<String> Lnama;


    /********** METHOD **********/
    // Konstruktor tanpa parameter untuk membuat objek Teman
    public Teman() {
        nbelm = 0;
        Lnama = new ArrayList<>();
    }

    // Konstruktor dengan parameter untuk membuat objek Teman
    public Teman(int nbelm, List<String> lnama) {
        this.nbelm = nbelm;
        this.Lnama = lnama;
    }

    // Selektor untuk mengambil banyak elemen
    public int getNbelm() {
        return nbelm;
    }

    // Selektor untuk mengambil nama pada indeks tertentu
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // Mutator untuk mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // Mutator untuk menambahkan nama ke list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = nbelm + 1;
    }

    // Mutator untuk menghapus nama dari list
    public void delNama(String nama) {
        try {
            if (nbelm == 0) {
                throw new Exception("Daftar teman kosong");
            }
            if (Lnama.remove(nama)) {
                nbelm = nbelm - 1;
                System.out.println(nama + " berhasil dihapus");
            } else {
                System.out.println(nama + " tidak ada dalam daftar teman");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Fungsi untuk mengecek apakah nama merupakan anggota list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Mutator untuk mengganti nama lama menjadi nama baru
    public void gantiNama(String nama, String namaBaru) {
        boolean found = false;
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namaBaru);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nama tidak ditemukan");
        }
    }

    // Fungsi untuk menghitung jumlah kemunculan nama
    public int countNama(String nama) {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                count = count + 1;
            }
        }
        return count;
    }
    
    // Method untuk menampilkan semua nama teman
    public void showTeman() {
        try {
            if (nbelm == 0) {
                throw new Exception("Daftar teman kosong");
            }

            for (int i = 0; i < nbelm; i++) {
                System.out.println(Lnama.get(i));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}