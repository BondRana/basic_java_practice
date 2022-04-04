import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("To keep the count press 1 and To terminate press 0");
        Scanner sc = new Scanner(System.in);
            while (true) {
                int num = sc.nextInt();
                count=count+num;
                System.out.println("The count is:" + count);

                if (num == 0) {
                    System.out.println("The count reset, count:0");
                    break;
                }
            }
        }
   }

