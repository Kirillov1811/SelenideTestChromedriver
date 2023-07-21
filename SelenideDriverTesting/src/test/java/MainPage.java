import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchButton = ($x("//*[@name = \"q\"]"));
    public void clickOnSearch(){
        searchButton.click();
    }

    public void openWebSite(String url){
        Selenide.open(url);
    }
}
