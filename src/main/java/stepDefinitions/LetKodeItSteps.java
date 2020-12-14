/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LetKodeItSteps {
	WebDriver driver;

	@Given("Open Web Let Kode Page")
	public void open_Web_Let_Kode_Page() {
		// Window
		System.setProperty("webdriver.chrome.driver", "C:/Users/PC User1/Documents/Devops/chromedriver.exe");

		// Macbook
//		System.setProperty("webdriver.chrome.driver","/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("Click on the BMW checkbox")
	public void click_on_the_BMW_checkbox() {
		driver.findElement(By.id("bmwradio")).click();

	}

	@Then("Click on the Benz checkbox")
	public void click_on_the_Benz_checkbox() {
		driver.findElement(By.id("benzradio")).click();
	}

	@Then("Click on the Honda checkbox")
	public void click_on_the_Honda_checkbox() {
		driver.findElement(By.id("hondaradio")).click();

	}

	@Then("Close the Webpage")
	public void close_the_Webpage() {
		driver.quit();
	}
}