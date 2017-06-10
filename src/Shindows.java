/**
 * Created by Тим on 10.06.2017.
 */
public class Shindows {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Shindows() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void makeShindowsGreatAgain() {
        System.out.println("Forger MCNTSH!\nMake Shindows Great Again");
        cpu.execute();
        memory.load();
        hardDrive.read();
        hardDrive.write();
        System.out.println("Thnks for bring your mny to BillySoft");
    }
}

