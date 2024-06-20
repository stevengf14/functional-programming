package ec.com.linkedinlearning.functionalprogramming;

/**
 *
 * @author Steve
 */
public class C4_Challenge {

    static int fibonacci(int x) {
        if (x <= 2) {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);

    }

    public static void main(String[] args) {
        System.out.println("The 5th fibonacci number is: " + fibonacci(5));
        System.out.println("The 10th fibonacci number is: " + fibonacci(10));
        System.out.println("The 17th fibonacci number is: " + fibonacci(17));
    }
}
