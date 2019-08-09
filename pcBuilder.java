public class pcBuilder extends ComputerBuilder {
    @Override
    public void buildHDD() {
        computer.setHDD("500GB");
    }

    @Override
    public void buildCPU() {
computer.setCPU("i5");
    }

    @Override
    public void buildRAM() {
computer.setRAM("4gb");
    }
}
