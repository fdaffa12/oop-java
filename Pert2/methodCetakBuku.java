public class methodCetakBuku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    
    void cetaBuku(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tahun : "+tahun);
    }

    public static void main(String[] args) {
        methodCetakBuku book = new methodCetakBuku();
        book.judul = "Learn Java";
        book.pengarang = "Faiz Daffa";
        book.penerbit = "Erlangga";
        book.tahun = 2020;
        book.cetaBuku();
    }
}
