interface IDisplay {
    void display();

    void displayDetail();
}

class Person implements IDisplay {
    private String name;
    private String mobileNo;

    public Person(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public void display() {
        System.out.println(name + " " + mobileNo);
    }

    public void displayDetail() {
        System.out.println("Name = " + name);
        System.out.println("Mobile No = " + mobileNo);
    }
}

class Book implements IDisplay {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println(title + " " + author);
    }

    public void displayDetail() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
    }

    public void calc() {
        System.out.println("Computation is been carried out");
    }

}

class Interface {
    public static void main(String[] args) {

        Book bk = new Book("Star Wars", "George Lucas");
        Person p = new Person("Kamal", "0721334222");
        bk.display();
        p.display();
        bk.displayDetail();
        p.displayDetail();

        // Class classname = new Class();
        // Interface ivar = new Class();
        // Any class that implements that interface
        IDisplay id = new Book("Famous Five", "Enid Blyton");
        IDisplay id2 = new Person("Indika", "078223232");
        id.display();
        id2.display();
        Book bk2;
        bk2 = (Book) id;
        bk2.calc();
        IDisplay objs[];
        objs = new IDisplay[2];
        objs[0] = bk;
        objs[1] = p;
        for (int r = 0; r < 2; r++)
            objs[r].displayDetail();
    }
}