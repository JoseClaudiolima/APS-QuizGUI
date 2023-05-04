package Aleatorio;

import java.util.Random;
import java.util.Arrays;

import textos.Questoes;

public class Aleatorio {
    Questoes questoes = new Questoes();
    
    
    private int[] questoesRodadas;
    private int contagemQuestoesRodadas = 1;
    
    Random random = new Random();
    private int numeroAleatorio;
    private int range;
    
    private int[] AlternativasEscolhidas;
    
    
    
    //Método Construtor
    //Preenche toda a array com -1
    //Isso pois quando era gerado aleatoriamente a questao 0 (a primeira questao) estava dando conflito com "new int[15]" que já colocava as 15 questões como 0
    public Aleatorio() {
        this.questoesRodadas = new int[15];
        Arrays.fill(questoesRodadas, -1);
        
        this.AlternativasEscolhidas = new int[4];
        Arrays.fill(AlternativasEscolhidas, -1);
    }
    
    
    //Método para Receber a questão de numero aleatório de acordo com a dificuldade
    public int getQuestaoAleatoria(String Dificuldade) {
        
        //De acordo com a dificuldade, o range muda, por exemplo: Questões fáceis estão entre a 1° e a 10° questão, e as Díficeis entre a 20° e a 30°
        if (Dificuldade.equals("Facil")){
             range = 0;
        }
        if (Dificuldade.equals("Medio")){
             range = 10;
        }
        if(Dificuldade.equals("Dificil")){
             range = 20;
        }
         
        //Aqui gerará um numero da questão aleatório enquanto esse numero não for igual ao outros anteriores escolhidos, isso é para a questão não ser repetida várias vezes por razão de ter pego de forma aleatória.
        do{
            numeroAleatorio = random.nextInt(10) + range; // Gera um número aleatório entre 0 e 9
        } while(verificaçãoDeQuestõesRodadasEAlternativasEscolhidas(numeroAleatorio,questoesRodadas));     
            
        //Abaixo, Armazenará a questão escolhida a uma lista, na ordem que foram escolhidas
        setQuestoesRodadas(getContagemQuestoesRodadas()-1,numeroAleatorio);
        return numeroAleatorio; 
    }   
    

    //Esse metódo colocará a questão que foi escolhida pelo método aleatório, na ordem que for dita
    public void setQuestoesRodadas(int posicaoDaQuestao,int questaoRodada) {
        this.questoesRodadas[posicaoDaQuestao] = questaoRodada;
    }
    
    public int getContagemQuestoesRodadas() {
        return contagemQuestoesRodadas;
    }

    public void setContagemQuestoesRodadas(int quantidadeQuestoesRodadas) {
        this.contagemQuestoesRodadas += quantidadeQuestoesRodadas;
    }
    
    
    public void setAlternativasAleatorias(){
        //Looping simples de 4 repetições
        for (int i = 0; i < 4; i++) {
            do{
                numeroAleatorio = random.nextInt(4); // Gera um número aleatório entre 0 e 3
            } while(verificaçãoDeQuestõesRodadasEAlternativasEscolhidas(numeroAleatorio,AlternativasEscolhidas));
            AlternativasEscolhidas[i] = numeroAleatorio;
            System.out.println("Numero aleatorio gerado: "+numeroAleatorio);
        }
    }
    
    public void setAlternativasAleatorias(String pedido){
        if (pedido.equals("Resetar")){
            Arrays.fill(AlternativasEscolhidas, -1);
        }
    }
    
    public int getAlternativaAleatoria(int numeroAlternativa){
        return AlternativasEscolhidas[numeroAlternativa];
    }
    
    
    public String getTodasAlternativasEscolhidas(int QuestaoFacil){
    
        return 
        "\na) "+questoes.getAlternativaIsolada(QuestaoFacil,getAlternativaAleatoria(0))+
        "\nb) "+ questoes.getAlternativaIsolada(QuestaoFacil,getAlternativaAleatoria(1))+ 
        "\nc) "+ questoes.getAlternativaIsolada(QuestaoFacil,getAlternativaAleatoria(2))+
        "\nd) "+ questoes.getAlternativaIsolada(QuestaoFacil,getAlternativaAleatoria(3));
    }
    
    
    
    //Esse método verifica se a questão escolhida pelo método aleatório já foi escolhida ou não
    //Retornando true caso já foi escolhida, ou false caso não foi escolhida
    public boolean verificaçãoDeQuestõesRodadasEAlternativasEscolhidas(int valor,int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return true;
            } 
        }   return false;
    }
}
