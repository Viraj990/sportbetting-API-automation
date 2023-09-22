package iGuru.Sportsbook.BIP.SuperAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.SuperAdminEndpoint.MenuEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MenuTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void getmenu() {

		Response response=MenuEndpoint.getmenu();
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
	public void getmenus() {

		Response response=MenuEndpoint.getmenulist();
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
	public void addmenu() {

		Response response=MenuEndpoint.Addmenu();
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
	public void updatemenu() {

		Response response=MenuEndpoint.Updatemenu();
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
	public void deletemenu() {

		Response response=MenuEndpoint.deletemenu();
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
