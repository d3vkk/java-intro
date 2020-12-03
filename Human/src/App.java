package JavaIntro.Human.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Human human = new Human();
        human.eat();

        Man man = new Man();
        man.eat();
        System.out.println(man.getNameOfMan());

        Woman woman = new Woman();
        woman.eat();
        System.out.println(woman.getNameOfWoman());

        Baby baby = new Baby();
        baby.eat();
        System.out.println(baby.getNameOfBaby());

        System.out.println("Enter your year of birth");
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = scanner.nextInt();
        System.out.println("Your age is: " + man.calculateAge(yearOfBirth));
        scanner.close();
    }
}
