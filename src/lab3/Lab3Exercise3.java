package lab3;

import java.util.Scanner;

public class Lab3Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] str1 = str.toCharArray();
		 alterString(str1);
		System.out.println("changing string is:"+str1);

	}
	 static boolean isVowel(char ch)
	 {
		 if(ch!='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u') {
			 return false;
		 }
		return true;
		 
	 }

       static  char[] alterString(char[] str) {
		for(int i=0;i<str.length;i++){
			if(!isVowel(str[i])) {
				if(str[i]=='z') {
					str[i]='b';
				}
				else {
					str[i]=(char)(str[i]+1);
					if(isVowel(str[i])) {
						str[i]=(char)(str[i]+1);
					}
				}
			}
		}
		return str;
		
	}

}
