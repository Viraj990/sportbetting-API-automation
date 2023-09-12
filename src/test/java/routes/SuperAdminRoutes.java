package routes;

public class SuperAdminRoutes {
	//public static String base_url="https://api.onlinegamblingtech.com/api";
		public static String base_url="http://api.onlinegamblingtech.com/api";
//		public static String local="http://192.168.1.7:5000/api";
		
		//Admin Login
		public static String adminlogin=base_url+"/admin/login";
		
		//SuperAdmin Dash board
		public static String getdashboarddata=base_url+"/admin/dashboard";
		public static String getbetstats=base_url+"/admin/dashboard/betstats";
		public static String gettopshops=base_url+"/admin/dashboard/topshops";
		
		//Live balance Report
		public static String livebalance=base_url+"/admin/reports/live/shop/balance";
		
		//Pay out report
		public static String payoutreport=base_url+"/admin/reports/payouts";
		public static String exportpayout=base_url+"/admin/reports/payouts/export";
		
		//Bet report
		public static String betreport=base_url+"/admin/reports/bets";
		public static String exportbetreport=base_url+"/admin/reports/bets/export";
			
		//Highest Bet report
		public static String GetHighestBetsReport=base_url+"/admin/reports/highestbets";
		public static String ExportHighestBetsReport=base_url+"/admin/reports/highestbets/export";

		//Winning report
		public static String GetwinningReport=base_url+"/admin/reports/winnings";
		public static String Exportwinningreport=base_url+"/admin/reports/winnings/export";
		
		//Betting Report
		public static String Getplayerbet=base_url+"/admin/get/bet/details";
		public static String getbettingreport=base_url+"/admin/reports/betting";
		public static String exportbettingreport=base_url+"/admin/reports/betting/export";
		
		//Supervisor Summary Report
		public static String getsupervisorlist = base_url+"/admin/supervisor/list";
		public static String supervisorreport = base_url+"/admin/reports/supervisor/summary";
		public static String exportsupervisorreport = base_url+"/admin/reports/supervisor/summary/export";

		//Cashier Summary Report
		public static String getcashierlist = base_url+"/admin/cashier/list";
		public static String cashierreport = base_url+"/admin/reports/cashier/summary";
		public static String exportcashierreport = base_url+"/admin/reports/cashier/summary/export";

		//Shop Summary Report
		public static String getshoplist = base_url+"/admin/shop/list";
		public static String shopreport = base_url+"/admin/reports/shop/summary";
		public static String exportshopreport = base_url+"/admin/reports/shop/summary/export";
		
		//League Summary Report
		public static String getleaguelist = base_url+"/admin/league/list";
		public static String leaguereport = base_url+"/admin/reports/league/summary";
		public static String exportleaguereport = base_url+"/admin/reports/league/summary/export";
		
		//Menu
		public static String getmenu = base_url+"/admin/menu/get/1";
		public static String getmenus = base_url+"/admin/menu/list";
		public static String addmenu = base_url+"/admin/menu/add";
		public static String updatemenu = base_url+"/admin/menu/update";
		public static String deletemenu = base_url+"/admin/menu/delete/36";
		
		//Role
		public static String getrole = base_url+"/admin/role/get/4";
		public static String getroles = base_url+"/admin/role/list";
		public static String addrole = base_url+"/admin/role/add";
		public static String updaterole = base_url+"/admin/role/update";
		public static String deleterole = base_url+"/admin/role/delete/41";
		
		//permission
		public static String getpermission = base_url+"/admin/permission/get/2";
		public static String getpermissions = base_url+"/admin/permission/list";
		public static String addpermission = base_url+"/admin/permission/add";
		public static String updatepermission = base_url+"/admin/permission/update";
		public static String deletepermission = base_url+"/admin/permission/delete";
		
		//Shop Superadmin
		public static String getshop = base_url+"/admin/shop/get/19";
		public static String getshops = base_url+"/admin/shop/list";
		public static String addshop = base_url+"/admin/shop/add";
		public static String updateshop = base_url+"/admin/shop/update";
		public static String deleteshop = base_url+"/admin/shop/delete";
		public static String getshopasignforadminuser = base_url+"/admin/shop/assign/get/1";
		public static String shopasignforadminuser = base_url+"/admin/shop/assign";
		public static String shopassginforadminuserlist = base_url+"/admin/shop/assign/adminuser/list";
		//public static String importshop = base_url+"/admin/shop/import";
		
		//user
		public static String getuser = base_url+"/admin/user/get/5";
		public static String getusers = base_url+"/admin/user/list";
		public static String adduser = base_url+"/admin/user/add";
		public static String updateuser = base_url+"/admin/user/update";
		public static String deleteuser = base_url+"/admin/user/delete";
}
