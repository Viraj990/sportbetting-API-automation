package iGuru.Sportsbook.BIP.SuperAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.SuperAdminEndpoint.SystemsettingEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SystemsettingTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void get_systemsetting() {

		Response response=SystemsettingEndpoint.getsystemsetting();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "User added successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
	@Test (priority=2)
	public void update_systemsetting() {

		Response response=SystemsettingEndpoint.updatesystemsetting();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Setting updated successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
}
