import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By mailError = By.xpath("//*[text()=\"Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. \"]");
    private By mailFlield = By.xpath("//*[@id=\"email\"]");
    private By passField = By.xpath("//*[@id=\"pass\"]");
    private By loginInButton = By.xpath("//*[@id=\"loginbutton\"]");
    private By forgotPassLink = By.xpath("//*[text()=\"Забыли аккаунт?\"]");
    private By createAkkButton = By.xpath("//div/a[@role=\"button\"]");
    private By passError = By.xpath("//*[text()=\"Вы ввели неверный пароль. \"]");


    public String getMailErrorText() {
        return driver.findElement(mailError).getText();
    }
    public LoginPage typeMail(String mail) {
        driver.findElement(mailFlield).sendKeys(mail);
        return this;
    }
    public LoginPage typePass(String pass) {
        driver.findElement(passField).sendKeys(pass);
        return this;
    }
    public LoginPage clickLoginInButton() {
        driver.findElement(loginInButton).click();
        return new LoginPage(driver);
    }

    public LoginPage registred (String mail, String pass){
        this.typeMail(mail);
        this.typePass(pass);
        this.clickLoginInButton();
        return new LoginPage(driver);
    }

    public LoginPage clickForgotPassLink() {
        driver.findElement(forgotPassLink).click();
        return new LoginPage(driver);
    }
    public String passErrorText(){
        return driver.findElement(passError).getText();
    }
    public LoginPage clickCreateAkkButton() {
        driver.findElement(createAkkButton).click();
        return new LoginPage(driver);
    }

}