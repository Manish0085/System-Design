package FacadeDesignPattern;

public class ComputerFacade {

    private PowerSupply powerSupply;
    private CoolingSystem coolingSystem;
    private CPU cpu;
    private Memory memory;
    private HardDrive drive;
    private BIOS bios;
    private OperatingSystem os;

    public ComputerFacade() {
        this.powerSupply = new PowerSupply();
        this.coolingSystem = new CoolingSystem();
        this.cpu = new CPU();
        this.memory = new Memory();
        this.bios = new BIOS();
        this.drive = new HardDrive();
        this.os = new OperatingSystem();
    }

    public void startComputer(){
        System.out.println("-------- Starting Computer --------");
        powerSupply.providePower();;
        coolingSystem.startFans();
        bios.boot(cpu, memory);
        os.load();
    }
}
