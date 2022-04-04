import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        int Formal_shirt=1200, Saree=3500, purchase_price=0;
        System.out.println("Enter the amount of Shirt:");
        Scanner sc1 =new Scanner(System.in);

        int i=sc1.nextInt();
        System.out.println("Enter the amount of Saree:");
        Scanner sc2 =new Scanner(System.in);
        int j=sc2.nextInt();

        if(i==2&&j==1){
            purchase_price= (Formal_shirt*2 + Saree*1)-400;
        }
        else{
            purchase_price= Formal_shirt*i + Saree*j;
        }

        System.out.println("The purchase price is:"+purchase_price);
    }
}
