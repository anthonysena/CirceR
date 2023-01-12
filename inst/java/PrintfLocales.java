import java.util.Locale;

public class PrintfLocales {

	public static Locale getLocales() {
		Locale currentLocale = Locale.getDefault();
		return currentLocale;
	}
	
	public static void printLocales() {
		Locale currentLocale = getLocales();

		System.out.println(currentLocale.getDisplayLanguage());  //English
		System.out.println(currentLocale.getDisplayCountry());	//United States

		System.out.println(currentLocale.getLanguage()); //en
		System.out.println(currentLocale.getCountry());  //US

		System.out.println(System.getProperty("user.language"));  //en
		System.out.println(System.getProperty("user.country"));  //US
	}

    public static void main(String args[]) {
		printLocales();
    }

}