import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;

public class FlipkartTest {
    test test1=new test();
    @Given("Open Flipkart Website")
    public void openFlipkartWebsite() throws InterruptedException {
        test1.launchDriver();
    }
    @Then("goto {string} section")
    public void gotoSection(String elementType) throws InterruptedException {
        test1.GotoElectronicSection(elementType);
    }
    @And("Select {string} brand name")
    public void selectBrandName(String brand) throws InterruptedException {
        test1.GotoOppo(brand);
    }
}
