package gmail.com.tests;

import gmail.com.businessObjects.User;
import gmail.com.services.Service;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static final String CHROME_PATH = "src/test/resources/chromedriver.exe";
    private static final String WEBSITE_ADDRESS = "https://gmail.com/";
    private final String eMail = "tt4175664@gmail.com";
    private final String password = "1wdv2efb";
    protected String receiverOfEmail = "tt4175664@gmail.com";
    protected String headerOfMessage = "test";
    protected String textOfMessage = "Hello world!";

    private static WebDriver driver;

    protected Service service;

    protected User user = new User(eMail, password);


    @BeforeMethod
    public void login() {
        service = new Service();
        service.login(user);
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver = getWebDriverInstance();
        driver.get(WEBSITE_ADDRESS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}