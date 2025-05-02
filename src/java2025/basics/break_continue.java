package java2025.basics;

public class break_continue {
    public static void main(String[] args){

        //break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 20; i++) {

            if (i == 5) {
                continue;
            }
            if (i == 15) {
                break;
            }

            System.out.print(i + " ");
        }
    }
}
