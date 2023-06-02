import java.util.Scanner;



class Exercicios {
  public static void main(String[] args) {
    Scanner ent = new Scanner (System.in);
    Scanner letra = new Scanner (System.in);
    Scanner sala = new Scanner (System.in);
    //Atividade 1
    System.out.println("exercicio 1");
    int n1,n2;
    System.out.println("Digite o 1° número:");
    n1 = ent.nextInt();
    System.out.println("Digite o 2° número:");
    n2 = ent.nextInt();
    if (n1 > n2)
      System.out.println("o número maior é: " + n1);
    else
      System.out.println("o número maior é: " + n2);

    //Atividade 2
    System.out.println("exercicio 2");
    int p1;
    System.out.println("digite um número.");
    p1 = ent.nextInt();
    if ( p1 >0)
      System.out.println("seu número é positivo.");
    else
      System.out.println("seu número é negativo. ");

    //Atividade 3
    System.out.println("exercicio 3");
    char sexo,m,f;
    m = 'm';
    f = 'f';
    System.out.println("digite seu sexo(f/m)");
    sexo = letra.next().charAt(0);
    if (sexo == m)
     System.out.println("masculino");
    else
    if (sexo == f)
      System.out.println("femenino");
    else 
      System.out.println("sexo invalido");

    //Atividade 4

    System.out.println("exercicio 4");
    int no1,no2,med;
    System.out.println("digite sua primeira nota");
    no1 = ent.nextInt();
    System.out.println("digite sua segunda nota");
    no2 = ent.nextInt();
    med = (no1 + no2)/2;
    System.out.println("sua media é: " + med);
    if (med >= 7 )
      System.out.println("aprovado");
    else
      if (med <7)
        System.out.println("reprovado");
      else
        if (med == 10)
          System.out.println("aprovado com distinção");

    //atividade 5
    System.out.println("exercicio 5");
    int n11,n22,n33;
    System.out.println("digite 3 numeros");
    n11 = ent.nextInt();
    n22 = ent.nextInt();
    n33 = ent.nextInt();
    if (n11 > n22) {
      if (n11 > n33) 
        System.out.println("o numero maior é " + n11);
      }
    else
      if (n22 > n33)
        System.out.println("o numero maior é " + n22);
      else 
        System.out.println("o numero maior é " + n33);

    //atividade 6
    System.out.println("exercicio 6");
    int n12,n23,n34;
    System.out.println("digite 3 numeros");
    n12 = ent.nextInt();
    n23 = ent.nextInt();
    n34 = ent.nextInt();
    if (n12 > n23) {
      if (n12 > n34) 
        System.out.println("o numero maior é " + n12);
      }
    else
      if (n23 > n34)
        System.out.println("o numero maior é " + n23);
      else 
        System.out.println("o numero maior é " + n34);
    
    if (n12 < n23) {
      if (n12 < n34) 
        System.out.println("o numero menor é " + n12);
      }
    else
      if (n23 < n34)
        System.out.println("o numero menor é " + n23);
      else 
        System.out.println("o numero menor é " + n34);
      
    // atividade 7
     System.out.println("exercicio 7");
     System.out.println("digite 3 numeros");
    int d1,d2,d3;
    d1 = ent.nextInt();
    d2 = ent.nextInt();
    d3 = ent.nextInt();
    if (d1 == d2 & d1 ==d3)
      System.out.println( d1 + " "+ d2 + " " +d3);
    else if (d1 >= d2 & d2 >= d3)
      System.out.println( d1 + " " + d2 + " "+ d3);
    else if (d1 >= d3 & d3 >= d2)
      System.out.println( d1 + " "+ d3 + " " +d2);
    else if (d2 >= d1 & d1 >= d3)
      System.out.println( d2 + " "+ d1 + " "+ d3);
    else if ( d2 >= d3 & d3 >= d1)
      System.out.println( d2 + " "+ d3 + " "+ d1);
    else if ( d3 >= d1 & d1 >=d2)
      System.out.println( d3 +" "+ d1 + " " +d2);
    else 
      System.out.println( d3 +" "+ d2 + " "+ d1);

    //atividade 8
    System.out.println("exercicio 8");
    double sa,sal,au;
    System.out.println("digite o salario");
    sa = sala.nextDouble();
    if (sa <= 280) {
      au = sa * 0.2;
      sal = sa + au;
      System.out.println("salario antes = "+sa);
      System.out.println("aumento de 20%");
      System.out.println("valor do aumento "+ au);
      System.out.println("novo salario " +sal);
    }
    else if (sa > 280 & sa<=700){
      au = sa * 0.15;
      sal = sa + au;
      System.out.println("salario antes = "+sa);
      System.out.println("aumento de 15%");
      System.out.println("valor do aumento "+ au);
      System.out.println("novo salario " +sal);
    }
    else if (sa >700 & sa<=1500) {
      au = sa * 0.1;
      sal = sa + au;
      System.out.println("salario antes = "+sa);
      System.out.println("aumento de 10%");
      System.out.println("valor do aumento "+ au);
      System.out.println("novo salario " +sal);
    }
    else {
      au = sa * 0.05;
      sal = sa + au;
      System.out.println("salario antes = "+sa);
      System.out.println("aumento de 5%");
      System.out.println("valor do aumento "+ au);
      System.out.println("novo salario " +sal);
    }
    // atividade 9
    System.out.println("exercicio 9");
    double nota1,nota2,medi;
    System.out.println("digite a primeira nota");
    nota1 = sala.nextDouble();
    nota2 = sala.nextDouble();
    medi = (nota1 + nota2)/2;
    if (medi >=9 & medi<=10)
      System.out.println("nota A");
    else if (medi >=7.5 & medi<9 )
      System.out.println("nota B");
    else if (medi >=6 & medi <7.5)
      System.out.println("nota C");
    else if (medi >=4 & medi <6)
      System.out.println("nota D");
    else 
      System.out.println("nota E");

    //atividade 10
    System.out.println("exercicio 10");
   int val,ta1,ta5,ta10,ta50,ta100;
    System.out.println("digite o valor que voce quer sacar");
    ta1 = 0;
    ta5 = 0;
    ta10 =0;
    ta50 = 0;
    ta100 = 0;
    val = ent.nextInt();
    if ((val < 10) || (val > 600))
      System.out.println("Valor inválido");
    else {
      while (val > 0) {
        if (val >= 100) {
          ta100++;
          val = val - 100;
        }
        else if (val >= 50) {
          ta50++;
           val=val - 50;
        }
        else if (val >= 10) {
          ta10++;
          val=val -10;
        }
       else if (val >= 5) { 
         ta5++;
         val=val - 5;
         }
        else {
          ta1++;
          val--;
        
        }
    }
    System.out.println(ta1 + " de R$1.00");
    System.out.println(ta5 + " de R$5,00");
    System.out.println(ta10+ " de R$10,00");
    System.out.println (ta50 + " de R$50.00");
    System.out.println(ta100 + " de R$100,00");
      }
  }
}
