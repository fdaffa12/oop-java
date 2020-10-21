public class konstruktorBuku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    public konstruktorBuku(String judul, String pengarang, String penerbit, int tahun){
        judul= judul;
        pengarang= pengarang;
        penerbit= penerbit;
        tahun= tahun;
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tahun : "+tahun);
    }
    public static void main(String[] args) {
        konstruktorBuku book = new konstruktorBuku("Learn Java", "Faiz Daffa", "Erlangga", 2019);

        

    }
}
