/**
 * CNF class is used to checks whether CNF format in a given string.
 */
public class CNF {

    /**
     * Class realises analyzes depend on value of this variable.
     */
    private String data;

    /**
     * No parameter constructor. It's assign default value.
     */
    public CNF () {
        data=null;
    }

    /**
     * One parameter constructor. It's parameter is a CNF string.
     * If it is a null pointer parameter, constructor throws a exception.
     * @param input CNF string...
     */
    public CNF (String input){
        if (input == null)
            throw new IllegalArgumentException("CNF string isn't be null");
        data=input;
    }

    /**
     * It is getter for data member.
     * This method is necessary for unit testing.
     * @return data member for CNF string.
     */
    public String getData(){
        return data;
    }

    /**
     * This main method used to decide that whether given string is cnf format.
     * @return If given string is a CNF format, It returns true otherwise returns false.
     */
    public boolean cnfFormat(){
        boolean result=true;
        try{
            // Whitespaces is eliminated  from string.
            clearString();
            if (data.contains(".") == false || data.charAt(0) != '(' || data.charAt(data.length() - 1) != ')') {
                if (checkingClause(data.substring(0, data.length()))) {
                    return true;
                }
                result = false;
            }
            else {
                // oldIndex was used to follow next clauses.
                int oldIndex = 0;
                // result==true should be a condition. When a clause is invalid. input CNF should be invalid.
                for (int i = oldIndex; i < data.length() && result == true; ++i) {
                    if (data.charAt(i) == '.') {
                        if (!checkingClause(data.substring(oldIndex, i)))
                            result = false;
                        oldIndex = i + 1;
                    }
                }
                if (!checkingClause(data.substring(oldIndex, data.length())))
                    result = false;
            }
        }
        catch(Exception e){
//            System.out.print(e.getMessage() + " --->");
            result=false;
        }
        return result;
    }

    /**
     * It checks whether given string is a clause?
     * @param var   For example "(12,23).(-33,21)" is a string, var parameter should be (12,23) or (-33,21).
     * @return  If given string is a clause, It returns true otherwise returns false.
     */
    protected boolean checkingClause(String var){
        boolean result=true;
        // Length is a zero then return false directly.
        if(var.length()==0)
            return false;
        if (var.charAt(0) != '(' || var.charAt(var.length() - 1) != ')') {
            result = false;
        }
        else {
            int oldIndex = 1;
            if (var.contains(",")) {
                for (int i = oldIndex; i < var.length() - 1 && result == true; ++i) {
                    if (var.charAt(i) == ',') {
                        if (!checkingData(var.substring(oldIndex, i)))
                            result = false;
                        oldIndex = i + 1;
                    }
                }
            }
            else {
                if (!checkingData(var.substring(oldIndex, var.length() - 1)))
                    result = false;
            }
        }
        return result;
    }

    /**
     * It checks whether given string is number?
     * @param var For example "(12,23).(-23)" is a string, var parameter should be 12 or 23, -23.
     * @return  If given string is a number, It returns true otherwise returns false.
     */
    protected boolean checkingData(String var){
        boolean result=true;
        // Length is a zero then return false directly.
        if(var.length()==0)
            return false;
        int start = 0;
        if (var.charAt(0) == '-')
            start = 1;
        for (int i = start; i < var.length(); ++i) {
            if (var.charAt(i) < '0' || var.charAt(i) > '9')
                result = false;
        }
        return result;
    }

    /**
     * Data string is eliminated from whitespace characters by this function.
     */
    protected void clearString()throws Exception{
        if(data.length()==0)
            throw new Exception("Data size is 0.");
        data=data.replaceAll(" ","");
        data=data.replaceAll("\t","");
    }

    public static void main(String args[]){
    /*
        String []elements = new String[16];
        elements[0]="(1)";
        elements[1]="())";
        elements[2]="(2)..(3,-45)";
        elements[3]=",(34,,-45)";
        elements[4]="(!1??*,23,-5)";
        elements[5]="";
        elements[6]=null;
        elements[7]="\t(1\t )2";
        elements[8]="()";
        elements[9]="\t(\t1,-21323,-66).\t(3,4,-6)";
        elements[10]="";
        elements[11]="(,).(.)";
        elements[12]="(,).(,)";
        elements[13]="(.),(.)";
        elements[14]="(2.3).,(-3453323213132,3)";
        elements[15]="null";
        for(String s:elements) {
            try {
                System.out.print(s + " --->\t");
                CNF example = new CNF(s);
                System.out.println(example.cnfFormat());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            System.out.println("---No parameter constructor---");
            CNF example = new CNF();
            System.out.println(example.cnfFormat());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        */
    }
}