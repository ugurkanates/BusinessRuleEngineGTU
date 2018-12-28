import java.util.ArrayList;

/**
 * Created by paypaytr on 12/18/18.
 */
public class Business {
    public int getSolverResult() {
        return solverResult;
    }

    public void setSolverResult(int solverResult) {
        this.solverResult = solverResult;
    }

    private int solverResult=2;

    private boolean isTotoloji = false;
    private ArrayList<String> rule ;
    public static void main(String[] args) {
        Business obje1 = new Business();
        //System.out.println(obje1.firstCheck("(-45).(45)","(34,42,13,45)"));
        /*
        0  false
1 true
2 wait
         */
        obje1.rule = new ArrayList<String>();
       /* obje1.rule.add("(16, 17, 30).(-17, 22, 30).(-17, -22, 30).(16, -30, 47).(16, -30, -47).(-16, -21, 31).(-16, -21, -31).(-16, 21, -28).(-13, 21, 28).(13, -16, 18).(13, -18, -38).(13, -18, -31).(31, 38, 44).(-8, 31, -44).(8, -12, -44).(8, 12, -27).(12, 27, 40).(-4, 27, -40).(12, 23, -40).(-3, 4, -23).(3, -23, -49).(3, -13, -49).(-23, -26, 49).(12, -34, 49).(-12, 26, -34).(19, 34, 36).(-19, 26, 36).(-30, 34, -36).(24, 34, -36).(-24, -36, 43).(6, 42, -43).(-24, 42, -43).(-5, -24, -42).(5, 20, -42).(5, -7, -20).(4, 7, 10).(-4, 10, -20).(7, -10, -41).(-10, 41, 46).(-33, 41, -46).(33, -37, -46).(32, 33, 37).(6, -32, 37).(-6, 25, -32).(-6, -25, -48).(-9, 28, 48).(-9, -25, -28).(19, -25, 48).(2, 9, -19).(-2, -19, 35).(-2, 22, -35).(-22, -35, 50).(-17, -35, -50).(-29, -35, -50).(-1, 29, -50).(1, 11, 29).(-11, 17, -45).(-11, 39, 45).(-26, 39, 45).\n" +
               "(-3, -26, 45).(-11, 15, -39).(14, -15, -39).(14, -15, -45).(14, -15, -27).(-14, -15, 47).(17, 17, 40).(1, -29, -31).(-7, 32, 38).(-14, -33, -47).(-1, 2, -8).(35, 43, 44).(21, 21, 24).(20, 29, -48).(23, 35, -37).(2, 18, -33).(15, 25, -45).(9, 14, -38).(-5, 11, 50).\n" +
               "(-3, -13, 46).(-13, -41, 43)");
               */

        /*obje1.rule.add("(34,42,14).(12,42)");
        obje1.rule.add("(34,42,15).(12,42)");
        obje1.rule.add("(34,42,16).(12,42)");
        */
        isTotoloji obje4 = new isTotoloji();
        //System.out.println(obje4.theLoop("(16,17, 30).(-17, 22, 30).(-17, -22, 30).(16, -30, 47).(16, -30, -47).(-16, -21, 31).(-16, -21, -31).(-16, 21, -28).(-13, 21, 28).(13, -16, 18).(13, -18, -38).(13, -18, -31).(31, 38, 44).(-8, 31, -44).(8, -12, -44).(8, 12, -27).(12, 27, 40).(-4, 27, -40).(12, 23, -40).(-3, 4, -23).(3, -23, -49).(3, -13, -49).(-23, -26, 49).(12, -34, 49).(-12, 26, -34).(19, 34, 36).(-19, 26, 36).(-30, 34, -36).(24, 34, -36).(-24, -36, 43).(6, 42, -43).(-24, 42, -43).(-5, -24, -42).(5, 20, -42).(5, -7, -20).(4, 7, 10).(-4, 10, -20).(7, -10, -41).(-10, 41, 46).(-33, 41, -46).(33, -37, -46).(32, 33, 37).(6, -32, 37).(-6, 25, -32).(-6, -25, -48).(-9, 28, 48).(-9, -25, -28).(19, -25, 48).(2, 9, -19).(-2, -19, 35).(-2, 22, -35).(-22, -35, 50).(-17, -35, -50).(-29, -35, -50).(-1, 29, -50).(1, 11, 29).(-11, 17, -45).(-11, 39, 45).(-26, 39, 45)." +
          //     "(-3, -26, 45).(-11, 15, -39).(14, -15, -39).(14, -15, -45).(14, -15, -27).(-14, -15, 47).(17, 17, 40).(1, -29, -31).(-7, 32, 38).(-14, -33, -47).(-1, 2, -8).(35, 43, 44).(21, 21, 24).(20, 29, -48).(23, 35, -37).(2, 18, -33).(15, 25, -45).(9, 14, -38).(-5, 11, 50)." +
              //  "(-3, -13, 46).(-13, -41, 43)"));

        String abi = "(16, 17, 30).(-17, 22, 30).(-17, -22, 30).(16, -30, 47).(16, -30, -47).(-16, -21, 31).(-16, -21, -31).(-16, 21, -28).(-13, 21, 28).(13, -16, 18).(13, -18, -38).(13, -18, -31).(31, 38, 44).(-8, 31, -44).(8, -12, -44).(8, 12, -27).(12, 27, 40).(-4, 27, -40).(12, 23, -40).(-3, 4, -23).(3, -23, -49).(3, -13, -49).(-23, -26, 49).(12, -34, 49).(-12, 26, -34).(19, 34, 36).(-19, 26, 36).(-30, 34, -36).(24, 34, -36).(-24, -36, 43).(6, 42, -43).(-24, 42, -43).(-5, -24, -42).(5, 20, -42).(5, -7, -20).(4, 7, 10).(-4, 10, -20).(7, -10, -41).(-10, 41, 46).(-33, 41, -46).(33, -37, -46).(32, 33, 37).(6, -32, 37).(-6, 25, -32).(-6, -25, -48).(-9, 28, 48).(-9, -25, -28).(19, -25, 48).(2, 9, -19).(-2, -19, 35).(-2, 22, -35).(-22, -35, 50).(-17, -35, -50).(-29, -35, -50).(-1, 29, -50).(1, 11, 29).(-11, 17, -45).(-11, 39, 45).(-26, 39, 45)." +
                "(-3, -26, 45).(-11, 15, -39).(14, -15, -39).(14, -15, -45).(14, -15, -27).(-14, -15, 47).(17, 17, 40).(1, -29, -31).(-7, 32, 38).(-14, -33, -47).(-1, 2, -8).(35, 43, 44).(21, 21, 24).(20, 29, -48).(23, 35, -37).(2, 18, -33).(15, 25, -45).(9, 14, -38).(-5, 11, 50)." +
                "(-3, -13, 46).(-13, -41, 43)";
        String abi2 = "(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32," +
                "33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50)";

        //calismayan icin yaziyom
        String abi3 = "(1,2,3).(1,2,-3).(1,-2,3).(1,-2,-3).(-1,2,3).(-1,2,-3).(-1,-2,3).(-1,-2,-3)";
        String abi4 = "(1,2,3)";

        abi = abi.replaceAll(" ","");
        abi=  abi.replaceAll("\n","");

        abi3 = abi3.replaceAll(" ","");
        abi3=  abi3.replaceAll("\n","");


        //System.out.println(obje1.firstCheck(abi,abi2));

        obje1.rule.add(abi3);
        obje1.solver("1","T","0");
        obje1.solver("2","F","0");
        obje1.solver("3","T","0");



        /*

        FIRST CHECK FONKSIYONU BUSINESS OBJESI OLUSTURULUYOR
        BU OBJENIN FIRST.CHECK METHODU CAGRILIYOR  BU SIRADA BIZIM KOD GELEN RULELERI
        HER GELDIGINDE OBJE.RULE ICINE ADD(RULEID,RULE) SEKLINDE EKLEMELI

        OBJE.firstCheck(RULE,RELATIVELIST)
        */



        /*
         IKINCI OLAY obje.SOLVER(KISIID,CEVAP(T/F),ruleID)
          0 1 2 3 donduruyor
          0 false
          1 true
          2 wait

        */



    }


   // return values : "true","false","total"
    public String firstCheck(String rule,String relative){

        // relativeleri en son andlicez tek satırnda return yapcaz
        boolean sonuc = false;
        CNF obje = new CNF(rule);
        isTotoloji obje2 = new isTotoloji();
        sonuc = obje.cnfFormat() ;
        if (!sonuc) {
            return "false";
        }

        sonuc = sonuc && RelativeChecker.areRelativesCorrect(rule,relative);
        if (!sonuc) {

            return "false";

        }
        //totoloji grubu !
        if(obje2.theLoop(rule)) {
            setTotoloji(true);
            return "total";
        }


        isSatisfiable obje3 = new isSatisfiable(rule,sonuc);


        sonuc = sonuc && obje3.isCNFSatisfiable();
        if (!sonuc) {

            return "false";
        }



        return "true";



    }




    // true false wait
    public String solver(String kisiID,String cevap,String ruleID){
        logicSolver obje = new logicSolver();
        if(cevap.equals("T")) {
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll(('-' + kisiID) + ',', "F,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll(("\\(" + kisiID) + ',', "(T,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll((',' + kisiID) + ',', ",T,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll(('-' + kisiID) + "\\)", "F)"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll((',' + kisiID) + "\\)", ",T)"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll(("\\(" + kisiID) + "\\)", "(T)"));
        }
        if(cevap.equals("F")) {
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll('-' + kisiID + ',', "T,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll("\\("+ kisiID + ',', "(F,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll(',' + kisiID + ',', ",F,"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll('-' + kisiID + "\\)", "T)"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll((',' + kisiID) + "\\)", ",F)"));
            rule.set(Integer.parseInt(ruleID),rule.get((Integer.parseInt(ruleID))).replaceAll("\\(" + kisiID + "\\)", "(F)"));
        }
        setSolverResult(obje.theLoop(rule.get((Integer.parseInt(ruleID)))));
        switch(getSolverResult()){
            case 0:
                return "false";
            case 1:
                return "true";
            case 2:
                return "wait";

        }
        //System.out.println(rule.get((Integer.parseInt(ruleID))));

        return null; // THIS IS ERROR CASE btw
    }

    public boolean isTotoloji() {
        return isTotoloji;
    }

    public void setTotoloji(boolean totoloji) {
        isTotoloji = totoloji;
    }
    // -> (id=numara,T/F,ruleid)
}
