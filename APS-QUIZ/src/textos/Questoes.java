package textos;

public class Questoes {

    // Aqui estao armazenadas todas as perguntas do quiz.
    public String[][] todasPerguntasArray = {
        {"1) A Lei da Política Nacional do Meio Ambiente tem por objetivo:\n"
        + "\na) Fiscalizar a utilização da coleta seletiva nos bairros\n"
        + "b)Controle potencial da emissão de gases em industrias de grande porte\n"
        + "c) Incentivar o estudo ás questões ambientais e o uso da tecnologia em prol delas\n"
        +"d) Nenhuma das opções"},

        
        {"2) Qual das gestões apresentadas é responsável pela administração do exercício de atividades econômicas e sociais na utilização de recursos naturais?\n"
        + "\na) Gestão de recursos ambientais\n"
        + "b) Gestão política\n"
        + "c) Gestão ecológica\n"
        +"d) Nenhuma das opções"},

        
        {"3) Qual das opções abaixo é um exemplo de reciclagem?\n"
        + "\na) Incineração\n"
        + "b) Acumulo de matéria-prima\n"
        + "c) Coleta Seletiva\n"
        +"d) Todas as opções são exemplo de reciclagem"},

        
        {"4) Qual dos seguintes gases contribui para o efeito estufa?\n"   
        + "\na) Oxigênio\n"
        + "b) Dioxido de carbono\n"
        + "c) Cloro flúor carboneto\n"
        +"d) Vapor de sulfito"},

        
        {"5) O que é coleta seletiva?\n"
        + "\na) Destinação de resíduos para lixões e aterros\n"
        + "b) A escolha aleatória do melhor lixo produzido\n"
        + "c) Processo de envio de todo lixo produzido para cooperativas ou entrega para catadores de rua\n"
        +"d) Processo de separação e recolhimento dos resíduos para o reaproveitamento por meio de reciclagem"},

        
        {"6) Qual das gestões apresentadas é responsável pela administração do exercício de atividades econômicas e sociais na utilização de recursos naturais?\n"
        + "\na) Gestão de recursos ambientais\n"
        + "b) Gestão política\n"
        + "c) Gestão ecologica\n"
        +"d) nenhuma das opções"},

        
        {"7) O que é um “Ambiente Espoliado”?\n"
        + "\na) Ambiente coberto de mata\n"
        + "b) Ambiente que possui recursos naturais escassos por uso excessivo ilegalmente\n"
        + "c) Ambiente ou faixa ambiental que possui multi características\n"
        +"d) Ambiente originado de ações humanas"},
    
        
        {"8) Uma das formas de colaborar com a preservação do meio ambiente é reduzir a produção de resíduos. Mas como?\n"
        + "\na) Optando pela compra de produtos com embalagens recicláveis\n"
        + "b) Reutilizando os materiais e objetos sempre que possível\n"
        + "c) Apoiando iniciativas de reciclagem\n"
        +"d) Todas as anteriores"},
    };
        
    // Esses metódos retornarão a pergunta da questão que for desejada.
    public String pergunta1(){
        return todasPerguntasArray[0][0];
    };
    public String pergunta2(){
        return todasPerguntasArray[1][0];
    };
    public String pergunta3(){
        return todasPerguntasArray[2][0];
    };
    public String pergunta4(){
        return todasPerguntasArray[3][0];
    };
    public String pergunta5(){
        return todasPerguntasArray[4][0];
    };
    public String pergunta6(){
        return todasPerguntasArray[5][0];
    };
    public String pergunta7(){
        return todasPerguntasArray[6][0];
    };
    public String pergunta8(){
        return todasPerguntasArray[7][0];
    };
}
