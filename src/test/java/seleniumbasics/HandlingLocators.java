package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
public void verifyLocators() {
	driver.findElement(By.id("single-input-field"));
	driver.findElement(By.className("form-control"));
	driver.findElement(By.tagName("input"));
	driver.findElement(By.name("description"));
	driver.findElement(By.linkText("Simple Form Demo"));
	driver.findElement(By.partialLinkText("Simple"));
	driver.findElement(By.cssSelector("input[id='single-input-field']"));
	
	//absolute xpath -- /html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input
	//relative xpath
	driver.findElement(By.xpath("//input[@id = 'value-a']"));
	driver.findElement(By.xpath("//button[text()='Show Message']"));
	driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
	driver.findElement(By.xpath("//button[@id = 'button-one' and @type = 'button']"));
	driver.findElement(By.xpath("//button[@id = 'button-one' or @type = 'button']"));
	
	//1.xpath Access methods
	
	//1.1the below example is pointing to the parent with class='card' from a child so child through parent lot reach aakunnu
	driver.findElement(By.xpath("//div[@class='card-header' and contains(text(),'Single Input Field')]//parent::div[@class='card']"));
	
	//1.2 ini nere opposite..parent through child lot reach aakunnu
	
	driver.findElement(By.xpath("//div[@class='card']//child::div[@class='card-header' and contains(text(),'Single Input Field')]"));
	//another example for 1.2
	driver.findElement(By.xpath("//div[@class='card-body']//child::button[@id='button-one' and contains(text(),'Show Message')]"));
	//following -  reaching to the @class  = card..i.e exact divlot ethunnu from a button.. 
	driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	
	
	//main div kittan 
	
	driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
	
	
	//ancestor
	driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	
	//descentant
	driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
