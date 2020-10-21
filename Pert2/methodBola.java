public class methodBola {
    int jari;
    double volume;
    double phi=3.14;

    void bola(){
    System.out.println("Jari = " + jari);
    System.out.println("Volume = " + jari*phi);
    }

    public static void main(String[] args) {
        methodBola mbola = new methodBola();
        mbola.jari = 10;
        mbola.bola();
    }
}
