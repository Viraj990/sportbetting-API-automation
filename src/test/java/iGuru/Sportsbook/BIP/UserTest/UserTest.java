package iGuru.Sportsbook.BIP.UserTest;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.UserEndpoint.UserEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UserTest {
	@Test (priority=1)
	public void GetTicketlist() {
		Response user=UserEndpoint.GetTicketlist();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=2)
	public void GetTicketlistdetails() {
		Response user=UserEndpoint.GetTicketlistdetails();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=3)
	public void gettransactionlist() {
		Response user=UserEndpoint.gettransactionlist();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=4)
	public void placedbet() throws FileNotFoundException {
		Response user=UserEndpoint.placedbets();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Place bet created successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=5)
	public void logintokencheck()  {
		Response user=UserEndpoint.logintoken();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=6)
	public void getuserprofile()  {
		Response user=UserEndpoint.profiledetails();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
	@Test (priority=7)
	public void Getupdateprofile() throws FileNotFoundException {
		Response user=UserEndpoint.updateprofile();
		user.then().log().all();
		user.then().extract().response();
		String responseBody = user.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your profile updated successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(user.getStatusCode(),200);
		Assert.assertEquals(user.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(user.contentType(), "application/json; charset=utf-8" );
	}
}
