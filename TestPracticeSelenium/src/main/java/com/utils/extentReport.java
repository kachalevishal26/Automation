package com.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	static ExtentReports extent;
	public static ExtentReports getReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
		reporter.config().setReportName("OrangeHRM Test Report");
		reporter.config().setDocumentTitle("TestResults");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Software Test Engineer", "Vishal Kachale");
		return extent;
	}
}
