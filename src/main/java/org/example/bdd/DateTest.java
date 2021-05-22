package org.example.bdd;

public class DateTest {

    public static void main(String[] args) {
        String EXAMPLE_TEST = "a,b,c,d,e,f";
        String regex = "^([a-zA-Z0-9]+,?\\s*)+$";
        System.out.println(EXAMPLE_TEST.matches(regex));
    }
}
