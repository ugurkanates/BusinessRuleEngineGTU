public class DPSolver{
    
    public DPSolver(String fileName){
        Formula formula = new Formula();
        formula.read(fileName);
        solve(formula);
    }

    public boolean dpSolver(Formula f){
        if(f.isFormulaEmpty())//formula emmpty or solved
            return true;
        else if(f.hasEmptyClause())//formula has empty clause
            return false; 
        else {
            int varAvailable = f.firstAvailable();
            f.assign(varAvailable, 1);
            if(dpSolver(f)) 
                return true;
            else{
                f.unset(varAvailable);
                f.assign(varAvailable, -1);
                if(dpSolver(f)) 
                    return true;
                else{
                    f.unset(varAvailable);
                    }
                    return false;
                }
            }
    }
    
    public void solve(Formula f) {
        if(dpSolver(f)){
            System.out.println("The formula is satisfiable with the following variables!");
            f.printAssignment();
        }
        else
            System.out.println("The formula is unsatisfiable!");
    }
}
