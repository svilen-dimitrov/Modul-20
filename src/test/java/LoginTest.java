
import org.testng.Assert;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;


public class LoginTest extends MainDriver {
   // private WebDriver driver;

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductsPage productsPage = loginPage.clickLoginButton();

        Assert.assertEquals(productsPage.getPageTitle(), "Products");
    }
    @Test
    public void testLoginMissingUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
    @Test
    public void removeItemFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCartSauceLabsButton();
        productsPage.



    }
}
