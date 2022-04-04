import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        int sum=0, number, digit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = sc.nextInt();
        while (number>0){

            digit= number%10;

            sum= sum+digit;

            number=number/10;
        }
        System.out.println("sum of digits:"+sum);
    }
}
