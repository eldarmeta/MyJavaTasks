package java2025.basics;

public class logical_operators {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // ! = NOT

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("It's a good weather!");
            System.out.println("Go for a walk, it's sunny!");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("It's a good weather!");
            System.out.println("don't go for a walk, it's cloudy!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad :( ");
        }
        }
}
