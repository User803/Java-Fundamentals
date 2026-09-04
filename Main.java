import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
//        System.out.println("Hello, Java!");

//        Specifier	 Meaning
//            %s	 string (any object — uses its toString)
//            %d	 decimal integer
//            %f	 floating point — defaults to 6 decimals
//            %.2f	 floating point, exactly 2 decimals
//            %5d	 integer right-aligned in 5 columns
//            %-10s	 string left-aligned in 10 columns
//            %n	 newline

//        Scanner input = new Scanner(System.in);
//        int firstNum = input.nextInt();
//        int secondNum = input.nextInt();
//        input.close();
//        System.out.println(firstNum + secondNum);

//        Scanner input = new Scanner(System.in);
//        int width = input.nextInt();
//        int height = input.nextInt();
//        input.close();
//        System.out.println(width * height);

//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
//        input.close();
//        System.out.println(sentence.toUpperCase());

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        input.close();
        System.out.println("Hi, " + name + "! You are " + age + " years old.");
    }
}
