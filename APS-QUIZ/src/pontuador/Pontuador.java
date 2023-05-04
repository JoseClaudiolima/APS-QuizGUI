package pontuador;

public class Pontuador {
    //Aqui estão armazenadas as repostas do quiz de forma ordenada
    private int[] gabarito = {2, 0, 2, 3, 1, 3, 1, 0, 1, 0, 3, 3, 0, 0, 2, 1, 0, 2, 3, 2, 0, 1, 1, 0, 3, 2, 1, 2, 1, 3};
    private int pontuaçãoUsuario = 0;
    

    //Esse método retorna a solução de uma questão
    public int getSolucaoIndividual(int numeroQuestao){
        return gabarito[numeroQuestao];
    }
    
    //Aqui altera a pontuação do usuário a cada acerto
    public void setPontuaçãoUsuario(String correcao) {
        if (correcao.equals("correto")){
            this.pontuaçãoUsuario += 1;
        }
    }
    
    //Retorna a pontuação atual do usuário
    public int getPontuaçãoUsuario() {
        return pontuaçãoUsuario;
    }
   
}

