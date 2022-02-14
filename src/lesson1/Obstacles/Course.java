package lesson1.Obstacles;

import lesson1.Players.Player;
import lesson1.Players.Team;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Player[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Player c: teamMembers){
                for (Obstacle o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
