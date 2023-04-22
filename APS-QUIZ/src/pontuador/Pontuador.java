package pontuador;

public class Pontuador {
    // Aqui o programa fará a verificação das repostas do usuário ao gabarito, aumentando a sua pontuação a cada acerto.
    // Por fim retornará a pontuação.
    
    public int pontuacao(int pergunta[], int solucao[]){
        int pontuacaoTotal = 0;
        for(int i = 0; i < pergunta.length; i++){
            int pontuacao = 0;
            if (pergunta[i] == solucao[i]){
                pontuacao++;
            }
            pontuacaoTotal += pontuacao;
        }
        return pontuacaoTotal;
        
    }
}

