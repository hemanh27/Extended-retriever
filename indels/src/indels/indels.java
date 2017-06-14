/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indels;

/**
 *
 * @author Hemanth Kumar
 */

 import java.io.*;
public class indels {

	public static void main(String[] args) {
		//Give the structural alert as input which needs to e modified 
		StringBuffer sa = new StringBuffer("[C@,sig3,sig6]");
                String Str = new String("[C@,sig3,sig6]");

		
		// length of the structural alert
		System.out.println("original: " + sa); 
		
		
		
		//System.out.println("length(): " + sa.length() + ", capacity(): " + sa.capacity());
		
		// this call returns the character that is present at the given index of the structural alert.
		System.out.println("charAt(): " + sa.charAt(13)); 
		
		
		
		
                // this method performs insertion operation with the specified terminal and/or non terminal symbol at the given postion
		System.out.println("insert(): " + sa.insert(3, ",sig2"));
		
		
		
		// this method perfroms deletion opetion terminal and/or non terminal symbol at the specifieed position
		System.out.println("delete(): " + sa.delete(1, 1+ "ca,sig2,".length()));
		
		
                //this method perfroms substitution on the 
                System.out.println("substitution(): " +Str.replace("sig3", "=C"));
	}
	
}
