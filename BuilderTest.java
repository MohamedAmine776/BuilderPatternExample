public class BuilderTest {
    public static void main(String [] args){
        factory fact = new factory();
        ComputerBuilder pcBuilder = new pcBuilder();
        ComputerBuilder serverBuilder=new serverBuilder();
         //construction of a PC
        fact.setComputerBuilder(pcBuilder);
        fact.constructComputer();
        Computer pc=fact.getComputer();
        System.out.println(pc.toString());
        //construction of a server
        fact.setComputerBuilder(serverBuilder);
        fact.constructComputer();
        Computer server =fact.getComputer();
        System.out.println(server.toString());
    }

}
