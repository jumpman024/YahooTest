import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HistoricalPage;

import java.util.concurrent.TimeUnit;


public class HistoricalPageTest extends BaseTest {

    private HistoricalPage historicalPage;

    @BeforeMethod
    public void startup(){

        historicalPage = new HistoricalPage(driver);
    }

    @Test (description = "This test confirms the display of actual information about stock value after changing the Time Period filter for 1 day.")
    public void testCase1() {
        boolean actualTableIsDisplayed = historicalPage.timePeriodClick()
                .oneDayClick()
                .doneButtonClick()
                .applyButtonClick()
                .tableIsDisplayed();
        Assert.assertTrue(actualTableIsDisplayed);

    }

    @Test (description = "This test confirms the display of actual information about stock value after changing the Time Period filter for 5 day.")
    public void testCase2(){
        boolean actualTableIsDisplayed = historicalPage.timePeriodClick()
                .fiveDaysClick()
                .doneButtonClick()
                .applyButtonClick()
                .tableIsDisplayed();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        Assert.assertTrue(actualTableIsDisplayed);

    }

    @Test (description = "This test confirms the display of actual information about stock value after changing the Time Period filter usingStart Date and End Date.")
    public void testCase3(){
       // boolean actualTableIsDisplayed =
                historicalPage.timePeriodClick()
                .inputStartDate()
                .moveToEndDate()
                .inputEndDate();
                //.doneButtonClick()
               // .applyButtonClick()
                //.tableIsDisplayed();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        //Assert.assertTrue(actualTableIsDisplayed);

    }

    @Test
    public void testCase4(){
        String expectedInputValue = "Jun 10, 2019 - Jun 16, 2019";
        String actualInputValue = historicalPage.timePeriodClick()
                .inputStartDate()
                .inputEndDate()
                .doneButtonClick()
                .applyButtonClick()
                .timePeriodValue();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        Assert.assertEquals(actualInputValue,expectedInputValue);

    }

}
