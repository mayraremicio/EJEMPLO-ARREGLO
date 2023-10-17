import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        String [] marcas ={ "nike","adidas","puma","converse"};

        JOptionPane.showMessageDialog(null,"maracas de zapatos populares : ");
        for (int i = 0; i < marcas.length; i++){
            JOptionPane.showMessageDialog( null,"marcas"+( i + 1 )+" : " + marcas [i]);
        }
    }
}