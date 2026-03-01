/* Nama File    : MGaris.java 
 * Deskripsi    : main driver untuk menguji class Garis
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Minggu, 1 Maret 2026 */

public class MGaris {
    public static void main(String[] args) {
        
        Garis G1 = new Garis();
        System.out.print("Garis G1: ");
        G1.printGaris();

        System.out.print("Titik Awal G1: ");
        G1.getTitikAwal().printTitik();
        System.out.print("Titik Akhir G1: ");
        G1.getTitikAkhir().printTitik();

        G1.setTitikAwal(new Titik(2, 2));
        G1.setTitikAkhir(new Titik(5, 5));
        System.out.print("G1 setelah setTitikAwal(2,2) & setTitikAkhir(5,5): ");
        G1.printGaris();

        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(4, 5);
        Garis G2 = new Garis(T1, T2);
        System.out.print("Garis G2: ");
        G2.printGaris();

        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.print("Titik Tengah G2: ");
        G2.getTitikTengah().printTitik();

        Garis G3 = new Garis(new Titik(), new Titik(3,3));
        System.out.print("Garis G3: ");
        G3.printGaris();
        System.out.println("Apakah G2 sejajar G3? " + G2.isSejajar(G3));

        Garis G4 = new Garis(new Titik(0,4), new Titik(4,0));
        System.out.print("Garis G4: ");
        G4.printGaris();
        System.out.println("Apakah G2 tegak lurus G4? " + G2.isTegakLurus(G4));

        Garis G5 = new Garis(new Titik(-2,0), new Titik(0,4));
        System.out.print("Persamaan Garis G5: ");
        G5.getPersamaanGaris();

        System.out.println("Jumlah objek garis: " + Garis.getCounterGaris());

    }
}