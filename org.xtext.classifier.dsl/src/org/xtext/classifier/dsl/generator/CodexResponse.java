package org.xtext.classifier.dsl.generator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CodexResponse {
	
	public CodexResponse() {}
	
	public StringBuilder generate(String input) throws IOException, InterruptedException{
		File pathToExecutable = new File("D:\\Code\\Eclipse\\dsl-pclassifier\\org.xtext.classifier.dsl\\src\\org\\xtext\\classifier\\dsl\\generator\\Codex.py" );
		ProcessBuilder builder = new ProcessBuilder( "python", pathToExecutable.getAbsolutePath());
		builder.directory( new File( "D:\\\\Code\\\\Eclipse\\\\dsl-pclassifier\\\\org.xtext.classifier.dsl\\\\src\\\\org\\\\xtext\\\\classifier\\\\dsl\\\\generator" ).getAbsoluteFile() ); // this is where you set the root folder for the executable to run with
		builder.redirectErrorStream(true);
		Process process =  builder.start();

		Scanner s = new Scanner(process.getInputStream());
		StringBuilder text = new StringBuilder();
		while (s.hasNextLine()) {
		  text.append(s.nextLine());
		  text.append("\n");
		}
		s.close();

		int result = process.waitFor();

		return text;
    }
}
