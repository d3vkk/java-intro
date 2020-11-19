package School.src;

public class Student {
    // Instance variables
    String regNo;
    String name;
    String degreeProgram;
    int age;
    // Class variable
    static String gender;

    // Constructor
    public Student(String regNo, String name, String degreeProgram, int age){
        // variable names are case sensitive and camel Cased
        this.regNo = regNo;
        this.name = name;
        this.degreeProgram = degreeProgram;
        this.age = age;
    }

    /*
        public -access modifier
        void - return type
        (String - parameter type
        regNo)- parameter name
    */
    // Setters - set value from class
    public void setRegNo(String regNo){
        this.regNo = name;
    }

    // Getters - get value from class
    public String getRegNo(){
        return regNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDegreeProgram(String degreeProgram){
        this.degreeProgram = degreeProgram;
    }

    public String getDegreeProgram(){
        return degreeProgram;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /*
        Method overloading is where you have more
        than one function with the same name but
        take in different parameters
    */
    public int calculateDOB() {
        int currentYear = 2020;
        int yearOfBirth = currentYear - age;
        return yearOfBirth;
    }

    public int calculateDOB(int currentYear) {
        int yearOfBirth = currentYear - age;
        return yearOfBirth;
    }
}
