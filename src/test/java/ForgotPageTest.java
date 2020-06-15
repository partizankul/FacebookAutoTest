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
        logger.info("start headingTest");
        String heading = forgotPage.getHeadingText();
        Assert.assertEquals("Facebook", heading);
    }

    @After
    public void tearDown(){
        Driver.getDriver().quit();
    }

}
