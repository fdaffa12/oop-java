import java.util.Scanner;

public class SalamKenal {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        String nama = masukan.nextLine();
        System.out.println("Hallo, Salam Kenal Nama Saya " + nama + "!");

    }
}
