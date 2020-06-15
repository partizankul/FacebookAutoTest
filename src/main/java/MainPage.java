import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    private By  logotip = By.xpath("//div/h1/a/i");
    private By textCreateAkk = By.xpath("//*[text()=\"Создать аккаунт\"]");
    private By singInlogin = By.xpath("//tbody//input[@id=\"email\"]");
    private By singInPass = By.xpath("//tbody//input[@id=\"pass\"]");
    private By singInButton = By.xpath("//input[@id=\"u_0_b\"]");
    private By forgotAkkLink = By.xpath("//*[text()=\"Забыли аккаунт?\"]");

    private By singUpName = By.xpath("//input[@id=\"u_0_q\"]");
    private By singUpLastname = By.xpath("//input[@id=\"u_0_s\"]");
    private By singUpNumberphoneOrEmail = By.xpath("//input[@id=\"u_0_v\"]");
    private By singUpNewPass = By.xpath("//input[@id=\"u_0_10\"]");
    private By singUpBirthdayDay  =By.xpath("//*[@id=\"day\"]");
    private By singUpBirthdayMonth  =By.xpath("//*[@id=\"month\"]");
    private By singUpBirthdayYear  =By.xpath("//*[@id=\"year\"]");
    private By singUpSexMen = By.xpath("//*[@id=\"u_0_a\"]");
    private By singUpSexWoman = By.xpath("//*[@id=\"u_0_9\"]");
    private By singUpSexOther = By.xpath("//*[@id=\"u_0_8\"]");
    private By singUpButton = By.xpath("//*[@id=\"u_0_17\"]");
    private By cretePublicPageButton = By.xpath("//div/a[text()=\"Создать Страницу\"]");
    private By nameIsError = By.xpath("//div[@id=\"js_dr\"]");

    public String getHeadingText(){
        return driver.findElement(logotip).getText();
    }
    public String getTextCreateAkk(){
        return driver.findElement(textCreateAkk).getText();
    }
    public MainPage singInMail(String mail){
        driver.findElement(singInlogin).sendKeys(mail);
        return this;
    }
    public MainPage singInPass(String pass){
        driver.findElement(singInPass).sendKeys(pass);
        return this;
    }
    public MainPage loginIn(String mail){
        this.singInMail(mail);
        driver.findElement(singInButton).click();
        return new MainPage(driver);
    }
    public MainPage loginIn(String mail, String pass){
        this.singInMail(mail);
        this.singInPass(pass);
        driver.findElement(singInButton).click();
        return new MainPage(driver);
    }

    public MainPage forgotAkkLinkClick(){
        driver.findElement(forgotAkkLink).click();
        return new MainPage(driver);
    }
    public String getSingUpName(){
        return driver.findElement(singUpName).getText();
    }
    public String getSingUpLastname(){
        return  driver.findElement(singUpLastname).getText();
    }
    public String getSingUpNumberphoneOrEmail(){
        return driver.findElement(singUpNumberphoneOrEmail).getText();
    }
    public String getSingUpNewPass(){
        return driver.findElement(singUpNewPass).getText();
    }
    public MainPage clickCretePublicPageButton(){
        driver.findElement(cretePublicPageButton).click();
        return new MainPage(driver);
    }


}
