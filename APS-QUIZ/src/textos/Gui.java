package textos;

import javax.swing.JOptionPane;

public class Gui {
    // Classse criada para a estrturação da gui do projeto
    public int getGui (String pergunta, String titulo) {
        String[] escolhas = {"A", "B", "C", "D"};

        return 
        JOptionPane.showOptionDialog(
        null,  // componente pai
        pergunta,  // pergunta
        titulo,  // título da janela
        JOptionPane.YES_NO_OPTION,  // tipo da janela
        JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
        null,  // icone da janela
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