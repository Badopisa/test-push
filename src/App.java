
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class App {
	ChromeDriver driver;
	
	WebDriverWait wait;
	String url= "https://app.talentsphere.io/";
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\selenium\\AutomationTest\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	public void login()
	{
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("login_field")).sendKeys("badopisa11");
		driver.findElement(By.id("password")).sendKeys("Pscore1234#");
		driver.findElement(By.cssSelector("input[name='commit'][value='Sign in']")).click();
		 try {
	            Thread.sleep(15000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 driver.findElement(By.className("swal-button--confirm")).click();
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
				driver.findElement(By.cssSelector("div.flex.flex-row.justify-between.items-center.border-2.border-x-dark_grey6.rounded-tr-md.rounded-br-md.px-2.py-3.relative.cursor-pointer")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			driver.findElement(By.linkText("codingzhero.com")).click();
				//driver.findElement(By.xpath("//div[contains(@class, 'flex flex-row w-full font-cmedium text-base hover:bg-slate-100 text-dark_text px-1 py-3 cursor-pointer') and text()='Internship']")).click();
	
}
		
	public void closeBrowser()
	{
		driver.quit();
	}
	public static void main(String[] args)
	{
		App tst= new App();
		tst.invokeBrowser();
		tst.login();

}
}
