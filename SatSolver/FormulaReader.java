import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class FormulaReader {

    private int[][] formula;    //formula array
    private int numVars, numClauses;

    public void read(String file) {
        try {
            Scanner fileScanner = new Scanner(new File(file));
            Pattern pattern = Pattern.compile("p cnf"); // set pattern to look for p cnf
            while (fileScanner.findInLine(pattern) == null)
                fileScanner.nextLine(); //loop that skips lines till p cnf
            numVars = fileScanner.nextInt(); //store variables from p cnf line found
            numClauses= fileScanner.nextInt();
            formula = new int[numClauses][]; //set the formula size
            LinkedList<Integer> curLine = new LinkedList<>();
            for (int curRow = 0, curNum; fileScanner.hasNextInt();) { //loop to store clauses in 2d array
                curNum = fileScanner.nextInt();
                if (curNum == 0) {
                    formula[curRow] = curLine.stream().mapToInt(i->i).toArray();
                    curRow++;
                    curLine.clear();
                    continue;
                }
                curLine.add(curNum);
            }
            fileScanner.close();
        } catch (FileNotFoundException ex) {

            System.out.println("ERROR: Unable to read " + file + ".");
            System.exit(0);
        }
    }

    public int[][] getFormula() {
        return formula;
    }

    public int getVariables() {
        return numVars;
    }

    public int getClauses() {
        return numClauses;
    }
}
