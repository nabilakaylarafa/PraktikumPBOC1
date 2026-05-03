/* Nama File    : Datum.java 
 * Deskripsi    : Berisi kelas generik dengan atribut isi bertipe generik
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class Datum<T> {

    /********** ATRIBUT **********/
    private T isi;

    /********** METHOD ***********/

    // Selektor untuk mengambil nilai isi
    public T getIsi() {
        return isi;
    }

    // Mutator untuk mengubah nilai isi
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
