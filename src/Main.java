import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  ArrayList <Pizza> menuKort = new ArrayList<>();
  ArrayList <Object> bestillinger = new ArrayList<>();
  ArrayList <Object> totalOrdre = new ArrayList<>();
  ArrayList <Integer> pizzaKanFjernes = new ArrayList<>();
  ArrayList <Integer> stat = new ArrayList<>();
  Boolean programIsRunning = true;
  Scanner scanner = new Scanner(System.in);
  int pristotal;
  int regnskab;
  int i = 1;
  String h;



public void lavPizza(){
  //Vi laver instanser af Pizza objektet og adder nummer, navn, liste med ingredienser og en pris.
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

//Vi looper indtil brugeren indtaster et nummer fra 1 til 33
  do {
    while(!scanner.hasNextInt()){
      // Når brugeren ikke indtaster en int går vi i dette loop
      String stringInput = scanner.nextLine();
      if (stringInput.equalsIgnoreCase("menukort")) {
        printMenukort();
      }
      if (stringInput.equalsIgnoreCase("slut")) {
        //Når brugeren indtaster "slut" så afsluttes den nuværende ordre og der printes detaljer.
        System.out.println("\n\nOrdren er slut, den har fået ordrenummer: " + i);
        System.out.println("Ordre nummer " + i + " indeholder: ");
      for (Object a : bestillinger) {
        //Printer ArrayList med newline
        System.out.println(a);
      }
        System.out.println("ialt pris: " + pristotal + " kroner.");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        h = dateFormat.format(date);
        System.out.println("Bestilling modtaget " + h);
        gemBestillinger(bestillinger);
        stat.add(menuKort.get(pizzaNummer - 1).nummer);
        bestillinger.clear();
        pristotal = 0;
        i++;
      }
      if (stringInput.equalsIgnoreCase("statistik")) {
        printStatistik();

        System.out.println("\nI dag er der i alt blevet solgt pizza for: " + regnskab + " kroner");
      }

      if (stringInput.equalsIgnoreCase("total")) {
        for (Object s : totalOrdre) {
          System.out.println(s);
      }
      if (stringInput.equalsIgnoreCase("Alfonso")) {
        System.out.println("Ja chef, hvilken pizza skal jeg fjerne fra listen? "+pizzaKanFjernes);
        int svar = scanner.nextInt();
        if (svar == pizzaNummer) {
          pizzaKanFjernes.remove(Integer.valueOf(svar));
          System.out.println("Pizzaen er fjernet! " + pizzaKanFjernes);
        }
      }
    }
    if(scanner.hasNextInt()) {
      pizzaNummer = scanner.nextInt();
    }
    if (pizzaNummer < 34 && pizzaNummer > 0) {
      System.out.println(menuKort.get(pizzaNummer - 1));
      bestillinger.add(menuKort.get(pizzaNummer - 1));
      pizzaKanFjernes.add(pizzaNummer);
      pristotal += menuKort.get(pizzaNummer - 1).pris;
      regnskab += menuKort.get(pizzaNummer - 1).pris;
      stat.add(menuKort.get(pizzaNummer - 1).nummer);
      System.out.print("indtast nummeret på næste pizza, indtast slut for at afslutte ordren: ");
    }
    else {
      System.out.println("forkert indtastning, vælg et nummer fra menuen");
    }
  }
  while(pizzaNummer < 34 && pizzaNummer > 0);
}

public void gemBestillinger(ArrayList<Object> pizza){
  totalOrdre.add(new Mellemrum("\nOrdrenummer: " + i + "    bestilt klokken: " + h));
  totalOrdre.addAll(pizza);
}

public void printMenukort(){
  for (Pizza s : menuKort) {
    System.out.println(s);
  }
}

public void printStatistik() {

  for(int i = 1; i < 34; i++) {
        System.out.print("Pizza " + i + ": ");
        System.out.println(Collections.frequency(stat, i));
      }
    }

public static void main(String[] args){
  Main main = new Main();
  main.lavPizza();

  while (main.programIsRunning) {
    main.tagImodBestilling();
    }
  }
}
