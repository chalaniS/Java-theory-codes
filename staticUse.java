class Student {
   private String ditno;
   private String name;
   private static String batchId; // global variable
   // class variable

   public Student(String mditno, String mname, String mbatchId) {
      ditno = mditno;
      name = mname;
      batchId = mbatchId;
   }

   public void setBatchId(String mbatchId) {
      batchId = mbatchId;
   }

   public String getBatchId() {
      return batchId;
   }

   public void setDitNo(String mditno) {
      ditno = mditno;
   }

   public String getDitNo() {
      return ditno;
   }

   public void setName(String mname) {
      name = mname;
   }

   public String getName() {
      return name;
   }

   public void display() {
      System.out.println(ditno + " " + name + "  " + batchId);
   }

   // static method
   // they only work with static
   // properties
   public static void setBatch(String mbatchId) {
      batchId = mbatchId;
      // NOT STATIC name = "SLIIT";
   }

   static {
      System.out.println("Just running some static code");
   }
}

class Utility {
   public static int add(int no1, int no2) {
      return no1 + no2;
   }
}

class Demo {
   public Demo() {
      System.out.println("DEMO CONSTRUCTOR CALLED");
   }

   static {
      System.out.println("Demo class static loaded");
   }
}

class staticUse {
   public static void main(String args[]) {
      int ans = Utility.add(34, 60);
      System.out.println(ans);

      Student st1 = new Student("IT17011110", "Amali", "Malabe Batch 4");
      Student st2 = new Student("IT17031220", "Dinesh", "Malabe Batch 4");
      Student st3 = new Student("IT17068830", "Lal", "Malabe Batch 4");
      Student st4 = new Student("IT17082320", "Brinsly", "Malabe Batch 4");

      // st1.setBatchId("Malabe Weekday Batch 4");
      Student.setBatch("Malabe Weekday Group 4");
      // Class.method(); // static method

      st1.display();
      st2.display();
      st3.display();
      st4.display();

      Demo d;
      d = new Demo();

   }

}