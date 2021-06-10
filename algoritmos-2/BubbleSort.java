import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] vetor = {32, 17, 51, 8, 23};
    System.out.printf("Início -> %s\n", Arrays.toString(vetor)); //printf = print formatado, %s é pra strings
    bubbleSort(vetor);
    System.out.printf("Fim -> %s\n", Arrays.toString(vetor));
    
  }

  public static void bubbleSort(int[] vetor) {
    for (int ordenacao = 0; ordenacao < vetor.length; ordenacao++) {
      for (int posicao = 0; posicao < vetor.length - 1; posicao++) {
        if (vetor[posicao] > vetor[posicao+1]) {
          int aux = vetor[posicao];
          vetor[posicao] = vetor[posicao+1];
          vetor[posicao+1] = aux;
        }
      }
      System.out.printf("Passagem %d -> %s \n", ordenacao, Arrays.toString(vetor)); //mostra oq acontece em cada passagem
    }
  }
}