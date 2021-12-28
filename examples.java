import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class examples {

	public static void main(String[] args) {
		int[] numbers = {24, 32, 89, 77 };
		int sum = 0;
		for(int i : numbers) {
				sum = sum+ numbers[i];
				
		}
		System.out.println("The sum of all the numbers is:" + sum);
		
		 double[ ] exampleArray = {1,5,6,5,4,1};

         double maximum = exampleArray[0];

         int index = 0;

         for (int i = 1; i<exampleArray.length; i++){

              if (exampleArray[ i ] > maximum) {

                   maximum = exampleArray[ i ];

                   index = i;

              }

         }

         System.out.println(index);
         
        
	}
}