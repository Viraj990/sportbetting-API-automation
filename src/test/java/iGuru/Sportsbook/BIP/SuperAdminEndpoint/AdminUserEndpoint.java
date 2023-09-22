package iGuru.Sportsbook.BIP.SuperAdminEndpoint;

import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AdminUserEndpoint {
	public static Response getAdminUser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getadminuser);
		return response;
	}
	public static Response getadminuserlist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getadminusers)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.adminuserlist);
		return response;
	}
	public static Response addadminuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.addadminuser)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.addAdminuser);
		return response;
	}
	public static Response updateadminuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updateadminuser)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put(SuperAdminRoutes.updateadminuser);
		return response;
	}
	public static Response deleteadminuser(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.delete(SuperAdminRoutes.deleteadminuser);
		return response;
	}
}
