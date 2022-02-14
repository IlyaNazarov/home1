package lesson1.Obstacles;

import lesson1.Players.Player;

public class Wall extends Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Player player) {
        player.jump(height);
    }
}
