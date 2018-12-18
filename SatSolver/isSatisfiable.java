package issatisfiable;

public class isSatisfiable {

    private String CNF;
    private boolean isCNF;

    public isSatisfiable(String CNF, boolean isCNF) {

        this.CNF = CNF;
        this.isCNF = isCNF;
    }

    public boolean isCNFSatisfiable() {

        if (isCNF) {
            DPSolver solver = new DPSolver();
            return solver.solve(CNF);
        }
        //System.out.println("The formula is unsatisfiable!");
        return false;
    }

}

/* Main.java
        isSatisfiable isSat = new isSatisfiable("(1,2,3).(1,2,-3).(1,-2,3).(1,-2,-3).(-1,2,3).(-1,2,-3).(-1,-2,3).(-1,-2,-3)", true);
        System.out.println(isSat.isCNFSatisfiable());
 */