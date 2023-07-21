import org.junit.Test;
public class AppleTest extends BaseTest{
    private final static String BASE_URL = "https://google.com";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);

    }
}
