package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingDropDownCheckBoxRadioButton extends Base {
	
	public void verifyDropDown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement ddJava = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(ddJava);
		
		//To select value Python(Actual List is showing like order : JAVA , C# , Python , SQL)
		//select.selectByIndex(2);
		//select.selectByValue("c#");
		select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckBox() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement optCheckBox = driver.findElement(By.xpath("//input[@value='option-1']"));
		optCheckBox.click();
		System.out.println(optCheckBox.isSelected());
		
	}
	public void verifyRadioButton()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement orangeRadioBtn = driver.findElement(By.xpath("//input[@value='orange']"));
		orangeRadioBtn.click();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDownCheckBoxRadioButton drop = new HandlingDropDownCheckBoxRadioButton();
		drop.browserLaunch();
		//drop.verifyDropDown();
		drop.verifyCheckBox();
		//drop.verifyRadioButton();
		

	}


}
