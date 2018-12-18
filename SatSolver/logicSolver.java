  import java.util.ArrayList;

    public class logicSolver {
        public int TrueFlag = 0;
        public int checker = 0;
        public int FalseFlag= 0;
        private String[] clauses;
        private String[] eachClause;


        public int theLoop(String comesFile) {
            clauses = comesFile.split("\\.");
            //hic degismezse true kalip dogru gorebilir DIKKAT !!!
            //bunu hala cozmedik

            for (int i = 0; i < clauses.length; i++) {
                checker = theChecker(clauses[i]);
                if (checker==0)
                    return 0;
                else if (checker==2)
                    return 2;
            }
            return 0;
        }

        public int theChecker(String clause) {
            ArrayList<Integer> eachNumber = new ArrayList<Integer>();
            clause = clause.replace("(", "");
            clause = clause.replace(")", "");
            eachClause = clause.split(",");
            TrueFlag=0;
            FalseFlag=0;
            for (int i = 0; i < eachClause.length; i++) {

                if(!(eachClause[i].equals("T")) && !(eachClause[i].equals("F"))&& !(eachClause[i].equals("-F"))&& !(eachClause[i].equals("-T")) ) {
                    System.out.println(eachClause[i]);
                    FalseFlag=1;
                    eachNumber.add(Integer.parseInt(eachClause[i]));
                }
                else if(eachClause[i].equals("T")||eachClause[i].equals("-F")){
                    TrueFlag=1;
                    FalseFlag=1;
                    break;
                }
            }
            if(FalseFlag==0) {
                return 0;
            }
            // buraya kadar konrol yok

            for (int i = 0; i < eachNumber.size()|| TrueFlag==1 ; i++) {
                if(TrueFlag==1){
                    return 1;
                }
                for (int j = i + 1; j < eachNumber.size(); j++) {
                    if (eachNumber.get(i).equals(-eachNumber.get(j)))
                        return 1;
                }

            }

            return 2;
        }

        public static void main(String[] args) {

            String string = "(34,-34).(12,-12)";
            String string2 = "(-23,23,12,3,4,15).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(45,44)"; // <<<--------------------- TEST ETTİĞİM YER
            logicSolver obje = new logicSolver();
            obje.theLoop(string2);
            // ------- 0 = FALSE 1= TRUE 2= ÇÖZÜLMEDİ    -------------
            System.out.println("checker is = " + obje.checker);
            // obje.theLoop(string);


        }

    }
