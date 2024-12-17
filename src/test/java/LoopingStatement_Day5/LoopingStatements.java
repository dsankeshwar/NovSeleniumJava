package LoopingStatement_Day5;

public class LoopingStatements {

    public static void main(String[] args) {

        //Looping Statements:
        //Repeating the code multiple times until the condition is satisfied

        //Different Types of Loop statments:
        //1. while
        //2. do-while (Used Very Rarely)
        //3. for
        //4. for-each

        //Syntax of while loop:
        //while(condition to be checked)
            //Block of code to be executed

        int b=40;

        // != (Value present on the left hand side is not same as value present on the right hand side)
        while(b!=40)
            System.out.println(b);

        //Loop runs for infinite times
//        while((b-30)%3!=0)
//            System.out.println(b);

        while(b<60)
        {
            System.out.println(b);
            b+=1;
        }

        System.out.println("************************************");

        //b=60
        while(b>30)
        {
            System.out.println(b);
            b*=10;
        }

        System.out.println("************************************");

        b=30;

        while(b>0) //b=0    
        {
            System.out.println(b*2); //2
            b/=2; //b=b/2-->0
        }


    }
}
