package library;

import java.util.Arrays;

public class ArrayUtils {

  public static void printIntArray(int[] array) {
    Arrays.stream(array).forEach((value) -> {
      System.out.print(value + " ");
    });
    System.out.println();
  }

  public static void printInt2DArray(int[][] array) {
    Arrays.stream(array).forEach((row) -> {
      Arrays.stream(row).forEach((value) -> {
        System.out.print(value + " ");
      });
      System.out.println();
    });
    System.out.println();
  }

  public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  /**
   * build an integer array from provided string containing space separated numbers
   * 
   * @return
   */
  public static int[] getIntegerArrayFromString(String string) {
    String[] numbers = string.split(" ");
    int[] numArray = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      numArray[i] = Integer.parseInt(numbers[i]);
    }
    return numArray;
  }
}
