public class Main {

    public static void main(String[] args) {
        Team team1 = new Team("EK");
        team1.addPlayer(new Player("Rasmus", 56));
        team1.addPlayer(new Player("Patrick", 76));
        team1.addPlayer(new Player("Jonas", 189));


        Team team2 = new Team("CPH-business");
        team2.addPlayer(new Player("Jeff", 56));
        team2.addPlayer(new Player("Preben", 76));
        team2.addPlayer(new Player("Kurt", 100));

        team1.printTeam();
        team2.printTeam();

        team1.compete(team2);

    }
}
