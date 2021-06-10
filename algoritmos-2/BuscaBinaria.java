import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] vetor = {7, 3, 4, 5, 6, 2};
    Arrays.sort(vetor);
    
    System.out.print("Valor: ");
    int valorSelecionado = leitor.nextInt();
    int posicao = buscaBinaria(vetor, valorSelecionado);
    if (posicao >= 0) {
      System.out.println("Valor encontrado na posição: " + posicao);
    }
    else {
      System.out.println("Valor não encontrado.");
    }
  }

  public static int buscaBinaria(int[] vetor, int valorProcurado) {
    int inicio = 0;
    int fim = vetor.length - 1;
    int meio;
    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (vetor[meio] == valorProcurado) {
        return meio;
      }
      if (valorProcurado < vetor[meio]) {
        fim = meio - 1;
      }
      else {
        inicio = meio + 1;
      }
    }
    return -1;
  }
}