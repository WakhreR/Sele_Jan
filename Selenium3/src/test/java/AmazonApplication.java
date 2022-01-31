import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplication {

	public static void main(String[] args) {
		
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver d1;
         d1=new ChromeDriver();
         d1.get("https://www.amazon.in/");
        String titel = d1.getTitle();
        System.out.println("titel");
	}

}
