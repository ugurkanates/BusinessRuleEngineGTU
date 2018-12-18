public class RelativeChecker{

private static LinkedList<Integer> relativeParser(String rule){
		LinkedList<Integer> result = new LinkedList<Integer>();
		for (int i = 0; i < rule.length(); ++i) {
			if(isNumber(rule.charAt(i))){
				String currentRelative = Character.toString(rule.charAt(i));
				/* <= kontrol et */
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
}
