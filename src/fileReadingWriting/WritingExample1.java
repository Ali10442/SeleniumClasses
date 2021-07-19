package fileReadingWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingExample1 {

	public static void main(String[] args) throws IOException {
		String st="Hello";
		
		File f= new File("D:\\EclipseWS_June\\Workspace\\input1.txt");
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(st);
		bw.append(" World");
		bw.append(" Java");
		bw.close();
		

	}

}
