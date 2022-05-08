package com.resonance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.resonance.keywords.UIKeywords;
import junit.framework.Assert;

public class RegressionTests {//1.45.33

	@Test
	public void verifyTitleOfHomePage() {
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchUrl("https://www.testingshastra.com");
		
		String actualTitle = UIKeywords.getTitle();
		WebElement element=null;
		UIKeywords.enterText(element, "Hello");
		Assert.assertEquals("Home Page", actualTitle);
	}
}
