package JavaIntro.Human.src;

public class Woman extends Human {
    private String nameOfWoman = name + "Sally";

    public void eat() {
        System.out.println(nameOfWoman + " eat corn");
    }

    public String getNameOfWoman() {
        return nameOfWoman;
    }
}
