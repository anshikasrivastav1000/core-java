package Question;
//question 2
class Reactangle{
    int length;
    int Breadth;
Reactangle(){

}
    Reactangle(int l, int b)
    {
        length = l;
        Breadth = b;

    }
    int perimeter(){
        return 2* (length+Breadth);
    }
    int area(){
        return length*Breadth;
    }

};
class Square extends Reactangle{
  Square(){

}
Square(int l){
      super(l,l);
}
        }

public class OPPS2 {
    public static void main(String[] args){
        Square obj = new Square(5);

        System.out.println(obj.perimeter());
        System.out.println(obj.area());

    }
}
