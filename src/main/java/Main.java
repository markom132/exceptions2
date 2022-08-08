import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
   static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will create an array, please enter arrays lenght");
        int n = scanner.nextInt();
        System.out.println("Enter array values");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Insert value on index " + (i) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter a index of element you want to see");

        //with try-catch we can try our code and if everything is legit try block is executed, if it's not catch block will 'catch' exception and execute that block of code :)
        try {
            int index =  scanner.nextInt();
            System.out.println("Value of selected index is: " + array[index]);
//this catch block can catch two exceptions, when we enter non-existent index, also if we enter text instead of number for index search
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("Entered index don't exists in this array");
            logger.log(Level.SEVERE, String.valueOf(e));
        }

    }
}
