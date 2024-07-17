package org.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneration {
	
	public static void generateJvmReport(String jsonFilePath) {
		//1.Mention the target folder location-File
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Jvm");
		
		//2.Add details to the report using Configuration class
		
        
		Configuration c = new Configuration(f, "Target.com Project");
		c.addClassifications("BrowserName", "Chrome");
		c.addClassifications("Sprint", "12");
		c.addClassifications("OS", "Windows");
		
		//3. Add json file paths into List<String>
		List<String> li = new ArrayList<String>();
		li.add(jsonFilePath);
		
		//4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		

    }
}
