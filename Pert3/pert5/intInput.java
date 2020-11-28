import javax.swing.*;

public class intInput {
    public static void main(String[] args) {
        int angka;
        String rubah = JOptionPane.showInputDialog("Masukan Jumlah Angka = ");
        angka = Integer.parseInt(rubah);
        String info = "Anda memasukan angka " + angka;
        JOptionPane.showMessageDialog(null, info);
        JOptionPane.showConfirmDialog(null, "Terima Kasih", "keluar", JOptionPane.CLOSED_OPTION);
    }
}
