/* Nama File    : MData.java 
 * Deskripsi    : Berisi class generik Data yang menyimpan elemen dalam array statis
                  dengan kapasitas 100.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class Data<T> {

    /********** ATRIBUT **********/
    private static final int Kapasitas = 100;
    private T[] ruang;
    private int banyak;

    /********** METHOD ***********/

    // Konstruktor untuk inisialisasi array dan banyak elemen
    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[Kapasitas];
        banyak = 0;
    }

    // Mutator untuk isi elemen pada posisi tertentu
    public void setIsi(int posisi, T isi) {
        if (posisi >= 1 && posisi <= Kapasitas) {
            ruang[posisi - 1] = isi;
            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    // Selektor untuk mengambil elemen pada posisi tertentu
    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    // Selektor untuk mengambil jumlah elemen 
    public int getSize() {
        return banyak;
    }

    // Selektor untuk mengambil kapasitas maksimum array
    public int getKapasitas() {
        return Kapasitas;
    }
}
