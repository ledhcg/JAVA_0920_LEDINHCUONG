package app.Prak7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class PlayerDequeue {

    private String name;
    Deque<Integer> postTray = new ArrayDeque<>();

    public PlayerDequeue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.addLast(card);
        } else if (card == 0) {
            this.postTray.addLast(10);
        } else {
            System.out.println("Something wrong.");
            return;
        }
    }

    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        this.postTray.addFirst(cardBigger);
        this.postTray.addFirst(cardSmaller);
    }

    public void showCards() {
        if (!this.postTray.isEmpty()) {
            System.out.print("Cards of player " + this.name + " (bottom to top): ");
            Stream<Integer> playerStream = this.postTray.stream();
            playerStream.forEach((element) ->
            {
                if((Integer)element != 10){
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
