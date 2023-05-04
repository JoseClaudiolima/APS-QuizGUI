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
        int contador = 0;
        //Looping simples para repetir 5 vezes
        while (contador <=4){//4
            
            //Escolherá uma questão aleatória entres as fáceis
            int QuestaoFacil = Aleatorizar.getQuestaoAleatoria("Facil");
            //Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();
            
            //Mostrará uma Interface, pegando os dados da classe "Questões"
            int questao  = Interface.getQuestão(Aleatorizar.getContagemQuestoesRodadas()+ questoes.getPergunta(QuestaoFacil) + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoFacil), "Dificuldade: Fácil",questoes.getDica(QuestaoFacil));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(QuestaoFacil,Aleatorizar.getAlternativaAleatoria(0)), questoes.getAlternativaIsolada(QuestaoFacil,Aleatorizar.getAlternativaAleatoria(1)), questoes.getAlternativaIsolada(QuestaoFacil,Aleatorizar.getAlternativaAleatoria(2)), questoes.getAlternativaIsolada(QuestaoFacil,Aleatorizar.getAlternativaAleatoria(3)), Aleatorizar.getContagemQuestoesRodadas()+questoes.getPergunta(QuestaoFacil),"Dificuldade: Fácil");
                
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoFacil), questoes.getAlternativaIsolada(QuestaoFacil,Aleatorizar.getAlternativaAleatoria(questao)));
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Média"
        //Looping simples para repetir 5 vezes
        while (contador <=9){//9
            
            //Escolherá uma questão aleatória entres as Médias
            int QuestaoMedia = Aleatorizar.getQuestaoAleatoria("Medio");
            //Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();
            
            //Mostrará uma Interface, pegando os dados da classe "Questões"
            int questao  = Interface.getQuestão(Aleatorizar.getContagemQuestoesRodadas()+ questoes.getPergunta(QuestaoMedia) + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoMedia), "Dificuldade: Média",questoes.getDica(QuestaoMedia));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(QuestaoMedia,Aleatorizar.getAlternativaAleatoria(0)), questoes.getAlternativaIsolada(QuestaoMedia,Aleatorizar.getAlternativaAleatoria(1)), questoes.getAlternativaIsolada(QuestaoMedia,Aleatorizar.getAlternativaAleatoria(2)), questoes.getAlternativaIsolada(QuestaoMedia,Aleatorizar.getAlternativaAleatoria(3)), Aleatorizar.getContagemQuestoesRodadas()+questoes.getPergunta(QuestaoMedia),"Dificuldade: Média");
            
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoMedia), questoes.getAlternativaIsolada(QuestaoMedia,Aleatorizar.getAlternativaAleatoria(questao)));
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador ++;
        }
        
        //Mostrará 5 questões com o titulo: "Dificuldade: Dificil"  
        //Looping simples para repetir 5 vezes        
        while (contador <=14){//14
            
            //Escolherá uma questão aleatória entres as Dificeis
            int QuestaoDificil = Aleatorizar.getQuestaoAleatoria("Dificil");
            //Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();
            
            //Mostrará uma Interface, pegando os dados da classe "Questões"
            int questao  = Interface.getQuestão(Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoDificil) + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoDificil), "Dificuldade: Dificil",questoes.getDica(QuestaoDificil));
            questao = Interface.getAlternativas(questoes.getAlternativaIsolada(QuestaoDificil,Aleatorizar.getAlternativaAleatoria(0)), questoes.getAlternativaIsolada(QuestaoDificil,Aleatorizar.getAlternativaAleatoria(1)), questoes.getAlternativaIsolada(QuestaoDificil,Aleatorizar.getAlternativaAleatoria(2)), questoes.getAlternativaIsolada(QuestaoDificil,Aleatorizar.getAlternativaAleatoria(3)), Aleatorizar.getContagemQuestoesRodadas()+questoes.getPergunta(QuestaoDificil),"Dificuldade: Dificil");
            
            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoDificil), questoes.getAlternativaIsolada(QuestaoDificil,Aleatorizar.getAlternativaAleatoria(questao)));
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador ++;
        }
        
            
        //Mensagem de despedida dizendo a quantidade de acertos.
        //fazer um metodo na classe gui de despedidas, para fazer o chamado por aqui no main e substituir o codigo abaixo
        JOptionPane.showMessageDialog(null, "Parabéns " + nome + ", por chegar ao fim deste quiz! \nVocê acertou um total de " + pontuador.getPontuaçãoUsuario() + "/15 perguntas.");
        
       
    }
}


