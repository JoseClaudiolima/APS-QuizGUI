package pontuador;

public class Pontuador {
    private int[] gabarito = {2, 0, 2, 3, 1, 3, 1, 0, 1, 0, 2, 3, 0, 0, 2, 1, 0, 2, 3, 2, 0, 1, 1, 0, 3, 2, 1, 2, 1, 3};
    
    // Aqui o programa fará a verificação das repostas do usuário ao gabarito, aumentando a sua pontuação a cada acerto.
    // Por fim retornará a pontuação.
    
    public int pontuacao(int respUsuario[]){
        int pontuacaoTotal = 0;
        for(int i = 0; i < respUsuario.length; i++){
            int pontuacao = 0;
            if (respUsuario[i] == gabarito[i]){
                pontuacao++;
            }
            pontuacaoTotal += pontuacao;
        }
        return pontuacaoTotal;
        
    }
    
    public int getSolucaoIndividual(int numeroQuestao){
        return gabarito[numeroQuestao];
    }
}

