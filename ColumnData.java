package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ColumnData {
    public static void main(String[] args) {
        //giving path to where chrome driver is downloaded
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi.Arora\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximizing the window which opens
        driver.manage().window().maximize();
        //deleting all the cookies and cache
        driver.manage().deleteAllCookies();
        //opening url
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //locating table
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        //creating list for storing column data
        List<WebElement> columnCells;
        //traversing the columns and storing data
        for(int i=1;i<4;i++){
            columnCells = table.findElements(By.xpath(".//td[" + i + "]"));
            //printing the data
            for (WebElement columnCell : columnCells) {
                System.out.println(columnCell.getText());
            }
        }
        //closing instance
        driver.quit();
    }
}
