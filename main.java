import Models.Mammals;
import Models.student;

public class main{

    public static void main(String[] args) {

        Mammals human = new Mammals();
        Mammals cow = new Mammals();

        System.out.println(human);
        System.out.println(cow);

        System.out.println(human.getNo_of_chambers());
        System.out.println(cow.isWarmblooded());

        System.out.println(human.getFoods());
        human.setFoods("Meat");
        System.out.println(cow.getFoods());

        System.out.println("human");
        System.out.println(human.getFoods());

        student obj1 = new student();
        student obj2 = new student();

        obj1.setName("Prarthana");
        obj1.setAge(16);
        obj1.setGrade(10);

        obj2.setName("No one");
        obj2.setAge(15);
        obj2.setGrade(9);

        obj1.displayInfo();
        obj2.displayInfo();
        
    }
}
