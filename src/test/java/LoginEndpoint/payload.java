package LoginEndpoint;

public class payload {
//UserPayload
	public static String userlogin = "{\r\n"
			+ "    \"username\":\"yash_kumbhani\",\r\n"
			+ "    \"password\":\"Abcd@1234\"\r\n"
			+ "}";
	
	public static String loginuser= "{\r\n"
			+ "    \"username\":\"Viraj1\",\r\n"
			+ "    \"password\":\"Test@1234\"\r\n"
			+ "}";
	public static String getticketdetails= "{\r\n"
			+ "    \"pbet_uid\":\"1000000026\"\r\n"
			+ "}";
	
	public static String forgetpassword= "{\r\n"
			+ "    \"username_or_phone\":\"7698248371\"\r\n"
			+ "}";
	
	public static String getprematch= "{\r\n"
			+ "    \"search\":\"\"\r\n"
			+ "}";
	public static String prematchcalendar= "{\r\n"
			+ "    \"date\":\"2023-08-18\"\r\n"
			+ "}";
	
	public static String getsportbook="{\r\n"
			+ "    \"time_filter\": \"TODAY\" \"\r\n" // TODAY, TOMORROW, 3, 6, "2023-05-11T09:53:31.000Z"
			+ "}";
	
	public static String sportbooklist="{\r\n"
			+ "    \"sport_book\": [\r\n"
			+ "    {\r\n"
			+ "        \"id\": 8,\r\n"
			+ "        \"Locations\": [\r\n"
			+ "            {\r\n"
			+ "                \"id\": 4,\r\n"
			+ "                \"Leagues\": [\r\n"
			+ "                   544,557\r\n"
			+ "                ]\r\n"
			+ "            }\r\n"
			+ "        ]\r\n"
			+ "    }\r\n"
			+ "]\r\n"
			+ "\r\n"
			+ "}";
	
	public static String mobilesportbook="{\r\n"
			+ "    \"time_filter\": \"3\" \"\r\n" // TODAY, TOMORROW, 3, 6, "2023-05-11T09:53:31.000Z"
			+ "}";
	
	public static String Mobilesportbooklist="{\r\n"
			+ "    \"sport_id\":1,\r\n"
			+ "    \"time_filter\": \"\" \"\r\n" // TODAY, TOMORROW, 3, 6, "2023-05-11T09:53:31.000Z"
			+ "}";
	
	public static String betticket = "{\r\n"
			+ "    \"pbet_uid\":\"1000002014\"\r\n"
			+ "}";
	//SuperAdmin Payload
	public static String betweekstats = "{\r\n"
			+ "    \"type\":\"1\", \r\n"
			+ "    \"start_date\":\"2023-07-21 09:55:25\",\r\n"
			+ "    \"end_date\":\"2023-07-25 09:58:03\"\r\n"
			+ "}";
	
	public static String betmonthstats = "{\r\n"
			+ "    \"type\":\"2\", \r\n"
			+ "    \"start_date\":\"2023-07-21 09:55:25\",\r\n"
			+ "    \"end_date\":\"2023-07-25 09:58:03\"\r\n"
			+ "}";
	
	public static String topweekshop = "{\r\n"
			+ "    \"type\":\"1\", \r\n"
			+ "    \"sub_type\":1, \r\n" // 1=> Bet, 2 => Revenue, 3 => Profit, 4 => Payout
			+ "    \"start_date\":\"2023-07-20 09:55:25\",\r\n"
			+ "    \"end_date\":\"2023-07-25 09:58:03\"\r\n"
			+ "}";
	
	public static String topmonthshop = "{\r\n"
			+ "    \"type\":\"2\", \r\n"
			+ "    \"sub_type\":1, \r\n" // 1=> Bet, 2 => Revenue, 3 => Profit, 4 => Payout
			+ "    \"start_date\":\"2023-07-20 09:55:25\",\r\n"
			+ "    \"end_date\":\"2023-07-25 09:58:03\"\r\n"
			+ "}";
	
}
