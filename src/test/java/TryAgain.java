import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TryAgain {
    @Test
    void softAssertionsContainsJUnit5(){
        //откройте страницу Selenide  в Github
        open("https://github.com/selenide/selenide");
        //перейдите в раздел Wiki Проекта
        $("#wiki-tab").pressEnter();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").shouldHave(text("Pages"));
        $(byText("Show 2 more pages…")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //откройте страницу SoftAssertions,
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //проверьте,что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
