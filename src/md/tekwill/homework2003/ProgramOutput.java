package md.tekwill.homework2003;

public class ProgramOutput {
    public static void main (String[] args) {
        int a=18;
        int b=22;
        int c=30;
        System.out.println(++a > 18 || b++ < 10);
        /*true, because we have the logical operator OR, and since ++a(which is 19) is greater than 18 which is true
        there's no need to evaluate the second condition with b, so after this statement a will be 19
        and b will be still 22
         */
        System.out.println(b-- > 30 && a++ <= 19);
        /*false, because we have the logical operator AND, and since b--
        is not greater than 30 (first condition is false) there's no need to evaluate the second condition with a
         */
        System.out.println(c++ > a && a < b || c++ < 30 );
        /* true, because the first condition is true (c++ is greater than a which is 19) and the second condition
        is also true a(19) is smaller than b(21), so there's no need to evaluate the third condition with c, because
        of the OR operator, which will output true, even if only one condition is true
         */
        System.out.println("a="+a);
        //a is 19 because in the very first condition a was incremented by 1 (++a > 18)
        System.out.println("b="+b);
        /*b is 21, because of the condition (b-- > 30) which was executed. b will be decremented after this current
        value is used (used in a<b).value of b decrements to 21 due to the postfix-- used prior to this
         */
        System.out.println("c="+c);
        //c is 31 because of the condition (c++ >a)<- value of c increments to 31 due to the postfix++ used prior to this

    }


}
