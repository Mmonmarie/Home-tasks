public abstract class ComputerImpl implements Computer
{

    String maker;
    String model;
    String processor;
    String ram;
    String ssd;
    String cpu;
    public ComputerImpl (String maker, String model, String ram, String ssd, String cpu){
        this.maker = maker;
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
    }
    public String turnOn() {
        return "Turn on " + getClass().getSimpleName() + " " + toString();
    }

    public String turnOff() {
        return "Turn on " + getClass().getSimpleName() + " " + toString();
    }

    public String connect() {
        return "Connect to internet " + getClass().getSimpleName() + " " + toString();
    }
    @Override
    public String toString(){
        return "maker " + this.maker + "," + " model " + this.model + "," + " ram " + this.ram + "," + " cpu " + this.cpu + "," + " ssd " + this.ssd;
    }
}
