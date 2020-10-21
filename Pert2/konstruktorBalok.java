public class konstruktorBalok {
    int panjang;
    int lebar;
    int tinggi;
    int volume;

    public konstruktorBalok(int panjang, int lebar, int tinggi){
        panjang= panjang;
        lebar= lebar;
        tinggi= tinggi;
        volume=volume;

        System.out.println("Panjang "+ panjang);
        System.out.println("Lebar " + lebar);
        System.out.println("Tinggi " + tinggi);
        System.out.println("Volume " + panjang*lebar*tinggi);
    }

    public static void main(String[] args) {
        konstruktorBalok balok = new konstruktorBalok(10, 20, 20);
    }
}
