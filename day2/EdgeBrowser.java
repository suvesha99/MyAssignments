package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b = new Browser();
		String browserLaunch=b.launchBrowser("Microsoft Edge");
		System.out.println(browserLaunch);
		b.loadUrl();


	}

}
