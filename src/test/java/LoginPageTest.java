import Utilites.Driver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest {

    private LoginPage loginPage;
    private Logger logger;

    @Before
    public void setUp() {
        logger = Logger.getLogger("new logger");
        Driver.getDriver().get("https://www.facebook.com/login");
        loginPage = new LoginPage(Driver.getDriver());

    }
    @Test
    public void registredMailTest(){
        logger.info("start LoginPageTest test registredMailTest");
        loginPage.registred("", "test");
        logger.info("loginPage.getMailErrorText() = " + loginPage.getMailErrorText());
        Assert.assertEquals("Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт.", loginPage.getMailErrorText());
        logger.info("finish LoginPageTest test registredMailTest");
    }

    @Test
    public void registredPassTest(){
        logger.info("start LoginPageTest test registredPassTest");
        loginPage.registred("Test@mail.ru", "test");
        Assert.assertEquals("Вы ввели неверный пароль. Забыли пароль?", loginPage.passErrorText());
        logger.info("finish LoginPageTest test registredPassTest");
    }

    /*@After
    public void tearDown(){
        Driver.getDriver().quit();
    }
*/
}