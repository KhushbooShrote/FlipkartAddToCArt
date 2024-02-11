package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddToCrt;
public class AddToCartStepDefinition 
{
	WebDriver driver;
	AddToCrt addtocart=new AddToCrt();
	@Given("user is on flipkart.com page")
	public void user_is_on_flipkart_com_page() 
	{
		addtocart.goToLandingPage();
	}

	@When("user clicked on grocery tab")
	public void user_clicked_on_grocery_tab() 
	{
		addtocart.clickedOnGrocery();
	}

	@When("hover on staples")
	public void hover_on_staples() 
	{
		addtocart.hoverOnStaples();
	}

	@When("clicked on dals and pulses")
	public void clicked_on_dals_and_pulses() 
	{
		addtocart.clickOnDalsAndPulses();
	}

	@When("added any three items to the cart")
	public void added_any_three_items_to_the_cart() 
	{
		addtocart.addItemsToCart();
	}

	@Then("user proceeds to checkout")
	public void user_proceeds_to_checkout() 
	{
		addtocart.clickOnAddToCart();
	}

	@Then("navigates to place order")
	public void navigates_to_place_order() 
	{
		addtocart.placeOrder();
	}
}
