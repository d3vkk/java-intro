public class Human {
    protected String name = "Name | ";

    public void eat() {
        System.out.println("Human beings eat food");
    }

}

public class Man extends Human {
    private String nameOfMan = name + "Billy";

    public void eat() {
        System.out.println(nameOfMan + " eat beans");
    }

}
