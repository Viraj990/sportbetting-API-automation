package iGuru.Sportsbook.BIP.CashierAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.CashierAdminEndpoint.CashierProfileEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CashierProfileTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void getprofile() {
		
		Response response=CashierProfileEndpoint.CashierProfile();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=2)
	public void updateprofile() {
		Response response=CashierProfileEndpoint.UpdateCashierProfile();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your profile updated successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=3)
	public void changepassword() {
		Response response=CashierProfileEndpoint.Changepassword();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Password changed successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
}

