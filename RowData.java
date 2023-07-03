package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class RowData {
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
        //storing rows of the table in a list
        List<WebElement> rows = new ArrayList<>(table.findElements(By.tagName("tr")));
        //printing data
        for(WebElement row:rows){
            System.out.println(row.getText() + " ");
        }
        driver.quit();
    }
}
