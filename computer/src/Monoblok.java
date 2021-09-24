public class Monoblok extends ComputerImpl {
    String monitor;
    public Monoblok (String maker, String model, String cpu, String ram, String ssd, String monitor) {
        super(maker, model, cpu, ram, ssd);
        this.monitor = monitor;
    }
    @Override
    public String toString(){
        return "maker " + this.maker + "," + " model " + this.model + "," + " ram " + this.ram + "," + " cpu " + this.cpu + "," + " ssd " + this.ssd + "," + " monitor " + this.monitor;
    }
}