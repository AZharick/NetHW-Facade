public class Main {
   static String fifteen = "1111";
   static String five = "101";
   static String twenty = "10100";
   static String seven = "111";

   public static void main(String[] args) {
      BinOps bins = new BinOps();
      System.out.println("15 + 5 = " + bins.binToDeximal(bins.sum(fifteen, five)));
      System.out.println("20 * 7 = " + bins.binToDeximal(bins.mult(twenty, seven)));
   }
}