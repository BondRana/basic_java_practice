import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        int laptop_price=76000, purchase_price=0;
        System.out.println("Buy through cash press:1, Buy through card press:0");
        Scanner sc = new Scanner(System.in);
        int type= sc.nextInt();
        if(type==1){
            purchase_price= laptop_price-(laptop_price*10/100);
        }
        if(type==0){
            purchase_price= laptop_price;
        }
        System.out.print("The purchase price is:"+purchase_price);

    }
}
