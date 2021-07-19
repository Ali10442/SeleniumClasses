package fileReadingWriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingExample {

	public static void main(String[] args) throws IOException {
		
		Path p= Paths.get("D:\\EclipseWS_June\\Workspace\\input.txt");
		List<String> lines= Files.readAllLines(p, StandardCharsets.UTF_8);
		for(String s:lines) {
			System.out.println(s);
			System.out.println(s.length());
		}
	}
	

}
