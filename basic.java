class Person {
    private String name;
    private String mobileNo;

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

class basic {
    public static void main(String[] args) {
        Person p = new Person("Nimal", "0718332332");
        Person p2; // declaration
        p2 = new Person("Amala", "0772233322");
        p.display();
        p2.display();
        Person p3 = new Person();
        p3.display();
        p3.setName("Jagath");
        p3.setMobileNo("078233122");
        p3.display();
        System.out.println(p2.getName());

    }
}