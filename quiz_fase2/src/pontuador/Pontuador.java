package pontuador;

public class Pontuador {
    public int pontuacao(String pergunta[], String solucao[]){
        int pontuacaoTotal = 0;
        for(int i = 0; i < pergunta.length; i++){
            int pontuacao = 0;
            if (pergunta[i].equalsIgnoreCase(solucao[i])){
                pontuacao++;
            }
            pontuacaoTotal += pontuacao;
        }
        return pontuacaoTotal;
        
    }
}

