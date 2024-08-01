package org.pratice;

public class StarPattern {
	
	private void star() {
		
		for (int i = 1; i < 6; i++) {
			for(int j=1; j<=i;j++) {
				
			System.out.print("*");
			
		}
		System.out.println();
		}
	}
	
	//Main Function
	
	public static void main(String[] args) {
		
		StarPattern sp = new StarPattern();
		sp.star();
	}
	
	

}
