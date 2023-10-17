package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.homepage;
import com.actitime.pages.loginpage;

public class tc_1_login extends BaseTest {

		@Test
		public void login() throws InterruptedException, IOException {
			loginpage l=new loginpage(driver);
			l.loginmethod();
					
		}
		@Test(dependsOnMethods = "login")
		public void logout() {
		homepage h=new homepage(driver);
		h.logout();
}
}






