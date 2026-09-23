import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public double getAverageSkillLevel() {
        double sum = 0;
        for (Player player : players) {
            sum += player.getSkillLevel();
        }

        return sum / players.size();
    }

    public void printTeam() {
        System.out.println("Team Name: " + this.teamName);
        System.out.println("=== PLAYER LIST ===");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void compete(Team opponent) {
        if (this.getAverageSkillLevel() > opponent.getAverageSkillLevel()) {
            System.out.println(this.teamName + " wins!");
        } else {
            System.out.println(opponent.teamName + " wins! ");
        }
    }
}
