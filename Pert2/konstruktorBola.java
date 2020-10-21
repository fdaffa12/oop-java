public class konstruktorBola {
    int jari;
    double volume;
    double phi=3.14;
    
    public konstruktorBola(int jari){
    jari=jari;
    phi=phi;
    volume=volume;
    System.out.println("Jari = " + jari);
    System.out.println("Volume = " + jari*phi);
    }

    public static void main(String[] args) {
        konstruktorBola bola = new konstruktorBola(20);
    }
    
    
}
