package com.company.General;

import com.company.Objects.Hero;
import com.company.Objects.Boss;

public class Main {

    public static void main(String[] args) {

        Hero theFirstHero = new Hero(120, 500, "Agility");
        System.out.println(theFirstHero.getDamage() + " " + theFirstHero.getHealth() + " " + theFirstHero.getSuperAbility());

        Hero theSecondHero = new Hero(300, 65);
        System.out.println(theSecondHero.getHealth() + " " + theSecondHero.getDamage());


        Boss theMainBoss = new Boss();
        theMainBoss.setHealth(1500);
        theMainBoss.setDamage(333);
        theMainBoss.setBossDefenseType("Shield");
        System.out.println(theMainBoss.getDamage()+ " "+theMainBoss.getHealth()+ " "+theMainBoss.getBossDefenseType());

    }


}
