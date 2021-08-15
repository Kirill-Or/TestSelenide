import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {
@Test
    public void selenideTest(){

    open("https://demo.nopcommerce.com/build-your-own-computer");
    $("#product_attribute_1").selectOptionByValue("2");
    $("#product_attribute_2").selectOptionByValue("5");
    $("label[for='product_attribute_3_6']").click();
    $("label[for='product_attribute_4_8']").click();
    $("#add-to-cart-button-1").click();
    $(".cart-label").click();
    $("td[class='product'] div[class='attributes']").shouldHave(Condition.text("HDD: 320 GB"));
    $("td[class='product'] div[class='attributes']").shouldHave(Condition.text("RAM: 2 GB"));

    }



}
