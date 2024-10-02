package FileHandlin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ReadFile_from_url {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			String url= "https://example-files.online-convert.com/document/txt/example.txt";
			//readFilefromURL(url);
			String first= "http://world.news.yahoo.com/news/olympics/";
			
			URL  url1= new URL(first);
		String[] arr=url1.getHost().split("\\.");
		System.out.println(arr[arr.length-2]+"."+ arr[arr.length-1]);
			
	}

	private static void readFilefromURL(String url) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL uri= new URL(url);
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(uri.openStream()));
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
