package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import juaracoding.pages.LoginPage;
import juaracoding.pages.ShoppingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestShopping {
    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();
    public static ShoppingPage shop = new ShoppingPage();
    public TestShopping(){
        driver = Hooks.driver;
    }

    @When("User go back to Home")
    public void user_go_back_to_home() {
        shop.toHome();
        System.out.println("User go back to Home");
    }

    @And("User pick item")
    public void user_pick_item() {
        shop.toItem();
        System.out.println("User pick item");
    }

    @And("User choose variant")
    public void user_choose_variant() {
        shop.chooseVariant();
        System.out.println("User choose variant");
    }

    @Then("User click button Add to Cart")
    public void user_click_button_add_to_cart() {
        Hooks.delay(1);
        shop.addToCart();
        Assert.assertEquals(shop.getTxtAdded(), "View cart");
        System.out.println("User click button Add to Cart");
    }

}
