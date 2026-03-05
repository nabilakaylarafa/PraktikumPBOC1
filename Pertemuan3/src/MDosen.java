public class MDosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        D1.printDosen();
        D1.setNip("1234567890");
        D1.setNama("Nabila Kayla");
        D1.setProdi("Informatika");
        D1.printDosen();
        System.out.println("Jumlah Objek Dosen = " + Dosen.getCounterDosen());
    }
}