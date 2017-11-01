public class Squirtle extends Pokemon{

    public Squirtle(String name, int health){
        super(name, health, "water");
    }

    public void attack(Pokemon pokemon){
        int health = pokemon.getHealth();
        health -= 5;
        pokemon.setHealth(health);
    }
    public void flee(){
        System.out.println("Squirtle flead!!");
    }
}