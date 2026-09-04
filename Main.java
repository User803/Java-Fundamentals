import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
//        System.out.println("Hello, Java!");

//        Scanner input = new Scanner(System.in);
//        int firstNum = input.nextInt();
//        int secondNum = input.nextInt();
//        input.close();
//        System.out.println(firstNum + secondNum);

        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int height = input.nextInt();
        input.close();
        System.out.println(width * height);
    }
}
