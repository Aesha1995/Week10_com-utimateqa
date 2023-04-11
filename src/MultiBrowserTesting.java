import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args)
    {
        //condition for check web browser its depends on user choice
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Enter valid browser");
        }
        driver.get(baseUrl); //open url
        System.out.println("Title of Website is : " + driver.getTitle()); //print title of the website
        System.out.println("URL of current webpage is : " + driver.getCurrentUrl()); //print current url of webpage
        System.out.println("Source code of webpage : " + driver.getPageSource()); //print source code of webpage
        driver.findElement(By.id("user[email]")).sendKeys("Aesha123@gmail.com"); //it will enter email id in email field
        driver.findElement(By.id("user[password]")).sendKeys("Abcde12345"); //it will enter password in password field
        driver.close(); //it will close browser
    }
}
