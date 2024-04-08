package prova01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conteudo04 {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}

class C04E01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Primero nome: ");
    String primeiroNome = sc.nextLine();
  
    System.out.print("Segundo nome: ");
    String segundoNome = sc.nextLine();
    
    System.out.print("Primero nome: ");
    String sobrenome = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();
  
    sc.close();

    System.out.printf("%s, %s %s\n", sobrenome, primeiroNome, segundoNome);
    System.out.printf("Idade: %d anos.", idade);
  }
}

class C04E02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = sc.nextLine();
  
    System.out.print("CPF: ");
    String cpf = sc.nextLine();
    
    System.out.print("Identidade: ");
    String identidade = sc.nextLine();

    System.out.print("Título de eleitor: ");
    String tituloEleitor = sc.nextLine();

    System.out.print("Carteira de motorista: ");
    String carteiraMotorista = sc.nextLine();

    System.out.print("Nome da Empresa: ");
    String empresa = sc.nextLine();

    System.out.print("Salário: ");
    float salario = sc.nextFloat();

    sc.close();

    System.out.printf(
      """
      FICHA FUNCIONAL DE:\t\t%s
      
      Documentos:
      CPF:\t\t\t\t%s
      C.I.:\t\t\t\t%s
      Título de eleitor:\t\t%s
      Carteira de motorista:\t\t%s

      Empresa:\t\t\t%s
      Salário: R$\t\t\t%.2f
      """,
      nome,
      cpf,
      identidade,
      tituloEleitor,
      carteiraMotorista,
      empresa,
      salario
    );
  }
}

class C04E03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Valor 1: ");
    float valor1 = sc.nextFloat();
  
    System.out.print("Valor 2: ");
    float valor2 = sc.nextFloat();
    
    System.out.print("Valor 3: ");
    float valor3 = sc.nextFloat();

    System.out.print("Valor 4: ");
    float valor4 = sc.nextFloat();
    
    System.out.print("Valor 5: ");
    float valor5 = sc.nextFloat();
  
    sc.close();

    System.out.printf(
      """
      Quantidade de Poluente Emitido x Valor de Multa
      Até %.2f multa de R$ %.2f
      Entre %.2f e %.2f multa de R$ %.2f
      Acima de %.2f multa de R$ %.2f por poluente emitido  
      """,
      valor1,
      valor3,
      valor1,
      valor2,
      valor4,
      valor2,
      valor5
    );
  }
}

class C04E04 {
  public static void main(String[] args) {
    String primeiroNome = JOptionPane.showInputDialog(
      null,
      "Nome",
      "C04E04",
      JOptionPane.QUESTION_MESSAGE
    );

    String segundoNome = JOptionPane.showInputDialog(
      null,
      "Nome do meio",
      "C04E04",
      JOptionPane.QUESTION_MESSAGE
    );

    String sobrenome = JOptionPane.showInputDialog(
      null,
      "Sobrenome",
      "C04E04",
      JOptionPane.QUESTION_MESSAGE
    );

    String idadeStr = JOptionPane.showInputDialog(
      null,
      "Idade",
      "C04E04",
      JOptionPane.QUESTION_MESSAGE
    );

    String saida = String.format(
      """
      %s, %s %s
      Idade: %d anos.
      """,
      sobrenome,
      primeiroNome,
      segundoNome,
      Integer.parseInt(idadeStr)
    );

    JOptionPane.showMessageDialog(
      null,
      saida,
      idadeStr,
      JOptionPane.INFORMATION_MESSAGE
    );
  }
}

class C04E05 {
  public static void main(String[] args) {
    Scanner arquivo = new Scanner(
      C04E05.class.getResourceAsStream("C04E05.txt")
    );

    String nome = arquivo.nextLine();
    String cpf = arquivo.nextLine();
    String identidade = arquivo.nextLine();
    String tituloEleitor = arquivo.nextLine();
    String carteiraMotorista = arquivo.nextLine();
    String empresa = arquivo.nextLine();
    float salario = arquivo.nextFloat();

    arquivo.close();

    System.out.printf(
      """
      FICHA FUNCIONAL DE:\t\t%s
      
      Documentos:
      CPF:\t\t\t\t%s
      C.I.:\t\t\t\t%s
      Título de eleitor:\t\t%s
      Carteira de motorista:\t\t%s

      Empresa:\t\t\t%s
      Salário: R$\t\t\t%.2f
      """,
      nome,
      cpf,
      identidade,
      tituloEleitor,
      carteiraMotorista,
      empresa,
      salario
    );
  }
}