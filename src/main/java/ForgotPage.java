import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage {
    WebDriver driver;

    public ForgotPage(WebDriver driver){
        this.driver = driver;
    }

    private By heading = By.xpath("//div/h1/a/i");
    private By findYouAkkQuestionText = By.xpath("//h2[@class=\"uiHeaderTitle\"][text()=\"Найдите свой аккаунт\"]");
    private By mailOrPhoneField = By.xpath("//*[@id=\"identify_email\"]");
    private By findAkkButton = By.xpath("//*[@id=\"u_0_2\"]");
    private By cancelButton = By.xpath("//*[text()=\"Отмена\"]");
    private By singInlogin = By.xpath("//tbody//input[@id=\"email\"]");
    private By singInPass = By.xpath("//tbody//input[@id=\"pass\"]");
    private By singInButton = By.xpath("//input[@id=\"u_0_3\"");

    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
    public String getFindYouAkkQuestionText (){
        return driver.findElement(findYouAkkQuestionText).getText();
    }
    public ForgotPage mailOrPhoneField(String mailOrPhone){
        driver.findElement(mailOrPhoneField).sendKeys(mailOrPhone);
        return this;
    }
    public ForgotPage clickFindAkkButton(){
        driver.findElement(findAkkButton).click();
        return new ForgotPage(driver);
    }
    public ForgotPage clickCancelButton(){
        driver.findElement(cancelButton).click();
        return new ForgotPage(driver);
    }
    public ForgotPage sinInLoginField( String login){
        driver.findElement(singInlogin).sendKeys(login);
        return this;
    }
    public  ForgotPage singInPassField(String pass){
        driver.findElement(singInPass).sendKeys(pass);
        return this;
    }
    public ForgotPage clickSingInButton(){
        driver.findElement(singInButton).click();
        return  new ForgotPage(driver);
    }
}
