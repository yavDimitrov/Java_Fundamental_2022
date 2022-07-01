package L33_Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Heroes_of_Code_and_Logic_VII_Sorted_Advance {
    static class Hero{
        String name;
        int hitpoints;
        int manapoints;

        public Hero (String name, int hitPoints, int manaPoints){
            this.name = name;
            this.hitpoints = hitPoints;
            this. manapoints = manaPoints;
                    }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHitpoints() {
            return hitpoints;
        }

        public void setHitpoints(int hitpoints) {
            this.hitpoints = hitpoints;
        }

        public int getManaPoints() {
            return manapoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manapoints = manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Hero> heroes = new LinkedHashMap<>();

        int numHeros = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numHeros; i++) {
            String line = scan.nextLine();
            String[] heroParams = line.split(" ");
            Hero Hero = new Hero(heroParams[0],Integer.parseInt(heroParams[1]),Integer.parseInt(heroParams[2]));
            heroes.put(Hero.getName(), Hero);

        }

        String command = scan.nextLine();
        while(!command.equals("End")){
            //TODO:
            String [] commandParts = command.split(" - ");
            String commandName = commandParts[0];

            switch(commandName){
                case "CastSpell":
                    handleCastSpel(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case "TakeDamage":
                    handleDamage(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case "Recharge":
                    handleRecharge(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
                case "Heal":
                    handleHeal(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;

                default:
                    throw new IllegalStateException("unknown command name" + commandName + "in" + command);
            }



            command = scan.nextLine();
        }

        List<Hero> allHeroes = new ArrayList<>(heroes.values());

        Collections.sort(allHeroes, (a, b) -> {
            if(a.getHitpoints() != b.getHitpoints()) {
                return Integer.compare(a.getHitpoints(), b.getHitpoints());
            } else {
                return a.getName().compareTo(b.getName());
            }
        });

        for (Hero hero : heroes.values()) {
            System.out.println(
                    hero.getName() + System.lineSeparator()
            + "  HP: " + hero.getHitpoints() + System.lineSeparator()
            + "  MP: " + hero.getManaPoints());
            
        }


    }

    private static void handleCastSpel(Map<String, Hero> heroes, String heroName, int manaPoints, String spellName) {
        Hero hero = heroes.get(heroName);
        if(hero.getManaPoints() >= manaPoints){
            hero.setManaPoints(hero.getManaPoints() - manaPoints);
            System.out.printf("%s has successfully cast %s and now has %s MP!%n", hero.getName(), spellName, hero.getManaPoints());
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", hero.getName(), spellName);

        }
    }

    private static void handleDamage(Map<String, Hero> heroes, String heroName, int damage, String attacker) {
        Hero hero = heroes.get(heroName);
        int health = hero.getHitpoints();
        health = health - damage;
        hero.setHitpoints(health);
        if(health > 0){
            System.out.println( hero.getName() + " was hit for " + damage + " HP by " + attacker + " and now has " + health + " HP left!");
        } else {
            System.out.println( hero.getName() + " has been killed by " + attacker + "!");
            heroes.remove(hero.getName());
        }
    }

    private static void handleRecharge(Map<String, Hero> heroes, String heroName, int amount) {
        Hero hero = heroes.get(heroName);
        int oldManaPoints = hero.getManaPoints();
        int newManaPoints = Math.min(hero.getManaPoints() + amount, 200);
        hero.setManaPoints(newManaPoints);

        System.out.println(hero.getName() +" recharged for " + (newManaPoints - oldManaPoints) + " MP!");
    }

    private static void handleHeal(Map<String, Hero> heroes, String heroName, int amount) {
        Hero hero = heroes.get(heroName);
        int oldHealthPoints = hero.getHitpoints();
        int newHealthPoints = Math.min(hero.getHitpoints() + amount, 100);
        hero.setHitpoints(newHealthPoints);

        System.out.println(hero.getName() +" healed for " + (newHealthPoints - oldHealthPoints) + " HP!");

            }
}
