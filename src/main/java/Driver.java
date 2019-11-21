import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver webDriver;
    public static void initializeDriver()
    {
        WebDriverManager.chromedriver().version("2.40").setup();
        webDriver =new ChromeDriver();
    }
    public static WebDriver getDriver()
    {
        return webDriver;
    }
}
