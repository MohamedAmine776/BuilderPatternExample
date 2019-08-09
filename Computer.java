public class Computer {
    private String HDD;
    private String RAM;
    private String CPU;


    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
