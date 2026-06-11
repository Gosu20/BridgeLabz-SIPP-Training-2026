import java.util.Scanner;

public class DeckOfCards {

    public static String[] createDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
        };

        String[] deck = new String[52];
        int index = 0;

        for (String s : suits) {
            for (String r : ranks) {
                deck[index++] = r + " of " + s;
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cards) {

        if (players * cards > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }

        String[][] table = new String[players][cards];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                table[i][j] = deck[index++];
            }
        }

        for (int i = 0; i < players; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < cards; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = createDeck();

        shuffleDeck(deck);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        distribute(deck, players, cards);

        sc.close();
    }
}