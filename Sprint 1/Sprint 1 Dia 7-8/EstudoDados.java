import java.util.Scanner;


public class EstudoDados{
    public static void main(String[]args){


        Scanner teclado = new Scanner(System.in);
       
        int n1, n2, r, x;
        boolean y;
        n1 = 14;
        n2 = 18;
        r = (n1>n2)?n1:n2; // praticamente um if se o que tiver entre Parêntese for True então o valor de r será n1, se for False será n2
        x = (n1<n2)?n1+n2:n1-n2; // é possível usar operações no bloco
        y = (n1<n2 && r>n2 )?true:false;
        System.out.println(y);
        System.out.println(r);
        System.out.println(x);


       
        String nome = "Gustavo";
        float nota = 8.55555555f;
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // (%.2s  assim o valor da variável nota vai ser colocado no "%.2s, o "2" significa 2 zeros após o ponto, "\n" para quebrar linha)
        System.out.format("A nota de %s é %.4s \n", nome, nota);


        //lendo notas
        System.out.println("Digite seu nome: ");
        String nome2 = teclado.nextLine();
        System.out.println(nome2);
       
        // java aceita HTML


        // escolhas


        int pernas = 7;
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
            case 2:
                tipo = "Bípede";
            case 4:
                tipo = "Quadrúpede";
            case 6,8:
                tipo = "Aranha";
            default:
                tipo = "ET";
        }
        System.out.println(tipo);


        // repetição
        int cont = 0;
        while (cont<10){
            cont++;
            // continue, break |  do { } while {} | for (int = cc; cc<=3; cc++)
            // enquanto, então, passos.
            // estruturas podem ser somadas
        }
        System.out.println(cont);

    }
}

