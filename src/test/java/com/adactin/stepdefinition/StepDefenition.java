package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	 
	public static WebDriver driver= RunnerClass.driver;
		

@Given("^user Launch The Url In Adactin Application$")
public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
	

}

@When("^user Enter The Username In User Field$")
public void user_Enter_The_Username_In_User_Field() throws Throwable {
	
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("Vinothprabhakarans");
	
}

@When("^user Enter The Password In Paaword Field$")
public void user_Enter_The_Password_In_Paaword_Field() throws Throwable {
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("Vinoth@1994");
	
}

@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	 WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
	 login.click();


}

@When("^User Select The Location$")
public void user_Select_The_Location() throws Throwable {
	 WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	 location.click();
	 Select a =new Select(location);
	 a.selectByIndex(2);
}

@When("^user Select The Hotels$")
public void user_Select_The_Hotels() throws Throwable {
	 WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
	 hotels.click();

Select b = new Select(hotels);
b.selectByIndex(2);
	
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	 WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
	 roomtype.click();
	 Select c = new Select(roomtype);
	 c.selectByIndex(3); 
}

@When("^user Select The Number Of Rooms$")
public void user_Select_The_Number_Of_Rooms() throws Throwable {
WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
numberofrooms.click();
Select d = new Select(numberofrooms);
d.selectByIndex(2);
}

@When("^user Enter The Check In Date$")
public void user_Enter_The_Check_In_Date() throws Throwable {
	WebElement checkindate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	checkindate.click();
	  checkindate.sendKeys("30/10/2023"); 
}

@When("^user Enter The Check Out Date$")
public void user_Enter_The_Check_Out_Date() throws Throwable {
	WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	checkout.click();
	 checkout.sendKeys("31/10/2023	");
	
}

@When("^user Select The Adults Per Room$")
public void user_Select_The_Adults_Per_Room() throws Throwable {
	WebElement adultsperroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
	adultsperroom.click();
	 Select e = new Select(adultsperroom);
	 e.selectByIndex(2);
	  
}

@When("^user Select The Children Per Room$")
public void user_Select_The_Children_Per_Room() throws Throwable {
	WebElement childrenperroom = driver.findElement(By.xpath("//select[@id='child_room']"));
	 childrenperroom.click();
	 Select f = new Select(childrenperroom);
	  f.selectByIndex(2);
	  
}

@Then("^user Click The Search Button And It Navigates To Next Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_Next_Page() throws Throwable {
	 WebElement submit  = driver.findElement(By.xpath("//input[@id='Submit']"));
	  submit.click();;
}

@When("^user Select The Hotel Name$")
public void user_Select_The_Hotel_Name() throws Throwable {
	  WebElement clickbutton  = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	  clickbutton.click();
}

@Then("^user Click The Continue Button And And It Navigates To Next Page$")
public void user_Click_The_Continue_Button_And_And_It_Navigates_To_Next_Page() throws Throwable {
	WebElement continuebutton= driver.findElement(By.xpath("//input[@id='continue']"));
	continuebutton.click();
}

@When("^user Enter The First Name In First Name Field$")
public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	 WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	 firstname.sendKeys("vinothprabhakaran");
}

@When("^user Enter The Last Name In Last Name Field$")
public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	  WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	  lastname.click();
	    lastname.sendKeys("s");

}

@When("^user Enter The Billing Address In Billing Address Field$")
public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	 WebElement billingaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
	 billingaddress.click();
     billingaddress.sendKeys("7/321 yadav street padi chennai-600001");
     
}

@When("^user Enter The Credit Card No In Credit Card No Field$")
public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	  WebElement creditcardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
	  creditcardno.click();
	     creditcardno.sendKeys("5464587121212121");

}

@When("^user Select The Credit Card Type In Credit Card Field$")
public void user_Select_The_Credit_Card_Type_In_Credit_Card_Field() throws Throwable {
	   WebElement creditcardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	   creditcardtype.click();
	   Select g = new Select(creditcardtype);
	     g.selectByIndex(2);
	     

}

@When("^user Select The Expiry Date In Month And Year$")
public void user_Select_The_Expiry_Date_In_Month_And_Year() throws Throwable {
	 WebElement expiryyear= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	 expiryyear.click();
	 Select i = new Select(expiryyear);
     i.selectByIndex(2);

}

@When("^user Enter The Cvv Number In Cvv Number Field$")
public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
	WebElement findElement = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	WebElement cvvnumber = findElement;
    cvvnumber.click();
    cvvnumber.sendKeys("123");

}

@Then("^User Click The Book Now And It Navigates To Next Page$")
public void user_Click_The_Book_Now_And_It_Navigates_To_Next_Page() throws Throwable {
	WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']")); 
	 booknow.click();
}
	
}