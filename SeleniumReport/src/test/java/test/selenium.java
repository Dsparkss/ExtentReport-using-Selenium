package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class selenium {
	
	ExtentReports extent;
	@BeforeTest
	
	public void finall() {
		 String path =System.getProperty("user.dir")+"\\reports\\index.html";
         ExtentSparkReporter reporter = new ExtentSparkReporter(path);
         reporter.config().setReportName("Dinesh");
         reporter.config().setDocumentTitle("Report");
         extent = new ExtentReports();
         extent.attachReporter(reporter);
         extent.setSystemInfo("Tester" , "Dinesh");
		
	}
	
	
	
	@Test
	public void initial() {
	extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver_win32//chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com");
     System.out.println(driver.getTitle());
     extent.flush();
	}
	
	
}
