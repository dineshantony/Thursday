package javaClassPack;

import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import org.testng.annotations.Test;
import javaClassPack.Config;
import javaClassPack.InitializeWebDriver;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenShot {
	
	String fileName;
	String url;
	
	@Test
	public void CaptureFullScreenShot() throws Exception {
		
		InitializeWebDriver obj = new InitializeWebDriver();
		WebDriver driver = obj.Initialize();
		
		String FilePath = Config.testdata;
		FileInputStream fs = new FileInputStream(FilePath);
		jxl.Workbook wb = jxl.Workbook.getWorkbook(fs);	
		jxl.Sheet sh = wb.getSheet("Sheet1");
		
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();		
		
		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				String rowData = sh.getCell(col, row).getContents();
				
				if(col == (totalNoOfCols-1)) {
					url = rowData;
					driver.get(url);					
				    Thread.sleep(2000);
				    Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
				    ImageIO.write(fpScreenshot.getImage(),"PNG",new File(Config.screenshotloc +fileName+".png"));

				}else {
					
					fileName = rowData;
				}
			}
			System.out.println();
		}
				
	}

}
