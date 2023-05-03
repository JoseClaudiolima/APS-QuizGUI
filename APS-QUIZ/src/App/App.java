
import javax.swing.JOptionPane;

import conferencia.Conferencia;
import pontuador.Pontuador;
import textos.Questoes;
import textos.Gui;
import Aleatorio.Aleatorio;

public class App {
    public static void main(String[] args) throws Exception {
        Questoes questoes = new Questoes();
        Conferencia validador = new Conferencia();
        Pontuador pontuador = new Pontuador();
        Gui Interface = new Gui();
        Aleatorio Aleatorizar = new Aleatorio();


        // Mostrará uma interface, introduzindo o usuário ao programa.
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome, por gentileza.");
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", você acha que sabe o bastante sobre como ajudar o meio ambiente? \nClique em ok para descobrir!");


        
        //Mostrará 5 questões com o titulo: "Dificuldade: fácil"
        String ResultadoCorrecao;
        //Não finalizado
        int contador = 0;
        while (contador <5){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador) +"\n a)" + questoes.getAlternativaIsolada(contador,0) , "Dificuldade: Fácil",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Fácil");
            
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Média"
        //Não finalizado
        while (contador <10){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador), "Dificuldade: Média",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Média");
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Dificil"     
        //Não finalizado        
        while (contador <15){
            int questao  = Interface.getQuestão(questoes.getPergunta(contador), "Dificuldade: Dificil",questoes.getDica(contador));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(contador,0), questoes.getAlternativaIsolada(contador,1), questoes.getAlternativaIsolada(contador,2), questoes.getAlternativaIsolada(contador,3), questoes.getPergunta(contador),"Dificuldade: Dificil");
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(contador), questao);
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            contador ++;
        }

        
            
        //Mensagem de despedida dizendo a quantidade de acertos.
        //Não finalizado.
        //fazer um metodo na classe gui de despedidas, para fazer o chamado por aqui no main e substituir o codigo abaixo
        JOptionPane.showMessageDialog(null, "Parabéns " + nome + ", por chegar ao fim deste quiz! \nVocê acertou um total de " + pontuador.getPontuaçãoUsuario() + "/15 perguntas");
        
       
    }
}

