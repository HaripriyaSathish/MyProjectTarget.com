package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	//1
	public static void chromeBrowser() {
		driver = new ChromeDriver();
		
	}
	//2
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	//3
    public static void launchUrl(String url) {
	driver.get(url);
	
    }
    //4
    public static void fillText(WebElement w,String object) {
		w.sendKeys(object);

	}
    //5
    public static void btnClick(WebElement btn) {
		btn.click();
	}
    //6
    public static String pageTitle() {
    	String title = driver.getTitle();
    	System.out.println(title);
		return title;
		
	}
    //7
    public static String pageUrl() {
    	String url = driver.getCurrentUrl();
    	System.out.println(url);
    	return url;
	
	}
    //8
    public static void closeBrowser() {
	driver.close();

	}
    //9
    public static void dragDrop(WebElement sou, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(sou, des).perform();

	}
    //10
    public static void mousehoevering(WebElement target) {
		a.moveToElement(target).perform();

	}
    //11
    public static void copy()throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}
    //12
    public static void paste() {
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
	}
    //13
    public static void quitBrowser() {
    	driver.quit();
	}
    //14
    public static void downKey(WebElement target,String value) {
    	a.keyDown(Keys.SHIFT).sendKeys(target, value).perform();
	}
    //15
    public static void doubClick(WebElement target) {
    	a.doubleClick(target).perform();
	}
    //16
    public static void contClick(WebElement target) {
    	a.contextClick(target).perform();
		
	}
    //17
    public static void alertText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);

	}
    //18
    public static void handleAlert() {
    	al.accept();
		
	}
    //19
    public static void takeScreenshot(String pathname) throws IOException {
    	TakesScreenshot t = (TakesScreenshot)driver;
    	File sou = t.getScreenshotAs(OutputType.FILE);
    	File des = new File("C:\\Users\\Haripriya\\eclipse-workspace\\MyProject\\target\\Screenshot\\"+pathname+".png");
    	FileUtils.copyFile(sou, des);
	}
    //20
    public static <Script> void setValue(Script arg1,Object args) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','arg1')", args );
	}
    //21
    public static void selectValue(WebElement element,String value) {
    	Select s = new Select(element);
    	s.selectByValue(value);
    }
    //22
    public static void checkMultiple() {
		if (s.isMultiple()) {
			System.out.println("we can able to select more than one option");
			
		} else {
            System.out.println("we can select only one option");
		}
    }	
    //23
    public static void selectText(String text) {
    	s.selectByVisibleText(text);
	}
    //24
    public static void selectIndex(int index) {
    	s.selectByIndex(index);
	}
    //25
    public static void allOptions() {
    	List<WebElement> options = s.getOptions();
    	for (int i = 0; i < options.size(); i++) {
			WebElement eachOpt = options.get(i);
			System.out.println(eachOpt.getText());
		}
		
	}
    //26
    public static void deselectText(String text) {
    	s.deselectByVisibleText(text);
		
	}
    //27
    public static void deselectValue(String value) {
    	s.deselectByValue(value);
	}
    //28
    public static void retriveText(Object args) {
    	js.executeScript("return arguments[0].getAttribute('value')", args);
	}
    //29
    public static void clickWebElement(Object args) {
    	js.executeScript("arguments[0].click()", args);
	}
    //30
    public static void scrollDown(Object args) {
    	js.executeScript("arguments[0].scrollIntoView(true)", args);
	}
    //31
    public static void scrollUp(Object args) {
		js.executeScript("arguments[0].scrollIntoView(false)", args);
	}
    //32
    public static void parentId() {
		String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
	}
    //33
    public static void allWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
    //34
    public static void tableData(WebElement table) {
		String text = table.getText();
		System.out.println(text);
	}
    //35
    public static void implictWait(long seconds) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
    //36
    public static void explicitWait(long seconds) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		w.until(ExpectedConditions.alertIsPresent());
		al.accept();

	}
    //37
    public static String readFromExcel(String sheet,int rowno, int cellno) throws IOException {
    	File f = new File("C:\\\\Users\\\\Haripriya\\\\eclipse-workspace\\\\MavenProgram\\\\ExternalFile\\\\Book1.xlsx");
    	FileInputStream fin = new FileInputStream(f);
    	Workbook book = new XSSFWorkbook(fin);
    	Sheet s = book.getSheet(sheet);
    	Row r = s.getRow(rowno);
    	Cell c = r.getCell(cellno);    	
    	int type = c.getCellType();
    	String name;
    	if (type==1) {
			name= c.getStringCellValue();
		} 
    	else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			 name = sim.format(d);
		}
    	
    	else {
    		double number = c.getNumericCellValue();
    		long l = (long)number;
    	    name = String.valueOf(l);

		}
    	return name;
		
	}

    //38
    public static String getPassedValue(WebElement element, String value) {
    	String v = element.getAttribute(value);
    	return v;
    }
    
    //39
    public static void refreshPage() {
		driver.navigate().refresh();
	}
    
    //40
    public static void goToBackPage() {
		driver.navigate().back();

	}
    
    //41
    public static void forwardPage() {
		driver.navigate().forward();

	}
    
    //42
    public static void dismissAlert() {
		al.dismiss();

	}
    //43
    public static void switchToAlert() {
		al = driver.switchTo().alert();
	}
    
    //44
    public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
    
    //45
    public static void tab() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
    //46
    public static void parentFrame() {
		driver.switchTo().parentFrame();

	}
    //47
    public static void mainHtmlFrame() {
		driver.switchTo().defaultContent();

	}
    //48
    public static void frameId(String id) {
		driver.switchTo().frame(id);

	}

    //49
    public static void frameReference(WebElement ref) {
		driver.switchTo().frame(ref);

	}
    //50
    public static void windowId(String id) {
		driver.switchTo().window(id);

	}
    //51
    public static void windowUrl(String url) {
		driver.switchTo().window(url);
	}
    //52
    public static void windowTitle(String title) {
		driver.switchTo().window(title);

	}
    //53
    
    public static void newWindow() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
    //54
    public static void threadSleep(long s) throws InterruptedException {
		Thread.sleep(s);

	}
    
    //55
    public static void pageTimeOut(long s) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(s));
	}
    //56
    public static void downKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
    //57
    public static void upKey() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
    //58
    public static void enable(WebElement ref) {
		if (ref.isEnabled()) {
			System.out.println("WebElement is enabled");
		}

	}
    //59
    public static void selected(WebElement ref) {
		if (ref.isSelected()) {
			System.out.println("WebElement is Selected");
		}
	}
    
    //60
    public static void displayed(WebElement ref) {
		if (ref.isDisplayed()) {
			System.out.println("webElement is displayed");
		}
	}
    //61
    public static void getFirstSelectedOption(WebElement element) {
		s= new Select(element);
		WebElement firstSelected= s.getFirstSelectedOption();
		System.out.println(firstSelected.getAttribute("value"));

	}
    //62
    public static void getAllSelected(WebElement element) {
		s= new Select(element);
		List<WebElement> allSelected = s.getAllSelectedOptions();
		for (int i = 0; i < allSelected.size(); i++) {
			System.out.println(allSelected.get(i).getText());
		}
	}

}
