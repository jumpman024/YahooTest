package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HistoricalPage {

    private WebDriver driver;

    public HistoricalPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@class='C(t) O(n):f Tsh($actionBlueTextShadow) Bd(n) Bgc(t) Fz(14px) Pos(r) T(-1px) Bd(n):f Bxsh(n):f Cur(p) W(190px)']")
    private WebElement timePeriod;

    @FindBy (xpath = "//div[@class='Pos(a) Px(20px) Pt(12px) Pb(20px) Mstart(40px) Z(10) Bgc(#fff) Bd Bdc($c-fuji-grey-c) Bdrs(2px) Bxsh($boxShadow) W(195px)']//div[@class='Ta(c) C($gray)']//span[@class='P(5px) W(37px) H(15px) Fl(start) Mb(5px) Cur(p) Bdbc($c-fuji-blue-1-a):h Bdbs(s) Bdbw(3px) Bdbc(t)']")
    private WebElement oneDay;

    @FindBy (xpath = "//*[@id=\"Col1-1-HistoricalDataTable-Proxy\"]/section/div[1]/div[1]/div[1]/span[2]/div/div[1]/span[2]")
    private WebElement fiveDays;

    @FindBy (xpath = "//div[@class='Pos(a) Px(20px) Pt(12px) Pb(20px) Mstart(40px) Z(10) Bgc(#fff) Bd Bdc($c-fuji-grey-c) Bdrs(2px) Bxsh($boxShadow) W(195px)']//div[@class='Mt(20px)']//button[@class=' Bgc($c-fuji-blue-1-b) Bdrs(3px) Px(20px) Miw(100px) Whs(nw) Fz(s) Fw(500) C(white) Bgc($actionBlueHover):h Bd(0) D(ib) Cur(p) Td(n)  Py(9px) Miw(80px)! Fl(start)']")
    private WebElement doneButton;

    @FindBy (xpath = "//button[@class=' Bgc($c-fuji-blue-1-b) Bdrs(3px) Px(20px) Miw(100px) Whs(nw) Fz(s) Fw(500) C(white) Bgc($actionBlueHover):h Bd(0) D(ib) Cur(p) Td(n)  Py(9px) Fl(end)']")
    private WebElement applyButton;

    @FindBy (xpath = "//table[@class='W(100%) M(0)']")
    private WebElement table;

    @FindBy (xpath = "//input[@class='Bdrs(0) Bxsh(n)! Fz(s) Bxz(bb) D(ib) Bg(n) Pend(5px) Px(8px) Py(0) H(34px) Lh(34px) Bd O(n):f O(n):h Bdc($c-fuji-grey-c) Bdc($c-fuji-blue-1-b):f M(0) Pstart(10px) Bgc(white) W(90px) Mt(5px)']")
    private WebElement startDate;

    @FindBy (xpath = "//div[@class='Pos(a) Px(20px) Pt(12px) Pb(20px) Mstart(40px) Z(10) Bgc(#fff) Bd Bdc($c-fuji-grey-c) Bdrs(2px) Bxsh($boxShadow) W(195px)']//input[@class='Bdrs(0) Bxsh(n)! Fz(s) Bxz(bb) D(ib) Bg(n) Pend(5px) Px(8px) Py(0) H(34px) Lh(34px) Bd O(n):f O(n):h Bdc($c-fuji-grey-c) Bdc($c-fuji-blue-1-b):f M(0) Pstart(10px) Bgc(white) W(90px) Mt(5px) Mstart(15px)']")
    private WebElement endDate;

    @FindBy (xpath = "//*[@id=\"Col1-1-HistoricalDataTable-Proxy\"]/section/div[1]/div[1]/div[3]/span/div")
    private WebElement frequency;

    @FindBy (xpath = "//*[@id=\"Col1-1-HistoricalDataTable-Proxy\"]/section/div[1]/div[1]/div[3]/span/div[2]/div[2]")
    private WebElement weekly;




    public HistoricalPage timePeriodClick(){
        timePeriod.click();
        return this;
    }

    public HistoricalPage oneDayClick(){
        //oneDay.sendKeys("6/15/2019");
        oneDay.click();
        return this;
    }

    public HistoricalPage fiveDaysClick(){
        fiveDays.click();
        return this;
    }

    public HistoricalPage doneButtonClick(){
        doneButton.click();
        return this;
    }

    public HistoricalPage applyButtonClick(){
        applyButton.click();
        return this;
    }

    public Boolean tableIsDisplayed(){
        return table.isDisplayed();
    }

    public HistoricalPage inputStartDate(){
        startDate.sendKeys(Keys.CONTROL + "a");
        startDate.sendKeys(Keys.DELETE);

        startDate.sendKeys("6/10/2019");
        return this;
    }


    public HistoricalPage inputEndDate(){
        endDate.sendKeys(Keys.CONTROL + "a");
        endDate.clear();

        endDate.sendKeys("6/16/2019");
        return this;
    }

    public String timePeriodValue(){
       String elementValue = timePeriod.getAttribute("value");
       return elementValue;
    }

    public HistoricalPage frequencyClick(){
        frequency.click();
        return this;
    }

    public HistoricalPage weeklyClick(){
        weekly.click();
        return this;
    }



}
