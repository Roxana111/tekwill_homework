package md.tekwill.homework2003;

public class DeclareDatatype {
    public static void main(String[] args){
        int intValue=50;
        double doubleValue=30.2;
        double sumOfIntAndDouble=intValue+doubleValue;
        /* data type of sumOfIntAndDouble is double because if an arithmetic operation includes a double data type
        all operand values are widened to double. When one operand is double and the other is int, Java creates a new
        temporary value that is the double version of the int operand.

         */
        System.out.println(sumOfIntAndDouble);

    }

}
