package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPractiseHomePage {
    public AutomationPractiseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(id = "email_create")
    public WebElement emailBox;

    @FindBy(id = "SubmitCreate")
    public WebElement createButton;

    @FindBy(id = "email")
    public WebElement emailBox2;

    @FindBy(id = "passwd")
    public WebElement pass;

    @FindBy(id = "SubmitLogin")
    public WebElement signinButton;

    @FindBy(xpath = "//li[.='Authentication failed.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[.='Women']")
    public WebElement womenLink;

    @FindBy(xpath = "//a[.='T-shirts']")
    public WebElement tshirts;

    @FindBy (xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product1;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(name = "submit_search")
    public WebElement search;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product2;

}
