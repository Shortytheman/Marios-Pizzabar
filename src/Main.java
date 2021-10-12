import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  ArrayList<Pizza> menuKort = new ArrayList<>();
  ArrayList <Pizza> bestillinger = new ArrayList<>();
  Boolean programIsRunning = true;
  Scanner scanner = new Scanner(System.in);
  int pristotal;
  int regnskab;


public void lavPizza(){
  menuKort.add(new Pizza(1,"Vesuvio",new String[]{"Tomatsauce","Ost", "Skinke", "Oregano"},57));
  menuKort.add(new Pizza(2,"Amerikaner",new String[]{"Tomatsauce","Ost", "Oksefars", "Oregano"},53));
  menuKort.add(new Pizza(3,"Cacciatore",new String[]{"Tomatsauce","Ost", "Pepperoni", "Oregano"},57));
  menuKort.add(new Pizza(4,"Carbona",new String[]{"Tomatsauce","Ost", "Kødsauce","Spaghetti", "Cocktailpølser", "Oregano"},63));
  menuKort.add(new Pizza(5,"Dennis",new String[]{"Tomatsauce","Ost", "Pepperoni", "Oregano"},57));
  menuKort.add(new Pizza(6,"Bertil",new String[]{"Tomatsauce","Ost", "Bacon", "Oregano"},57));
  menuKort.add(new Pizza(7,"Silvia",new String[]{"Tomatsauce","Ost", "Pepperoni", "Rød peber", "Løg", "Oliven", "Oregano"},61));
  menuKort.add(new Pizza(8,"Victoria",new String[]{"Tomatsauce","Ost", "Skinke", "Ananas", "Champignon","Løg", "Oregano"},61));
  menuKort.add(new Pizza(9,"Toronfo",new String[]{"Tomatsauce","Ost", "Skinke", "Bacon", "Kebab","Chili", "Oregano"},61));
  menuKort.add(new Pizza(10,"Capricciosa",new String[]{"Tomatsauce","Ost", "Skinke", "Champignon", "Oregano"},61));
  menuKort.add(new Pizza(11,"Hawai",new String[]{"Tomatsauce","Ost", "Skinke", "Ananas", "Oregano"},61));
  menuKort.add(new Pizza(12,"Le Blissola",new String[]{"Tomatsauce","Ost", "Skinke", "Rejer", "Oregano"},61));
  menuKort.add(new Pizza(13,"Venezia",new String[]{"Tomatsauce","Ost", "Skinke", "Bacon", "Oregano"},61));
  menuKort.add(new Pizza(14,"Mafia",new String[]{"Tomatsauce","Ost", "Pepperoni", "Bacon", "Løg", "Oregano"},61));
  menuKort.add(new Pizza(15,"Alfonso",new String[]{"Tomatsauce","Ost", "Rødløg", "Serano skinke"},68));
  menuKort.add(new Pizza(16,"Mario",new String[]{"Tomatsauce","Ost", "Pepperoni", "Rød peber", "Rødløg", "Hele Syltede Chili'er"},64));
  menuKort.add(new Pizza(17,"Luigi",new String[]{"Tomatsauce","Mozzarella", "Spinat", "Grøn Peber", "Forårsløg"},62));
  menuKort.add(new Pizza(18,"Peach",new String[]{"Tomatsauce","Ost", "Serano Skinke", "Rødkål", "Rød Peber", "Radiser"},64));
  menuKort.add(new Pizza(19,"Daisy",new String[]{"Tomatsauce","Ost", "Kylling", "Majs", "Gul Peber", "Gulerødder"},63));
  menuKort.add(new Pizza(20,"Toad",new String[]{"Tomatsauce","Mozzarella", "Champignon", "Karl Johan", "Kantarel", "Ægte Hummer Skørhat"},100));
  menuKort.add(new Pizza(21,"Donkey Kong",new String[]{"Tomatsauce","Ost", "Kebab", "Jordskokker", "Løg", "Skorzonerrod"},90));
  menuKort.add(new Pizza(22,"Yoshi",new String[]{"Tomatsauce","Ost", "Kylling", "Squash", "Grønne Asparges", "Ærter", "Grønkål"},62));
  menuKort.add(new Pizza(23,"Baby Mario",new String[]{"Tomatsauce","Ost", "Pepperoni", "Rødbede", "Rødløg"},60));
  menuKort.add(new Pizza(24,"Baby Luigi",new String[]{"Tomatsauce","Ost", "Kylling", "Spinat", "Squash"},62));
  menuKort.add(new Pizza(25,"Bowser",new String[]{"Tomatsauce","Ost", "Oksekød", "Løg"},59));
  menuKort.add(new Pizza(26,"Den stærke",new String[]{"Tomatsauce","Mozzarella", "Chorizo", "Peberrod", "Hele syltede Habanero's","Chili sauce", "Jalapenos"},70));
  menuKort.add(new Pizza(27,"La Patata",new String[]{"Tomatsauce","Ost", "Kartoffel", "Soltørrede tomater", "Oregano"},62));
  menuKort.add(new Pizza(28,"El Queso",new String[]{"Tomatsauce","Ost", "Mozzarella", "Gorgonzola", "Feta", "Chorizo"},68));
  menuKort.add(new Pizza(29,"El Bueno",new String[]{"Tomatsauce","Ost", "Mozzarella", "Chorizo", "Peberfrugt", "Artiskokker","Chili sauce", "Chili flager"},64));
  menuKort.add(new Pizza(30,"Con Carne",new String[]{"Tomatsauce","Ost", "Oksekød", "Kebab", "Kylling", "Pepperoni","Peberfrugt"},68));
  menuKort.add(new Pizza(31,"El Mariacho",new String[]{"Tomatsauce","Ost", "Kebab", "Artiskokker", "Tomat", "Agurk","Peberfrugt", "Oregano"},62));
  menuKort.add(new Pizza(32,"Ensalda",new String[]{"Tomatsauce","Ost", "Kylling", "Salat", "Tomat", "Agurk","Peberfrugt", "Massere af dressing"},64));
  menuKort.add(new Pizza(33,"Mexico",new String[]{"Tomatsauce","Ost", "Oksekød", "Jalapenos", "Nachos", "Guacamole",
          "Chili","Kaktus"},70));
}

public void tagImodBestilling(){

  System.out.println("Indtast nummeret på den pizza der bliver bestilt: ");
  int pizzaNummer = 0;
  int i = 1;

  do {
    while(!scanner.hasNextInt()){
      if (scanner.nextLine().equalsIgnoreCase("menukort"))
        printMenukort();
      if (scanner.nextLine().equalsIgnoreCase("slut")) {
        System.out.println("\n\nOrdren er slut, den har fået ordrenummer: " + i);
        System.out.println("Ordre nummer " + i + " indeholder: ");
      for (Pizza a : bestillinger)
        System.out.println(a);
        System.out.println("ialt pris: " + pristotal);
        bestillinger.clear();
        pristotal = 0;
        i++;
      }
      if (scanner.nextLine().equalsIgnoreCase("regnskab")){
        System.out.println("Ialt er der blevet solgt pizza for: " + regnskab + " kroner idag.");
      }
    }
    if(scanner.hasNextInt()) {
      pizzaNummer = scanner.nextInt();
    }
    if (pizzaNummer < 34 && pizzaNummer > 0) {
      System.out.println(menuKort.get(pizzaNummer - 1));
      bestillinger.add(menuKort.get(pizzaNummer - 1));
      pristotal += menuKort.get(pizzaNummer - 1).pris;
      regnskab += menuKort.get(pizzaNummer - 1).pris;
      System.out.print("indtast nummeret på næste pizza, indtast slut for at afslutte ordren: ");
    }
    else {
      System.out.println("forkert indtastning, vælg et nummer fra menuen");
    }
  }
  while(pizzaNummer < 34 && pizzaNummer > 0);
}

public void printMenukort(){
  for (Pizza s : menuKort) {
    System.out.println(s);
  }
}

public static void main(String[] args){
  Main main = new Main();
  main.lavPizza();
  main.printMenukort();

  while (main.programIsRunning) {
    main.tagImodBestilling();
  }
  }
}
