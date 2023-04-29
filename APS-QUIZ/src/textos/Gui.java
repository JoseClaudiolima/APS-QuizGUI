package textos;

import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Gui {
    // Classse criada para a estrturação da gui do projeto
    public int getGui (String pergunta, String titulo) {
        String[] escolhas = {"A", "B", "C", "D"};
        
        // Cria uma imagem transparente, pois substituindo o icone padrão por esse transparente a interface não mostrará icone algum.
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        ImageIcon icon = new ImageIcon(image);
        
        return 
        JOptionPane.showOptionDialog(
        null,  // componente pai
        pergunta,  // pergunta
        titulo,  // título da janela
        JOptionPane.YES_NO_OPTION,  // tipo da janela
        JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
        icon,  // pegará o icone transparente
        escolhas,  // opções
        escolhas[0]  // opção selecionada por padrão
        );  


        /*
        Para criar um OptionDialog é preciso criar uma array, e o conteudo dessa array vai aparecer como as opções da caixa de dialogo.
        
        
         tipos de mensagem poder sem 
            JOptionPane.ERROR_MESSAGE: mensagem de erro;
            JOptionPane.INFORMATION_MESSAGE: mensagem informativa;
            JOptionPane.WARNING_MESSAGE: mensagem de alerta;
            JOptionPane.QUESTION_MESSAGE: mensagem de pergunta;
            JOptionPane.PLAIN_MESSAGE: mensagem sem ícone.

         tipos de janela podem ser
            JOptionPane.DEFAULT_OPTION: janela com botões "Ok" e "Cancelar";
            JOptionPane.YES_NO_OPTION: janela com botões "Sim" e "Não";
            JOptionPane.YES_NO_CANCEL_OPTION: janela com botões "Sim", "Não" e "Cancelar";
            JOptionPane.OK_CANCEL_OPTION: janela com botões "Ok" e "Cancelar".
         */
    }
}