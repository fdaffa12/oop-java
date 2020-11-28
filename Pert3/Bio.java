import java.util.Scanner;

public class Bio {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan NPM Anda : ");
        int npm = masukan.nextInt();
        System.out.println("Masuka Nama Anda : ");
        String nama = masukan.nextLine();
        System.out.println("Masukan Alamat Anda : ");
        String alamat = masukan.nextLine();

        System.out.println("NPM = " + npm );
        System.out.println("Nama = " + nama );
        System.out.println("Alamat = " + alamat );
    }
}
