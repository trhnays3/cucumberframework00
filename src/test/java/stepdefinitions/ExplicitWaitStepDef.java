package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class ExplicitWaitStepDef {
    @Given("user is on the demo page")
    public void user_is_on_the_demo_page() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Given("user clicks on start button")
    public void user_clicks_on_start_button() {
        WebElement startButton = Driver.getDriver().findElement(By.xpath("//button"));
        startButton.click();
    }

    @Given("user wait until the page loads")
    public void user_wait_until_the_page_loads() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[.='Hello World!']")));

    }

    @Then("verify the Hello World! text is visible")
    public void verify_the_Hello_World_text_is_visible() {
        WebElement helloWorldText = Driver.getDriver().findElement(By.xpath("//*[.='Hello World!']"));
        Assert.assertTrue(helloWorldText.getText().equals("Hello World!"));
    }
}
