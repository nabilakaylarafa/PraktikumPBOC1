/* Nama File    : OperatorGenerik.java 
 * Deskripsi    : Berisi prosedur generik Tukar dan fungsi generik Bobot2
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 30 April 2026 */

public class OperatorGenerik {

    // Prosedur Tukar dengan 2 parameter
    public static <T> void Tukar(T[] arr) {
        if (arr.length >= 2) {
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    // Fungsi generik untuk mengembalikan jumlah bobot 2 objek
    public static double Bobot2(Kucing K1, Kucing K2) {
        return K1.getBobot() + K2.getBobot();
    }
}
