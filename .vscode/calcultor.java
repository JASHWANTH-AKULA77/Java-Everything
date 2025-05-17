public class calcultor {
    public static void main(String[] args) {
        add();
        sub(10, 5);  
        System.out.println(mul());
        System.out.println(div(10, 5));

    }
    static void add(){
        int a=10,b=5;
        int res=a+b;
        System.out.println(res);
    }
    static void sub(int a,int b){
        int res=a-b;
        System.out.println(res);
    }
    static int mul(){
        int a=10,b=5;
        int res=a*b;
        return res;
    }
     static int div(int a,int b){
        int res=a/b;
        return res;
    }
}
