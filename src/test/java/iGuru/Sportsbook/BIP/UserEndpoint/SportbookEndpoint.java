package iGuru.Sportsbook.BIP.UserEndpoint;
import static io.restassured.RestAssured.given;

import iGuru.Sportsbook.BIP.Routes.UserRoutes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SportbookEndpoint {
	public static Response getsportbooks() {
		Response sportbook=given()
				.header("x-api-key", "35969c8e0fba4")
				.header("API-KEY", "35969c8e0fba4")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(iGuru.Sportsbook.BIP.Payload.payload.getsportbook)
				.when()
				.post(UserRoutes.getsportbook);
		return sportbook;
	}
		public static Response sportbooklists() {
			Response sportbook=given()
					.header("x-api-key", "35969c8e0fba4")
					.header("API-KEY", "35969c8e0fba4")
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(iGuru.Sportsbook.BIP.Payload.payload.sportbooklist)
					.when()
					.post(UserRoutes.sportbooklist);
			return sportbook;
		}
		public static Response getmobilesportbook() {
			Response sportbook=given()
					.header("x-api-key", "35969c8e0fba4")
					.header("API-KEY", "35969c8e0fba4")
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(iGuru.Sportsbook.BIP.Payload.payload.mobilesportbook)
					.when()
					.post(UserRoutes.MobileGetSportBooks);
			return sportbook;
		}
		public static Response getmobilesportbooklist() {
			Response sportbook=given()
					.header("x-api-key", "35969c8e0fba4")
					.header("API-KEY", "35969c8e0fba4")
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(iGuru.Sportsbook.BIP.Payload.payload.Mobilesportbooklist)
					.when()
					.post(UserRoutes.MobileGetSportBooksList);
			return sportbook;
		}
}
