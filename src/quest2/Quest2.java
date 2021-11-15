
package quest2;

import java.util.Scanner;

public class Quest2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        String x , y ;
        double num1 , num2 ;
        
        System.out.println("Enter the type for service");
        x = in.nextLine();
        discount.get_service_discount(x , 55);
        System.out.println("Enter the type for product");
        y = in.nextLine();
        discount.get_product_discount(y , 55);
    }
    
}
