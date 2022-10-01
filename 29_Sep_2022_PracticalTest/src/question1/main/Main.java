package question1.main;


import java.util.Scanner;



import question1.exception.InvalidNameException;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int i=0;
		 int spaceCount = 0;
		 String fullname;
		
		do { 
			System.out.println("enter the name");
	       fullname = sc.nextLine();
	  
	
		 System.out.println("enter 1 to add again");
	     i = sc.nextInt();
		 }while(i==1);
		
		 
		
       for (int j= 0;j<=fullname.length();j++) {
	
    	   char ch = fullname.charAt(j);
    	   if(ch==' ');{
    		   spaceCount++;
    	   }
    	   
       }
       
       if(spaceCount==1) {
    	   System.out.println(fullname);
       }
//       else {
//    	   throw new InvalidNameException("give the aprroprite name");
//       }
	}

}
