package Models;

public class student {
    String name = "";
    int age = 15;
    int grade = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInfo(){

        System.out.println("The student's name is "+ name + "age is"+ age +  "and studies in" + grade );
    }
}

