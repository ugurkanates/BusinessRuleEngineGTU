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
