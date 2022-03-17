class car{
    String company="BMW";
    String model="3-series";
    void does(){
        System.out.println("Driving pleasure.");
    }
}
public class modelyear extends car{
    String model_year="2021";

    public static void main(String[] args) {
        modelyear ob=new modelyear();
        System.out.println(ob.company);
        System.out.println(ob.model);
        System.out.println(ob.model_year);
        ob.does();
    }
        }