package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;

    // Assuming there's an element to verify on the Products page, like a header
    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartSauceLabs;

    @FindBy(className = "shopping_cart_link")
    private  WebElement shopingCart;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void addToCartSauceLabsButton(){
        addToCartSauceLabs.click();
    }
    private void openShopingCart(){
        shopingCart.click();
    }
}
