package app.Prak7;

import java.util.Scanner;

public class GameDrunkardStack {
    public static int count = 0;

    public static void main(String args[]) {
        PlayerStack firstPlayer = inputPlayer1();
        PlayerStack secondPlayer = inputPlayer2();
        gameStart(firstPlayer, secondPlayer);
    }

    public static PlayerStack inputPlayer1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of first player: ");
        PlayerStack firstPlayer = new PlayerStack(sc.nextLine());
        System.out.print("Cards of first player (bottom to top, 5 cards): ");
        for (int i = 0; i < 5; i++) {
            firstPlayer.addCardsToPostTray(sc.nextInt());
        }
        sc.close();
        return firstPlayer;
    }

    public static PlayerStack inputPlayer2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of second player: ");
        PlayerStack secondPlayer = new PlayerStack(sc.nextLine());
        System.out.print("Cards of second player (bottom to top, 5 cards): ");
        for (int i = 0; i < 5; i++) {
            secondPlayer.addCardsToPostTray(sc.nextInt());
        }
        sc.close();
        return secondPlayer;
    }

 
    public static void gameStart(PlayerStack firstPlayer, PlayerStack secondPlayer) {
        while (!firstPlayer.postTray.isEmpty() && !secondPlayer.postTray.isEmpty()) {
  
            Integer card1 = firstPlayer.postTray.pop();
            Integer card2 = secondPlayer.postTray.pop();
            if (card1 > card2) {
                firstPlayer.rebuildPostTray(card1, card2);
            } else if (card1 < card2) {
                secondPlayer.rebuildPostTray(card2, card1);
            } else {
                System.out.println("Something wrong!");
                return;
            }

            System.out.println("\n--------------Turn " + ++count + "---------------");
            firstPlayer.showCards();
            System.out.println();
            secondPlayer.showCards();
        }

        System.out.print("\n-----------------RESULT----------------");
        if (count > 106) {
            System.out.println("SHOW");
        }

        if (secondPlayer.postTray.isEmpty()) {
            System.out.println("\nFirst player " + firstPlayer.getName() + " win!");
            firstPlayer.showCards();
        }

        if (firstPlayer.postTray.isEmpty()) {
            System.out.println("\nSecond player " + secondPlayer.getName() + " win!");
            secondPlayer.showCards();
        }
    }
}
