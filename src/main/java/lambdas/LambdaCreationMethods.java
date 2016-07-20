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
        
        // with explicit type e.g. String and return
        Function<String, String> function2 = null;
        displayFunction(function2);
        
        // without explicit type
        Function<String, String> function3 = null;
        displayFunction(function3);
        
        // without brackets () in argument
        Function<String, String> function4 = null;
        displayFunction(function4);
        
        // lambda without return type
        Function<String, String> function5 = null; 
        displayFunction(function5);
    }
    
    private static void displayFunction(Function<String, String> toDisplay) {
        String inputParameter = "Krystian";
        System.out.println(toDisplay.apply(inputParameter));
    }
}

