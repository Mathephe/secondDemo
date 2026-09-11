import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchNdosiTest {
    WebDriver driver;

    @Test
    public void launchNdosiUrlTest(){
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void closeBrower()
    {
        driver.close();
    }
}
