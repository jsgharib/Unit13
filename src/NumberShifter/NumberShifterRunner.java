package NumberShifter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner {

    public static void main(String args[]) throws IOException {
        NumberShifter shifty = new NumberShifter();
        
        int[] array = shifty.makeLucky7Array(30);
         System.out.println(Arrays.toString(array));
         shifty.shiftEm(array);
         System.out.println(Arrays.toString(array));
    }
}
