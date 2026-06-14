//write a code to input marks of 5 subjects from a student and calculate percentage
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter marks for the subject Maths = ");
        double maths = sc.nextDouble();
        System.out.println("Please enter marks for the subject Computers = ");
        double computers = sc.nextDouble();
        System.out.println("Please enter marks for the subject Physics = ");
        double physics = sc.nextDouble();
        System.out.println("Please enter marks for the subject Chemistry = ");
        double chemistry = sc.nextDouble();
        System.out.println("Please enter marks for the subject Biology = ");
        double biology = sc.nextDouble();
        double sum = maths + computers + physics + chemistry + biology;
        System.out.println("The sum is " + sum);
        long total = 500;
        double percentage = 100 * sum / total;
        System.out.println("The percentage is " + percentage);
    }
}
