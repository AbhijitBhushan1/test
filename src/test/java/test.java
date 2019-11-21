import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class test {

    Actions action = new Actions(Driver.getDriver());

    public void launchDriver() throws InterruptedException {

        Driver.initializeDriver();
        Driver.getDriver().get("https://www.flipkart.com");
        Driver.getDriver().manage().window().fullscreen();
    }

    public void cancelLoginPagePopup() throws InterruptedException {
          Thread.sleep(1000);
          if(Helper.isElementPresent(By.className("_3Njdz7")))


        Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    }
    public void GotoElectronicSection(String elementtype) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = Driver.getDriver().findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul"));
        for (WebElement element : elementList) {

            if (element.findElement(By.tagName("span")).getText().equalsIgnoreCase(elementtype)) {
                Helper.highlightElement(element);
                element.findElement(By.tagName("span")).click();
                Thread.sleep(1000);
            }
        }
    }
public void GotoOppo(String brand) throws InterruptedException {
          WebElement itemLiost =Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul"));
          List<WebElement> brandList = itemLiost.findElements(By.tagName("li"));
          for (WebElement element:brandList)
          {
System.out.println(element.findElement(By.tagName("a")).getText());
              if (element.findElement(By.tagName("a")).getText().equalsIgnoreCase(brand)){
                  Helper.highlightElement(element);
                  element.findElement(By.tagName("a")).click();

                  Thread.sleep(10000);
              }
          }
          Driver.getDriver().quit();
      }

    }

