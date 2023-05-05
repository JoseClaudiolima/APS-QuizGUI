package conferencia;

import javax.swing.JOptionPane;

public class Conferencia {
    /*
    private String validade = "";
    
    //Nesse código é validado, se a resposta escolhida é a correta, de forma bem intuitiva
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
*/
    private String validade;
    
    public String validarResposta(String solucao,String respostaUsuario){
        
        if (respostaUsuario.equals(solucao)){
            JOptionPane.showMessageDialog(null, "Parabéns, Você acertou!");
            validade = "correto";
        }else{
            JOptionPane.showMessageDialog(null, "Você errou!");
            validade = "incorreto";
        }
        return validade;
    }
}