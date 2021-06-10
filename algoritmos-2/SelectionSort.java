import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] vetor = {32, 17, 51, 8, 23};
    System.out.printf("Início -> %s\n", Arrays.toString(vetor));
    selectionSort(vetor);
    System.out.printf("Fim -> %s\n", Arrays.toString(vetor));
  }

  public static void selectionSort(int[] vetor) {
    for (int faseDeOrdenacao = 0; faseDeOrdenacao < vetor.length; faseDeOrdenacao++) {
      int menorElemento = faseDeOrdenacao;
      for (int elemento = faseDeOrdenacao + 1; elemento < vetor.length; elemento++) {
        if (vetor[elemento] < vetor[menorElemento]) {
          menorElemento = elemento;
        }
      }
      int auxiliar = vetor[faseDeOrdenacao];
      vetor[faseDeOrdenacao] = vetor[menorElemento];
      vetor[menorElemento] = auxiliar;
      System.out.printf("Iteração %d -> %s \n", faseDeOrdenacao, Arrays.toString(vetor));
    }
  }
}