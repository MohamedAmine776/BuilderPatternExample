abstract class ComputerBuilder {
    protected  Computer computer ;

    public Computer getComputer() {
        return computer;
    }
    public void newComputer(){
        computer= new Computer();
    }

    public abstract void buildHDD();
    public abstract void buildCPU();
    public abstract void buildRAM();
}
