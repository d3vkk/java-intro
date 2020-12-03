package JavaIntro.Human.src;

public class Man extends Human {
    private String nameOfMan = name + "Billy";

    public void eat() {
        System.out.println(nameOfMan + " eat beans");
    }

    public int calculateAge(int yearOfBirth) {
        int currentYear = 2020;
        int Age = currentYear - yearOfBirth;
        return Age;
    }

    public String getNameOfMan() {
        return nameOfMan;
    }

}
