package main;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(" Task three");
        System.out.println(" ");
        System.out.println(Calculator.sum(2,5));
        System.out.println(Calculator.subtract(10, 5));
        System.out.println(Calculator.multiply(2,5));
        System.out.println(Calculator.divide(6, 3));
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println("Task four");
        System.out.println(" ");
        System.out.println( AgeVerification.age((byte)18));
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println("Task five ");
        System.out.println(" ");
        System.out.println(IsEven.evenNumber(18));
        System.out.println(IsNotEven.notEvenNumber(15));
    }
}