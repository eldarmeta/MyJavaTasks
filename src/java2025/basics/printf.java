package java2025.basics;

public class printf{
public static void main(String[] args) {

    // printf() = is a method used to format output
    // %[flags][width][.precision][specifier-character]

    String name = "Eldar";
    char firstLetter = 'E';
    int age = 23;
    double height = 187.5;
    boolean isEmployed = true;

    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with a %c\n", firstLetter);
    System.out.printf("You are %d years old\n", age);
    System.out.printf("You are a %f cm tall\n", height);
    System.out.printf("Employed: %b\n", isEmployed );

    System.out.printf("%s is %d years old\n", name, age);


}
}
