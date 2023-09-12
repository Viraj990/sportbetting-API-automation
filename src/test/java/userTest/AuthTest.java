package userTest;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import userEndpoint.authpojo;

public class AuthTest {
	Faker faker;
	authpojo authpayload;

	public Logger logger;


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
			Response response=userEndpoint.AuthEndpoint.createuser(authpayload);
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
			logger.info("***************User Registered*****************");
		}
		@Test (priority=2)
		public void OTPverification() throws FileNotFoundException {
			logger.info("****************OTP Verification*****************");
			Response response=userEndpoint.AuthEndpoint.VerifyOTPForRegistration();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
			logger.info("****************User Regsitered*****************");
		}
		@Test (priority=3)
		public void Resentotpverification() throws FileNotFoundException {
			logger.info("****************Resent OTP Verification*****************");
			Response response=userEndpoint.AuthEndpoint.resentotp();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
			logger.info("****************OTP check*****************");}
		
			@Test (priority=4)
			public void usercancel() throws FileNotFoundException {
				logger.info("****************Resent OTP Verification*****************");
				Response response=userEndpoint.AuthEndpoint.cancelusers();
				response.then().log().all();
				Assert.assertEquals(response.getStatusCode(),200);
				logger.info("****************OTP check*****************");
		}
		@Test (priority=5)
		public void Loginuser() {
			logger.info("****************Login user*****************");
			Response response=userEndpoint.AuthEndpoint.loginuser();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
			logger.info("****************User loggedIn*****************");
		}

		@Test (priority=6)
		public void getticketdetails() {
			logger.info("****************Check Status*****************");
			Response ticket=userEndpoint.AuthEndpoint.getticketdetails();
			ticket.then().log().all();
			Assert.assertEquals(ticket.getStatusCode(),200);
			logger.info("****************Got Status*****************");
		}
		@Test (priority=7)
		public void forgotpassword() {
			logger.info("****************Rest password*****************");
			Response response=userEndpoint.AuthEndpoint.forgetpassword();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200);
			logger.info("****************Password Received*****************");
		}
}
