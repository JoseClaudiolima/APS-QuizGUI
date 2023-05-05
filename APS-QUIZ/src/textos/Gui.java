package textos;

import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class Gui {
    private int option;
    private int numDica;

    // Classse criada para a estrturação da gui do projeto
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
                        "Acabaram suas dicas!!!",
                        "DICAS ESGOTADAS",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        return 0;

    }

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
