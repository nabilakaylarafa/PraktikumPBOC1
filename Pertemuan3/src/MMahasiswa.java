/* Nama File    : MMahasiswa.java 
 * Deskripsi    : Main driver untuk menguji class Dosen, MataKuliah, Kendaraan, dan Mahasiswa
 * Pembuat      : Nabila Kayla Rafa (24060124120022)
 * Tanggal      : Minggu, 8 Maret 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        //spasi untuk merapilan tampilan output
        System.out.println("\n");

        //pengujian konstruktor tanpa parameter
        System.out.println("\n******* Pengujian Konstruktor Tanpa Parameter *******");
        //membuat objek dosen D1 kosong
        Dosen D1 = new Dosen();
        D1.printDosen();           
        //membuat objek mata kuliah MK1 kosong         
        MataKuliah MK1 = new MataKuliah();
        MK1.printMataKuliah();
        //membuat objek kendaraan K1 kosong
        Kendaraan K1 = new Kendaraan();
        K1.printKendaraan();
        //membuat objek mahasiswa M1 kosong
        Mahasiswa M1 = new Mahasiswa();
        M1.printMhs();


        //pengujian konstruktor dengan parameter
        System.out.println("\n******* Pengujian Konstruktor dengan Parameter *******");
        //membuat objek dosen D2 sekaligus mengisi nip, nama, dan prodinya
        Dosen D2 = new Dosen("1230002", "Budi, S.Kom., M.Kom.", "Informatika");
        D2.printDosen();
        //membuat objek mata kuliah MK2 sekaligus mengisi id mata kuliah, nama, dan sks-nya
        MataKuliah MK2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MK2.printMataKuliah();
        //membuat objek kendaraan K2 sekaligus mengisi nomor plat dan jenisnya
        Kendaraan K2 = new Kendaraan("H 4567 CD", "Mobil");
        K2.printKendaraan();
        //membuat objek mahasiswa M2 sekaligus mengisi nim, nama, dan prodinya
        Mahasiswa M2 = new Mahasiswa("245002", "Rafa", "Informatika");
        M2.printMhs();


        //pengujian mutator
        System.out.println("\n******* Pengujian Mutator *******\n");
        //mengisi data nip, nama, dan prodi ke dosen D1
        D1.setNip("1230001");
        D1.setNama("Andi, S.T., S.Kom.");
        D1.setProdi("Informatika");
        D1.printDosen();
        //mengisi data id mata kuliah, nama, dan sks ke mata kuliah MK1
        MK1.setIdMatKul("PBO");
        MK1.setNama("Pemrograman Berorientasi Objek");
        MK1.setSks(3);
        MK1.printMataKuliah();
        //mengisi data jenis dan nomor plat ke kendaraan K1
        K1.setJenis("Motor");
        K1.setNoPlat("H 1234 AB");
        K1.printKendaraan();
        //mengisi data nama, nim, dan prodi ke mahasiswa M1
        M1.setNama("Citra");
        M1.setNim("2450001");
        M1.setProdi("Informatika");
        M1.printMhs();


        //pengujian selektor
        System.out.println("\n******* Pengujian Selektor *******\n");
        //mengambil data spesifik dari objek dosen D1
        System.out.println("NIP Dosen D1                    : " + D1.getNip());
        System.out.println("Nama Dosen D1                   : " + D1.getNama());
        System.out.println("Prodi Dosen D1                  : " + D1.getProdi());
        //mengambil data spesifik dari objek mata kuliah MK2
        System.out.println("ID Mata Kuliah MK2              : " + MK2.getIdMatKul());
        System.out.println("Nama Mata Kuliah MK2            : " + MK2.getNama());
        System.out.println("SKS Mata Kuliah MK2             : " + MK2.getSks());
        //mengambil data spesifik dari objek kendaraan K1
        System.out.println("Nomor Plat Kendaraan K1         : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan K1              : " + K1.getJenis());
        //mengambil data spesifik dari objek mahasiswa M2
        System.out.println("NIM Mahasiswa M2                : " + M2.getNim());
        System.out.println("Nama Mahasiswa M2               : " + M2.getNama());
        System.out.println("Prodi Mahasiswa M2              : " + M2.getProdi());
        System.out.println("Total SKS Mahasiswa M2          : " + M1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah Mahasiswa M2 : " + M1.getJumlahMatKul());


        //pengujian relasi antar objek
        System.out.println("\n******* Pengujian Relasi antar Objek *******\n");
        //menetapkan dosen D2 sebagai dosen wali mahasiswa M1
        M1.setDosenWali(D2);
        //menetapkan kendaraan K1 sebagai kendaraan milik mahasiswa M1
        M1.setKendaraan(K1);
        //menambahkan objek mata kuliah MK1 ke list mata kuliah mahasiswa M1
        M1.addMatKul(MK1);
        //menambahkan objek mata kuliah MK2 ke list mata kuliah mahasiswa M1
        M1.addMatKul(MK2);
        //menampilkan data detail mahasiswa M1
        M1.printDetailMhs();
    }
}