package issatisfiable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
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

            numClauses = fileScanner.nextInt();

            formula = new int[numClauses][]; //set the formula size

            LinkedList<Integer> curLine = new LinkedList<>();

            for (int curRow = 0, curNum; fileScanner.hasNextInt(); ) { //loop to store clauses in 2d array

                curNum = fileScanner.nextInt();

                if (curNum == 0) {

                    formula[curRow] = curLine.stream().mapToInt(i -> i).toArray();

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

    public void readFromString(String cnf) {

        Map<Integer, Integer> varmap = new HashMap<>();

        numClauses = 0;

        LinkedList<Integer> curLine = new LinkedList<>();

        formula = new int[0][]; //set the formula size

        Scanner stringScanner = new Scanner(cnf.trim()).useDelimiter("\\s*\\.\\s*");

        Integer j = 1;

        while (stringScanner.hasNext()) {

            String clause = stringScanner.next();

            clause = clause.substring(1, clause.length() - 1);

            Scanner clauseScanner = new Scanner(clause.trim()).useDelimiter("\\s*,\\s*");

            while (clauseScanner.hasNext()) {
                Integer expression = clauseScanner.nextInt();

                Integer var;

                if (varmap.containsKey(Math.abs(expression))) {

                    var = varmap.get(Math.abs(expression)) * (expression / Math.abs(expression));
                } else {
                    var = j * (expression / Math.abs(expression));

                    varmap.put(Math.abs(expression), j);

                    j++;
                }

                //System.out.println("Exp: " + expression + " var: " + var);

                curLine.add(var);
            }

            numClauses++;

            int[][] oldFormula = formula.clone();

            formula = new int[numClauses][]; //set the formula size

            for (int i = 0; i < oldFormula.length; i++) {

                formula[i] = oldFormula[i];
            }

            formula[numClauses - 1] = curLine.stream().mapToInt(i -> i).toArray();

            curLine.clear();
        }

        numVars = varmap.size();
    }

    public void generateFileFromString(String cnf, String filePath) {


        Map<Integer, Integer> varmap = new HashMap<>();

        numClauses = 0;

        StringBuilder sb = new StringBuilder();

        Scanner stringScanner = new Scanner(cnf.trim()).useDelimiter("\\s*\\.\\s*");

        Integer j = 1;

        while (stringScanner.hasNext()) {

            String clause = stringScanner.next();

            clause = clause.substring(1, clause.length() - 1);

            Scanner clauseScanner = new Scanner(clause.trim()).useDelimiter("\\s*,\\s*");

            while (clauseScanner.hasNext()) {

                Integer expression = clauseScanner.nextInt();

                Integer var;

                if (varmap.containsKey(Math.abs(expression))) {

                    var = varmap.get(Math.abs(expression)) * (expression / Math.abs(expression));
                } else {

                    var = j * (expression / Math.abs(expression));

                    varmap.put(Math.abs(expression), j);

                    j++;
                }

                sb.append(var);
                sb.append(" ");
            }
            sb.append("0\n");
            numClauses++;
        }
        numVars = varmap.size();

        sb.insert(0, "\n");
        sb.insert(0, numClauses);
        sb.insert(0, " ");
        sb.insert(0, numVars);
        sb.insert(0, "p cnf ");

        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(sb.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
