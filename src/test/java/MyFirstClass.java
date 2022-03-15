import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstClass {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\chromedriver.exe";
    public WebDriver driver ;

    @BeforeTest                            //Jumbled
    public void launchBrowser() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test                             //Jumbled
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
    }
}
