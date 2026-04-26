/* Nama File    : MSeminar.java 
 * Deskripsi    : Berisi main driver untuk menguji class civitas akademika, dosen, mahasiswa, dan seminar.
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Kamis, 23 April 2026 */

package akademik;

public class MSeminar {
    public static void main(String[] args) {

        // Membuat objek Seminar
        Seminar s = new Seminar();

        // Membuat 2 objek Dosen
        Dosen d1 = new Dosen("Budi Santoso", "1898215467");
        Dosen d2 = new Dosen("Ani Kusuma", "1990145879");

        // Membuat 5 objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Angelina", "2345600001");
        Mahasiswa m2 = new Mahasiswa("Benny", "2345600002");
        Mahasiswa m3 = new Mahasiswa("Caroline", "2345600003");
        Mahasiswa m4 = new Mahasiswa("Dani", "2345600004");
        Mahasiswa m5 = new Mahasiswa("Elisa", "2345600005");

        // Set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // Registrasi peserta ke seminar
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // Menampilkan daftar peserta
        System.out.println("===== Daftar Peserta =====");
        s.tampilPeserta();
        System.out.println();

        // Menampilkan jumlah peserta
        System.out.println("Jumlah peserta : " + s.countPeserta());
        System.out.println();

        // Menampilkan data mahasiswa
        System.out.println("===== Data Mahasiswa =====");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
        System.out.println();

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah mahasiswa : " + s.countMahasiswa());
        System.out.println();
    }
}