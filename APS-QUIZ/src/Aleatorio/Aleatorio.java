package Aleatorio;

import java.util.Random;

public class Aleatorio {
    private int[] questoesRodadas = new int[15];
    private int contagemQuestoesRodadas = 0;
    
    Random random = new Random();
    private int numeroAleatorio;
    private int range;
    
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
        } while(verificaçãoDeQuestõesRodadas(numeroAleatorio));     
            
        //Abaixo, Armazenará a questão escolhida a uma lista, na ordem que foram escolhidas
        setQuestoesRodadas(contagemQuestoesRodadas,numeroAleatorio);
        contagemQuestoesRodadas ++;
        return numeroAleatorio; 
    }   
    

    //Esse metódo colocará a questão que foi escolhida pelo método aleatório, na ordem que for dita
    public void setQuestoesRodadas(int posicaoDaQuestao,int questaoRodada) {
        this.questoesRodadas[posicaoDaQuestao] = questaoRodada;
    }
    
    //Esse método verifica se a questão escolhida pelo método aleatório já foi escolhida ou não
    //Retornando true caso já foi escolhida, ou false caso não foi escolhida
    public boolean verificaçãoDeQuestõesRodadas(int valor){
        for (int i = 0; i < questoesRodadas.length; i++) {
            if (questoesRodadas[i] == valor) {
                return true;
            } 
        }   return false;
    }
}
