package com.revature.pokemon;

/*
Think about what kind of information we want to store about the pokemon. Things such as Name, Lvl, HP, Atk
 */

import java.util.Random;

public class Pokemon {

    String name;
    int level;
    int hp;
    int atk;

    //adding on field to see if fainted
    boolean fainted;

    //Now that pokemon vars established, we need to find way to construct our pokemon object

    public Pokemon(String name) {
        this.name = name;
        //randomize values.
        Random r = new Random();

        this.level = r.nextInt(100) + 1;
        this.hp = r.nextInt(350) + 1;
        this.atk = r.nextInt(61) + 1;
        this.fainted = false;
    }

    /*
    Have a way to create pokemon, but not attack. Create methods to battle
     */
    //Battle -- needs pokemon stats & enemy stats
    public Pokemon battle(Pokemon opponent) {
        //How to setup battle? when I atk, my atk reduces hp, then their turn-- their atk reduces my hp.
        //Instead of immediately decreasing health, make sure it doesn't allow pokemon to go negative.
        //this is for when we attack opponent:
        if (opponent.hp - this.atk <= 0 ) {
            //Mark pokemon as fainted
            //Create boolean to show fainted status
            opponent.hp = 0;
            opponent.fainted = true;
        } else {
            //Health is positive and ok to continue
            opponent.hp -= this.atk;
        }

        //When opponent attacks us:
        if (this.hp - opponent.atk <= 0 ) {
            this.hp = 0;
            this.fainted = true;
        } else {
            this.hp -= opponent.atk;
        }

        return opponent;
    }

}
