package java2025.basics;

public class varags {
    public static void main(String[] args) {

        System.out.println(avarage(1,2,3,4,5,6,8));

    }
    static double avarage(double... numbers){

        double sum = 0;

        if (numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}

//        System.out.println(add(1, 2, 3, 4, 5, 6));
//    }
//
//    static int add(int... numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }
//}

// varargs = allow a method to accept a varying # of arguments
        //          makes methods more flexible, no need for overloaded methods
        //          java will pack the arguments into an array
        //          ...  (ellipsis)

