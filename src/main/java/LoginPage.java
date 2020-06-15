import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
<<<<<<< HEAD
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By mailError = By.xpath("//*[text()=\"Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. \"]");
    private By mailFlield = By.xpath("//*[@id=\"email\"]");
    private By passField = By.xpath("//*[@id=\"pass\"]");
    private By loginInButton = By.xpath("//*[@id=\"loginbutton\"]");
    private By forgotPassLink = By.xpath("//*[text()=\"Забыли аккаунт?\"]");
    private By createAkkButton = By.xpath("//div/a[@role=\"button\"]");

    public String  getMailErrorText(){
        return driver.findElement(mailError ).getText();
    }

    public LoginPage  typeMail(String mail){
        driver.findElement(mailFlield).sendKeys(mail);
        return this;
    }

    public LoginPage typePass(String pass){
        driver.findElement(passField).sendKeys(pass);
        return this;
    }

    public LoginPage clickLoginInButton(){
        driver.findElement(loginInButton).click();
        return new LoginPage(driver);
    }
    public LoginPage clickForgotPassLink(){
        driver.findElement(forgotPassLink).click();
        return new LoginPage(driver);
    }
    public LoginPage clickCreateAkkButton(){
        driver.findElement(createAkkButton).click();
        return new LoginPage(driver);
    }
=======
  
  WebDriver driver;
public LoginPage(WebDriver driver){
  this.driver = driver;
>>>>>>> 380c4becaba3fc81cf1309eed763fde9f0764d92
}
  
private By mailError = By.xpath("//*[text()=\"Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. \"]");
private By mailFlield = By.xpath("//*[@id=\"email\"]");
private By passField = By.xpath("//*[@id=\"pass"]\");
private By loginInButton = By.xpath("//*[@id=\"loginbutton"]\");
private By forgotPassLink = By.xpath("//*[text()=\"Забыли аккаунт?\"]");
private By createAkkButton = By.xpath("//div/a[@role=\"button\"]");

public String  getMailErrorText(){
return driver.findElement(mailError ).getText();
}

public LoginPage  typeMail(String mail){
driver.findElement(mailFlield).sendKeys(mail);
return this;
}

public LoginPage typePass(String pass){
driver.findElement(passField).sendKeys(pass);
return this;
}

public LoginPage clickLoginInButton(){
   driver.findElement(loginInButton).click();
return new LoginPage(driver);
}
public LoginPage clickForgotPassLink(){
driver.findElement(forgotPassLink).click();
  return new LoginPage(driver);
}   
public LoginPage clickCreateAkkButton(){
driver.findElement().click();
  return new LoginPage(driver);
}
                                    
