/* Nama File    : Asersi2.java 
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input 
                  jari-jari lingkaran yang bernilai nol
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Selasa, 14 April 2026 */

// Class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Pertanyaan
/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
   Jelaskan pada lembar laporan praktikum.
   
   Jawaban:
   Penggunaan asersi untuk validasi input jari-jari lingkaran tersebut 
   kurang tepat karena tujuan assersi dibuat untuk debugging, bukan untuk 
   validasi input. Selain itu asersi harus dijalankan dengan -enableassertion 
   (-ea) agar asersi aktif. Jika tidak diaktifkan, validasi akan dilewati dan 
   program akan memproses inputan yang salah tanpa memberikan peringatan. */