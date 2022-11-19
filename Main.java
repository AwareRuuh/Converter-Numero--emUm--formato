import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
    System.out.println("Insira um número positivo de três dígitos: ");
    String numUser = sc1.nextLine();
    // Faça a comparação do if do zero até o 9
    if (numUser.contains("0")) {
    System.out.print("P");
}
    if (numUser.contains("1")) {
      System.out.print("XRT");
    }
    if (numUser.contains("2")) {
      System.out.print("B");
    }
    if (numUser.contains("3")) {
      System.out.print("GWE");
    }
    if (numUser.contains("4")) {
      System.out.print("14370");
    }
    if (numUser.contains("5")) {
      System.out.print("D");
    }
    if (numUser.contains("6")) {
      System.out.print("QH");
    }
    if (numUser.contains("7")) {
      System.out.print("5478");
    }
    if (numUser.contains("8")) {
      System.out.print("H");
    }
    if (numUser.contains("9")) {
      System.out.print("FDE");
    }
    if (numUser.contains("A BCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%¨&*()_-+={}[]<>,.;:/?'")) {
      System.out.print("Favor inserir um valor válido");
    }
    }
  }