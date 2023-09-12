package superAdminEndpoint;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import routes.SuperAdminRoutes;
import routes.Token;
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
		.body(LoginEndpoint.payload.betweekstats)
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
		.body(LoginEndpoint.payload.betmonthstats)
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
		.body(LoginEndpoint.payload.topweekshop)
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
		.body(LoginEndpoint.payload.topmonthshop)
		.when()
		.get(SuperAdminRoutes.getdashboarddata);
		return response;
	}

}
