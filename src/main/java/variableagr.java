public class variableagr {
    private void test(int ... a) {
        for (int i : a) {
            System.out.println(i);

        }

    }

    private void test(boolean p,String ... b){
        for( String i:b){
            System.out.println("boolean:"+p +"String:"+i);
        }

    }


    public static void main(String[] args) {
        variableagr obj =new variableagr();
        obj.test(1,2,3,4);
        obj.test(true,"raj","raviknat");
    }
}
