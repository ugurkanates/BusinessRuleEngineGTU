/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relativechecker;

/**
 *
 * @author CAN
 */

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
				for (j = i+1; isNumber(rule.charAt(j)) == true && j <= rule.length(); ++j) {
					currentRelative += (rule.charAt(j));
				}
				i = j;
				int currentResult = Integer.parseInt(currentRelative);
				result.add(currentResult);
			}
		}
		ListIterator it = result.listIterator();
		return result;
	}

	public static boolean areRelativesCorrect(String rule, String relatives){
		
                LinkedList<Integer> relativesFromFile = relativeParser(rule);
                
                LinkedList<Integer> relativesList = relativeParser(relatives);
                LinkedList shortlist;
	            ListIterator it, it2;
	            if (relativesList.size() < relativesFromFile.size()){
	            	it = relativesFromFile.listIterator();
	            	it2 = relativesList.listIterator();
	            	shortlist = relativesList;
	            }
	            else{
	            	it2 = relativesFromFile.listIterator();
	            	it = relativesList.listIterator();
	            	shortlist = relativesFromFile;
	            }
	            while(it.hasNext()){
	            	boolean relativeExists = false;
	            	Integer currentRelative = (Integer)it.next();
	            	while(it2.hasNext()){
		            	Integer currentRelative2 = (Integer)it2.next();
		            	if(currentRelative.equals(currentRelative2)){
		            		relativeExists = true;
		            		break;
		            	}
	            	}
	            	if(relativeExists == false){
	            		return false;
	            	}
	            	it2 = shortlist.listIterator(0);
	            }
	          return true;  
            }

        }
    	


    


