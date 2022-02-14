package lesson1.Obstacles;

import lesson1.Players.Player;

public class Water extends Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Player player) {
        player.swim(distance);
    }
}
