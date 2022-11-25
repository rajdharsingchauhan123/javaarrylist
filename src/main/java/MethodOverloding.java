public class MethodOverloding {
    public static void display(int a){
        System.out.println("Argumnents:" +a);
    }
    public static void display(int a,int b){
        System.out.println("Argumnents:" +a +"and" +b);
    }
    public static void main(String[] args) {
        display(3);
        display(2,5);
    }

}
