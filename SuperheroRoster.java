import java.util.Scanner;

public class SuperheroRoster 
{

    public static void main(String[] args) 
    {
       
        String[] heroNames = {"Ant Man", "SuperMan", "BatMan"};
        String[] abilities = {"Size chagne","Super strength and abilites", "Strength and Technology"};
        int[] powerLevels = {80,95, 85};

        Superhero[] heroes = new Superhero[3];
        for (int i = 0; i < heroes.length; i++)
         {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        System.out.println(" Superhero Roster ");
        for (Superhero hero : heroes)
         {
            hero.displayHero();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hero Name:");
        String targetHero = scanner.nextLine();
        searchHero(heroNames, abilities, powerLevels, targetHero);

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) 
    {
        boolean found = false;
        for (int i = 0; i < names.length; i++) 
        {
            if (names[i].equalsIgnoreCase(target))
             {
                System.out.println("\nHero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found)
         {
            System.out.println("Hero not found.");
        }
    }

    public static double calculateAveragePower(int[] powerLevels) 
    {
        int sum = 0;
        for (int power : powerLevels) 
        {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}
