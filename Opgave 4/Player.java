public class Player {
    private String name;
    private int skillLevel;

    public Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Skill Level: " + this.skillLevel;
    }

    public int getSkillLevel() {
        return skillLevel;
    }
}
