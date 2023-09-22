package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PermissionEndpoint {
	public static Response getpermission(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.get(SuperAdminRoutes.getpermission);
		return response;
	}
	public static Response getpermissionlist(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getpermission)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.getpermissions);
		return response;
	}
	public static Response Addpermission(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.addpermission)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.post(SuperAdminRoutes.addpermission);
		return response;
	}
	public static Response Updatepermission(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updatepermission)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.put(SuperAdminRoutes.updatepermission);
		return response;
	}
	public static Response deletepermission(){
		Response response=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.header("Authorization", Token.super_admin)
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.when()
		.delete(SuperAdminRoutes.deletepermission);
		return response;
	}
}
