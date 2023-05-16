package com.ojas.nayatasks;

public class CollatzSequence {
	
	public static void  getCollatzSequence(int num) {
		if(num<0) {
			System.out.println("error");
		}else 
		{
			 while (num != 1)
		        {
		            System.out.print(num + " ");
		     
		            
		            if ((num & 1) == 1)
		                num = 3 * num + 1;
		     
		            else
		                num = num / 2;
		        }
		     
		        System.out.print(num);
		    }
	
		}
		
	

	public static void main(String[] args) {
		getCollatzSequence(6);
	}

}
