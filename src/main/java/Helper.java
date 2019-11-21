import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.image.CropImageFilter;

public class Helper {
    public static boolean isElementPresent(By element)
    {
        try {
            Driver.getDriver().findElement(element);
            return true;

        }
        catch (Exception e)
        {
            return false;
        }
    }
    public static void highlightElement(WebElement elementToHighlight)
    {
        if (Driver.getDriver() instanceof JavascriptExecutor) {
            ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].style.border='1px solid red'", elementToHighlight);
        }
    }
}
