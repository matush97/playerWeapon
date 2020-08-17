package sk.stuba.fei.cvicenie4;

import sk.stuba.fei.cvicenie4.player.Barbarian;
import sk.stuba.fei.cvicenie4.player.Knight;
import sk.stuba.fei.cvicenie4.player.Player;
import sk.stuba.fei.cvicenie4.player.Ranger;
import sk.stuba.fei.cvicenie4.weapon.Axe;
import sk.stuba.fei.cvicenie4.weapon.Bow;
import sk.stuba.fei.cvicenie4.weapon.Sword;

public class Main {

    public static void main(String[] args) {
        Sword sword = new Sword(2,1);
        Bow bow = new Bow(5,2);
        Axe axe = new Axe(3,5);

        Player player1 = new Knight("artus",100,sword);
        Player player2 = new Ranger("jazdec",100,bow);
        Barbarian barbarian= new Barbarian("barbar",100,axe);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(barbarian);
    }
}
