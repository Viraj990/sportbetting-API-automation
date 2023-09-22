package iGuru.Sportsbook.BIP.SuperAdminTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.SuperAdminEndpoint.PermissionEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class PermissionTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void getpermission() {

		Response response=PermissionEndpoint.getpermission();
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
	public void getpermissions() {

		Response response=PermissionEndpoint.getpermissionlist();
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
	public void addpermission() {

		Response response=PermissionEndpoint.Addpermission();
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
	@Test (priority=4)
	public void updatepermission() {

		Response response=PermissionEndpoint.Updatepermission();
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
	@Test (priority=5)
	public void deletePermission() {

		Response response=PermissionEndpoint.deletepermission();
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
}
