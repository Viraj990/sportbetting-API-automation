package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class LeagueEndpoint {
	public static Response getselectedtopleague() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(SuperAdminRoutes.SelectedTopleague);
		return user;
	}
	public static Response gettopleague() {
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.getleagues)
				.when()
				.post(SuperAdminRoutes.getleague);
		return user;
	}
	public static Response updatetopleague() {
	Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updateleague)
				.when()
				.post(SuperAdminRoutes.updatetopleague);
		return user;
	}
}
