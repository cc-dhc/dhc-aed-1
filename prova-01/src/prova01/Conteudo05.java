package prova01;

import java.util.Scanner;

public class Conteudo05 {

}

class C05E01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("X: ");
    double x = sc.nextDouble();

    sc.close();

    double fx = Math.pow(x, 3) + 4 * x + 10;

    System.out.printf("f(x) = %.2f\n", fx);
  }
}

class C05E02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Raio: ");
    double raio = sc.nextDouble();

    sc.close();

    System.out.printf(
      """
      Área = %.2f
      Volume = %.2f    
      """,
      4 * Math.PI * Math.pow(raio, 2),
      4 / 3f * Math.PI * Math.pow(raio, 3)
    );
  }
}

class C05E03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Salário: ");
    double salario = sc.nextDouble();

    System.out.print("Número de Dependentes: ");
    int dependentes = sc.nextInt();

    sc.close();

    double liquido = salario - dependentes * 60;
    double imposto = liquido * 0.15;

    System.out.printf("Imposto de Renda: %.2f\n", imposto);
  }
}

class C05E04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\t\tPonto 1");

    System.out.print("X: ");
    double x1 = sc.nextDouble();

    System.out.print("Y: ");
    double y1 = sc.nextDouble();

    System.out.println("\t\tPonto 2");

    System.out.print("X: ");
    double x2 = sc.nextDouble();

    System.out.print("Y: ");
    double y2 = sc.nextDouble();

    sc.close();

    double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

    System.out.printf("Distância = %.2f\n", distancia);
  }
}

class C05E05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Temperatura em Celsius: ");
    double celsius = sc.nextDouble();

    sc.close();

    System.out.printf(
      """
      Kelvin = %.2f
      Fahrenheit = %.2f    
      """,
      celsius + 273,
      (celsius * 9 + 160) / 5f
    );
  }
}

class C05E06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("A: ");
    double a = sc.nextDouble();

    System.out.print("B: ");
    double b = sc.nextDouble();

    System.out.print("C: ");
    double c = sc.nextDouble();

    System.out.print("X: ");
    double x = sc.nextDouble();

    System.out.print("Y: ");
    double y = sc.nextDouble();

    sc.close();

    double distancia = (a * x + b * y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    System.out.printf("Distância = %.2f\n", distancia);
  }
}

class C05E07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("X: ");
    double x = sc.nextDouble();

    sc.close();

    double fx = Math.sqrt(Math.pow(x/4f + 1, 2) + x/5f);

    System.out.printf("f(x) = %.2f\n", fx);
  }
}

class C05E08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("S: ");
    double s = sc.nextDouble();

    System.out.print("Alfa: ");
    double alfa = sc.nextDouble();

    sc.close();

    double raio = Math.sqrt(s * 360 / (alfa * Math.PI));

    System.out.printf("Raio = %.2f\n", raio);
  }
}

class C05E09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nota 1: ");
    int nota1 = sc.nextInt();

    System.out.print("Nota 2: ");
    int nota2 = sc.nextInt();

    System.out.print("Nota 3: ");
    int nota3 = sc.nextInt();

    sc.close();
  
    double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10f; 
    
    System.out.printf("Média = %.2f\n", media);
  }
}

class C05E10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Número de 5 digitos: ");
    int numero = sc.nextInt();

    sc.close();

    System.out.printf(
      """
      Impressão =
      %d
      %d
      %d
      %d
      %d
      """,
      numero / 10000,
      numero / 1000 % 10,
      numero / 100 % 10,
      numero / 10 % 10,
      numero % 10
    );
  }
}

class C05E11 {
  public static void main(String[] args) {
    
  }
}