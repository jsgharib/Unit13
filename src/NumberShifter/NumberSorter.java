package NumberShifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
    

     public static int getNumDigits(int number) {
         int count = 0;
         while(number > 0){
             count++;
             number /= 10;
         }
         return count;
    }

    public static int[] getSortedDigitArray(int number) {
        int input = number;
         int[] sorted = new int[getNumDigits(number)];
         for(int i = 0; i < getNumDigits(number); i++){
             sorted[i] = input%10;
             input /= 10;
         }
         Arrays.sort(sorted);
         return sorted;
    }
}
