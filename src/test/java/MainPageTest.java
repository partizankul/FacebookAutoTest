import Utilites.Driver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest {

    private MainPage mainPage;
    private Logger logger;

    @Before
    public void setUp() {
        logger = Logger.getLogger("new logger");
        Driver.getDriver().get("https://www.facebook.com");
        mainPage = new MainPage(Driver.getDriver());
}
    @Test
    public void createNewAkk(){
    logger.info("start MainPageTest test createNewAkk");
    Assert.assertEquals("Вход на Facebook", mainPage.createAkk("Test", "Test", "+375291111111", "Test"));
        logger.info("finish MainPageTest test createNewAkk");
    }


    /*@After
    public void tearDown(){
        Driver.getDriver().quit();
    }*/
}
