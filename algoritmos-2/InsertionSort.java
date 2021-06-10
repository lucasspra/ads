import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int[] vector = {32, 17, 51, 8, 23};
    System.out.printf("Start -> %s\n", Arrays.toString(vector));
    insertionSort(vector);
    System.out.printf("End -> %s\n", Arrays.toString(vector));
  }

  public static void insertionSort(int[] vector) {
    for (int index = 1; index < vector.length; index++) {
      int currentIndex = vector[index];
      for (int iterationIndex = index - 1; iterationIndex >= 0 && vector[iterationIndex] > currentIndex; iterationIndex--) {  
        vector[iterationIndex + 1] = vector[iterationIndex];
        vector[iterationIndex] = currentIndex;      
      }
      System.out.printf("Iteration of number %d -> %s \n", currentIndex, Arrays.toString(vector));
    }
  }
}