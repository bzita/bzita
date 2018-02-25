import java.util.*;

public class Exercise09CandyShop{

  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }
  public static List<Object> sweets (List<Object> listToCorrect){

    listToCorrect.set(1, "Croissant");
    listToCorrect.set(3, "Ice cream");
    return listToCorrect;
  }
}
