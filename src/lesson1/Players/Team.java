package lesson1.Players;

public class Team {
    String teamName;
    Player[] teamMembers;


    public Team(String teamName, Player[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name: "+teamName;
    }

    public Player[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Player c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(Player c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}
