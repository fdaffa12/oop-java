public class methodBalok {
    int panjang;
    int lebar;
    int tinggi;
    int volume;

    void balok(){
        System.out.println("Panjang "+ panjang);
        System.out.println("Lebar " + lebar);
        System.out.println("Tinggi " + tinggi);
        System.out.println("Volume " + panjang*lebar*tinggi);
    }

    public static void main(String[] args) {
        methodBalok mbalok = new methodBalok();
        mbalok.panjang = 10;
        mbalok.lebar = 20;
        mbalok.tinggi = 50;
        mbalok.balok();
    }
}
