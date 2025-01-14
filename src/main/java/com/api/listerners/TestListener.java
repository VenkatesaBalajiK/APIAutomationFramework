package com.api.listerners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	private static final Logger logger = LogManager.getLogger(TestListener.class);

	public void onStart(ITestContext context) {
		logger.info("Test Suit Started");
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suit Finished");
	}

	public void onTestStart(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " execution started");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " is Success");
	}

	public void onTestFailure(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " is Failed");
	}

}
