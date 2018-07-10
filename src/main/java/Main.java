public class Main {
    public static void main(String[] args) {

        Simulation sim1 = new Simulation();
        System.out.println(sim1.simulate(15,6, 100L));

        Simulation sim2 = new Simulation();
        System.out.println(sim2.simulate(0,1, 500L));
        
        Simulation sim3 = new Simulation();
        System.out.println(sim3.simulate(0,1, 10000L));

    }

}
