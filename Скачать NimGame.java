
public class NimGame {
    public static void main(String[] args) {
        int stones = 10; // Общее количество камней

        if (canWinNim(stones)) {
            System.out.println("Starting with " + stones + " stones: You can win!");
        } else {
            System.out.println("Starting with " + stones + " stones: You will lose if your opponent plays optimally.");
        }
    }

    public static boolean canWinNim(int n) {
        // Если остаток от деления на 4 != 0, то можно выиграть
        return n % 4 != 0;
    }
}
