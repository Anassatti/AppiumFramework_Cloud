package FirstFramework.AppiumFramework1;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FirstFramework.AppiumFramework1.TestData;
import FirstFramework.AppiumFramework1.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class apiDemoTest extends base{

	@Test(dataProvider="InputData", dataProviderClass=TestData.class)
	public void ApiDemo(String input) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=runCapabilities("ApiDemo", true);
		//Xpath syntax("tagName[attribute='value']")
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys(input);
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		//service.stop();
	}

}
