import java.util.Scanner;
import java.util.InputMismatchException;

class ArithmeticEx2 {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            int index, value;
            String name;

            try {
                System.out.print("Enter Name : ");
                name = myScanner.next();
                System.out.print("Enter Index : ");
                index = myScanner.nextInt();
                System.out.print("Enter Value : ");
                String temp = myScanner.next();
                value = Integer.parseInt(temp);
                int data[];
                data = new int[5];
                data[index] = value;
                System.out.println(data[index]);
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer for the Index");
                System.out.println("Error class " + e);
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer for the value");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter a value less than 5 for the index");
            } catch (Exception e) {
                System.out.println("Some unknown error has occured");
            } finally {
                // cleaning up operations
                // if there are no errors this will executed
                // this will also be executed even if there
                // are errors
                System.out.println("Finishing up");
            }
        }
        System.out.println("End of program");

    }
}