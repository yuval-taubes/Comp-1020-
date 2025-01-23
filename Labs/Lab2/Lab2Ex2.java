public class Lab2Ex2 {
  public static void main(String[] args) {
    int[] array1 = { 3, 9, 7 }, array2 = { 15, 3, 4, 7 }, array3 = { 10, 8, 6, 4, 5, 15};
    int[] arrayTemp = new int[array1.length + array2.length];
    int[] arrayFinal = new int[arrayTemp.length + array3.length];
    
    for (int i = 0; i < arrayFinal.length; i++) {
      System.out.println(arrayFinal[i]);
    }

    concatenateArrays(array1, array2, arrayTemp);
    concatenateArrays(arrayTemp, array3, arrayFinal);

    for (int i = 0; i < arrayFinal.length; i++) {
      System.out.println(arrayFinal[i]);
    }
		
    System.out.println("End of processing.");
  }
	
  public static void concatenateArrays(int[] a1, int[] a2, int[] a3) {
    // Copy elements from a1 into a3
    for (int i = 0; i < a1.length; i++) {
      a3[i] = a1[i];
    }
    // Copy elements from a2 into a3, starting after the end of a1
    for (int i = 0; i < a2.length; i++) {
      a3[a1.length + i] = a2[i];
    }
  }
}
