public class test1 {
    static void fun(int... a){
        System.out.println("numaber of arguments:" + a.length);
        for(int i:a)
            System.out.println(i +" ");


    }

    public static void main(String[] args) {
        fun(100,1,3,4);
        fun(100);
        fun(1,2,3,4,5);
    }
}
