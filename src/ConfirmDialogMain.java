import javax.swing.*;

public class ConfirmDialogMain {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("O usuário escolheu Sim.");
        } else {
            System.out.println("O usuário escolheu Não.");
        }
    }
}
