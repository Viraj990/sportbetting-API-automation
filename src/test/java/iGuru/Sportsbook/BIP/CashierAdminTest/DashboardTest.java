package iGuru.Sportsbook.BIP.CashierAdminTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import iGuru.Sportsbook.BIP.CashierAdminEndpoint.DashboardEndpoint;
import io.restassured.response.Response;

public class DashboardTest {
	@Test (priority=1)
	public void getdashboarddata() {
		Response response=DashboardEndpoint.getcashierdashboard();
		response.then().log().all();
		response.then().contentType("application/json; charset=utf-8");
		response.then().statusLine("HTTP/1.1 200 OK");
		String actualServerName = response.getHeader("Server");
        // Define the expected server name
        String expectedServerName = "nginx/1.20.1";
        // Assert that the actual server name matches the expected server name
        Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected value.");
		Assert.assertEquals(response.getStatusCode(),200);	
}
	@Test (priority=2)
	public void summaryReport() {
		Response response=DashboardEndpoint.getsummaryReport();
		response.then().log().all();
		response.then().contentType("application/json; charset=utf-8");
		response.then().statusLine("HTTP/1.1 200 OK");
		String actualServerName = response.getHeader("Server");
        // Define the expected server name
        String expectedServerName = "nginx/1.20.1";
        // Assert that the actual server name matches the expected server name
        Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected value.");
		Assert.assertEquals(response.getStatusCode(),200);	
}
	@Test (priority=3)
	public void getroles() {
		Response response=DashboardEndpoint.getRole();
		response.then().log().all();
		response.then().contentType("application/json; charset=utf-8");
		response.then().statusLine("HTTP/1.1 200 OK");
		String actualServerName = response.getHeader("Server");
        // Define the expected server name
        String expectedServerName = "nginx/1.20.1";
        // Assert that the actual server name matches the expected server name
        Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected value.");
		Assert.assertEquals(response.getStatusCode(),200);	
}
	@Test (priority=4)
	public void playerlogincheck() {
		Response response=DashboardEndpoint.Adminlogincheck();
		response.then().log().all();
		response.then().contentType("application/json; charset=utf-8");
		response.then().statusLine("HTTP/1.1 200 OK");
		String actualServerName = response.getHeader("Server");
        // Define the expected server name
        String expectedServerName = "nginx/1.20.1";
        // Assert that the actual server name matches the expected server name
        Assert.assertEquals(actualServerName, expectedServerName, "Server name does not match expected value.");
		Assert.assertEquals(response.getStatusCode(),200);	
}
}
