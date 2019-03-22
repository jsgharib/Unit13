package NumberShifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter {

    public static int[] makeLucky7Array(int size) {
         int[] lucky7s = new int[size];
         for (int i =0; i < size; i++){
             lucky7s[i] = (int)(Math.random()*10);
         }
        return lucky7s;
    }

    public static void shiftEm(int[] array) {
        int front = 0;
        int fDigit = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 7){
                fDigit = array[front];
                array[front] = array[i];
                array[i]=fDigit;
                front++;
            }
        }
    }
}
