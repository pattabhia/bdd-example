package org.example.bdd;

public class RegexExample {

    public static void main(String[] args) {
        String names = "a, 98,c, D, e, f";
        String regex = "^([a-zA-Z0-9]+,?\\s*)+$";
        System.out.println(names.matches(regex));
        String [] namesArray = names.split(",");
    }
}
