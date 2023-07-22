import javax.swing.*;

public class CastMain {
    public static void main(String[] args) {
        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro);

        Double pontoFlutuante = Double.parseDouble(JOptionPane.
                showInputDialog(null, "Digite um double:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(pontoFlutuante);

        Boolean boleano = Boolean.parseBoolean(JOptionPane.
                showInputDialog(null, "Digite um boleano:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(boleano);
    }
}







