package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class TeamPlayerDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo", "Forward", 7);
        Player player2 = new Player("Messi", "Forward", 10);

        List<Player> teamPlayers = new ArrayList<>();
        teamPlayers.add(player1);
        teamPlayers.add(player2);

        Team team = new Team("Portugal national team", "Portuguese", "Division A", teamPlayers);

        System.out.println(team);
    }
}

