public class Kuadrat {
    int bilangan;
    int hasil;
    public Kuadrat(int nilai){
        bilangan = nilai;
    }
    int getHasil(){
        hasil = bilangan * bilangan;
        return hasil;
    }
    public static void main(String[] args) {
        Kuadrat kuadrat = new Kuadrat(8);
        System.out.println("8 * 8 ="+ kuadrat.getHasil());
    }
}
