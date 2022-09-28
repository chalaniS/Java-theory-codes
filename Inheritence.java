// Inherit the Person Class and create
// a Student Class
// The student class should have the following
// properties
// studentId, name, mobileno, GPA
// We will have a method called
// displayClass()

// Topics Covered
// 1. Inheritence
// 2. Calling super class constructors
// 3. Using protected keyword
// 4. Overriding
// 5. Overloading
// 6. Creating Objects
// 7. Using objects of the Base Class

class Person {
    protected String name;
    protected String mobileNo;

    public Person() {
        mobileNo = "071xxxxxxxx";
        name = "";
    }

    public Person(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void display() {
        System.out.println("Name = " + this.name + ", Mobile No = " + this.mobileNo);
    }
}

class Student extends Person {
    protected int studentId;
    protected float gpa;

    public Student() {
        gpa = 2.0f;
    }

    public Student(int studentId, String name, String mobileNo, float gpa) {
        super(name, mobileNo);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public float getGpa() {
        return this.gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void display() {
        super.display();
        System.out.println("Student Id = " + this.studentId + ", GPA = " + this.gpa);
    }

    public void displayClass() {
        if (gpa < 3)
            System.out.println("Pass");
        else
            System.out.println("You have graduated with a class");
    }
}

class Inheritence {
    public static void main(String[] args) {
        Student std;
        std = new Student(100, "Geetha", "0782343322", 3.2f);
        std.display();
        std.displayClass();

        // Superclass x = new Superclass();
        // Superclass y = new Subclass();
        Person p;
        p = new Student(10, "Namalie", "077623232", 3.1f);
        p.display();
        //
        // Subclass z = (Subclass) [super class variable]
        Student s = (Student) p;
        s.displayClass();
    }
}