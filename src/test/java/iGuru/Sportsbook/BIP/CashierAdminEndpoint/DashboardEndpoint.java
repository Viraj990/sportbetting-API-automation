package iGuru.Sportsbook.BIP.CashierAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.CashierRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class DashboardEndpoint {

	public static Response getcashierdashboard(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.cashier)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.getdashboarddata);
		return response;
	}
	public static Response getsummaryReport(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.adminarka)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.getdashboarddata);
		return response;
	}
	public static Response getRole(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.adminarka)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.getrole);
		return response;
	}
	public static Response Adminlogincheck(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.adminarka)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(CashierRoutes.checklogin);
		return response;
	}
}
