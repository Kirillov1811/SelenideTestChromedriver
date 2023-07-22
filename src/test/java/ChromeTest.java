import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class ChromeTest {
    @Test
    public void check(){
       open("https://www.wikipedia.org");
       new WikiMainPage().search("selenide");
    }
}
