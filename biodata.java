import java.util.Scanner;

public class biodata {
	public static void main(String[] args) {
		String nama,alamat,prodi;
		int npm;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("=====Program JAVA=====");
		
		System.out.println("NPM = ");
		npm = keyboard.nextInt();

		System.out.println("Nama = ");
		nama = keyboard.nextLine();

		System.out.println("Prodi = ");
		prodi = keyboard.nextLine();

		System.out.println("Alamat = ");
		alamat = keyboard.nextLine();

		System.out.println("*****STIMK SUBANG*****");

		System.out.println("======================");

		System.out.println("NPM = " + npm);
		System.out.println("Nama = " + nama);
		System.out.println("Prodi = " + prodi);
		System.out.println("Alamat = " + alamat);
		System.out.println("*****STIMK SUBANG*****");
	}
}