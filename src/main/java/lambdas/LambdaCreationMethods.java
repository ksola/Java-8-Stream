package lambdas;

import java.util.function.Function;

public class LambdaCreationMethods {

    public static void main(String[] args) {
        
        // creation of lambdas
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }; 
        
        Runnable run2 = () -> {System.out.println("Hello world");};
        
        Runnable run3 = () -> System.out.println("Hello world");
        
        
        
        Function<String, String> function = new Function<String, String>() {

            @Override
            public String apply(String t) {
                return "Hello " + t;
            }
        };
        displayFunction(function);
        
        
        Function<String, String> function2 = (String input) -> {
            return "Hello " + input;
        }; // with explicit type e.g. String and return
        displayFunction(function2);
        
        Function<String, String> function3 = (input) -> {
            return "Hello " + input;
        }; // without explicit type
        displayFunction(function3);
        
        Function<String, String> function4 = input -> {
            return "Hello " + input; 
        }; // without brackets () in argument
        displayFunction(function4);
        displayFunction(input -> {
            return "Hello " + input; 
        });
        
        Function<String, String> function5 = input -> "Hello " + input; // lambda without return type
        displayFunction(function5);
        displayFunction(input -> "Hello " + input);
    }
    
    private static void displayFunction(Function<String, String> toDisplay) {
        String inputParameter = "Krystian";
        System.out.println(toDisplay.apply(inputParameter));
    }
}

