package School.src;

public class App {
    // main function initialised
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Variable initialisation
        String firstStudentRegNo = null;

        // Creating an object
        Student firstStudent = new Student("COM/1000/88", "Makoyo", "dadsa", 32);
        System.out.println(firstStudent.age);

        // Calling a getter
        firstStudentRegNo = firstStudent.getRegNo();
        System.out.println(firstStudentRegNo);

        // Calling a setter
        firstStudent.setName("Mariba");
        System.out.println(firstStudent.name);

        // Class variable can be referenced directly
        String firstStudentGender = Student.gender;
        System.out.println(firstStudentGender);

        // When a String is empty it'll show null
        // When a int is empty it'll show 0

        Student secondStudent = new Student("COM/900/75", "Mbuyu", "Med", 33);
        System.out.println(secondStudent.calculateDOB());
        System.out.println(secondStudent.calculateDOB(2020));
    }
}
