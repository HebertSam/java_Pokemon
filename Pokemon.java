
public abstract class Pokemon implements actionPokemon {
    protected String name;
    protected int health;
    protected String type;
    protected static int count;


    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}