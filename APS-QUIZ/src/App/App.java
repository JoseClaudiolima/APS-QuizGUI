import javax.swing.JOptionPane;

import conferencia.Conferencia;
import pontuador.Pontuador;
import textos.Questoes;

public class App {
    public static void main(String[] args) throws Exception {

        // Mostrará uma interface, introduzindo o usuário ao programa.
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome, por gentileza.");
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", você acha que sabe o bastante sobre como ajudar o meio ambiente? \nClique em ok para descobrir!");



        Questoes questoes = new Questoes();
        Conferencia validador = new Conferencia();
        Pontuador pontuador = new Pontuador();

        // Em cada uma das questões, mostrará uma interfarce e verificará se o usuário errou ou acertou.
        String questao1  = JOptionPane.showInputDialog(null, questoes.pergunta1());
        validador.validarResposta("c", questao1);
        
        
        String questao2  = JOptionPane.showInputDialog(null, questoes.pergunta2());
        validador.validarResposta("a", questao2);
        

        String questao3  = JOptionPane.showInputDialog(null, questoes.pergunta3());
        validador.validarResposta("c", questao3);
      

        String questao4  = JOptionPane.showInputDialog(null, questoes.pergunta4());
        validador.validarResposta("c", questao4);
      

        String questao5  = JOptionPane.showInputDialog(null, questoes.pergunta5());
        validador.validarResposta("d", questao5);
      

        String questao6  = JOptionPane.showInputDialog(null, questoes.pergunta6());
        validador.validarResposta("a", questao6);
        

        String questao7  = JOptionPane.showInputDialog(null, questoes.pergunta7());
        validador.validarResposta("b", questao7);
       

        String questao8  = JOptionPane.showInputDialog(null, questoes.pergunta8());
        validador.validarResposta("d", questao8);

        String questao9  = JOptionPane.showInputDialog(null, questoes.pergunta9());
        validador.validarResposta("b", questao9);

        String questao10  = JOptionPane.showInputDialog(null, questoes.pergunta10());
        validador.validarResposta("a", questao10);

        String questao11  = JOptionPane.showInputDialog(null, questoes.pergunta11());
        validador.validarResposta("c", questao11);
       

        // Armazenará as respostas do usuário, para contabilizar quantos acertos teve.
        int pontuadorTotal = pontuador.pontuacao(
            new String[] {questao1, questao2, questao3, questao4, questao5, questao6, questao7, questao8, questao9, questao10, questao11 },
            new String[] {"c", "a", "c", "c", "d", "a", "b", "d", "b", "a", "c"}
            );

        JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por chegar ao fim deste quiz! \nVocê acertou um total de " + pontuadorTotal + "/11 perguntas");
    }
}
