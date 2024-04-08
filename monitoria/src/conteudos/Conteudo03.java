package conteudos;

import java.util.Scanner;

public class Conteudo03 {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
  }
}

class C03E01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe um número: ");
    long numero = teclado.nextLong();

    long fatorial = 1;

    for (long contador = 2; contador <= numero; contador++) {
      fatorial = fatorial * contador;
    }

    System.out.println("Fatorial = " + fatorial);

    teclado.close();
  }
}

class C03E02 {
  public static void main(String[] args) {
    long n1, n2, n3, soma;
    double media;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe um número: ");
    n1 = teclado.nextLong();

    System.out.print("Informe outro número: ");
    n2 = teclado.nextLong();
  
    System.out.print("Informe mais um número: ");
    n3 = teclado.nextLong();
  
    soma = n1 + n2 + n3;
    media = soma / 3.0;

    System.out.println("Média = " + media);

    teclado.close();
  }
}

class C03E03 {
  // baixar arquivo hipotenusa
}

class C03E04 {
  // planilha
}

class C03E05 {
  public static void main(String[] args) {
    int anoNasc, anoAtual, idade;
    String nome;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    nome = teclado.nextLine();
  
    
    System.out.print("Digite o ano em que você nasceu: ");
    anoNasc = teclado.nextInt();
  
    
    System.out.print("Digite o ano em que estamos: ");
    anoAtual = teclado.nextInt();
  
    idade = anoAtual - anoNasc;

    System.out.println(nome + ", você tem/terá " + idade + " anos em " + anoAtual);
  
    teclado.close();
  }
}