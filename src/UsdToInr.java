import java.util.Scanner;
public class UsdToInr {
    public static void main(String args[]){
        float USD;
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees: ");
        float INR = cc.nextFloat();
        USD = (1f / 80) * INR;
        System.out.println("Amount in USD is: " + USD);
    }
}
