package conferencia;

import javax.swing.JOptionPane;

// Nessa classe estou fazendo um codigo que valide se a resposta do usuário esá correta!
public class Conferencia {

    public String validarResposta (String solucao, String resposta) {
        String validade = "";
        while (resposta == null || resposta.isEmpty() || (!resposta.equalsIgnoreCase("a") && !resposta.equalsIgnoreCase("b") && !resposta.equalsIgnoreCase("c") && !resposta.equalsIgnoreCase("d"))) {
            resposta = JOptionPane.showInputDialog(null, "Opção inválida! Por favor, digite uma das letras (A, B, C ou D).");
        };
    
        if (resposta.equalsIgnoreCase(solucao)) {
            JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
            validade = "correto";
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
            validade = "incorreto";
        }
        return validade;
    }
    
}