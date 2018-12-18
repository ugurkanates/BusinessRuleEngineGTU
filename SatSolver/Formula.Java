package issatisfiable;// GTU BIZTALK PROJE GRUP 1

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Formula {

    private int[] assignedValues;
    private int vars, clauses;
    private int[][] formulaArr;
    private LinkedList<Integer> formula = new LinkedList<>();

    public void read(String file) {
        FormulaReader reader = new FormulaReader();
        reader.read(file);
        vars = reader.getVariables();
        clauses = reader.getClauses();//set vars, clauses, formula array
        formulaArr = reader.getFormula();
        assignedValues = new int[vars + 1];
        for (int i = 0; i < clauses; i++)//create formula linkedlist
            formula.add(i);
        formula.add(-1);//delimiter add
    }

    public void readString(String cnf) {
        FormulaReader reader = new FormulaReader();
        reader.readFromString(cnf);
        vars = reader.getVariables();
        clauses = reader.getClauses();//set vars, clauses, formula array
        formulaArr = reader.getFormula();
        assignedValues = new int[vars + 1];
        for (int i = 0; i < clauses; i++)//create formula linkedlist
            formula.add(i);
        formula.add(-1);//delimiter add
    }

    public boolean isFormulaEmpty() {
        return formula.getFirst() == -1;
    }

    public boolean isClauseEmpty(int clause) {
        for (int i : formulaArr[clause]) {
            if (assignedValues[Math.abs(i)] == 0)
                return false;
        }
        return true;
    }

    public boolean hasEmptyClause() {
        for (int i : formula) {
            if (i == -1)//end of unsatisfied clauses
                break;
            if (isClauseEmpty(i))//check if current clause is empty
                return true;
        }
        return false;
    }

    public int firstAvailable() {//loop through variables array
        for (int i = 1; i <= vars; i++)//find first 0 and return it's index
            if (assignedValues[i] == 0)
                return i;
        return -1;//else returns -1
    }

    public LinkedList<Integer> separateClauses() {
        LinkedList<Integer> returnList = new LinkedList<>();
        for (int i : formula) {
            if (i == -1)//end of unsatisfied clauses
                break;
            returnList.add(i);
        }
        return returnList;
    }

    public void assign(int var, int value) {//assigns the var to value
        assignedValues[var] = value;
        LinkedList<Integer> satisfiedList = new LinkedList<>();
        LinkedList<Integer> unsatisfiedList = new LinkedList<>();
        separateClauses().forEach((i) -> {
            if (isClauseSatisfied(i))//if clause is satisfied adds it to
                satisfiedList.add(i);//satisfied sublist
            else
                unsatisfiedList.add(i);//else adds to unsatisfied 
        });
        ListIterator<Integer> newFormula;
        if (separateClauses().size() + 1 > formula.size())
            newFormula = formula.listIterator(separateClauses().size());
        else
            newFormula = formula.listIterator(separateClauses().size() + 1);
        if (satisfiedList.size() > 0)
            satisfiedList.add(-1);
        unsatisfiedList.add(-1);
        unsatisfiedList.addAll(satisfiedList);
        while (newFormula.hasNext()) //reconstructs new formula
            unsatisfiedList.add(newFormula.next());
        formula = unsatisfiedList;
    }

    public boolean isClauseSatisfied(int clause) {
        for (int i : formulaArr[clause]) {
            if (i < 0) {//check if current clause value is negation
                if (assignedValues[Math.abs(i)] == -1)
                    return true;
            } else if (assignedValues[i] == 1)
                return true;//current clause value is not negation
        }
        return false;
    }

    public void unset(int var) {
        assignedValues[var] = 0;
        int index = 0;
        for (int i : formula) {
            if (i == -1) {
                formula.remove(index);
                break;
            }
            index++;
        }
    }

    public void printAssignment() {//prints assignment array to string
        System.out.println("Assigned Variables Array: " +
                Arrays.toString(assignedValues));
    }

    public void printFormula() {//prints formula linkedlist to string
        System.out.println("Formula LinkedList: " + formula.toString());
    }

    public void print() {//prints both assignment array and formula
        printAssignment();
        printFormula();
    }
}
