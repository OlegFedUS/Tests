import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesTest {

    @Test
    public void TablesTest() {

        System.setProperty("webdriver.chrome.driver", "c:\\program files\\google\\chrome\\application\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.moebelhaushamburg.de/m%C3%B6bel/tisch");

        List<WebElement> tabels = driver.findElements(By.xpath("//div[contains(text(),'tisch')]"));
        for (int i = 0; i < tabels.size(); i++) {
            Assert.assertTrue(tabels.get(i).getText().toLowerCase().contains("tisch"));
        }


    }
}

