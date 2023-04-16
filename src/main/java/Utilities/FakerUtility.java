package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class FakerUtility  
{
	WebDriver driver;
	
	public static void fakerName(WebElement element)
	{
	   Faker faker=new Faker();
       String firstName= faker.name().firstName().toString();
       System.out.println("The first name is "+firstName);
	}
	public static void fakerLastName(WebElement element)
	{
	   Faker faker=new Faker();
       String lastName= faker.name().lastName().toString();
       System.out.println("The first name is "+lastName);
	}
	public static void fakerCityName(WebElement element)
	{
		 Faker faker=new Faker();
		 String cityname=faker.address().cityName().toString();
		 System.out.println("The city name is "+cityname);
	}
	public static void fakerState(WebElement element)
	{
		 Faker faker=new Faker();
		 String state=faker.address().state();
		 System.out.println("The city name is "+ state);
	}
	public static void fakerCountry(WebElement element)
	{
		 Faker faker=new Faker();
		 String country=faker.address().country();
		 System.out.println("The city name is "+ country);
	}
	public static void fakerPhoneNumber(WebElement element)
	{
		 Faker faker=new Faker();
		 String phoneNo=faker.phoneNumber().cellPhone();
		 System.out.println("The city name is "+ phoneNo);
	}
	public static void fakerAnimalName(WebElement element)
	{
		 Faker faker=new Faker();
		 String animalName=faker.animal().name();
		 System.out.println("The city name is "+animalName );
	}
	public static void fakerEmail(WebElement element)
	{
		 Faker faker=new Faker();
		 String emailAdrress=faker.internet().emailAddress();
		 System.out.println("The city name is "+ emailAdrress);
	}
	public static void fakerUsername(WebElement element) {
		 Faker faker=new Faker();
		 String userName=faker.internet().userAgentAny();
		 System.out.println("The username is"+ userName);
	}
}