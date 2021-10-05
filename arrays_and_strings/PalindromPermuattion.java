import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class PalindromPermuattion {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll(" ", "");

		char[] strArray = str.toCharArray();
		
		Map<Character,Integer> count = new HashMap<Character,Integer>();
		for (char s: strArray) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            }
            else {
                count.put(s, 1);
            }
		}
		int cnt=0;
		for(Map.Entry entry: count.entrySet()) {
			if((int)entry.getValue()%2!=0)
				cnt++;
		}
		if(cnt>1)
			System.out.println("TRUE: Its a palindromic permutation");
		else
			System.out.println("FALSE: Not a palindromic permutation");
	}
}