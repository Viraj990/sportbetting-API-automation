package iGuru.Sportsbook.BIP.SuperAdminEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.SuperAdminRoutes;
import iGuru.Sportsbook.BIP.Routes.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SystemsettingEndpoint {
	public static Response getsystemsetting() {

		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(SuperAdminRoutes.getsystemsetting);
		return user;
	}
	public static Response updatesystemsetting() {
		Response user=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.header("Authorization", Token.super_admin)
				.body(iGuru.Sportsbook.BIP.Payload.Menu_LeaguePayload.updatesystemsetting)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.post(SuperAdminRoutes.updatesystemsetting);
		return user;
	}
}
