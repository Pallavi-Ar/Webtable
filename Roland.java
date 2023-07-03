package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roland {
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
        //getting value of name
        String name = table.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
        //getting company
        String company = table.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
        //getting country
        String country = table.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]")).getText();
        //verifying if name, company and country match the required name, company and country
        if((name.contains("Roland Mendel")) && (company.contains("Microsoft")) && (country.contains("Austria"))){
            System.out.println("Roland Mendel works in Microsoft and lives in Australia");
        }
        else{
            System.out.println("Not verified");
        }
        //exiting the instance
        driver.quit();
    }
}
