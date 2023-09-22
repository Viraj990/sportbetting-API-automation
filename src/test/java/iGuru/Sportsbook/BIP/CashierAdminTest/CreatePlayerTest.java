package iGuru.Sportsbook.BIP.CashierAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import iGuru.Sportsbook.BIP.CashierAdminEndpoint.CreatePlayerEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreatePlayerTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void getprofile() {
		
		Response response=CreatePlayerEndpoint.Createplayer();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "OTP sent successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=2)
	public void verify_OTP() {
		
		Response response=CreatePlayerEndpoint.verifyOTP();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Player created successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=3)
	public void resent_OTP() {
		
		Response response=CreatePlayerEndpoint.resentOTP();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "OTP sent successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=4)
	public void Cancel_player() {
		
		Response response=CreatePlayerEndpoint.cancelplayerrequest();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Cancelled create player request.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
}
