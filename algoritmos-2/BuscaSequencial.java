import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] vetor = {7, 3, 4, 5, 6, 2};
    System.out.print("Valor que quer achar: ");
    int valorSelecionado = leitor.nextInt();
    int posicao = buscaSequencial(vetor, valorSelecionado);
    if (posicao >= 0) {
      System.out.println("Valor encontrado na posição: " + posicao);
    }
    else {
      System.out.println("Valor não encontrado.");
    }
  }


  public static int buscaSequencial(int[] vetor, int valorProcurado) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorProcurado) {
        return i;
      }
    }
    return -1;
  }
}