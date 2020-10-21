public class methodKubus {
    int sisi;
    int volume;

    void kubus(){
        System.out.println("Sisi = " + sisi);
        System.out.println("Volume = " + sisi*sisi*sisi);
    }

    public static void main(String[] args) {
        methodKubus mkubus = new methodKubus();
        mkubus.sisi = 20;
        mkubus.kubus();
    }
}
