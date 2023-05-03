package conferencia;

import javax.swing.JOptionPane;

// Nessa classe estou fazendo um codigo que valide se a resposta do usuário esá correta!
public class Conferencia {
    private String validade = "";
    
    public String validarResposta (int solucao, int resposta) {
        
        
        if (resposta == solucao) {
            JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
            validade = "correto";
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
            validade = "incorreto";
        }
        return validade;
    }
    
}