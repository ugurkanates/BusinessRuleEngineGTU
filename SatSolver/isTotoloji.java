import java.util.ArrayList;

public class isTotoloji{

    public boolean checker = true;
    private String[] clauses;
    private String[] eachClause;


    public boolean theLoop(String comesFile){
        clauses = comesFile.split("\\.");
        //hic degismezse true kalip dogru gorebilir DIKKAT !!!
        //bunu hala cozmedik

        for(int i=0;i<clauses.length;i++){
            checker = theChecker(clauses[i]);
            if(!checker)
                return false;
        }
        return checker;
    }
//first commit
    public boolean theChecker(String clause){
        ArrayList<Integer> eachNumber = new ArrayList<Integer>();
        clause = clause.replace("(","");
        clause = clause.replace(")","");
        eachClause = clause.split(",");
        for(int i=0;i<eachClause.length;i++){
            eachNumber.add(Integer.parseInt(eachClause[i]));
        }
//second commit

    // buraya kadar konrol yok

        for(int i=0;i<eachNumber.size();i++){

            for(int j=i+1;j<eachNumber.size();j++){
                if(eachNumber.get(i).equals(-eachNumber.get(j)))
                    return true;
            }
        }

        return false;
    }
//third commit
