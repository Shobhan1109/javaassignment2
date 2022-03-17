public class methodoverload {
    public int multiply(int a,int b){
        return a*b;
    }
    public int multiply(int a,int b, int c){
        return a*b*c;
    }
    public double multiple(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        methodoverload ob=new methodoverload();
        int result1 = ob.multiply(10,20);
        int result2 = ob.multiply(10,30,50);
        System.out.println(result1);
        System.out.println(result2);

    }
}
