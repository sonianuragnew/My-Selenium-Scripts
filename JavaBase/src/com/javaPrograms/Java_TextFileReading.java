
package com.javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Java_TextFileReading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\xbbnd0r\\workspace\\JavaBase\\src\\com\\javaPrograms\\crm_credentials.txt");
		int i;
		
		while( (i=fis.read()) != -1 )
		{
			System.out.print((char)i);
		}
	}

}
