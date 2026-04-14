/* Nama File    : AngkaSial.java 
 * Deskripsi    : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Selasa, 14 April 2026 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// Pertanyaan
/* Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
   Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
   Jelaskan pada lembar praktikum anda!
   
   Jawaban:
   Ketika eksepsi terjadi, baris 12 yaitu System.out.println(angka + " bukan angka sial"); 
   hanya dieksekusi saat pemanggilan cobaAngka(10), karena tidak terjadi exception. 
   Tetapi saat cobaAngka(13), baris tersebut tidak dieksekusi karena perintah throw akan 
   menghentikan program dan langsung memindahkan eksekusi ke catch. Jadi, pemanggilan 
   cobaAngka(12) juga tidak dijalankan.
   
   Baris 21 yaitu catch (AngkaSialException ase) akan dieksekusi karena exception yang 
   dilempar oleh cobaAngka(13) ditangkap oleh catch. Setelah itu, program menjalankan 
   method getMessage() dan mencetak peringatan. */