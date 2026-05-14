/* Nama File    : Piaraan.java 
 * Deskripsi    : Berisi implementasi kelas Piaraan yang merepresentasikan
 *                antrean hewan peliharaan (Anabul) pada klinik hewan.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 7 Mei 2026 */

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {

    /********** ATRIBUT *********/
    private int nbelm;
    private Queue<Anabul> Lanabul; 

    
    /********** METHOD **********/
    // Konstruktor tanpa parameter untuk membuat antrean kosong 
    public Piaraan() {
        nbelm = 0;
        Lanabul = new LinkedList<>();
    }

    // Konstruktor dengan parameter
    public Piaraan(int nbelm, Queue<Anabul> lanabul) {
        this.nbelm = nbelm;
        this.Lanabul = lanabul;
    }

    // Selektor untuk mengambil banyak elemen antrean
    public int getNbelm() {
        return nbelm;
    }    

    // Menambahkan Anabul ke akhir antrean
    public void enqueueAnabul(Anabul A) {
        Lanabul.add(A);
        nbelm = nbelm + 1;
    }

    // Mengecek apakah Anabul ada dalam antrean
    public boolean isMember(Anabul A) {
        return Lanabul.contains(A);
    }

    // Mengambil Anabul pertama dalam antrean
    public Anabul getAnabul() {
        try {
            if (nbelm == 0) {
                throw new Exception("Antrean anabul kosong");
            } else {
                return Lanabul.peek();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Mengambil dan menghapus Anabul pertama dalam antrean
    public Anabul dequeueAnabul() {
        try {
            if (nbelm == 0) {
                throw new Exception("Antrean anabul kosong");
            } else {
                nbelm = nbelm - 1;
                Anabul out = Lanabul.poll();
                System.out.println(out.getNama() + " berhasil dikeluarkan dari antrean");
                return out;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Menampilkan nama semua Anabul dalam antrean
    public void showAnabul() {
        try {
            if (nbelm == 0) {
                throw new Exception("Antrean anabul kosong");
            }
            for (Anabul A : Lanabul) {
                System.out.println(A.getNama());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Menghitung jumlah keluarga Kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul A : Lanabul) {
            if (A instanceof Kucing) {
                count = count + 1;
            }
        }
        return count;
    }

    // Menghitung total bobot keluarga Kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul A : Lanabul) {
            if (A instanceof Kucing) {
                totalBobot = totalBobot + ((Kucing) A).getBobot();
            }
        }
        return totalBobot;
    }

    // Menampilkan nama dan jenis objek Anabul dalam antrean
    public void showJenisAnabul() {
        try {
            if (nbelm == 0) {
                throw new Exception("Antrean anabul kosong");
            }
            for (Anabul A : Lanabul) {
                System.out.println(A.getNama() + " - " + A.getClass().getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
