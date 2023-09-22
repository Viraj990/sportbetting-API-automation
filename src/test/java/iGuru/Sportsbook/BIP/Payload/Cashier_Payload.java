package iGuru.Sportsbook.BIP.Payload;

public class Cashier_Payload {
	
	public static String update_profile = "{\r\n"
			+ "    \"first_name\":\"James\",\r\n"
			+ "    \"last_name\":\"Test\",\r\n"
			+ "    \"username\":\"CT1\",\r\n"
			+ "    \"email\":\"CT1@in.com\",\r\n"
			+ "    \"dob\":\"2000-11-26\",\r\n"
			+ "    \"country_code\":\"251\",\r\n"
			+ "    \"phone\":\"749327439274\",\r\n"
			+ "    \"vat_number\":\"4554\",\r\n"
			+ "    \"address\":\"grte\"\r\n"
			+ "}";

	public static String changepassword= "{\r\n"
			+ "    \"old_password\":\"Test@1234\",\r\n"
			+ "    \"new_password\":\"Test@12345\"\r\n"
			+ "}";
	
	public static String createplayer="{\r\n"
			+ "    \"shop_id\":\"1\",\r\n"
			+ "    \"first_name\":\"Jaydip\",\r\n"
			+ "    \"last_name\":\"patel\",\r\n"
			+ "    \"username\":\"jaydip_patel04\",\r\n"
			+ "    \"password\":\"Abcd@1234\",\r\n"
			+ "    \"email\":\"jay01@gmail.com\",\r\n"
			+ "    \"country_code\":\"91\",\r\n"
			+ "    \"dob\":\"2000-12-26\",\r\n"
			+ "    \"phone\":\"999998121\"\r\n"
			+ "}";
	public static String verifyotp = "{\r\n"
			+ "    \"user_id\":\"636\",\r\n"
			+ "    \"otp\":\"123456\"\r\n"
			+ "}";
	public static String resentotp = "{\r\n"
			+ "    \"user_id\":\"637\"\r\n"
			+ "}";
	public static String cancelplayerOTP = "{\r\n"
			+ "    \"user_id\":\"96\"\r\n"
			+ "}";
	
	public static String btrequest ="{\r\n"
			+ "    \"user_id\":\"11\",\r\n"
			+ "    \"amount\":\"100.20\",\r\n"
			+ "    \"transaction_type\":2,\r\n"
			+ "    \"note\":\"player deposit\"\r\n"
			+ "}";
	public static String verfiytransferotp = "{\r\n"
			+ "    \"otp\":\"123456\",\r\n"
			+ "    \"isBalanceTransfer\":true,\r\n"
			+ "    \"user_id\": 2,\r\n"
			+ "    \"shop_transaction_id\": 27,\r\n"
			+ "    \"user_transaction_id\": 71\r\n"
			+ "}";
	public static String canceltransfer = "{\r\n"
			+ "  \"user_id\": 563,\r\n"
			+ "  \"shop_transaction_id\": 2316,\r\n"
			+ "  \"user_transaction_id\": 1896\r\n"
			+ "}";
	public static String resenttransferotp = "{\r\n"
			+ "    \"user_id\":\"563\",\r\n"
			+ "    \"isBalanceTransfer\":true\r\n"
			+ "}";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
