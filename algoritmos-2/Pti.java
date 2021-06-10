import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite o tamanho do vetor desejado: ");
    int tamanho = leitor.nextInt();
    int novoVetor[] = new int[tamanho];
    preencheVetor(tamanho, novoVetor);
    int diferenca = maiorDiferenca(novoVetor);
    System.out.println("\nA maior diferença entre 2 elementos é de " + diferenca);
    boolean vetorEmOrdem = emOrdem(novoVetor, novoVetor.length);
    System.out.println("\nO vetor está em ordem crescente? R: " + vetorEmOrdem);
  }

  public static void preencheVetor(int tamanho, int[] vetor) {
    System.out.print("\n");
    for(int i = 0; i < tamanho; i++) {
      Scanner leitor = new Scanner(System.in);
      System.out.print("Digite um número para o novo item do vetor -> ");
      vetor[i] = leitor.nextInt();
    }
  }

  public static int maiorDiferenca(int[] vetor) {
    int[] vetorOrdenado = vetor.clone();
    Arrays.sort(vetorOrdenado);
    int maiorNumero = vetorOrdenado[(vetorOrdenado.length - 1)];
    int menorNumero = vetorOrdenado[0];
    int diferencaValores = (maiorNumero - menorNumero);
    return diferencaValores;
  }

  public static boolean emOrdem(int[] vetor, int tamanho) {
        if (tamanho == 0 || tamanho == 1) return true;
        for (int i = 1; i < tamanho; i++) {
          if (vetor[i - 1] > vetor[i]) return false;}
        return true;
  }
}