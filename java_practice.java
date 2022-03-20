import java.util.Scanner;
public class java_practice {
    public static void main(String[] args) {
        double b = 0;
        System.out.println("hello!");
        System.out.println("commit?");


        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        System.out.println("commit?");
        

        double c = 0;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        b = scan1.nextDouble();
        c = scan2.nextDouble();

        double num1=(-b+Math.sqrt(b*b-4*c))/2;
        double num2=(-b+Math.sqrt(b*b-4*c))/2;
        System.out.println(num1);
        System.out.println(num2);
        scan1.close();
        scan2.close();
    }
}

    

