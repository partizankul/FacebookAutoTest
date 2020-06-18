import Utilites.Driver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ForgotPageTest {

    private ForgotPage forgotPage;
    private Logger logger;

    @Before
    public void setUp(){
        logger = Logger.getLogger("new logger");
        Driver.getDriver().get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");
        forgotPage = new ForgotPage(Driver.getDriver());
            }

    @Test
    public void headingTest(){
        logger.info("start ForgotPageTest test headingTest");
        String heading = forgotPage.getHeadingText();
        logger.info("heading = "+ heading );
        Assert.assertEquals("Facebook", heading);
        logger.info("finish ForgotPageTest test headingTest");
    }
    @Test
    public void getFindYouAkkQuestionTextTest(){
        logger.info("start ForgotPageTest test getFindYouAkkQuestionTextTest");
        logger.info("forgotPage.getFindYouAkkQuestionText() = " + forgotPage.getFindYouAkkQuestionText() );
        Assert.assertEquals("Найдите свой аккаунт", forgotPage.getFindYouAkkQuestionText());
        logger.info("finish ForgotPageTest test getFindYouAkkQuestionTextTest");
    }
    @Test
    public void findAkkTest(){
        logger.info("start ForgotPageTest test findAkkTest");
        forgotPage.findAkk("test@mail.ru");
        logger.info("getToRestorePassText() = "+ forgotPage.getToRestorePassText());
        Assert.assertEquals("Восстановление пароля", forgotPage.getToRestorePassText());
        logger.info("finish ForgotPageTest test findAkkTest");
    }

    @After
    public void tearDown(){
        Driver.getDriver().quit();
    }

}
