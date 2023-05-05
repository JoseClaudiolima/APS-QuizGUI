package textos;

//Importamos todas as utilizades do javax.swing que iremos utilizar para fazer a interface GUI
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;

//Importará as classes para serem utilizadas nessa
import Aleatorio.Aleatorio;
import conferencia.Conferencia;
import pontuador.Pontuador;


public class Gui {
 
    // Criando novos objetos
    Aleatorio Aleatorizar = new Aleatorio();
    Questoes questoes = new Questoes();
    Conferencia validador = new Conferencia();
    Pontuador pontuador = new Pontuador();
    
    private int option;
    private int numDica;
    private String nome;
    

    //Esse método cria uma interface em que pergunta ao usuário o seu nome, e retorna esse informação
    public void obterNome() {
        nome = JOptionPane.showInputDialog(null, "Seja bem vindo ao nosso quiz, digite o seu nome abaixo: ", "Quiz",
     JOptionPane.PLAIN_MESSAGE, null, null, "").toString();
    }

    
    //O método abaixo, mostra uma interface para instigar o usuário e dizer que o jogo irá começar
    public void inicio() {
        JOptionPane.showMessageDialog(null, "Olá " + nome +
        ", você acha que sabe o bastante sobre como ajudar o meio ambiente? \nClique em ok para descobrir!",
   "Quiz", JOptionPane.PLAIN_MESSAGE, null);
    }

    
    public void Jogar() {
        String ResultadoCorrecao;
        int contador = 0;
        // Mostrará 5 questões com o titulo: "Dificuldade: fácil"
        // Looping simples para repetir 5 vezes
        while (contador <= 4) {

            // Escolherá uma questão aleatória entres as fáceis
            int QuestaoFacil = Aleatorizar.getQuestaoAleatoria("Facil");
            // Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();

            // Mostrará uma Interface, pegando os dados da classe "Questões"
            // Neste Acionamento de "getQuestão", retornará uma questão aleatória fácil em forma de interface (JOptionPane.showOptionDialog)
            int questao = getQuestão(
                Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoFacil)
                + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoFacil),
                "Dificuldade: Fácil", questoes.getDica(QuestaoFacil));
            
            
            //No acionamento de "getAlternativas()", será mostrado toda a interface da questão pronta para receber a resposta do usuário
            //Nota-se que os argumentos colocados foram:
            //1. as 4 alternativas (aleatorizadas), 2. a contagem da questão (para mostrar na tela se é a 1° ou 5° questao)
            //3. o texto da pergunta em si, 4. o titulo mostrado na interface
            questao = getAlternativas(
                    questoes.getAlternativaIsolada(QuestaoFacil, Aleatorizar.getAlternativaAleatoria(0)),
                    questoes.getAlternativaIsolada(QuestaoFacil, Aleatorizar.getAlternativaAleatoria(1)),
                    questoes.getAlternativaIsolada(QuestaoFacil, Aleatorizar.getAlternativaAleatoria(2)),
                    questoes.getAlternativaIsolada(QuestaoFacil, Aleatorizar.getAlternativaAleatoria(3)),
                     Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoFacil),
                    "Dificuldade: Fácil");

                
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo, pelo método "validarResposta()"
            //Nota-se que os argumentos colocados foram:
            //1. o texto da resposta correta
            //2. o texto da resposta escolhida pelo usuário
            //Porém para selecionar 1. e 2., foi necessário utilizar vários outros métodos, isso pois as alternativas estão aleatórias, exige uma complexidade maior para selecionar o texto correto e selecionado pelo usuário
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoFacil),
            questoes.getAlternativaIsolada(QuestaoFacil, Aleatorizar.getAlternativaAleatoria(questao)));
            
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador++;
        }

        
        
        // Mostrará 5 questões com o titulo: "Dificuldade: Média"
        // Looping simples para repetir 5 vezes
        while (contador <= 9) {

            // Escolherá uma questão aleatória entres as Médias
            int QuestaoMedia = Aleatorizar.getQuestaoAleatoria("Medio");
            // Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();

            // Mostrará uma Interface, pegando os dados da classe "Questões"
            // Neste Acionamento de "getQuestão", retornará uma questão aleatória fácil em forma de interface (JOptionPane.showOptionDialog)
            int questao = getQuestão(
                Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoMedia)
                + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoMedia),
                "Dificuldade: Média", questoes.getDica(QuestaoMedia));
            
            
            //No acionamento de "getAlternativas()", será mostrado toda a interface da questão pronta para receber a resposta do usuário
            //Nota-se que os argumentos colocados foram:
            //1. as 4 alternativas (aleatorizadas), 2. a contagem da questão (para mostrar na tela se é a 1° ou 5° questao)
            //3. o texto da pergunta em si, 4. o titulo mostrado na interface
            questao = getAlternativas(
                    questoes.getAlternativaIsolada(QuestaoMedia, Aleatorizar.getAlternativaAleatoria(0)),
                    questoes.getAlternativaIsolada(QuestaoMedia, Aleatorizar.getAlternativaAleatoria(1)),
                    questoes.getAlternativaIsolada(QuestaoMedia, Aleatorizar.getAlternativaAleatoria(2)),
                    questoes.getAlternativaIsolada(QuestaoMedia, Aleatorizar.getAlternativaAleatoria(3)),
                    Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoMedia),
                    "Dificuldade: Média");

            
            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo, pelo método "validarResposta()"
            //Nota-se que os argumentos colocados foram:
            //1. o texto da resposta correta
            //2. o texto da resposta escolhida pelo usuário
            //Porém para selecionar 1. e 2., foi necessário utilizar vários outros métodos, isso pois as alternativas estão aleatórias, exige uma complexidade maior para selecionar o texto correto e selecionado pelo usuário
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoMedia),
            questoes.getAlternativaIsolada(QuestaoMedia, Aleatorizar.getAlternativaAleatoria(questao)));
            
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador++;
        }

        
        
        // Mostrará 5 questões com o titulo: "Dificuldade: Dificil"
        // Looping simples para repetir 5 vezes
        while (contador <= 14) {

            // Escolherá uma questão aleatória entres as Dificeis
            int QuestaoDificil = Aleatorizar.getQuestaoAleatoria("Dificil");
            // Deixara as Alternativas aleatórias
            Aleatorizar.setAlternativasAleatorias();

            // Mostrará uma Interface, pegando os dados da classe "Questões"
            // Neste Acionamento de "getQuestão", retornará uma questão aleatória fácil em forma de interface (JOptionPane.showOptionDialog)
            int questao = getQuestão(
                Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoDificil)
                + Aleatorizar.getTodasAlternativasEscolhidas(QuestaoDificil),
                "Dificuldade: Dificil", questoes.getDica(QuestaoDificil));
            
            
            //No acionamento de "getAlternativas()", será mostrado toda a interface da questão pronta para receber a resposta do usuário
            //Nota-se que os argumentos colocados foram:
            //1. as 4 alternativas (aleatorizadas), 2. a contagem da questão (para mostrar na tela se é a 1° ou 5° questao)
            //3. o texto da pergunta em si, 4. o titulo mostrado na interface
            questao = getAlternativas(
                    questoes.getAlternativaIsolada(QuestaoDificil, Aleatorizar.getAlternativaAleatoria(0)),
                    questoes.getAlternativaIsolada(QuestaoDificil, Aleatorizar.getAlternativaAleatoria(1)),
                    questoes.getAlternativaIsolada(QuestaoDificil, Aleatorizar.getAlternativaAleatoria(2)),
                    questoes.getAlternativaIsolada(QuestaoDificil, Aleatorizar.getAlternativaAleatoria(3)),
                    Aleatorizar.getContagemQuestoesRodadas() + questoes.getPergunta(QuestaoDificil),
                    "Dificuldade: Dificil");
            

            // Aqui estamos analisando se o usuario acertou a questão, e atualizando a pontuação do mesmo, pelo método "validarResposta()"
            //Nota-se que os argumentos colocados foram:
            //1. o texto da resposta correta
            //2. o texto da resposta escolhida pelo usuário
            //Porém para selecionar 1. e 2., foi necessário utilizar vários outros métodos, isso pois as alternativas estão aleatórias, exige uma complexidade maior para selecionar o texto correto e selecionado pelo usuário
            ResultadoCorrecao = validador.validarResposta(pontuador.getSolucaoIndividual(QuestaoDificil),
            questoes.getAlternativaIsolada(QuestaoDificil, Aleatorizar.getAlternativaAleatoria(questao)));
            
            pontuador.setPontuaçãoUsuario(ResultadoCorrecao);
            Aleatorizar.setContagemQuestoesRodadas(1);
            Aleatorizar.setAlternativasAleatorias("Resetar");
            contador++;
        }
    }

    
    // Mensagem de despedida dizendo a quantidade de acertos, com interface simples.
    public void Despedida() {
        JOptionPane.showMessageDialog(null,
                "                                                     "+
                "Parabéns " + nome +
                ", por chegar ao fim deste quiz! \n"+
                "                                                     "+
                "Você acertou um total de "
                + pontuador.getPontuaçãoUsuario() + "/15 perguntas.\n"
                + "Temos um total de 30 perguntas, e elas são aleatórias, jogue novamente para uma nova experiência!",
                null, JOptionPane.PLAIN_MESSAGE);
        
    }
    
    
    
    
    // O Método abaixo, é para mostrar a janela gráfica em que o usuário verá a questão e decidirá se irá gastar uma dica ou se irá responder a questão
    public int getQuestão(String pergunta, String titulo, String dica) {
        int questao;
        String[] escolhas = { "Responder a Questão", "Gastar uma dica" };

        // Cria uma imagem transparente, pois substituindo o icone padrão por esse
        // transparente a interface não mostrará icone algum.
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        ImageIcon icon = new ImageIcon(image);

        questao = JOptionPane.showOptionDialog(
                null, // componente pai
                pergunta, // pergunta
                titulo, // título da janela
                JOptionPane.YES_NO_OPTION, // tipo da janela
                JOptionPane.QUESTION_MESSAGE, // tipo da mensagem
                icon, // aponta para o icone transparente
                escolhas, // opções
                escolhas[0] // opção selecionada por padrão
        );

        if (questao == 1) {
            if (numDica < 3) {
                JOptionPane.showMessageDialog(
                        null, // nao tem componente pai
                        dica + "\nVocê já gastou " + (numDica + 1) + "/3 dicas.", // mensagem de texto na caixa de
                                                                                  // dialogo
                        "DICA", // titulo
                        JOptionPane.PLAIN_MESSAGE // tira o icone
                );
                System.out.println(numDica);
                numDica++;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Acabaram suas dicas!",
                        "DICAS ESGOTADAS",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        return 0;

    }

    
    
    // O Método a seguir, tem como objetivo mostrar a janela gráfica em que o usuário visualizará a questão com as alternativas e decidirá qual a alternativa correta e enviará a sua resposta
    public int getAlternativas(String a, String b, String c, String d, String questao, String titulo) {

        // Cria um painel para os botões de opção e define o layout como BoxLayout com
        // orientação vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Os Metódos nesse bloco são para mostrar o texto da pergunta da nossa questão

        // Aqui Separará a minha questão a cada \n, e armazenará o resultado
        // Essa separação é necessária pois o JLabel não separa a linha com \n, ele
        // descarta esta quebra de linha
        String[] linhas = questao.split("\n");

        //
        for (String linha : linhas) {
            JLabel label = new JLabel(linha);
            panel.add(label);
        }

        // Cria quatro botões de opção
        JRadioButton option1 = new JRadioButton(a);
        JRadioButton option2 = new JRadioButton(b);
        JRadioButton option3 = new JRadioButton(c);
        JRadioButton option4 = new JRadioButton(d);

        // Cria um grupo de botões e adiciona os botões de opção ao grupo, é importante
        // pois quando o usuário clica em outro botão, o anterior é deselecionado
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        buttonGroup.add(option4);

        // Define o primeiro botão de opção como selecionado por padrão
        option1.setSelected(true);

        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);

        // Exibe um JOptionPane com os botões de opção e um botão "OK" para confirmar a
        // seleção
        int result = JOptionPane.showConfirmDialog(null, panel, titulo,
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Verifica qual botão de opção foi selecionado e exibe uma mensagem
        // correspondente
        if (result == JOptionPane.OK_OPTION) {
            if (option1.isSelected()) {
                option = 0;
            } else if (option2.isSelected()) {
                option = 1;
            } else if (option3.isSelected()) {
                option = 2;
            } else if (option4.isSelected()) {
                option = 3;
            }
        } else {
            System.out.println("Nenhuma opção selecionada");
        }

        return option;
    }


}