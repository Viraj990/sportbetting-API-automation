package iGuru.Sportsbook.BIP.CashierAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.CashierAdminEndpoint.CashierBalanceTransferEndpoint;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CashierBalanceTransferTest {
	public String expectedServerName = "nginx/1.20.1";
	@Test (priority=1)
	public void userlist() {
		
		Response response=CashierBalanceTransferEndpoint.getBTlist();
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
	public void RequestBT() {
		
		Response response=CashierBalanceTransferEndpoint.BTrequest();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your Transaction request sent successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=3)
	public void verifytransferOTP() {
		
		Response response=CashierBalanceTransferEndpoint.VerifytransferwithOTP();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your Transaction successfully.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=4)
	public void canceltransfer() {
		
		Response response=CashierBalanceTransferEndpoint.canceltransfer();
		response.then().log().all();
		response.then().extract().response();
		String responseBody = response.getBody().asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		String message = jsonPath.getString("message");
		String expectedMessage = "Your transaction request cancel.";
		Assert.assertEquals(expectedMessage, message);
		String actualServerName = response.getHeader("Server");
		Assert.assertEquals(response.getStatusCode(),200);	
		Assert.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8" );
		Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected name.");
}
	@Test (priority=4)
	public void BTresentotp() {
		
		Response response=CashierBalanceTransferEndpoint.resentBTOTP();
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
}
