import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int vetor[] = { 31, 10, 29, 42, 51, 19, 83, 7 };
    sort(vetor, 0, vetor.length - 1);
    System.out.printf("Ordenado %s\n", Arrays.toString(vetor));
  }

  public static void sort(int vetor[], int inicio, int fim) {
    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      sort(primeiroSubvetor, inicio, meio);
      sort(segundoSubvetor, meio + 1, fim);
      merge(vetor, inicio, meio, fim);
    }
  }

  public static void merge(int vetor[], int inicio, int meio, int fim) {
    int i, esquerda, direita;
    int aux[] = new int[vetor.length];
    for (i = inicio; i <= fim; i++) {
      aux[i] = vetor[i];
    }
    esquerda = inicio;
    direita = meio + 1;
    i = inicio;
    while (esquerda <= meio && direita <= fim) {
      if (aux[esquerda] <= aux[direita]) {
        vetor[i++] = aux[esquerda++];
      }
      else {
        vetor[i++] = aux[direita++];
      }
    }
    while (esquerda <= meio) {
      vetor[i++] = aux[esquerda++];
    }
    while (direita <= fim) {
      vetor[i++] = aux[direita++];
    }
  }
}