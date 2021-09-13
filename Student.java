public class Student {
    int age;

    // Constructor
    public Student(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int calculateDOB() {
        int age = 33;
        int currentYear = 2020;
        int yearOfBirth = currentYear - age;
        return yearOfBirth;
    }

    public int calculateDOB(int currentYear) {
        int age = 33;
        int yearOfBirth = currentYear - age;
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Student secondStudent = new Student(33);
        System.out.println("Year of Birth: " + secondStudent.calculateDOB());
        System.out.println("Year of Birth: " + secondStudent.calculateDOB(2020));
    }
}
