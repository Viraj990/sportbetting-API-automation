package iGuru.Sportsbook.BIP.UserEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.UserRoutes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PrematchEndpoint {
	public static Response getprematchlist() {
		Response prematch=given()
	.header("x-api-key", "35969c8e0fba4")
	.header("API-KEY", "35969c8e0fba4")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(iGuru.Sportsbook.BIP.Payload.payload.getprematch)
	.when()
	.post(UserRoutes.getprematchlist);
	return prematch;
	}
	public static Response getprematchdetails() {
		
	Response prematch=given()
	.pathParam("FixtureID", "17033")
	.header("x-api-key", "35969c8e0fba4")
	.header("API-KEY", "35969c8e0fba4")
	.when()
	.get(UserRoutes.getprematchdetails);
	return prematch;
	}
	public static Response getlastminute() {
		
		Response prematch=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.queryParam("page", 1)
		.queryParam("Size", 10)
		.when()
		.get(UserRoutes.getlastminute);
		return prematch;
		}
public static Response prematchcalendar() {
		Response prematch=given()
		.header("x-api-key", "35969c8e0fba4")
		.header("API-KEY", "35969c8e0fba4")
		.body(iGuru.Sportsbook.BIP.Payload.payload.prematchcalendar)
		.when()
		.get(UserRoutes.getlastminute);
		return prematch;
		}
}
