public class coffeeShop {
    public static void orderCoffee(){
    System.out.println("Orderd a default coffee");

    }
    public static void orderCoffee(String type){
        System.out.println("odered a "+type+" coffee");

    }
    public static String orderCookie(){
        return  "Ordered a default cookie";
    
    }
    public static String orderCookie(String type){
        return "Order a type of coffee";
    }
  public static void main(String[] args) {
        
        orderCoffee();
        orderCoffee("Expresso");
        String cookieOrder1=orderCookie(null);
        System.out.println(cookieOrder1);
        String cookieOrder2=orderCookie("Chocloate");
        System.out.println(cookieOrder2);

}
}
