package com.retrieve.chemicals;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	public static void main(String args[])
	{
		try{
		String dir2 = "/home/s/Desktop/pattern_recognition/"+ "Retriever.txt";
		
		String input;int i,k;
		input = "[sig3, sig2, C@, sig2, sig1];[O, sig6, sig14];[C@, C@, =C@, sig2, sig2, sig2];[N, C, C];[C@, C@, sig2, sig2, sig1];";
		String sub_structures[] = input.split(";");
		//System.out.println("*****"+sub_structures.length);		
		i=0;
		while(i<sub_structures.length)
		{
			 k=0;
			 BufferedReader inputStream = new BufferedReader(new FileReader(dir2));
			 inputStream.readLine();
			String temp= sub_structures[i];
			
				while(k!=1)
				{
				String input2 = inputStream.readLine();
				
				if(input2.equals(temp))
				{k=1;
					System.out.println(input2);
					
					String chemical = inputStream.readLine();
					System.out.println(chemical);
					while(!chemical.equals(""))
					{
						chemical = inputStream.readLine();
						System.out.println(chemical);
					}
						
				}
				}
				i++;
				inputStream.close();
		}
		
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	}
