public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
      // bubble
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
          }
      
          int result = 1; // para no multiplicar por 0
          for (int i = 0; i < sub_size; i++) {
            result *= numbers[i];
          }

        return result;
}  
      }
    
