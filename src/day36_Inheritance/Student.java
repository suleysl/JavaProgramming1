package day36_Inheritance;

public class Student {


    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setAge(int age){

        if( age <5 || age > 90){
            return;
        }
        this.age= age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if( !(gender == 'M' || gender== 'F')){
            return; // exits the method
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if( !(grade == 'A' || grade=='B' || grade== 'C' || grade=='D' || grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
