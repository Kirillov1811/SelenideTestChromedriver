import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;


public class WikiMainPage {
    public void search(String text){
        $(By.id("searchInput")).val(text).pressEnter();
    }
}
