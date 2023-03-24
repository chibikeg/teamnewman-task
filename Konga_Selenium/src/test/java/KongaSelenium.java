import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaSelenium {
    //include the Selenium WebDriver
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "resources");
        //driver = new ChromeDriver();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
    }

    @Test(priority = 0)
    public void launch_URL() throws InterruptedException {
        //Visit the URL Konga
        driver.get("https://Konga.com");
        //Maximize the browser
        Thread.sleep(10000);
        driver.manage().window().maximize();
        //Click on the login/SignUp button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(7000);
    }
    @Test(priority = 1)
    public void login() throws InterruptedException {
        //input your Email/Phone number
        driver.findElement(By.id("username")).sendKeys("07031844009");

        //input your password
        driver.findElement(By.id("password")).sendKeys("electronic1");

        //click on the Login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void select_category() throws InterruptedException {
        //click on the "Computer and Accessories" category
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void select_laptop() throws InterruptedException {
        //Navigate and click on the "Laptop" sub-category
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 4)
    public void selectMacbook() throws InterruptedException {
        //click on the "Apple Macbook"
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void addToCart() throws InterruptedException {
        //Add an item to the Cart
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[2]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        //Select the item of your choice
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[2]/div/div/div[2]/a/div[1]/h3")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 6)
    public void buy_Now() throws InterruptedException {
        //Navigate and click on "Buy now"
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div[3]/div[1]/div[2]/div[2]/form/div[5]/div[1]/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 7)
    public void checkOut() throws InterruptedException {
        //Click on "Continue to Check-out"
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[4]/div/div[6]/div/a")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 8)
    public void address() throws InterruptedException {
        //Click on Delivery Address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        Thread.sleep(1000);
        //Select an Address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(1000);
        //Click on the Address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
        Thread.sleep(1000);
    }

        /**Fill in the information needed
        driver.findElement(By.id("firstname")).sendKeys("Chukwunwike");
        driver.findElement(By.id("lastname")).sendKeys("Okeke");
        driver.findElement(By.id("telephone")).sendKeys("07031844009");
        driver.findElement(By.id("street")).sendKeys("No.4 Onyilofor street Nibo");
        driver.findElement(By.id("landmark")).sendKeys("Nibo");
        driver.findElement(By.id("street")).sendKeys("Awka");
        //to select the state
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[6]/div/div/select=Anambra")).click();
        Thread.sleep(1000);
        //to select the L.G.A
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[7]/div/div/select=Awka-South")).click();
        //save changes made in Address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[1]/div/a/span")).click();
    }
         */


    @Test(priority = 9)
    public void payment() throws InterruptedException {
        //Payment option (select pay now)
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        Thread.sleep(5000);
        //continue to payment
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 10)
    public void selectCard() throws InterruptedException {
        //Select your card method
        driver.findElement(By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[2]/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 11)
    public void enterCardDetails() throws InterruptedException {
        //Input invalid card details
        driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("5061 1816 6270 0142 743");
        driver.findElement(By.xpath("//*[@id=\"expiry\"]")).sendKeys("01/24");
        driver.findElement(By.xpath("//*[@id=\"cvv\"]")).sendKeys("999");
        driver.findElement(By.xpath("//*[@id=\"card-pin-new\"]")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
        Thread.sleep(5000);
        System.out.println("OOPS! AN ERROR OCCURRED");
    }
    @AfterTest
    public void quitBrowser() throws InterruptedException {
        driver.quit();
    }

}
