public class testBuku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    void bukuSatu(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tahun : "+tahun);
    }

    void bukuDua(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tahun : "+tahun);
    }
    public static void main(String[] args) {
        testBuku buku1 = new testBuku();
        buku1.judul = "Pemrograman Berbasis Objek dengan Java";
        buku1.pengarang = "Indrajani";
        buku1.penerbit = "Elexmedia Komputindo";
        buku1.tahun = 2007;
        buku1.bukuSatu();

        testBuku buku2 = new testBuku();
        buku2.judul = "Dasar Pemrograman Java";
        buku2.pengarang = "Abdul Kadir";
        buku2.penerbit = "Andi Offset";
        buku2.tahun = 2006;
        buku2.bukuDua();
    }
}
