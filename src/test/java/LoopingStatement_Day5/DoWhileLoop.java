package LoopingStatement_Day5;

public class DoWhileLoop {

    public static void main(String[] args) {

        //Do-While Loop:
        //Loop runs atleast once irrespective of the condition is satisfied or not

        //Syntax of Do-While Loop:
        //do
//        {
            //Block of code
//        }

        //while(condition);

        int cds=401;

        do {
            System.out.println("Value of cds is: "+cds);
        }
        while (cds<400);

        int a=12-532;

        do {
            System.out.println("Value of a is: "+a);
            break; //To Terminate the loop immediately
        }

        while (a%2==0);

        a=50-10*3-400+20;

        do {
            System.out.println("Value of a is: "+a);
            a=a+10;
        }

        while (a%3==0);

        char b='K';
        char c='L';


        do {

            //Here we take the ASCII Values of the characters during any arithmetic operations
            System.out.println(b+c);
            break;
        }
        while (b%2==c%3);

        a=40-230-200*210-302;
        boolean d=false;

        do {
            System.out.println(a);

            if(a%5==0)
                d=true;

            else if(a%2==0 || a%3==0)
                d=true;

            else
                d=false;

            a=a+1;

        }
        while(d); //while(true) --> Loop will continue
                  //while(false) --> Loop will be stopped

    }
}