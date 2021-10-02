import java.util.Scanner;

class URLify {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);  
		String string = in.nextLine();
		int n = in.nextInt();
		//string.concat(Character.toString(string.charAt(6)));
		String res="";
		boolean fg = false;
		for(int i=0;i<n;i++) {
			if(string.charAt(i)!=' ') {
				fg=false;
				res = res + Character.toString(string.charAt(i));
				}
			else {
				if(fg==false) {
					fg=true;
					res = res + "%20";
				}
			}
		}
		System.out.println(res.substring(0, res.length()-3));
	}

}
