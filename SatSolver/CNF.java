
public class CNF {


    private String data;

    public CNF () {
        data=null;
    }


    public CNF (String input){
        if (input == null)
            throw new IllegalArgumentException("CNF string isn't be null");
        data=input;
    }

    public String getData(){
        return data;
    }


    public boolean cnfFormat(){
        boolean result=true;
        try{
            clearString();
            if (data.contains(".") == false || data.charAt(0) != '(' || data.charAt(data.length() - 1) != ')') {
                if (checkingClause(data.substring(0, data.length()))) {
                    return true;
                }
                result = false;
            }
            else {
                int oldIndex = 0;
                
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
            System.out.print(e.getMessage() + " --->");
            result=false;
        }
        return result;
    }


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


    protected void clearString(){

    }

        protected boolean checkingData(String var){
        boolean result=true;
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

    public static void main(String args[]){
    
    }
}