package FileHandlin;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Read_file {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\SDE47\\Downloads\\username.csv");
		String filePath = "C:\\Users\\SDE47\\Desktop\\SQuash.txt";
		// Using Scanner class.

		Scanner sc = new Scanner(file);
		sc.useDelimiter(";");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}

	}
	
	//using FileBufferReader
//	public static void main (String args[])
//	{
//		//read a file
//		try {
//			BufferedReader reader= new BufferedReader(new FileReader("C:\\\\Users\\\\SDE47\\\\Downloads\\\\username.csv"));
//			String line;
//			while((line=reader.readLine())!=null)
//			{
//				
//				System.out.println(Arrays.toString(line.split(";")));
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//		
	
		
}
