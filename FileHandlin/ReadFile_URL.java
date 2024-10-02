package FileHandlin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile_URL {

		// TODO Auto-generated method stu
		    public static void main(String[] args) throws MalformedURLException {
		        String fileUrl = "https://example-files.online-convert.com/document/txt/example.txt"; // Replace with your file URL

//		        try {
//		            // Create a URL object
//		            URL url = new URL(fileUrl);
//		            
//		            // Open a connection to the URL
//		            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//
//		            // Set the request method to GET
//		            httpURLConnection.setRequestMethod("GET");
//		            
//		            // Check if the connection was successful
//		            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//		                // Create a BufferedReader to read from the URL input stream
//		                try (BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
//		                    String line;
//		                    while ((line = reader.readLine()) != null) {
//		                        System.out.println(line); // Process each line
//		                    }
//		                }
//		            } else {
//		                System.out.println("Failed to fetch the file. HTTP Response Code: " + httpURLConnection.getResponseCode());
//		            }
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
		        
	//USING Bufferred Reader
		        URL url= new URL(fileUrl);
		        InputStream os;
				try {
					os = url.openStream();
					BufferedReader reader= new BufferedReader(new InputStreamReader(os));
					String line;
					while((line=reader.readLine())!=null)
					{
						System.out.println(line);
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}        
		    }
}


