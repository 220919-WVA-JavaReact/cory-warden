package com.revature.pokemon;
/*
Goal: create console application to allow us to traverse around and catch/battle pokemon.
Can only have 6 pokemon with you at a time, use array length 6,
Should be able to catch a pokemon, view current pokemon, and view party of pokemon.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class PokemonGame {
    //Attempt to create pokemon with random values before going further.

    public static void main(String[] args) {

        //Testing pokemon creation
        /*
        Pokemon p1 = new Pokemon("Blaziken");

        Pokemon p2 = new Pokemon("Staryu");

        Pokemon p3 = new Pokemon("Blastoise");

        System.out.println(p1.name + " " + p1.level + " " + p1.hp + " " + p1.atk);
        System.out.println(p2.name + " " + p2.level + " " + p2.hp + " " + p2.atk);
        System.out.println(p3.name + " " + p3.level + " " + p3.hp + " " + p3.atk);
        System.out.println("------------------------------------------------------");

        //Testing pokemon battling
        p1.battle(p2);
        System.out.println(p1.name + " " + p1.level + " " + p1.hp + " " + p1.atk + " " + p1.fainted);
        System.out.println(p2.name + " " + p2.level + " " + p2.hp + " " + p2.atk + " " + p2.fainted);
         */

        boolean running = true;

        Scanner input = new Scanner(System.in);
        //Lets create pokemon party of 6
        Pokemon p1 = new Pokemon("Shaymin");
        Pokemon[] party = new Pokemon[6];
        party [0] = p1;

        int partySize = 1;
        String[] possibleEncounters = {"Shinx", "Sableye", "Lugia", "Pikachu", "Deoxys", "Groudon"};
        Random r = new Random();

        //while loop powers the main app
        while (running) {
            //Application should go in here and only terminate when user advises.
            //Give ourselves a pokemon and have an encounter with another pokemon.

            Pokemon p2 = new Pokemon(possibleEncounters[r.nextInt(possibleEncounters.length)]);

            //Start creating menu logic
            System.out.println("You've encountered a wild " + p2.name);
            //Give options to player
            System.out.println("Type 'run' to run  :  Type 'battle' to battle  :  Type 'party' to view pokemon");
            System.out.println("If you hate the game, press 'q' to quit.");
            //Now collect user input
            String choice = input.nextLine();
            //Check to test if scanner is working properly.
                //System.out.println(choice);

            //if statement logic based off of choice.
            if (choice.equals("run")) {
                System.out.println(p1.name + " has fled.");
            } else if (choice.equals("battle")) {
                System.out.println(p1.name + " versus " + p2.name);
                System.out.println("Type 'attack' to attack  : Type 'catch' to catch");
                String subchoice = input.nextLine();

                if (subchoice.equals("attack")) {
                    //Battle if choosing attack
                    p1.battle(p2);
                    System.out.println(
                            "Your pokemon: " + p1.name + "\n"
                                    + "Health: " + p1.hp + "\n"
                                    + "Fainted? " + p1.fainted
                    );
                    System.out.println(
                            "Opponent pokemon: " + p2.name + "\n"
                                    + "Health: " + p2.hp + "\n"
                                    + "Fainted? " + p2.fainted
                    );
                } else if (subchoice.equals("catch")) {
                    //Add pokemon to party if you use catch
                    if (partySize < 6) {
                        party[partySize] = p2;
                        partySize++;
                        for (int i=0; i < party.length; i++) {
                            if(party[i] != null) {
                                System.out.println(party[i].name);
                            }
                        }
                    } else {
                        System.out.println("You have a full party.");
                    }
                }
            } else if (choice.equals("party")){
                System.out.println("Party");
                for (int i=0; i < party.length; i++) {
                    if (party[i] != null) {
                        System.out.println(party[i].name);
                    }
                }
            } else if (choice.equals("q")){
                break;
            } else {
                System.out.println("Your input was invalid");
            }
            break;
        }
    }


}
