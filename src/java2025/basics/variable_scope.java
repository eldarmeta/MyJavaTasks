package java2025.basics;

public class variable_scope {

    static int x = 3; //Class

    public static void main(String[] args) {
        // variable scope = where a variable can be accessed
        int x = 1; //Local

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){

        int x = 2; //Local

        System.out.println(x);


    }
}

