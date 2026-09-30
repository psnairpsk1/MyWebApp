package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElemetCommands extends Base {
	
	
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement txtMessageBox = driver.findElement(By.id("single-input-field"));
		txtMessageBox.sendKeys("Test Message");
		WebElement btnShowMessage = driver.findElement(By.id("button-one"));
		System.out.println(btnShowMessage.isDisplayed()); 
		System.out.println(btnShowMessage.isEnabled());
		btnShowMessage.click();
		WebElement yourMessage = driver.findElement(By.id("message-one"));
		System.out.println(yourMessage.getText());
		txtMessageBox.clear();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElemetCommands commands = new WebElemetCommands();
		commands.browserLaunch();
		commands.verifyWebElement();
		

	}

}
