package JavaIntro.Human.src;

public class Baby extends Human {
    private String nameOfBaby = name + "Jayden";

    public void eat() {
        System.out.println(nameOfBaby + " eat porridge");
    }

    public String getNameOfBaby() {
        return nameOfBaby;
    }
}
