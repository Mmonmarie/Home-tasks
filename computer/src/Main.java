public class Main {
    public static void main(String[] args){
        Computer[] computers = new Computer[6];
        computers[0] = new Netbook("Mac", "new model","Intel5", "16GB", "128GB", "big", "black");
        computers[1] = new Laptop("Mac", "new model","Intel5", "16GB", "128GB", "big", "black");
        computers[2] = new Monoblok("Mac", "new model","Intel5", "16GB", "128GB", "big");
        computers[3] = new Desktop("Mac", "new model", "Intel5", "16GB", "128GB", "fast");
        computers[4] = new Nettop("Mac", "new model", "Intel5", "16GB", "128GB");
        computers[5] = new Server("Mac", "new model","Intel5", "16GB", "128GB");
        for(Computer computer: computers){
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
        }
        System.out.println();
    }
}
