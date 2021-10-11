import java.util.ArrayList;

public class Main {
  ArrayList<Pizza> menuKort = new ArrayList<>();
  ArrayList<String> ingredienser = new ArrayList<>();

public void lavPizza(){
  menuKort.add(new Pizza(1,"Vesuvio",new String[]{"Tome","tome1"},54));
  menuKort.add(new Pizza(2,"Eddie",new String[]{"spis","kebibkkkkkk"},65));
  menuKort.add(new Pizza(2,"",new String[]{"spis","kebibkkkkkk"},65));
  // EDDIE LAV NOGLE PIZZAER!
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
  }
}
