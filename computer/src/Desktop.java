public class Desktop extends ComputerImpl{
    String vCard;
    public Desktop(String maker, String model, String cpu, String ram, String ssd, String vCard) {
        super(maker, model, cpu, ram, ssd);
        this.vCard = vCard;
    }
    @Override
    public String toString(){
        return "maker " + this.maker + "," + " model " + this.model + "," + " ram " + this.ram + "," + " cpu " + this.cpu + "," + " ssd " + this.ssd + "," + " videocard" + this.vCard;
    }
}
