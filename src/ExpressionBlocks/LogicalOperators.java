package ExpressionBlocks;

public class LogicalOperators {

    public static  void main (String[] args ){

        //logical oprators are used to check whether an expresion is true or false
        //they used in decision makeing

        //1.&& (logical AND )expression && expression2
        System.out.println((5>3) && (8>5));
        System.out.println((5<3) && (8>5));

        //2. || (Logical OR) exp || exp2
        System.out.println((5<3) || (8>5));
        System.out.println((5>3) || (8<5));
        System.out.println((5<3) || (8<5));

        //! (logical NOT ) !exp

        //true if exp is false and vica versa
        //it gives the opposite

        System.out.println(!(6>3));



    }
}
