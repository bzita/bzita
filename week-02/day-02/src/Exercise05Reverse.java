public class Exercise05Reverse {

  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    System.out.println(reverse(reversed));
  }
  private static String reverse(String reversed) {
    String reversedFinal = "";

    for (int i = reversed.length() - 1; i >= 0; i--) {
      reversedFinal += reversed.charAt(i);
    }
    return reversedFinal;
  }
}
