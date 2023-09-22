package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class DashboardEndpoint {
public static Response dashboarddata(){
		
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}
	public static Response betweekstats(){
		 Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization",Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.betweekstats)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}
	public static Response betmonthstats(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.betmonthstats)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}
	public static Response topweekshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.topweekshop)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}
	public static Response topmonthshop(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(iGuru.Sportsbook.BIP.Payload.payload.topmonthshop)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}

}
