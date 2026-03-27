/* Nama File    : IRInterface yang mendefinisikan method untuk esize.java 
 * Deskripsi    : mengubah ukuran objek (resize)
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 26 Maret 2026 */

public interface IResize {
    
    /************ METHOD *************/
    
    // method untuk menambah ukuran menjadi 10% lebih besar
    public void zoomIn();
    
    // method untuk mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // method untuk menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
    
}