package com.bw.pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bw.base.TestBase;

public class ProductListPage extends TestBase
{
	@FindBy(xpath = "//*[@class='button-2 add-to-wishlist-button valid']")
	WebElement addToWishlist;
	
	@FindBy(xpath = "//body[1]/div[15]/div[1]/div[1]/a[1]")
	WebElement closeAlert;
	
	@FindBy(xpath = "//input[@class='qty-input valid']")
	WebElement quantityTextBox;
	
	@FindBy(xpath = "//input[@class='button-1 add-to-cart-button nopAjaxCartProductVariantAddToCartButton']")
	WebElement addToCart;
	
	@FindBy(xpath = "//input[@class='button-2 email-a-friend-button']")
	WebElement emailFriend;
	
	@FindBy(id = "product-details-form")
	WebElement formId;
	
	public ProductListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sortByPage() throws InterruptedException
	{
		WebElement productSort = driver.findElement(By.id("products-orderby"));
		Select sort = new Select(productSort);
		Thread.sleep(2000);
		sort.selectByVisibleText("Price: Low to High");
	}
	
	public void clickProduct() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement productDetail = driver.findElements(By.xpath("//a[contains(text(),'Product Details')]")).get(0);
		productDetail.click();
	}
		
}
