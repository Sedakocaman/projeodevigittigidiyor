import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class gittigidiyorodev {
   @Test
   public void webSitesiAcma () throws InterruptedException {
      WebDriver driver =new ChromeDriver();

      System.out.println("driver sürücüsü: Chrome Browser oluşturma");

      driver.manage().window().maximize();
      System.out.println("Browser ekran boyutunu ayarlama");

      driver.navigate().to("https://www.gittigidiyor.com/");

      driver.navigate().to("https://www.gittigidiyor.com/uye-girisi");

      System.out.println("Sistem web sitesine giriş");
      driver.findElement(By.id("L-UserNameField")).sendKeys("ornekhesapdenemee@gmail.com"); //Kullanıcı adı alanı
      driver.findElement(By.id("L-PasswordField")).sendKeys("zk4245*a"); //Şifre alanı
      driver.findElement(By.id("gg-login-enter")).click(); //giriş butonu
      driver.findElement(By.name("k")).sendKeys("Bilgisayar"); //arama alanı 'bilgisayar'
      driver.findElement(By.className("sc-1yew439-1")).click();
      driver.navigate().to("https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2"); // sayfa2 geçişi

      int minimum = 0;
      int maksimum = 48;

      int randomSayi = ThreadLocalRandom.current().nextInt(minimum, maksimum + 1); //sayfa 2 ürünlerinde random ürün seçme (48 ürün)
      driver.findElement(By.xpath(".//*[@product-index='1']")).click();
      WebElement elementToClick = driver.findElement(By.xpath("//button[contains(text(), 'Sepete Ekle')]"));

      ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");

      elementToClick.click();
      driver.findElement(By.className("basket-container")).click();
      driver.findElement(By.className("number-selection")).click(); //ürün adedi listesi
      Thread.sleep(7000); //bekleme
      driver.findElement(By.className("btn-delete")).click(); //ürün sepeten silinir

   }
}