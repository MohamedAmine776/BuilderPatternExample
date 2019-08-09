public class factory {
    private ComputerBuilder computerBuilder ;
     public void setComputerBuilder(ComputerBuilder cb){
         computerBuilder=cb ;
     }
    public Computer getComputer(){
         return computerBuilder.getComputer();
    }
    public void constructComputer(){
         computerBuilder.newComputer();
         computerBuilder.buildCPU();
         computerBuilder.buildHDD();
         computerBuilder.buildRAM();
    }
}
