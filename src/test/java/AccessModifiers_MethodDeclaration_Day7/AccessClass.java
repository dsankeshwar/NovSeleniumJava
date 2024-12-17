package AccessModifiers_MethodDeclaration_Day7;

public class AccessClass {

    public static void main(String[] args) {

        //Below line of code will throw an error because we are trying to access
        //a default method that is present in another class and another package
//        MethodDeclarations.sumOfTwoNumbers(40,12432);

        MethodDeclarations.main(args);
    }
}