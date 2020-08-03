package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPractiseCreateAccountPage;
import pages.AutomationPractiseHomePage;
import utilities.Driver;

public class AutomationPractiseStepDef {
    AutomationPractiseHomePage apHomePage = new AutomationPractiseHomePage();
    AutomationPractiseCreateAccountPage apCreatePage = new AutomationPractiseCreateAccountPage();
    @Given("user web sayfasinda")
    public void user_web_sayfasinda() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }
    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        apHomePage.signInButton.click();
    }
    @Given("user Create an account bolumune  email adresi girer")
    public void user_Create_an_account_bolumune_email_adresi_girer() {
        apHomePage.emailBox.sendKeys("betult@gmail.com");
    }
    @Given("Create an Account butonuna basar")
    public void create_an_Account_butonuna_basar() {
        apHomePage.createButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        apCreatePage.gender.click();
        apCreatePage.firstname.sendKeys("Betul");
        apCreatePage.lastname.sendKeys("Trhn");
        apCreatePage.password.sendKeys("123123");
        Select birthDay = new Select(apCreatePage.day);
        birthDay.selectByIndex(4);
        Select birthMonth = new Select(apCreatePage.month);
        birthMonth.selectByIndex(3);
        Select birthYear = new Select(apCreatePage.year);
        birthYear.selectByIndex(12);
        apCreatePage.address1.sendKeys("Wall street");
        apCreatePage.city.sendKeys("NY");
        Select state = new Select(apCreatePage.state);
        state.selectByIndex(4);
        apCreatePage.zipcode.sendKeys("11122");
        Select country = new Select(apCreatePage.country);
        country.selectByIndex(1);
        apCreatePage.phone.sendKeys("1231234323");
        apCreatePage.aliasAddress.sendKeys("my address");

    }

    @Given("user Register butonuna basar")
    public void user_Register_butonuna_basar() {
        apCreatePage.registerButton.click();
    }

    @Then("hesap olusturuldugunu dogrulayin")
    public void hesap_olusturuldugunu_dogrulayin() {
        Assert.assertTrue(apCreatePage.myAccount.isDisplayed());

    }

    @Given("email kutusuna gecersiz email ve password yazar ve sign in butonuna  tiklar")
    public void email_kutusuna_gecersiz_email_ve_password_yazar_ve_sign_in_butonuna_tiklar() {
        apHomePage.emailBox2.sendKeys("testtest@gmail.com");
        apHomePage.pass.sendKeys("111222333");
        apHomePage.signinButton.click();

    }

    @Then("error mesajinin  Authentication failed. oldugunu dogrulayin")
    public void error_mesajinin_Authentication_failed_oldugunu_dogrulayin() {
        Assert.assertTrue(apHomePage.errorMessage.isDisplayed());

    }


    @Given("imleci Women linkinin uzerine ve daha sonra Tshirts'e tiklayin")
    public void imleci_Women_linkinin_uzerine_ve_daha_sonra_Tshirts_e_tiklayin() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(apHomePage.womenLink).moveToElement(apHomePage.tshirts).click().perform();
        Thread.sleep(2000);
    }

    @Given("sayfada gorunen ilk urunun textini alin")
    public void sayfada_gorunen_ilk_urunun_textini_alin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String productName = apHomePage.product1.getText();
        System.out.println(productName);
    }

    @Given("sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin")
    public void sayfada_ustte_bulunan_arama_cubuguna_ayni_urun_ismini_girin_ve_search_butonuna_basin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();

        apHomePage.searchBox.sendKeys(apHomePage.product1.getText());
        apHomePage.search.click();
    }

    @Then("acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin")
    public void acilan_sayfada_cikan_urunun_T_Shirt_sayfasinda_goruntulenen_urunle_ayni_oldugunu_dogrulayin() {
       Assert.assertTrue(apHomePage.product2.equals(apHomePage.product1));
    }

}
