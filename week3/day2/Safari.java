package week3.day2;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Read Mode");
	}
	public void fullScreenMode() {
		System.out.println("Ful Screen Mode");
	}
	public static void main(String[] args) {
		Safari s = new Safari();
		s.browserName="Safari";
		s.browserVersion=5;
		s.openURL();
		s.navigateBack();
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		System.out.println(s.browserName);
		System.out.println(s.browserVersion);
		
		
	}

}
