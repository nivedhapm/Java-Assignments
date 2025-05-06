package classesAndObjects;

import java.util.List;

public class Team {
    private String name;
    private String city;
    private String division;
    private List<Player> players; 

    public Team(String name, String city, String division, List<Player> players) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = players;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team: ").append(name).append(" | City: ").append(city).append(" | Division: ").append(division);
        sb.append("\nPlayers:\n");
        for (Player player : players) {
            sb.append(player.toString()).append("\n");
        }
        return sb.toString();
    }
}

