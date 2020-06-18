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
    private By toRestorePass = By.xpath("//div[@class=\"rfloat _ohf\"]/h2[@class=\"accessible_elem\"][text()=\"Восстановление пароля\"]");
    //private By cancelButton = By.xpath("//*[text()=\"Отмена\"]");


    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
    public String getFindYouAkkQuestionText (){
        return driver.findElement(findYouAkkQuestionText).getText();
    }
    public ForgotPage clickFindAkkButton(){
        driver.findElement(findAkkButton).click();
        return new ForgotPage(driver);
    }
    public ForgotPage mailOrPhoneField(String mailOrPhone){
         driver.findElement(mailOrPhoneField).sendKeys(mailOrPhone);
        return this;

    }
    public ForgotPage findAkk(String mailOrPhone){
        this.mailOrPhoneField(mailOrPhone);
        this.clickFindAkkButton();
        return new ForgotPage(driver);
    }
    public String getToRestorePassText(){
        return driver.findElement(toRestorePass).getText();
    }



   /* public ForgotPage clickCancelButton(){
        driver.findElement(cancelButton).click();
        return new ForgotPage(driver);
    }*/

}
