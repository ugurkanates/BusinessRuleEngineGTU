package relativechecker;

import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;

public class RelativeChecker{
	/* test */
	public static void main(String[] args) {
		boolean result = areRelativesCorrect("(46,44).(-57,-58).(-155,154,153)","(45,57,58,155,154,153)");
		System.out.println("result is " + result);
	}

	private static boolean isNumber(char param){
		return (param >= '0' && param <= '9');
	}

	private static LinkedList<Integer> relativeParser(String rule){
		LinkedList<Integer> result = new LinkedList<Integer>();
		for (int i = 0; i < rule.length(); ++i) {
			if(isNumber(rule.charAt(i))){
				String currentRelative = Character.toString(rule.charAt(i));
				
				int j;
		                for (j = i+1; j < rule.length() && isNumber(rule.charAt(j)) == true; ++j) {
					currentRelative += (rule.charAt(j));
				}
				i = j;
				int currentResult = Integer.parseInt(currentRelative);
				result.add(currentResult);
			}
		}
		return result;
	}

	public static boolean areRelativesCorrect(String rule, String relatives){

        LinkedList<Integer> relativesFromFile = relativeParser(rule);
        LinkedList<Integer> relativesList = relativeParser(relatives);
        for(int i=0;i<relativesList.size();i++){
            if(!relativesFromFile.contains(relativesList.get(i)))
                return false;
        }
        return true;
    	}
}
    	
