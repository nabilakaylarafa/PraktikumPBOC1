/* Nama File    : Coercion.java 
 * Deskripsi    : Berisi implementasi polimorfisme ad-hoc coercion
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

public class Coercion {
    public static void main(String[] args) {

        // 1a) Ilustrasi konsep polimorfisme coercion, konversi tipe data
        int intValue = 65;
        System.out.println("Sebagai integer  : " + intValue);
        System.out.println("Sebagai karakter : " + (char) intValue);
        System.out.println("Sebagai real     : " + (double) intValue); 

        // 1b) Konversi integer menjadi real, dikembalikan ke integer
        double realValue = (double) intValue;
        int newIntValue = (int) realValue;
        System.out.println("Nilai integer awal     : " + intValue);
        System.out.println("Hasil konversi ke real : " + realValue);
        System.out.println("Hasil konversi ke int  : " + newIntValue);

        // 1c) Konkatenasi string dan penjumlahan String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Hasil konkatenasi X dan Y : " + S);
        System.out.println("Hasil penjumlahan X dan Y : " + Z);

        // 1d) Konkatenasi string dan penjumlahan String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Hasil konkatenasi P dan Q : " + R);
        System.out.println("Hasil penjumlahan P dan Q : " + D);

        // 1e) Integer A berisi hasil konversi nilai String S
        Integer A = Integer.parseInt(S);
        System.out.println("Hasil konversi S ke A : " + A);

        // 1f) String T berisi hasil konversi nilai Integer A
        String T = A.toString();
        System.out.println("Hasil konversi A ke T : " + T);
    }
}
