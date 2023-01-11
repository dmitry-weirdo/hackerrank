package hackerrank;

public class HalloweenSale {

    public static void main(String[] args) {
        final int result = howManyGames(20, 3, 6, 85);
        System.out.println("Result: " + result);
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int gamesBought = 0;

        int currentPrice = p;

        int money = s;

        while (money >= currentPrice) {
            // System.out.printf("Current price: %d, games bought: %d %n", currentPrice, gamesBought);

            gamesBought++;
            money -= currentPrice;

            if ((currentPrice - d) >= m) {
                currentPrice -= d;
            }
            else {
                currentPrice = m;
            }
        }

        return gamesBought;
    }
}
