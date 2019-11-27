package Lesson10.DriversSet.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainElem {

    private WebDriver driver;


    @FindBy(xpath = "//form[@id=\"searchbox\"]/input[4]")
    private WebElement searchField;
    // searchField.sendKeys("Blouse");

    @FindBy (xpath = "//form[@id=\"searchbox\"]/button")
    private WebElement searchBtn;

    //searchBtn.click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    @FindBy (xpath = "//div[@class=\"sortPagiBar clearfix \"]/ul/li[3]/a")
    private WebElement listView;

//        listView.click();

    @FindBy (xpath = "//div[@class=\"row\"]/div[3]/div/div[2]/a")
    private WebElement addToCart;

//        addToCart.click();

    @FindBy (xpath = "//div[@class=\"clearfix\"]/div[2]/div[4]/a")
    private WebElement proceedChOut;

//        proceedChOut.click();

    @FindBy (xpath = "//tbody/tr/td[5]/div/a[2]")
    private WebElement addItem;

//        addItem.click();

    @FindBy (xpath = "//tfoot/tr[6]/td[2]/span[contains(text(), '$56.00')]")
    private WebElement total;

    @FindBy (xpath = "//tbody/tr/td[7]/div/a")
    private WebElement dropCart;

//        dropCart.click();


    public MainElem (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainElem searchValue (){
        searchField.sendKeys("Blouse");

        return this;
    }

    public MainElem doSearch (){

        searchBtn.click();
        return this;
    }

    public MainElem selectViewMode(){

        listView.click();
        return this;
    }

    public MainElem addItemToCart(){

        addToCart.click();
        return this;
    }

    public MainElem proceed(){

        proceedChOut.click();
        return this;
    }
    public MainElem addOneMoreToCart(){

        addItem.click();
        return this;
    }

    public String getTotalPrice(){

        return total.getText();
    }

    public MainElem clearCart(){

        dropCart.click();
        return this;
    }




}
