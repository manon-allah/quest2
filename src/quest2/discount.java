
package quest2;

public class discount {
    private static double s_discount_p = 0.2;
    private static double s_discount_g = 0.15;
    private static double s_discount_s = 0.1;
    private static double p_discount_p = 0.1;
    private static double p_discount_g = 0.1;
    private static double p_discount_s = 0.1;

    public static void get_service_discount(String type , double d) {
        switch (type) {
            case "premium":
                System.out.println(s_discount_p + "     " + "The discount " + d * s_discount_p);
                break;
            case "gold":
                System.out.println(s_discount_g + "     " + "after the discount " + d * s_discount_g);
                break;
            case "silver":
                System.out.println(s_discount_s + "     " + "after the discount " + d * s_discount_s);
                break;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }
    public static double get_product_discount(String type , double d) {
        switch (type) {
            case "premium":
                System.out.println(p_discount_p + "     " + "The discount " + d * s_discount_p);
                break;
            case "gold":
                System.out.println(p_discount_g + "     " + "after the discount " + d * s_discount_g);
                break;
            case "silver":
                System.out.println(p_discount_s + "     " + "after the discount " + d * s_discount_s);
                break;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

}
