package Lesson11;

import java.io.*;

public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\test1.txt"); 
		FileWriter wf = new FileWriter(file); 
		String str="자바 파일 쓰기\n";
		wf.write(str); 
		wf.close();
	}
}
