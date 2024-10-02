import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="DEVGHARE.Sanket@3ds.com";
		Pattern pattern=Pattern.compile(email,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("^[A-Z]+[.]{1}[A-Z]{1}[a-z]+@+[0-9]{1}[a-z]{2}\\.{1}[a-z]{3,}$");
	
		System.out.println(matcher.find());
	}

}
