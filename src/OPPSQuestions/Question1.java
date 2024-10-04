package OPPSQuestions;



class student {
    private String name;
    private int age;
    private int marks[] = new int[3];
    student(String Name, int Age, int Marks[]){
        name = Name;
        age = Age;
        marks[0] =Marks[0];
        marks[1] =Marks[1];
        marks[2] =Marks[2];

    }
    public  String get_name(){
        return  name;
    }
    public  int get_age(){
        return  age;
    }
    public  int get_maximum_marks(){
        int maximum = marks[0];
        if(marks[1] >= marks[0] && marks[1] >= marks[2]){
            maximum = marks[1];
        }
        else if(marks[2] >= marks[0] && marks[2] >= marks[1])
        {  maximum = marks[2];
        }

        return maximum;
    }
    public class Question1 {
        public  static void main(String[] args){
            int marks[] = new int[3];
            marks[0] =90;
            marks[1] =80;
            marks[2] =70;
            student obj = new student("anshu" ,20,marks);
            System.out.println(obj.get_age());
            System.out.println(obj.get_name());
            System.out.println(obj.get_maximum_marks());

        }
    }
}

