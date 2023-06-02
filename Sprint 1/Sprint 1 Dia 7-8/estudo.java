//Início
import java.util.*; //importando biblioteca util (* inclui tudo)
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*; // Para adicionar a biblioteca gráfica
import java.awt.*; // Para adicionar a biblioteca gráfica




public class estudo {
    public static void main (String[] args) {
        System.out.print ("Hello World!");


        //Importando bibliotecas
        Date horario = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(horario.toString());


        //Desafio descobrir a linguagem do SO
        Locale idioma = Locale.getDefault();
        System.out.println (idioma.getDisplayLanguage());
        System.out.println (idioma.getLanguage());
       
            // tamanho da tela
        Toolkit tamanhoTela = Toolkit.getDefaultToolkit();
        Dimension d = tamanhoTela.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + " X "+ d.height);


        // criando janela
        // exemplo de PUCRS


        int i;
        JFrame janela = new JFrame("Opa"); // título da janela
        janela.setBounds(50, 100, 400, 150); // Seta posição e tamanho, primeiro x, y, width e height
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout(); // Define o layout do container
        Container caixa = janela.getContentPane(); // Define o tamanho
        caixa.setLayout(flow); // Seta layout do container
        for (i=1; i<=6; i++)
        caixa.add(new JButton("Aperte " + i)); // Adiciona um botão
        janela.setVisible(true); // Exibe a janela


       


    }
}



