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
        Gui Interface = new Gui();


        // Mostrará uma interface, introduzindo o usuário ao programa.
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome, por gentileza.");
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", você acha que sabe o bastante sobre como ajudar o meio ambiente? \nClique em ok para descobrir!");

        
        
        // Aqui será armazenado as futuras respostas do usuário, para contabilizar quantos acertos teve.
        int[] respUsuario = new int[30];
        


        
        //Mostrará 5 questões com o titulo: "Dificuldade: fácil"
        //Não finalizado
        int contador = 0;
        while (contador <5){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador), "Dificuldade: Fácil",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Fácil");
            
            respUsuario[contador] = questao;
            
            validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Média"
        //Não finalizado
        while (contador <10){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador), "Dificuldade: Média",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Média");
            
            respUsuario[contador] = questao;
            
            validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Dificil"     
        //Não finalizado        
        while (contador <15){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador), "Dificuldade: Dificil",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Dificil");
            
            respUsuario[contador] = questao;
            
            validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            contador ++;
        }

        
            
        //Mensagem de despedida dizendo a quantidade de acertos.
        //Não finalizado.
        //Pensar na lógica para saber quantos acertaram, uma vez que cada questão é aleatória fica mais dificil de contabilizar.
        //Talvez, reutilizar os acertos mostrados na hora seja a melhor opção.
        //JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por chegar ao fim deste quiz! \nVocê acertou um total de " + pontuadorTotal + "/11 perguntas");
        
       
    }
}
