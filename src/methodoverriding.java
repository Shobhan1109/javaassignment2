public class methodoverriding {
    void runn(){
        System.out.println("Vehicle is running.");
    }
}
class bike extends methodoverriding{
    public static void main(String[] args) {
        bike ob=new bike();
        ob.runn();
    }
}