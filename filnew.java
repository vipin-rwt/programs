
	import java.io.*;
	public class thread{
		public static void main(String[]args)throws IOException
		{
			
			File fd=new File("vipinlag2");
			fd.mkdir();
			File f=new File("vipinlag2","vipinlag.txt");
			System.out.println(f.exists());
			f.createNewFile();
			System.out.println(fd.exists());

		}
	}
	
	