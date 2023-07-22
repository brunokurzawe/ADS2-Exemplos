import javax.swing.*;

public class OptionDialogMain {
    public static void main(String[] args) {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3", "Cancelar"};

        int resposta = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0] // Opção padrão selecionada
        );

        if (resposta == JOptionPane.CLOSED_OPTION) {
            System.out.println("Operação cancelada pelo usuário.");
        } else if (resposta == 0) {
            System.out.println("Opção 1 selecionada.");
        } else if (resposta == 1) {
            System.out.println("Opção 2 selecionada.");
        } else if (resposta == 2) {
            System.out.println("Opção 3 selecionada.");
        } else if (resposta == 3) {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }
}
