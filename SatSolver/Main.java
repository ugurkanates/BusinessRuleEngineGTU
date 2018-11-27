
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) // check for exactly one argument
        {
            System.out.println("ERROR: A single input file was not specified correctly!");
            System.exit(0);
        }
        Timer timer = new Timer();
        timer.start(); //start timer
        DPSolver solver = new DPSolver(args[0]); //solve
        timer.stop(); //stop timer
        System.out.println("Total SAT Execution Time = " + timer.getDuration() + " seconds!"); //print calculated total time
    }
}
