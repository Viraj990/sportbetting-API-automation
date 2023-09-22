package iGuru.Sportsbook.BIP.UserTest;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import iGuru.Sportsbook.BIP.UserEndpoint.authpojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthTest {
	Faker faker;
	authpojo authpayload;

	public Logger logger;

	public String expectedServerName = "nginx/1.20.1";
	@BeforeClass
	public void setup() {

		faker=new Faker();
		authpayload=new authpojo();
		//Registration
		authpayload.setfirst_name(faker.name().firstName());
		authpayload.setlast_name(faker.name().lastName());
		authpayload.setUsername(faker.name().username());
		authpayload.setPassword("Test@1234");
		authpayload.setEmail(faker.internet().safeEmailAddress());
		authpayload.setDob("2000-11-27");
		authpayload.setCountry_code("91");
		authpayload.setPhone(faker.number().digits(10));
		System.out.println(authpayload.getfirst_name());
		System.out.println(authpayload.getlast_name());
		System.out.println(authpayload.getUsername());
		System.out.println(authpayload.getEmail());
		System.out.println(authpayload.getPhone());

		//Login
		authpayload.getUsername();
		authpayload.getPassword();
		//Forgetpassword
		authpayload.getPhone();
		//logs

		logger = LogManager.getLogger(this.getClass());

	}

	@Test (priority=1)
	public void Registeruser() {
		logger.info("****************Register New user*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.createuser(authpayload);
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "OTP sent successfully.";
		response.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );	
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
		logger.info("***************User Registered*****************");
	}
	@Test (priority=2)
	public void OTPverification() throws FileNotFoundException {
		logger.info("****************OTP Verification*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.VerifyOTPForRegistration();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Registration successful.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		logger.info("****************User Regsitered*****************");
	}
	@Test (priority=3)
	public void Resentotpverification() throws FileNotFoundException {
		logger.info("****************Resent OTP Verification*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.resentotp();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "OTP sent successfully.";
		Assert.assertEquals(expectedMessage, message);
		response.then().statusLine("HTTP/1.1 200 OK");
		response.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		logger.info("****************OTP check*****************");}

	@Test (priority=4)
	public void usercancel() throws FileNotFoundException {
		logger.info("****************Resent OTP Verification*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.cancelusers();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your registration request has been canceled.";
		Assert.assertEquals(expectedMessage, message);
		response.then().statusLine("HTTP/1.1 200 OK");
		response.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		logger.info("****************OTP check*****************");
	}
	@Test (priority=5)
	public void Loginuser() {
		logger.info("****************Login user*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.loginuser();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Login successfully.";
		Assert.assertEquals(expectedMessage, message);
		response.then().statusLine("HTTP/1.1 200 OK");
		response.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		logger.info("****************User loggedIn*****************");
	}

	@Test (priority=6)
	public void getticketdetails() {
		logger.info("****************Check Status*****************");
		Response ticket=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.getticketdetails();
		ticket.then().log().all();
		ticket.then().extract().response();
		String responseBody = ticket.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		ticket.then().statusLine("HTTP/1.1 200 OK");
		ticket.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(ticket.getStatusCode(),200);
		Assert.assertEquals(ticket.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(ticket.contentType(), "application/json; charset=utf-8" );
		logger.info("****************Got Status*****************");
	}
	@Test (priority=7)
	public void forgotpassword() {
		logger.info("****************Rest password*****************");
		Response response=iGuru.Sportsbook.BIP.UserEndpoint.AuthEndpoint.forgetpassword();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your password has been reset, Please login with the new password given to you in the text message.";
		Assert.assertEquals(expectedMessage, message);
		response.then().statusLine("HTTP/1.1 200 OK");
		response.then().contentType("application/json; charset=utf-8");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		logger.info("****************Password Received*****************");
	}
}
