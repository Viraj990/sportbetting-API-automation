package iGuru.Sportsbook.BIP.SuperAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.SuperAdminEndpoint.SuperAdmin_UserEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SuperAdmin_UserTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void getsingleuser() {

		Response response=SuperAdmin_UserEndpoint.getuseradmin();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
	@Test (priority=2)
	public void getuserlist() {

		Response response=SuperAdmin_UserEndpoint.getuserlists();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("success");
		String expectedMessage = "true";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
	@Test (priority=3)
	public void adduser() {

		Response response=SuperAdmin_UserEndpoint.Adduser();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "User added successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
	@Test (priority=4)
	public void updateuser() {

		Response response=SuperAdmin_UserEndpoint.Updateuser();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "User updated successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
	@Test (priority=5)
	public void deleteuser() {

		Response response=SuperAdmin_UserEndpoint.deleteuser();
		String actualServerName = response.getHeader("Server");
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "User deleted successfully.";
		Assert.assertEquals(expectedMessage, message);
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
	}
}
