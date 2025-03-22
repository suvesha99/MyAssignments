package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b = new Browser();
		String browserLaunch=b.launchBrowser("Chrome");
		System.out.println(browserLaunch);
		b.loadUrl();

	}
	String launchBrowser(String browserName)
	{
		System.out.println("Browser launced successfully");
		return browserName;
	}
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

}
