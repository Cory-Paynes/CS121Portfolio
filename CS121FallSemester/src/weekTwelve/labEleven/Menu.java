package weekTwelve.labEleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    Pokedex pokedex = new Pokedex();
    Scanner scanner = new Scanner(System.in);

    public void displayMenu()
    {
        while(true)
        {
            System.out.println("\n********** MENU **********\nPlease make a selection:\n1) Add a Pokemon\n2) Remove a Pokemon\n3) Display Pokemon info\n4) Display ALL Pokemon info\n5) Exit");
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 1)
            {
                createPokemon();
            }
            else if (input == 2)
            {
                deletePokemon();
            }
            else if (input == 3)
            {
                displayPokemon();
            }
            else if (input == 4)
            {
                displayAllPokemon();
            }
            else if (input == 5)
            {
                System.out.println("Exiting...");
                break;
            }
            else
                System.out.println("Invalid Entry.");
        }
    }

    private void createPokemon()
    {
        System.out.println("1) Enter Pokemon details manually\n2) Select from file");
        int input = Integer.parseInt(scanner.nextLine());
            if(input == 1) {
                System.out.println("Enter the Pokemon name:");
                String name = scanner.nextLine();
                System.out.println("Enter the Pokemon HP:");
                int hp = Integer.parseInt(scanner.nextLine());
                Pokemon pokemon = new Pokemon(name, hp);
                pokedex.addPokemon(pokemon);

                String input2 = "";
                while (!input2.equals("q")) {
                    System.out.println("Enter a move name or \"q\" if finished");
                    input2 = scanner.nextLine();
                    if (!input2.equals("q")) {
                        System.out.println("Enter move's Power");
                        int pwr = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter move's Speed");
                        int spd = Integer.parseInt(scanner.nextLine());
                        Move move = new Move(input2, pwr, spd);
                        pokemon.addMove(move);
                    }
                }
                System.out.printf("Pokemon \"%s\" Added to Pokedex.\n", name);
            }
            else if (input == 2)
            {
                FileRead fileRead = new FileRead();
                ArrayList pokemonData = new ArrayList<String[]>();
                try
                {
                    pokemonData = fileRead.readPokemonData("CharacterStatsFile.txt");
                    if (pokemonData.isEmpty())
                    {
                        System.out.println("No Pokemon data available in file");
                        return;
                    }
                    else
                    {
                        File file = new File("CharacterStatsFile.txt");
                        System.out.println("Choose a Pokemon from the list:\n");
                        try {
                            Scanner scn = new Scanner(file);
                            int num = 1;
                            while(scn.hasNextLine())
                            {
                                String line = scn.nextLine();
                                System.out.printf("%d) %s\n",num, line);
                                ++num;
                            }
                            scn.close();
                        }
                        catch(FileNotFoundException e) {
                            e.printStackTrace();
                        }

                        System.out.println();


                    }
                }
                catch (FileNotFoundException e)
                {
                    throw new RuntimeException(e);
                }


            }
            else
            {
                System.out.println("Invalid Entry.");
            }
    }

    private void deletePokemon()
    {
        Pokemon pokemon;
        System.out.println("Enter the name of Pokemon you want to delete:");
        String name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(name == null)
        {
            System.out.println("Pokemon Not Found");
        }
        else
        {
            pokedex.removePokemon(pokemon);
            System.out.printf("Pokemon \"%s\" Removed from Pokedex.",name);
        }
    }

    private void displayPokemon()
    {
        System.out.println("Enter the name of the Pokemon to see info:");
        String name = scanner.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);
        if(pokemon == null)
        {
            System.out.println("Pokemon Not Found");
        }
        else
        {
            System.out.println(pokemon);
        }

    }

    private void displayAllPokemon()
    {
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        if (pokemonArrayList.isEmpty()) {
            System.out.println("No Pokémon in the Pokedex.");
            return;
        }
        System.out.println("All Pokémon in the Pokedex:");
        for (Pokemon pokemon : pokemonArrayList) {
            System.out.println("Name: " + pokemon.getName());
            System.out.println("HP: " + pokemon.getHp());
            ArrayList<Move> moves = pokemon.getMoveArrayList();
            if (moves.isEmpty()) {
                System.out.println("No moves available for this Pokémon.");
            } else {
                System.out.println("Moves:");
                for (Move move : moves) {
                    System.out.println(" - Move Name: " + move.getMoveName());
                    System.out.println(" Power: " + move.getMovePower());
                    System.out.println(" Speed: " + move.getMoveSpeed());
                }
            }
            System.out.println(); // Adds spacing between Pokémon entries
        }
    }

}
