package com.quinnox.patterncoding;

public class Pattern67 {

	public static void main(String[] args) {
		
		int height=5;
		for(int i=1;i<=height;i++){
			for(int j=height;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}

	}

}
