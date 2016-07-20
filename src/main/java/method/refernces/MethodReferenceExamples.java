package method.refernces;

import java.util.function.Function;

/*
 * Copyright (c) 2016. Schenker AG
 * All rights reserved.
 */

public class MethodReferenceExamples {

    
    public static void main(String[] args) {
        MethodReferenceExamples example = new MethodReferenceExamples();
        example.greetJohn(example::polish); // object instance method reference
        example.greetJohn(MethodReferenceExamples::german); // static method reference
        example.greetJohn(String::toLowerCase); // Class Method reference
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

