package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlertBtn= driver.findElement(By.id("alertButton"));
		simpleAlertBtn.click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert =  driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert alrtConfirm = driver.switchTo().alert();
		//alrtConfirm.accept();//for clicking OK button
		alrtConfirm.dismiss();//for clicking Cancel button
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert =  driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert alrtPrompt = driver.switchTo().alert();
		alrtPrompt.sendKeys("Prasanth Sankar K");
		alrtPrompt.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts alert = new HandlingAlerts();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
	}
	


}
