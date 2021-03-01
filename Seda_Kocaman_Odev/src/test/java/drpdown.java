import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class drpdown {
    @Test
    public void drpdwn() throws InterruptedException{
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/sepetim");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath(""));
        Select sel = new Select(element);


    }
}
