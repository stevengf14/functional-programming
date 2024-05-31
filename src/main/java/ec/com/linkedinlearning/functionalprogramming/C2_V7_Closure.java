package ec.com.linkedinlearning.functionalprogramming;

/**
 *
 * @author Steve
 */
public class C2_V7_Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Steven";
            return () -> "Hello " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }

}
