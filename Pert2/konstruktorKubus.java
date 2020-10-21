public class konstruktorKubus {
    int sisi;
    int volume;

    public konstruktorKubus(int sisi){
        sisi= sisi;
        volume= volume;
        System.out.println("Sisi = " + sisi);
        System.out.println("Volume = " + sisi*sisi*sisi);
    }
    public static void main(String[] args) {
        konstruktorKubus kubus = new konstruktorKubus(20);
    }

}
