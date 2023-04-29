import javax.swing.JOptionPane;

import conferencia.Conferencia;
import pontuador.Pontuador;
import textos.Questoes;
import textos.Gui;

public class App {
    public static void main(String[] args) throws Exception {
        Questoes questoes = new Questoes();
        Conferencia validador = new Conferencia();
        Pontuador pontuador = new Pontuador();
        Gui caixaDePergunta = new Gui();


        // Mostrará uma interface, introduzindo o usuário ao programa.
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome, por gentileza.");
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", você acha que sabe o bastante sobre como ajudar o meio ambiente? \nClique em ok para descobrir!");



        // Em cada uma das questões, mostrará uma interfarce e verificará se o usuário errou ou acertou.
        int questao1  = caixaDePergunta.getGui(questoes.getPergunta1(), "pergunta 1");
        validador.validarResposta(2, questao1);
        

        int questao2  = caixaDePergunta.getGui(questoes.getPergunta2(), "pergunta 2");
        validador.validarResposta(0, questao2);


        int questao3  = caixaDePergunta.getGui(questoes.getPergunta3(), "pergunta 3");
        validador.validarResposta(2, questao3);
      

        int questao4  = caixaDePergunta.getGui(questoes.getPergunta4(), "pergunta 4");
        validador.validarResposta(2, questao4);
      

        int questao5  = caixaDePergunta.getGui(questoes.getPergunta5(), "pergunta 5");
        validador.validarResposta(3, questao5);
      

        int questao6  = caixaDePergunta.getGui(questoes.getPergunta6(), "pergunta 6");
        validador.validarResposta(0, questao6);
        

        int questao7  = caixaDePergunta.getGui(questoes.getPergunta7(), "pergunta 7");
        validador.validarResposta(1, questao7);
       

        int questao8  = caixaDePergunta.getGui(questoes.getPergunta8(), "pergunta 8");
        validador.validarResposta(3, questao8);


        int questao9  = caixaDePergunta.getGui(questoes.getPergunta9(), "pergunta 9");
        validador.validarResposta(1, questao9);


        int questao10  = caixaDePergunta.getGui(questoes.getPergunta10(), "pergunta 10");
        validador.validarResposta(0, questao10);
        

        int questao11  = caixaDePergunta.getGui(questoes.getPergunta11(), "pergunta 11");
        validador.validarResposta(2, questao11);
       

        // Armazenará as respostas do usuário, para contabilizar quantos acertos teve.
        int pontuadorTotal = pontuador.pontuacao(
            new int[] {questao1, questao2, questao3, questao4, questao5, questao6, questao7, questao8, questao9, questao10, questao11 },
            new int[] {2, 0, 2, 2, 3, 0, 1, 3, 1, 0, 2}
            );
        
        JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por chegar ao fim deste quiz! \nVocê acertou um total de " + pontuadorTotal + "/11 perguntas");
    }
}
