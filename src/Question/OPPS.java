package Question;
//QUESTION2 count how many object
class SchoolMenber
{
    String name;
 static    int number; //number of obj
    SchoolMenber(){}
}
class Teacher extends SchoolMenber{
    Teacher(){
        number++;
    }

}
class Student extends SchoolMenber{
    Student(){
        number++;
    }

}

public class OPPS {
    public static void main(String[] args){
Student obj = new Student();
        Teacher obj1 = new Teacher();
        System.out.println(SchoolMenber.number);
}}