import java.util.Scanner;
import java.util.Arrays;

class CheckPermutation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		
		int[] flags = new int[128];
		Arrays.fill(flags,0);
		
		boolean flag = true;
		
		if(s1.length()!=s2.length()) {
			flag=false;
		}
		else {
			for(int i=0;i<s1.length();i++) {
				if(flags[(int)s1.charAt(i)]==0)
					flags[(int)s1.charAt(i)]=1;
				else
					flags[(int)s1.charAt(i)]=0;
				if(flags[(int)s2.charAt(i)]==0)
					flags[(int)s2.charAt(i)]=1;
				else
					flags[(int)s2.charAt(i)]=0;
			}
			
			for(int i=0;i<128;i++) {
				if(flags[i]!=0) {
					flag=false;
					break;
				}
			}
			
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
