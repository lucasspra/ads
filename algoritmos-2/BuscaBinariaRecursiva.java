public class BuscaBinariaRecursiva {
  public static void main(String[] args) {
    int[] vetor = { 3, 7, 8, 11, 14, 18, 21, 25 };
    int posicao = buscaBinaria(39, vetor, 0, vetor.length - 1);
    System.out.println("Posicao: " + posicao);
  }

  public static int buscaBinaria(int dadoBuscado, int vetor[], int inicio, int fim) {
    if (inicio > fim)
      return -1;
    int meio = (inicio + fim) / 2;
    if (dadoBuscado == vetor[meio])
      return meio;
    if (dadoBuscado < vetor[meio])
      return buscaBinaria(dadoBuscado, vetor, inicio, meio - 1);
    else
      return buscaBinaria(dadoBuscado, vetor, meio + 1, fim);
  }
}