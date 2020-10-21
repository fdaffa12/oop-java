public class methodMhs {
    int npm;
    String nama;

    void dataMhs(){
        System.out.println("Npm : " + npm);
        System.out.println("Nama : " + nama);
    }

    public static void main(String[] args){
        //membuat object
        methodMhs mhs = new methodMhs();
        //memanggil atribut dan memberi nilai */
        mhs.npm = 1706700054;
        mhs.nama = "Faiz Daffa Kusuma Laksana";
        mhs.dataMhs();
    }
}
