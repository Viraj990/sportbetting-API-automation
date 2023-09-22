package iGuru.Sportsbook.BIP.Payload;

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

	//Super Admin Payout Report
	public static String getpayoutreport = "{\r\n"
			+ "    \"order_key\":\"cashier.username\", \r\n" // id , user.username, shop.name,cashier.username, win_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";
	public static String exportpayoutreport = "{\r\n"
			+ "    \"page\":\"1\",\r\n"
			+ "    \"row_per_page\":\"10\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"id\",\"Player Name\",\"Shop\",\"Cashier\",\"Amount\",\"Create At\"],\r\n"
			+ "    \"order_key\":\"cashier.username\", \r\n" // id , user.username, shop.name,cashier.username, win_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";

	//Super Admin bets Report
	public static String getbetsreport = "{\r\n"
			+ "    \"order_key\":\"\", \r\n" //  user_id,user.full_name,user.shop.name ,total_payout,stake_amount,bet_count
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";
	public static String exportbetsreport = "{\r\n"
			+ "    \"page\":\"1\",\r\n"
			+ "    \"row_per_page\":\"10\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"id\",\"Player Name\",\"Shop\",\"Bets\",\"Payout\",\"Amount\"],\r\n"
			+ "    \"order_key\":\"\", \r\n" //  user_id,user.full_name,user.shop.name ,total_payout,stake_amount,bet_count
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";

	//Super Admin highestbet Report
	public static String gethighestbetreport = "{\r\n"
			+ "    \"order_key\":\"id\", \r\n" // id , user.username, shop.name ,stake_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";
	public static String exporthighestbetreport = "{\r\n"
			+ "    \"page\":\"1\",\r\n"
			+ "    \"row_per_page\":\"10\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"id\",\"Player Name\",\"Shop\",\"Amount\",\"Create At\"],\r\n"
			+ "    \"order_key\":\"id\", \r\n" // id , user.username, shop.name ,stake_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";

	//Super Admin Winning Report
	public static String winningreport ="{\r\n"
			+ "    \"order_key\":\"shop.name\", \r\n" // id ,user.full_name,shop.name,win_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";
	public static String winningreportexport ="{\r\n"
			+ "    \"page\":\"1\",\r\n"
			+ "    \"row_per_page\":\"10\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"id\",\"Player Name\",\"Shop\",\"Amount\",\"Create At\"],\r\n" 
			+ "    \"order_key\":\"shop.name\", \r\n" // id ,user.full_name,shop.name,win_amount,created_at
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";

	//Super Admin Bet Report
	public static String playerbetreport ="{\r\n"
			+ "    \"pbet_uid\":\"1000002072\"\r\n"
			+ "}";
	public static String betreport ="{\r\n"
			+ "    \"pbet_uid\":\"\", \r\n" //for ex. 1000000015
			+ "    \"bet_place_type\":\"\", \r\n" //Single=>1, Combi=>2
			+ "    \"match_type\":\"\", \r\n" //1=> Inplay 2=>prematch
			+ "    \"playerbet_status\":\"\", \r\n" // Win=>2, Lost=>1, running=>0, refund=>3
			+ "    \"shop_id\":\"1\",\r\n"
			+ "    \"start_date\":\"\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\",\r\n"
			+ "    \"isSettled\":false,\r\n"
			+ "    \"order_key\":\"pbet_uid\", \r\n" // pbet_uid,created_at,shop.name,user.username,bet_place_type,stake_amount,win_amount,playerbet_status,
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";
	public static String exportbetreport ="{\r\n"
			+ "    \"page\":\"\",\r\n"
			+ "    \"row_per_page\":\"\",\r\n"
			+ "    \"pbet_uid\":\"\",\r\n " //for ex. 1000000015
			+ "    \"bet_place_type\":\"\", \r\n" //Single=>1, Combi=>2
			+ "    \"match_type\":\"2\", \r\n" //1=> Inplay 2=>prematch
			+ "    \"shop_id\":\"1\", \r\n"
			+ "    \"start_date\":\"2023-08-01T00:00:00.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-03T00:00:00.000Z\",   \r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"Bet ID\",\"Date\",\"Shop\",\"User\",\"Type\",\"Amount\",\"Possible Win\",\"Win\",\"Win-Lost-Void\",\"Status\"],\r\n"
			+ "    \"order_key\":\"pbet_uid\", \r\n" // pbet_uid,created_at,shop.name,user.username,bet_place_type,stake_amount,win_amount,playerbet_status,
			+ "    \"order_value\":\"ASC\" \r\n" //ASC, DESC
			+ "}";

	//Super Admin (Supervisor summary report)
	public static String getsupervisorlist= "{\r\n"
			+ "    \"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\"\r\n"
			+ "}";

	public static String supervisorSummary = "{\"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\"}";

	public static String exportsupervisorSummary = "{\"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"Username\",\"Total Deposite\",\"Total Withdrawal\",\"Current Balance\"]}";
	
	//Super Admin (cashier summary report)
	public static String getcashiersummarylist = "{\r\n"
			+ "    \"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", " //for ex. 2023-06-13T12:05:19.000Z\r\n
			+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\"\r\n"
			+ "}";
	public static String cashierreport = "{\r\n"
			+ "    \"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-19T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-19T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\"\r\n"
			+ "}";
	public static String exportcashiersummary = "{\r\n"
			+ "    \"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-29T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\",\r\n"
			+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"Shop Name\",\"Shop Balance\",\"Total Bets\",\"Total Payout\",\"Total Deposite\",\"Total Withdrawal\",\"Cashier Username\", \"Cashier Balance\"]\r\n"
			+ "}";
	
	//Super Admin (shop summary report)
	
	public static String getshopsummarylist = "{\"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\"}";
	public static String shopsummaryreport = "{ \"id\":\"\",\r\n" 
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\",\r\n"  //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-29T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"0\",\r\n"
			+ "    \"end_price\":\"500000\"}";
	public static String exportshopsummaryreport = "{ \"id\":\"\",\r\n"
			+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
			+ "    \"end_date\":\"2023-08-29T12:05:19.000Z\",\r\n"
			+ "    \"start_price\":\"\",\r\n"
			+ "    \"end_price\":\"\",\r\n"
			+ "    \"file_type\":1, \r\n" //1=> json, 2=> csv, 3=> xlsx
			+ "    \"headers\":[\"Shop Name\",\"Shop Balance\",\"Total Bets\",\"Total Payout\",\"Total Deposite\",\"Total Withdrawal\",\"Cashier\",\"Cashier Balance\"]}";

	//Super Admin (league summary report)
	
		public static String getleaguesummarylist = "{\r\n"
				+ "    \"id\":\"\",\r\n"
				+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
				+ "    \"end_date\":\"2023-08-02T12:05:19.000Z\",\r\n"
				+ "    \"start_price\":\"\",\r\n"
				+ "    \"end_price\":\"\"\r\n"
				+ "}";
		public static String leaguesummaryreport = "{\r\n"
				+ "    \"id\":\"\",\r\n"
				+ "    \"start_date\":\"2023-07-15T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
				+ "    \"end_date\":\"2023-07-19T12:05:19.000Z\"\r\n"
				+ "}";
		public static String exportleaguesummaryreport = "{\r\n"
				+ "    \"id\":\"\",\r\n"
				+ "    \"start_date\":\"2023-07-01T12:05:19.000Z\", \r\n" //for ex. 2023-06-13T12:05:19.000Z
				+ "    \"end_date\":\"2023-08-29T12:05:19.000Z\",\r\n"
				+ "    \"file_type\":3, \r\n" //1=> json, 2=> csv, 3=> xlsx
				+ "    \"headers\":[\"League Name\",\"Total Bets\",\"Total Lost\",\"Total Refunds\",\"Total Win\",\"Win Lost-Receive\"]\r\n"
				+ "}";
}
