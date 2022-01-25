/*
 * Credit goes to below channel
 * https://www.youtube.com/channel/UCQSU2g8XU-ZSs26_4HGuCWg
 * */

import snakeandladder.Dice;
import snakeandladder.GameBoard;
import snakeandladder.Jumper;
import snakeandladder.Player;

import java.util.*;

public class SnakeAndLadder {

    public static void main(String[] args) {
        Dice dice = new Dice(1);

        Player bharath = new Player("Bharath", 1);
        Player ananth = new Player("Ananth", 2);
        Queue<Player> players = new LinkedList<>();
        players.add(bharath);
        players.add(ananth);

        HashMap<String, Integer> playerPositions = new HashMap<>();
        playerPositions.put(bharath.getPlayerName(), 0);
        playerPositions.put(ananth.getPlayerName(), 0);


        List<Jumper> snakes = new ArrayList<>();
        Jumper snake1 = new Jumper(10, 2);
        Jumper snake2 = new Jumper(56, 34);
        Jumper snake3 = new Jumper(88, 6);
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);

        List<Jumper> ladders = new ArrayList<>();
        Jumper ladder1 = new Jumper(7, 55);
        Jumper ladder2 = new Jumper(78, 89);
        Jumper ladder3 = new Jumper(37, 67);
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);

        GameBoard game = new GameBoard(dice, players, snakes, ladders, playerPositions, 100);

        game.startGame();
    }
}
