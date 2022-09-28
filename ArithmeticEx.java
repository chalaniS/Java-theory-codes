class ArithmeticEx {
   public static void main(String[] args) {
      int a, b, c;
      int d;
      a = 10;
      b = 10;
      c = 20;
      try {
         d = c / (a - b);
      } catch (ArithmeticException e) {
         System.out.println("The values of a and b should be different");
      }

      int data[];
      data = new int[10];

      int i = 30;
      try {
         data[i] = 300;
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("There are only 10 elements");
      }

      System.out.println("End of program");

   }
}