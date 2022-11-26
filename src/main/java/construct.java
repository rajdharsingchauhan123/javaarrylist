public class construct {
    int x;
//    private construct(){
//        x=5;
//    }
    construct(int x)
    {
        this.x =x;
    }


    public static final void main(String[] args) {
        construct myobj =new construct(7);
        System.out.println(myobj.x);
    }
}
