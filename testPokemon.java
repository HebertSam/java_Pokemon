public class testPokemon{
    public static void main(String[] args){
        Squirtle bob = new Squirtle("Bob", 30);
        Squirtle joe = new Squirtle("Joe", 35);
        Pokedex pokedex = new Pokedex();

        bob.attack(joe);
        pokedex.pokemonInfo(joe);
    }
}