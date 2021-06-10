import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int vetorX[] = {29, 10, 36, 18, 83, 42, 8, 20};
    long ini = System.nanoTime();
    sort(vetorX, 0, vetorX.length - 1);
    long fim = System.nanoTime();
    long t = fim - ini;
    System.out.printf("Ordenado: %s Tempo: %dns\n", Arrays.toString(vetorX), t);
  }

  public static void sort(int[] vetorX, int inicio, int fim) {
    if (inicio < fim) {
      int pivot = divide(vetorX, inicio, fim);
      sort(vetorX, inicio, pivot - 1);
      sort(vetorX, pivot + 1, fim);
    }
  }

  public static int divide(int vetorX[], int inicio, int fim) {
    int pivot = vetorX[inicio];
    int postPivot = inicio;
    for (int i = inicio + 1; i <= fim; i++) {
      if (vetorX[i] < pivot) {
        vetorX[postPivot] = vetorX[i];
        vetorX[i] = vetorX[postPivot + 1];
        postPivot++;
      }
    }
    vetorX[postPivot] = pivot;
    return postPivot;
  }
}