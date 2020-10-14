package app.Prak7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class PlayerQueue {

    private String name;
    Queue<Integer> postTray = new LinkedList<>();

    public PlayerQueue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.offer(card);
        } else if (card == 0) {
            this.postTray.offer(10);
        } else {
            System.out.println("Something wrong.");
            return;
        }
    }

    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        this.postTray.offer(cardBigger);
        this.postTray.offer(cardSmaller);
    }

    public void showCards() {
        if (!this.postTray.isEmpty()) {
            System.out.print("Cards of player " + this.name + " (top to bottom): ");
            Stream<Integer> playerStream = this.postTray.stream();
            playerStream.forEach((element) ->
            {
                if ((Integer) element != 10) {
                    System.out.print(" " + element);
                } else {
                    System.out.print(" " + 0);
                }
            });
        } else {
            System.out.print("Cards of player " + this.name + " empty.");
        }
    }
}
