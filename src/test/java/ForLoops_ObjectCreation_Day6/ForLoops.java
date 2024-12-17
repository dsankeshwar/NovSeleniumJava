package ForLoops_ObjectCreation_Day6;

public class ForLoops {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        //For Loop: Loop keeps on running until the condition is satisfied

        //Syntax of for loop:
        //for(initial value; condition to be satisfied; iterator)
//        {
//              Block of Code
//        }

        for(int i=0;i<5;i=i+1)
        {
            System.out.println(i);
        }

        System.out.println("*************************************************************************");

        for(int i=100;i>0;i=i-2)
            System.out.println(i);

        System.out.println("**********************************************************************************");

        for(int i=0;i<500;i++)
        {
            if(i%2==0)
            {
                int j=0;

                while(j<200)
                {
                    System.out.println(j);
                    j=j+5*5;
                }
            }

            else {

                do {
                    System.out.println(i*i);
                }
                while (i>30);
            }

            break;
        }

        System.out.println("**********************************************************************************");

        for(int j=0;j<20;j=j+4)
        {
            if(j==12)
                continue; //skip the current iteration or current run of the loop

            else
                System.out.println(j);
        }

        System.out.println("**********************************************************************************");

        for(String s="Hello";s.length()<10;s=s+"!")
        {
            System.out.println(s);
        }
    }
}