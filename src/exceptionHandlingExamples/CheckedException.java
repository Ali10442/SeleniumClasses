package exceptionHandlingExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	@SuppressWarnings("resource")
	public void readFromFile() throws IOException {
		File f= new File("D:\\EclipseWS_June\\input.txt");
		FileInputStream fis= new FileInputStream(f);
			
			try {
				fis= new FileInputStream(f);
				fis.read();
				
				
			} catch (IOException e) {
				System.out.println("Block 1");;
				
			}finally {
				try {
					fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Block 2");;
		}
			}	
		
	} 
	public static void main(String[] args) throws IOException {
		CheckedException ce= new CheckedException();
		ce.readFromFile();
	}

}
