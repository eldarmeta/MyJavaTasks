package java2025.basics;

public class printf2{
    public static void main(String[] args) {

              double price1 = 9.99;
    double price2 = 100000.15;
    double price3 = -54.01;

    System.out.printf("%+.1f\n", price1);
    System.out.printf("% .2f\n", price2);
    System.out.printf("%+(3f\n", price3);

        //******************************************

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        //*******************************************

        // [width]

//    0 = zero padding
//    number = right justified padding
//    negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);


    }
    }
