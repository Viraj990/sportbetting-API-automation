package iGuru.Sportsbook.BIP.UserEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.UserRoutes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class TopleagueEndpoint {
	public static Response GetTopLeague() {

		Response league=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(UserRoutes.GetTopLeague);
		return league;
	}
	public static Response GetTopLeagueDetail() {

		Response league=given()
				
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(UserRoutes.GetTopLeagueDetail);
		return league;
	}
	public static Response MobileGetTopLeague() {

		Response league=given()

				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when()
				.get(UserRoutes.MobileGetTopLeague);
		return league;
	}
}
