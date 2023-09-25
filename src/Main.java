import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Pär");

        Balbasaur b1 = new Balbasaur("Susan");
        Balbasaur b2 = new Balbasaur("Lois");

        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(b1);
        pokedex.add(b2);

p1.attack();

        for(Pokemon p : pokedex) {
            System.out.println("name: " + p.getName());
            p.attack();
        }
    b1.talk();
        Pokemon currentPokemon = pokedex.get(2);
        // currentPokemon.talk();   // går inte
        ((Balbasaur) currentPokemon).talk();   // detta går , använd endast om man är helt säker det är en balbasaur, får men farligt

    }
}