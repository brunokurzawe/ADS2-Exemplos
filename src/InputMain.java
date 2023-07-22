import javax.swing.*;

public class InputMain {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Entrada", JOptionPane.QUESTION_MESSAGE);
        System.out.println(nome);
    }
}
