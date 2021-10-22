abstract class PortableComputer extends ComputerImpl {
    String monitor;
    String keyboard;
    public PortableComputer(String maker, String model, String cpu, String ram, String ssd, String monitor, String keyboard) {
        super(maker, model, cpu, ram, ssd);
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
    @Override
    public String toString(){
        return "maker " + this.maker + "," + " model " + this.model + "," + " ram " + this.ram + "," + " cpu " + this.cpu + "," + " monitor " + this.monitor + "," + " keyboard " + this.keyboard ;
    }
}
