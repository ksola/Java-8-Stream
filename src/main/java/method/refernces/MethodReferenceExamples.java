package method.refernces;

import java.util.function.Function;

public class MethodReferenceExamples {

    
    public static void main(String[] args) {
        MethodReferenceExamples example = new MethodReferenceExamples();
        example.greetJohn(null); // object instance method reference
        example.greetJohn(null); // static method reference
        example.greetJohn(null); // Class Method reference String.toLowerCase(string)
    }
    
    public void greetJohn(Function<String, String> languageFunction) {
        String personToGreet = "John";
        String greeting = languageFunction.apply(personToGreet);
        System.out.println(greeting);
    }
    
    
    public String polish(String personToGreet) {
        return "Czesc " + personToGreet;
    }
    
    public static String german(String personToGreet) {
        return "Hallo " + personToGreet;
    }
}

