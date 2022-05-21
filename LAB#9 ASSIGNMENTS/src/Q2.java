class CPU{
    double price;

    class Processor{
        String manufacturer;
        double cores;

        double getCache(){
            return 4.2;
        }
    }
    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.3;
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        CPU.Processor process=cpu.new Processor();
        CPU.RAM ram=cpu.new RAM();
        System.out.println(process.getCache());
        System.out.println(ram.getClockSpeed());
    }
}
