package org.com.Utility;

import org.com.TestBase.BaseClass;

public class CommonUtil extends BaseClass {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICITWAIT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
}
