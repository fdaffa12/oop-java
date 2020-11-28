import javax.swing.*;
import java.util.*;

public class tebak {
    public static void main(String[] args) {
        String jawab = JOptionPane.showInputDialog("Apakah anda ingin lanjut ?");
        int lakukan = Integer.parseInt(jawab);
        do{
            String strUser = JOptionPane.showInputDialog("Masukan Angka 1 - 5");
            int user = Integer.parseInt(strUser);
            Random random = new Random();
            int comp = random.nextInt(5)+1;
            String hasil = "Komputer : " + comp + "\nAnda   : " + user;
                if (user==comp) {
                    hasil +="\nTebakan TEPAT";
                } else {
                    hasil +="\nMELESET";
                }
                JOptionPane.showMessageDialog(null, hasil);
        }
        while (0<lakukan);

    }    
}
