/* Nama File    : AngkaSialException.java 
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Selasa, 14 April 2026 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}