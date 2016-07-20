package lambdas;

/*
 * Copyright (c) 2016. Schenker AG
 * All rights reserved.
 */

public class DetermineFinal {

    public static void main(String[] args) {
        final String hello = "Hello";
        
        new Runnable() {
            @Override
            public void run() {
                System.out.println(hello);
            }
        };
        
        Runnable run = () -> System.out.println(hello);
        
//        hello = "czesc";
    }
}

