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
    if (this.navn.length() == 4 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":        " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 4 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":       " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 5 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":       " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 5 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":      " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 6 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":      " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 6 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":     " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 7 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":     " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 7 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":    " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 8 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":    " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 8 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":   " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 9 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":   " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 9 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":  " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 10 && this.nummer < 10)
      return this.nummer + " " + this.navn + ":  " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 10 && this.nummer > 10)
      return this.nummer + " " + this.navn + ": " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 11 && this.nummer < 10)
      return this.nummer + " " + this.navn + ": " + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    if (this.navn.length() == 11 && this.nummer > 10)
      return this.nummer + " " + this.navn + ":" + " " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";
    else
    return this.nummer + " " + this.navn + ": " + Arrays.toString(ingredienser) + " " + this.pris + " kr.";

  }
}
