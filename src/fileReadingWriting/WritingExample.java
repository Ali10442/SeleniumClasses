package fileReadingWriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingExample {

	public static void main(String[] args) throws IOException {


		String content="Writing into a file through Java"+
						"program";
		
		Path p= Paths.get("D:\\EclipseWS_June\\Workspace\\input.txt");
		Files.write(p, content.getBytes(StandardCharsets.UTF_8));
	}

}
