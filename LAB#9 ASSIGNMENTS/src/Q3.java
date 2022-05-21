import java.util.Scanner;

class Car{
    String carname;
    String cartype;
    Car(){}

    public Car(String carname, String cartype) {
        this.carname = carname;
        this.cartype = cartype;
    }
    private String getCarname() {
        return carname;
    }
    class Engine{
        String Enginetype;

        void setEngine(){
            if(cartype.equals("4T")){
                if(carname.equals("Mehran")){
                    this.Enginetype="Small";
                }
                else
                    this.Enginetype="Large";
            }
            else
                this.Enginetype="Bigger";
        }
        public String getEnginetype() {
            return Enginetype;
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Car");
        String carname = sc.next();
        System.out.println("Enter Car Type");
        String Cartype = sc.next();
        Car c = new Car(carname,Cartype);
        Car.Engine E = c.new Engine();
        E.setEngine();
        System.out.println("Engine Type = "+E.getEnginetype());
    }
}
