package org.Cucurun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {
		File f = new File(
				"C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\JvmReport");
		Configuration con = new Configuration(f, "AUSTRALLIA PROJECT");
		con.addClassifications("AUTO TOOL", "SELENIUM");
		con.addClassifications("LANGUAGE", "JAVA");
		con.addClassifications("IDE NAME", "ECLIPSE");
		List<String> li = new ArrayList<>();
		li.add(jsonpath);
		ReportBuilder rep = new ReportBuilder(li, con);
		rep.generateReports();

	}

}
