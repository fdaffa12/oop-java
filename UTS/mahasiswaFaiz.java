import java.util.Scanner;

class mahasiswaFaiz {
    int npm;
    String nama;
    String prodi;

    mahasiswaFaiz(int nim, String name, String jurusan){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NPM = "); nim=input.nextInt();
        System.out.print("Masukan Nama = "); name=input.next();
        System.out.print("Masukan Prody = "); jurusan=input.next();
        npm=nim;
        nama=name;
        prodi=jurusan;
    }

    void cetakMhs(){
        Scanner input = new Scanner(System.in);
        System.out.println("******");
        System.out.println("Npm = "+ npm);
        System.out.println("Nama = "+ nama);
        System.out.println("Prodi = "+ prodi);
    }

    public static void main(String[] args) {
        for(String m="Y"; m.equals("Y")||m.equals("y");){
            Scanner input = new Scanner(System.in);
            System.out.println("Berikut Adalah Data Mahasiswa");
            System.out.println("=============================");
            mahasiswaFaiz demoConstructor = new
            mahasiswaFaiz(2,"nama","prodi");
            demoConstructor.cetakMhs();
            System.out.println("Apakah ingin melanjutkan kembali?(Y/T):");m=input.next();
        }
        for(String n= "T"; n.equals("T")||n.equals("t");){
            System.out.println(" ");
            System.out.println("Terimakasih");
            System.exit(0);
          }
    }

}
