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
        
        Runnable run2 = null;
        
        Runnable run3 = null;
        
        
        
        Function<String, String> function = new Function<String, String>() {

            @Override
            public String apply(String t) {
                return "Hello " + t;
            }
        };
        displayFunction(function);
        
        
        Function<String, String> function2 = null; // with explicit type e.g. String
        displayFunction(function2);
        
        Function<String, String> function3 = null; // without explicit type
        displayFunction(function3);
        
        Function<String, String> function4 = null; // without explicit type
        displayFunction(function4);
        
        Function<String, String> function5 = null; // lambda expression which have more than one line of code 
        displayFunction(function5);
        
        // method references
    }
    
    private static void displayFunction(Function<String, String> toDisplay) {
        String inputParameter = "Krystian";
        System.out.println(toDisplay.apply(inputParameter));
    }
}

