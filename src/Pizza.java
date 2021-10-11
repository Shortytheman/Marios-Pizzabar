import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

  int nummer;
  String navn;
  String[] ingredienser;
  int pris;

  Pizza(int nummer, String navn, String[] ingredienser, int pris){
    this.nummer = nummer;
    this.pris = pris;
    this.navn = navn;
    this.ingredienser = ingredienser;
  }
  public String toString(){
    return "Nummer: " + this.nummer + "\nNavn: " + this.navn + "\nIngredienser: " + Arrays.toString(ingredienser) + "\nPris: " + this.pris;
  }
}
