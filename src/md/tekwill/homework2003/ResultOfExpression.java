package md.tekwill.homework2003;

public class ResultOfExpression {
    public static void main(String[] args){
        int a=7;
                   //8    //7  //7    //9   //9  //7   //7    //9
        int result =++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
        //8 //value of a increments with one unit till 8, due to the prefix notation
        //a is now 8
        //7 //value of a decrements with one unit till 7, due to the prefix notation
        //a is now 7
        //7 // here value of a stays the same because of the postfix notation
        //a increments now to 8 due to postfix ++ used prior to this
        //9 //the value of a increments to 9, due to prefix notation
        //a is 9 now
        //9 //here value of a stays the same because  of the postfix notation
        //a decrements to 8 due to postfix -- used prior to this
        //7 //the value of a decrements to 7, due to prefix notation
        //a is 7 now
        //7 //here value of a stays the same because of the postfix notation
        //a increments to 8 due to postfix ++ used prior to this
        //9 //the value of a increments to 9, due to prefix notation
        //final operation 8-7+7+9-9-7-7+9=3
        System.out.println(result);

    }
}
