import java.io.Console;

public class biodata2 {
	public static void main(String[] args) {
		String nama,alamat,prodi;
		int npm;

		Console con = System.console();

		System.out.println("=====Program JAVA=====");
		
		System.out.println("NPM = ");
		npm = Integer.parseInt(con.readLine());

		System.out.println("Nama = ");
		nama = con.readLine();

		System.out.println("Prodi = ");
		prodi = con.readLine();

		System.out.println("Alamat = ");
		alamat = con.readLine();

		System.out.println("*****STIMK SUBANG*****");

		System.out.println("======================");

		System.out.println("NPM = " + npm);
		System.out.println("Nama = " + nama);
		System.out.println("Prodi = " + prodi);
		System.out.println("Alamat = " + alamat);
		System.out.println("*****STIMK SUBANG*****");
	}
}