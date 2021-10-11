import java.util.ArrayList;

public class Main {
  ArrayList<Pizza> menuKort = new ArrayList<>();
  ArrayList<String> ingredienser = new ArrayList<>();

public void lavPizza(){
  menuKort.add(new Pizza(1,"Vesuvio",new String[]{"Tome","tome1"},54));
  // EDDIE LAV NOGLE PIZZAER!
}

public static void main(String[] args){
  Main main = new Main();
  main.lavPizza();
  System.out.println(main.menuKort);
  }
}
