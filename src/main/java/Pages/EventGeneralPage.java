package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class EventGeneralPage {

    private WebDriver driver;
    private WebElement element;
    private WebDriverWait wait ;

    @FindBy(xpath = "//input[@class='uui-form-element autosave title large']")
    WebElement EventTitle;

    @FindBy(xpath = "//input[@class='uui-form-element large']")
    WebElement SuggestedURl;

    @FindBy(xpath = "//input[@id='start_date']")
    WebElement StartDate;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle btn-default']")
    WebElement PrivacySettings;

    @FindBy(xpath = "//input[@id='unlisted']")
    WebElement Unlisted;

    @FindBy(xpath = "//label[@data-toggle='popover']")
    WebElement toggleSpeakerRegistration;

    @FindBy(xpath = "//button[@class='uui-button delete-entity lime-green']")
    WebElement EventConfirmationOK;

    @FindBy(xpath = "//ul[@class='sidebar-menu']/li[3]/a")
    WebElement PagesOption;

    @FindBy(xpath = "//button[@id='add-page']")
    WebElement AddPage;

    @FindBy(xpath = "//span[@class='filter-option pull-left']")
    WebElement PageTypeSelector;

    @FindBy(xpath = "//button[text()='Add']")
    WebElement AddPageButtonOK;

    @FindBy(xpath = "//button[@class='uui-button lime-green large publish']")
    WebElement PublishPageButtonOK;

    @FindBy(xpath = "//button[@type='button' and @class='uui-button raspberry delete-entity lime-green']")
    WebElement ConfirmPublisButtonOK;


    public EventGeneralPage() { }

    public EventGeneralPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait =  new WebDriverWait(driver, 20);

    }

    public Boolean  checkFormFields(String title , String suggestedURL , String startDate , String endDate , String privacySetting )
    {
       if( EventTitle.getText().equals(title) && SuggestedURl.getText().equals(suggestedURL)
               && StartDate.getText().equals(startDate) && PrivacySettings.getText().equals(privacySetting) )
           return true ;
       else
           return false ;
    }

    public void switchSpeakerRegOn()
    {
        toggleSpeakerRegistration.click();
        EventConfirmationOK.click();
    }

    public void addProposedTalkPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(PagesOption));
        PagesOption.click();
        AddPage.click();
        Set<String> windows = driver.getWindowHandles() ;
       // PageTypeSelector.click();
        AddPageButtonOK.click();
    }

    public void publishPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(PublishPageButtonOK));
        PublishPageButtonOK.click();
        ConfirmPublisButtonOK.click();
    }




}
