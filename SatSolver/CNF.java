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

     protected boolean checkingClause(String var){
         if(var.length()==0)
            return false;
         return true;
     }

    public boolean cnfFormat(){
        boolean result=true;
    
        //clearString();
        if (data.contains(".") == false || data.charAt(0) != '(' || data.charAt(data.length() - 1) != ')') {
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

        return result;
    }



   
}