class Mobil {
    //atribut
    String aktifitas;
    String warna;
    int kecepatan;
    //method untuk memeriksa kecepatan
    void cekKecepatan(){
        if (kecepatan==0)
            aktifitas="parkir";
    }
    // method untuk mencetak atribut
    void cetakAtribut(){
        System.out.println("Aktifitas = "+aktifitas);
        System.out.println("Warna = "+warna);
        System.out.println("Kecepatan = "+kecepatan);
    }
    public static void main(String [] args){
        //membuat object baru bernama mobilku
        Mobil mobilku = new Mobil();
        //memberi nilai awal pada atribut
        mobilku.kecepatan=0;
        mobilku.warna="merah";
        //memeriksa kecepatan
        mobilku.cekKecepatan();
        //mencetak atribut
        mobilku.cetakAtribut();
    }
}