package conferencia;

import javax.swing.JOptionPane;

// Nessa classe estou fazendo um codigo que valide se a resposta do usuário esá correta!
public class Conferencia {

    public String validarResposta (int solucao, int resposta) {
        String validade = "";
        
        if (resposta == solucao) {
            JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
            validade = "incorreto";
        }
        return validade;
    }
    
}