import javax.swing.*;

public class Perkalian {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter Bilangan : ");
        int A = Integer.parseInt(strA);
        String strB = JOptionPane.showInputDialog("Enter Bilangan : ");
        int B = Integer.parseInt(strB);
        JOptionPane.showMessageDialog(null, A + " * " + B + " = " + (A*B));

    }
}
