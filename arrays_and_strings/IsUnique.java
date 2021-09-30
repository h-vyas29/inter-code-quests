import java.util.Arrays;
import java.util.Scanner;

class IsUnique{  
    public static void main(String args[]){  
     Scanner sc = new Scanner(System.in);
     System.out.println("Hello World");
     String s = sc.nextLine();
     
     int[] flags = new int[128];
     Arrays.fill(flags, 0);
     boolean f=true;
     
     for(int i=0;i<s.length();i++) {
    	 if(flags[(int)s.charAt(i)]==1) {
    		 f=false;
    		 break;
    	 }
    	 else {
    		 flags[(int)s.charAt(i)]=1;
    	 }
     }
     if(f) {
    	 System.out.println("Its unique");
     }
     else {
    	 System.out.println("Not unique");
     }
    }  
}  