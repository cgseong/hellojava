package Lesson11;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) {
		 if(args.length != 2) {
		      System.out.println("���� : java FileCopy source-filename target-filename");
		      System.exit(0);
		    }

		    FileReader fr = null;
		    FileWriter fw = null;

		    try {
		      fr = new FileReader(args[0]);
		      fw = new FileWriter(args[1]);
		      char[] buffer = new char[512];
		      int readcount = 0;

		      while((readcount = fr.read(buffer)) != -1) {

		        //fw.write(buffer);
		        fw.write(buffer, 0, readcount);
		      }
		      System.out.println("������ �����Ͽ����ϴ�.");
		    } catch(Exception ex) {
		      System.out.println(ex);
		    } finally {
		      try {
		        fr.close();
		        fw.close();
		      } catch(Exception e) {}
		    }

	}

}
