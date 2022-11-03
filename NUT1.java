PRANAV import java.util.Scanner;

import myproject.ENERGY_DRINK;
import myproject.NUTRITION;
import myproject.PRODUCT;
import myproject.PROTEIN_PRODUCT;
import myproject.Registration;
import myproject.VITAMIN_PRODUCT;


class Registration // ==================================================================================FOR REGISTRATION OF CUSTOMER
{
	private String name;// ==================================================================================================ENCAPSULATION(DATA
						// HIDING)
	private String add;
	private String email;
	private long mob;

	
	
	public void regi()// =======================================================================METHOD
						// FOR REGISTRATION OF CUSTOMER
	{
		{
			Scanner n = new Scanner(System.in);// ==============================SCANNER INPUTS FOR CUSTOMER DETAILS
			System.out.println("====================================================================================");
			System.out.println(">--------------------------------REGISTRATION PAGE---------------------------------<");
			System.out.println("====================================================================================");

			System.out.print(">PLEASE ENTER >YOUR NAME         :");
			name = n.next();

			Scanner a = new Scanner(System.in);
			System.out.print(">PLEASE ENTER >YOUR ADDRESS      :");
			add = a.next();

			Scanner e = new Scanner(System.in);
			System.out.print(">PLEASE ENTER >YOUR EMAIL        :");
			email = e.next();

			Scanner m = new Scanner(System.in);
			System.out.print(">>PLEASE ENTER >YOUR MOBILE NO.  :+91");
			mob = m.nextLong();
			

			System.out.println("====================================================================================");
			System.out.println(">------------------------------------ THANK YOU -----------------------------------<");
			System.out.println(">--------------------------- REGISTRATION IS SUCCESSFUL ---------------------------<");
			System.out.println("====================================================================================");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			

		}
	}
	
	

	public String getName()// ==========================================================================>GETTER()
							// FOR ACCESSING PRIVATE DATA
	{
		return name;
	}

	public void setName(String name)// ==================== ============================================SETTER() FOR
									// MODYFYING PRIVATE DATA
	{
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}
	
	
	
}

class NUTRITION {
	static// ============================================================STATIC BLOCK TO EXECUTE 1ST
			 
	{


		//System.out.println("====================================================================================");
		System.out.println("          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         ");
		System.out.println("        |                                                                   |       ");
		System.out.println("        | >>-----------@ WELCOME TO FITNESS_R@JA NUTRITION @----------->>   |       ");
		System.out.println("        |                                                                   |       ");
		System.out.println("          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

	}

	public static void b() {
		System.out.println(" ");
	}
}

class PRODUCT extends NUTRITION// ================================proDuct inherits nutrition class
{
	static int l;

	public static void b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println(">NUTRITION_PRODUCT ");
		System.out.println("----------------------------------------------------------------------------------");
        System.out.println(">ENTER 1 FOR >ENERGY_DRINK_PRODUCT");
		System.out.println(">ENTER 2 FOR >VITAMIN_PRODUCT");
		System.out.println(">ENTER 3 FOR >PROTEIN_PRODUCT");
		System.out.println("==================================================================================");
		System.out.print  (">>PLEASE ENTER NUTRITION_PRODUCT NO = ");
		l = sc.nextInt();
		
		
		switch (l) {
		case 1:
			System.out.println("==============================================================================");
			System.out.println(">>THANK YOU FOR CHOSING ENERGY_DRINK");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT ENERGY_DRINK_TYPE");
			System.out.println("==============================================================================");
			break;
			
		case 2:
			System.out.println("==============================================================================");
			System.out.println(">>THANK YOU FOR CHOSING VITAMIN_PRODUCT");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT VITAMIN_TYPE");
			System.out.println("==============================================================================");
			break;
			
		case 3:
			System.out.println("==============================================================================");
			System.out.println(">>THANK YOU FOR CHOSING PROTEIN_PRODUCT");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT PROTEIN_TYPE");
			System.out.println("==============================================================================");
			break;
			
		default:
			System.out.println("==============================================================================");
			System.out.println(">>INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("***********************************");
			b();
			System.out.println("==============================================================================");

		}
	}

	public void ENERGY_DRINKTYPE()// ================================================================================METHOD
									// OVERRIDING(RUN-TIME POLYMORPHISM)
	{
		System.out.println("============================================================================");
	}
}

//===================================================================================================================================
class ENERGY_DRINK extends PRODUCT {
	public void ENERGY_DRINKTYPE() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >PRE_WORKOUT");
		System.out.println(">ENTER 2 FOR >POST_WORKOUT");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO BACK");
		System.out.println("==============================================================================");
		int l = sc.nextInt();
		switch (l) {
		case 0:
			PRODUCT.b();
			//ENERGY_DRINKTYPE();
			break;
			
		case 1:
			System.out.println("===============================================================================");
			System.out.println(">>THANK YOU...!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR BRAND");
			System.out.println("===============================================================================");
			PRE_WORKOUT();
			break;
			
		case 2:
			System.out.println("===============================================================================");
			System.out.println(">>THANK YOU...!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR BRAND");
			System.out.println("===============================================================================");
			POST_WORKOUT();
			break;
			
		default:
			System.out.println(">>INVALID INPUT...!");
			System.out.println(">>PLEASE TRY AGAIN");
			System.out.println("********************************");
			ENERGY_DRINKTYPE();
		}
	}

	public void PRE_WORKOUT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >MUSCLE_BLASE");
		System.out.println(">ENTER 2 FOR >PRO_BURST");
		System.out.println(">ENTER 3 FOR >ON_NUTRITION");
		System.out.println(">ENTER 4 FOR >XTREAM_POWER");
		System.out.println(">ENTER 5 FOR >GNX");
		System.out.println(">ENTER 6 FOR >CARBO_JET");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		
		int n = sc.nextInt();
		switch (n) {
		case 0:
			ENERGY_DRINKTYPE();
			break;
			
		case 1:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU....!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
			

		case 2:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU......!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
		
		case 3:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU......!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
			
		case 4:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU......!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
			
		case 5:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU......!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
			
		case 6:
			System.out.println("=============================================================================");
			System.out.println(">>THANK YOU......!");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT");
			System.out.println("=============================================================================");
			ENERGY_DRINK_PRODUCT();
			break;
			
			
		default:
			System.out.println("============================================================================");
			System.out.println(">>INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("***********************************");
			PRE_WORKOUT();
		}
	}

	public void ENERGY_DRINK_PRODUCT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >ECAA");
		System.out.println(">ENTER 2 FOR >BCAA");
		System.out.println(">ENTER 3 FOR >CREATINE");
		System.out.println(">ENTER 4 FOR >L_GLUTAMINE");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		int n = sc.nextInt();
		switch (n) {
		case 0:
			PRE_WORKOUT();
			break;
			
		case 1:
			System.out.println("===================================");
			System.out.println(">>THANK YOU FOR CHOSING 1kg>ECAA");
			System.out.println("===================================");
			System.out.println(">ENTER THE PRODUCT_CODE : 56 TO CONFIRM THE 1kg>ECAA");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
			break;
			
		case 2:
			System.out.println("===================================");
			System.out.println(">>THANK YOU FOR CHOSING 1kg>BCAA");
			System.out.println("===================================");
			System.out.println(">ENTER THE PRODUCT_CODE : 57 TO CONFIRM THE 1kg>BCAA");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
			break;
			
		case 3:
			System.out.println("=======================================");
			System.out.println(">>THANK YOU FOR CHOSING 1kg>CREATINE");
			System.out.println("=======================================");
			System.out.println(">ENTER THE PRODUCT_CODE : 58 TO CONFIRM THE 1kg>CREATINE");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
			break;

		case 4:
			System.out.println("============================================================");
			System.out.println(">>THANK YOU FOR CHOSING 1kg>L_GLUTAMINE");
			System.out.println("============================================================");
			System.out.println(">ENTER THE PRODUCT_CODE : 59 TO CONFIRM THE 1kg>L_GLUTAMINE");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
			break;

		default:
			System.out.println(">>INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*********************************");
			ENERGY_DRINK_PRODUCT();
		}
	}

	public void ENERGY_DRINK_PRICE() {
		System.out.println(">ENTER THE PRODUCT_CODE :");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
		case 0:
			b();
			ENERGY_DRINK_PRICE();
			break;

		case 56:
			System.out.println("******************************************");
			System.out.println("               ORDERD DETAILS             ");
			System.out.println("******************************************");
			System.out.println("------------------------------------------");
			System.out.println(">>THANK YOU!....YOU HAVE ORDER 1kg>ECAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 57:
			System.out.println("******************************************");
			System.out.println("               ORDERD DETAILS             ");
			System.out.println("******************************************");
			System.out.println("------------------------------------------");
			System.out.println(">>THANK YOU!....YOU HAVE ORDER 1kg>BCAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 58:
			System.out.println("******************************************");
			System.out.println("               ORDERD DETAILS             ");
			System.out.println("******************************************");
			System.out.println("------------------------------------------");
			System.out.println(">>THANK YOU!....YOU HAVE ORDER 1kg>CREATINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;

		case 59:
			System.out.println("******************************************");
			System.out.println("               ORDERD DETAILS             ");
			System.out.println("******************************************");
			System.out.println("------------------------------------------");
			System.out.println(">>THANK YOU!....YOU HAVE ORDER 1kg>L_GLUTAMINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">>YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		default:
			System.out.println(">>INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
		}
	}

	public void POST_WORKOUT() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >BIG_FLEX");
		System.out.println(">ENTER 2 FOR >MUSCLE_BLASE");
		System.out.println(">ENTER 3 FOR >FAST_UP");
		System.out.println(">ENTER 4 FOR >OPTIMIGHT_NUTRITION");
		System.out.println(">ENTER 5 FOR >GXN");
		System.out.println(">ENTER 6 FOR >ON_PUMP");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		int n = sc.nextInt();
		switch (n) {
		case 0:
			ENERGY_DRINKTYPE();
			break;
		case 1:
			System.out.println("======================================");
			System.out.println(">>THANK YOU FOR CHOSING BIG_FLEX_BRAND.");
			System.out.println("======================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("======================================");
			BIG_FLEX_BRAND();
			break;
		case 2:
			System.out.println("==========================================");
			System.out.println(">>THANK YOU FOR CHOSING MUSCLE_BLASE_BRAND.");
			System.out.println("==========================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("==========================================");
			MUSCLE_BLASE_BRAND();
			break;
		case 3:
			System.out.println("====================================");
			System.out.println(">>THANK YOU FOR CHOSING FAST_UP_BRAND");
			System.out.println("====================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("====================================");
			FAST_UP_BRAND();
			break;
		case 4:
			System.out.println("================================================");
			System.out.println(">>THANK YOU FOR CHOSING OPTIMIGHT_NUTRITION_BRAND");
			System.out.println("================================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("================================================");
			OPTIMIGHT_NUTRITION_BRAND();
			break;
			
		case 5:
			System.out.println("====================================");
			System.out.println(">>THANK YOU FOR CHOSING GNX_BRAND");
			System.out.println("====================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("====================================");
			FAST_UP_BRAND();
			break;
		case 6:
			System.out.println("================================================");
			System.out.println(">>THANK YOU FOR CHOSING ON_PUMP_BRAND");
			System.out.println("================================================");
			System.out.println(">>PLEASE SELECT >YOUR PRODUCT.");
			System.out.println("================================================");
			OPTIMIGHT_NUTRITION_BRAND();
			break;
			
		default:
			System.out.println(">>PLEASE>ENTER VALID INPUT");
			System.out.println("************************");
			POST_WORKOUT();
		}
	}

	public void BIG_FLEX_BRAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >EAA");
		System.out.println(">ENTER 2 FOR >BCAA");
		System.out.println(">ENTER 3 FOR >CREATINE"); 
		System.out.println(">ENTER 4 FOR >L_GLUTAMINE");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		int n = sc.nextInt();
		switch (n) {
		case 0:
			POST_WORKOUT();
			break;
		case 1:
			System.out.println(
					"====================================================================================================");
			System.out.println("                  >>THANK YOU FOR CHOSING EAA>                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 987.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println(">BRAND               : BIG_FLEX");
			System.out.println(">SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println(">PRODUCT BENIFITS    : MUSCLE_RECOVER_FASTER");
			System.out.println(">ITEM FORM           : PODWER");
			System.out.println(">DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=====================================================================================================");
			System.out.println("           ENTER THE PRODUCT_CODE : 46 TO CONFIRM THE BIG_FLEX_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 2:
			System.out.println(
					"======================================================================================================");
			System.out.println("                  >>THANK YOU FOR CHOSING BCAA>                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1560.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println(">BRAND               : BIG_FLEX");
			System.out.println(">SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println(">PRODUCT BENIFITS    : BODY_HYDRATION");
			System.out.println(">ITEM FORM           : PODWER");
			System.out.println(">DIET_TYPE            : VEGETARIAN");
			System.out.println(
					"======================================================================================================");
			System.out.println("          ENTER THE PRODUCT_CODE : 47 TO CONFIRM THE BIG_FLEX_BRAND             ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 3:
			System.out.println(
					"=======================================================================================================");
			System.out.println("                  >>THANK YOU FOR CHOSING CREATINE>                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1200.77  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS :  CREATINE");
			System.out.println(">BRAND               : BIG_FLEX");
			System.out.println(">SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println(">PRODUCT BENIFITS    : ENERGY_MANAGEMENT_FASTER");
			System.out.println(">ITEM FORM           : PODWER");
			System.out.println(">DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"========================================================================================================");
			System.out.println("         ENTER THE PRODUCT_CODE : 48 TO CONFIRM THE BIG_FLEX_BRAND             ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
			
		case 4:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >>THANK YOU FOR CHOSING L_GLUTAMINE>                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 1200.50  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS : CAFEEN_FREE");
			System.out.println(">BRAND               : BIG_FLEX");
			System.out.println(">SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println(">PRODUCT BENIFITS    : HELPS_TO_PROTECT_BUILD_REPAIR_MUSCLE");
			System.out.println(">ITEM FORM           : PODWER");
			System.out.println(">DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=========================================================================================================");
			System.out.println("    ENTER THE PRODUCT_CODE : 49 TO CONFIRM THE BIG_FLEX_BRAND            ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
			
		default:
			System.out.println(">>INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			BIG_FLEX_BRAND();
		}
	}

	public void MUSCLE_BLASE_BRAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >EAA");
		System.out.println(">ENTER 2 FOR >BCAA");
		System.out.println(">ENTER 3 FOR >CREATINE");
		System.out.println(">ENTER 4 FOR >GLUTAMINE");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		int n = sc.nextInt();
		switch (n) {
		case 0:
			POST_WORKOUT();
			break;
		case 1:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING EAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1240.80  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : BIG_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : MUSCLE_RECOVER_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=========================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 36 TO CONFIRM THE MUSCLE_BLASE_BRAND             ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 2:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING BCAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1400.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : BIG_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : BODY_HYDRATION");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"========================================================================================================");
			System.out.println("            ENTER THE PRODUCT_CODE : 37 TO CONFIRM THE MUSCLE_BLASE_BRAND             ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 3:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING CREATINE                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 640.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CREATINE");
			System.out.println("BRAND               : LEAN_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : ENERGY_MANAGEMENT_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("              ENTER THE PRODUCT_CODE : 38 TO CONFIRM THE MUSCLE_BLASE_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 4:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING L_GLUTAMINE                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 990.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CAFEEN_FREE");
			System.out.println("BRAND               : LEAN_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : HELPS_TO_PROTECT_BUILD_REPAIR_MUSCLE");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("            ENTER THE PRODUCT_CODE : 39 TO CONFIRM THE MUSCLE_BLASE_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			MUSCLE_BLASE_BRAND();
		}
	}

	public void FAST_UP_BRAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >EAA");
		System.out.println(">ENTER 2 FOR >BCAA");
		System.out.println(">ENTER 3 FOR >CREATINE");
		System.out.println(">ENTER 4 FOR >GLUTAMINE");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		
		int n = sc.nextInt();
		switch (n) {
		case 0:
			POST_WORKOUT();// =================================================================================================
			break;
			
		case 1:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING EAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1680.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : MUSCLE_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : MUSCLE_RECOVER_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("           ENTER THE PRODUCT_CODE : 26 TO CONFIRM THE FAST_UP_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 2:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING BCAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1300.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : MUSCLE_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : BODY_HYDRATION");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 27 TO CONFIRM THE FAST_UP_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 3:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING CREATINE                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 900.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CREATINE");
			System.out.println("BRAND               : MUSCLE_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : ENERGY_MANAGEMENT_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("                ENTER THE PRODUCT_CODE : 28 TO CONFIRM THE FAST_UP_BRAND               ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 4:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING L_GLUTAMINE                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1600.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CAFEEN_FREE");
			System.out.println("BRAND               : MUSCLE_FLEX");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : HELPS_TO_PROTECT_BUILD_REPAIR_MUSCLE");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out.println("      ENTER THE PRODUCT_CODE : 29 TO CONFIRM THE FAST_UP_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			FAST_UP_BRAND();
		}
	}

	public void OPTIMIGHT_NUTRITION_BRAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >EAA");
		System.out.println(">ENTER 2 FOR >BCAA");
		System.out.println(">ENTER 3 FOR >CREATINE");
		System.out.println(">ENTER 4 FOR >GLUTAMINE");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");
		
		int n = sc.nextInt();
		switch (n) {
		case 0:
			POST_WORKOUT();// =====================================================================================
			break;
		case 1:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING EAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 810.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : BIG GAIN");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : MUSCLE_RECOVER_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out
					.println("  ENTER THE PRODUCT_CODE : 16 TO CONFIRM THE OPTIMIGHT_NUTRITION_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 2:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING BCAA                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1500.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : AMINO ACID");
			System.out.println("BRAND               : BIG GAIN");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : BODY_HYDRATION");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out
					.println("            ENTER THE PRODUCT_CODE : 17 TO CONFIRM THE OPTIMIGHT_NUTRITION_BRAND             ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 3:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING CREATINE                       ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 320.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CREATINE");
			System.out.println("BRAND               : BIG GAIN");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : ENERGY_MANAGEMENT_FASTER");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out
					.println("      ENTER THE PRODUCT_CODE : 18 TO CONFIRM THE OPTIMIGHT_NUTRITION_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		case 4:
			System.out.println(
					"========================================================================================================");
			System.out.println("                  >THANK YOU FOR CHOSING L_GLUTAMINE                       ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1256.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : CAFEEN_FREE");
			System.out.println("BRAND               : BIG GAIN");
			System.out.println("SPECIAL USE FOR     : POST_WORKOUT");
			System.out.println("PRODUCT BENIFITS    : HELPS_TO_PROTECT_BUILD_REPAIR_MUSCLE");
			System.out.println("ITEM FORM           : PODWER");
			System.out.println("DIET_TYPE           : VEGETARIAN");
			System.out.println(
					"=======================================================================================================");
			System.out
					.println(">ENTER THE PRODUCT_CODE : 19 TO CONFIRM THE OPTIMIGHT_NUTRITION_BRAND              ");
			System.out
					.println("***************************************************************************************");
			POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			OPTIMIGHT_NUTRITION_BRAND();
		}
	}

	public void POST_WORKOUT_ENERGY_DRINK_PRICE() {
		System.out.println(">ENTER THE PRODUCT_CODE : ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >GO TO HOME PAGE");
		System.out.println("==============================================================================");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {

		case 0:b();
			//POST_WORKOUT_ENERGY_DRINK_PRICE();
			break;

		case 46:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 47:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER BCAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 48:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER CREATINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 49:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER L_GLUTAMINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;

//==============================================================================================================================================

		case 36:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 37:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER BCAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 38:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER CREATINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 39:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER L_GLUTAMINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
//==============================================================================================================================================

		case 26:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 27:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER BCAA .");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 28:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER CREATINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 29:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER L_GLUTAMINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
//==============================================================================================================================================

		case 16:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 17:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER BCAA.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 18:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println(" ");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER CREATINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 19:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER L_GLUTAMINE.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;

		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			ENERGY_DRINK_PRICE();
		}
	}
}

class VITAMIN_PRODUCT extends ENERGY_DRINK {
	public void VITAMIN_PRODUCT_BRAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR HEALTHCART");
		System.out.println(">ENTER 2 FOR OZIVA");
		System.out.println(">ENTER 3 FOR BIG_MUSCLE");
		System.out.println(">ENTER 4 FOR ZEDON");
		System.out.println(">ENTER 5 FOR BIG_BLAST");
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {
		case 0:
			PRODUCT.b();
			//VITAMIN_PRODUCT_BRAND();
			break;
		case 1:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING HEALTHCART");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR VITAMIN_PRODUCT'");
			System.out.println("=============================================================================");
			HEALTHCART();
			break;
		case 2:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING OZIVA");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR VITAMIN_PRODUCT'");
			System.out.println("=============================================================================");
			OZIVA();
			break;
		case 3:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING BIG_MUSCLE ");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR VITAMIN_PRODUCT'");
			System.out.println("=============================================================================");
			BIG_MUSCLE();
			break;
			
		case 4:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING ZEDON_BRAND");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR VITAMIN_PRODUCT'");
			System.out.println("=============================================================================");
			OZIVA();
			break;
		case 5:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING BIG_BLAST_BRAND ");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR VITAMIN_PRODUCT'");
			System.out.println("=============================================================================");
			BIG_MUSCLE();
			break;
			
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("********************************");
			VITAMIN_PRODUCT_BRAND();
		}
	}

	public void HEALTHCART() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR MULTI_VITAMIN");
		System.out.println(">ENTER 2 FOR FISH_OIL(OMEGA-3)  ");
		System.out.println(">ENTER 3 FOR EVION_400(VITAMIN-E)");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {

		case 0:
			VITAMIN_PRODUCT_BRAND();
			//HEALTHCART();
			break;

		case 1:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING MULTI_VITAMIN");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 1100.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : VITI=AMINE A,C,D,E,FOLIC ACIDS,ZINC ");
			System.out.println("MANIFACTURED        : WOW LIFE SCIENCE ");
			System.out.println("PRODUCT_BENIFITS    : EVERLASTING ENERGY & STAMINA ");
			System.out.println("DOSAGE_FORM         : CAPSULE ");
			System.out.println("ITEM DIMENSION      : 10.7*5.6*3.1CM(L*W*H) ");
			System.out.println("USE ONLY FOR        : ADULTS ");
			System.out.println("SPECIAL FOR         : PROTECT RDICAL DAMAGES ");
			System.out.println("SAMPLE QUALITY      : 60 CAPSULE ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("       ENTER THE PRODUCT_CODE : 68 TO CONFIRM THE MULTI_VITAMIN");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		case 2:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING FISH_OIL(OMEGA-3)");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 480.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("SPECIAL_INGREDIENTS : EICOSAPENTAENOIC_ACID(EPA) ");
			System.out.println("MANIFACTURED        : WOW LIFE SCIENCE ");
			System.out.println("PRODUCT_BENIFITS    : ENERGY_MANAGEMENT ");
			System.out.println("DOSAGE_FORM         : CAPSULE ");
			System.out.println("SAMPLE QUALITY      : 60 CAPSULE ");
			System.out.println("GENERIC NAME        : OMEGA 3 FATTY ACIDS ");
			System.out.println("SEVING SIZE         : 1000mg ");
			System.out.println("FOOD PREFERENCE     : NON-VEGETARIAN ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 67 TO CONFIRM THE FISH_OIL(OMEGA-3)");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		case 3:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING EVION_400(VITAMIN-E)");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 950.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("MODEL NAME       : VITAMINE E ");
			System.out.println("MANIFACTURED     : PROCTER ");
			System.out.println("SEVING SIZE      : 400mg ");
			System.out.println("TYPE             : ANTI-OXIDENTS ");
			System.out.println("USES TIMING      : POST WORKOUTS ");
			System.out.println("COMPOSITION      : VITAMINE E 400  ");
			System.out.println("FOOD PREFERENCE  : VEGETARIAN ");
			System.out.println("MAX_SHELF_LIFE   : 24 MONTHS ");
			System.out.println("SAMPLE QUALITY   : 60 CAPSULE ");
			System.out.println(
					"====================================================================================================="); /// PRICE
			System.out.println("        ENTER THE PRODUCT_CODE : 66 TO CONFIRM THE EVION_400(VITAMIN-E)");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			HEALTHCART();
		}
	}

	public void OZIVA() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR HAIR_MULTI_VITAMIN");
		System.out.println(">ENTER 2 FOR BIOTIN");
		System.out.println(">ENTER 3 FOR OMEGA 369");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {

		case 0:
			VITAMIN_PRODUCT_BRAND();
			//OZIVA();
			break;

		case 1:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING HAIR_MULTI_VITAMIN");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 850.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">GENERIC NAME     : HAIR_VITAMIN ");
			System.out.println(">MANIFACTURED     : OZIVA LIFE SCIENCE ");
			System.out.println(">PRODUCT_BENIFITS : CONTROL HAIRFALL");
			System.out.println(">DOSAGE_FORM      : CAPSULE ");
			System.out.println(">MAX_SHELF_LIFE   : 14 MONTHS ");
			System.out.println(">USE ONLY FOR     : MALES ");
			System.out.println(">SPECIAL FOR      : PROTECT HAIRFALL DAMAGES ");
			System.out.println(">SAMPLE QUALITY   : 30 CAPSULE ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 79 TO CONFIRM THE HAIR_MULTI_VITAMIN");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		case 2:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING BIOTIN");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 650.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">GENERIC NAME     : VITAMIN_H ");
			System.out.println(">MANIFACTURED     : OZIVA LIFE SCIENCE ");
			System.out.println(">PRODUCT_BENIFITS : STRONG HAIR & HEALTHY SKIN");
			System.out.println(">DOSAGE_FORM      : POWDER ");
			System.out.println(">MAX_SHELF_LIFE   : 19 MONTHS ");
			System.out.println(">USE ONLY FOR     : ADULTS ");
			System.out.println(">SPECIAL FOR      : PROTECT HAIRFALL AND SKIN DAMAGES ");
			System.out.println(">FOOD PREFERENCE  : VEGETARIAN ");
			System.out.println(">SAMPLE QUALITY   : 500gm ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("       ENTER THE PRODUCT_CODE : 78 TO CONFIRM THE BIOTIN ");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
			
		case 3:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING OMEGA 369");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 720.09  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">MODEL NAME        : PLANT BASED OMEGA 369 ");
			System.out.println(">MANIFACTURED      : OZIVA  ");
			System.out.println(">BENIFITS          : SKIN,HERT,JOIN SUPPORT ");
			System.out.println(">TYPE              : AYURVEDIC ");
			System.out.println(">USES TIMING       : ANY TIME ");
			System.out.println(">COMPOSITION       : JOINT SUPPLEMENT");
			System.out.println(">FOOD PREFERENCE   : VEGETARIAN ");
			System.out.println(">MAX_SHELF_LIFE    : 18 MONTHS ");
			System.out.println(">SAMPLE QUALITY    : 60 CAPSULE ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 77 TO CONFIRM THE OMEGA 369");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			OZIVA();
		}
	}

	public void BIG_MUSCLE() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR MULTI_VITAMIN");
		System.out.println(">ENTER 2 FOR FISH_OIL ");
		System.out.println(">ENTER 3 FOR EVION_200");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {
		case 0:
			VITAMIN_PRODUCT_BRAND();
			//BIG_MUSCLE();
			break;

		case 1:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING MULTI_VITAMIN");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 689.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS : VITAMINE A,C,D,E,FOLIC ACIDS,ZINC ");
			System.out.println(">MANIFACTURED        : WOW LIFE SCIENCE ");
			System.out.println(">PRODUCT_BENIFITS    : EVERLASTING ENERGY & STAMINA ");
			System.out.println(">DOSAGE_FORM         : CAPSULE ");
			System.out.println(">ITEM DIMENSION      : 10.7*5.6*3.1CM(L*W*H) ");
			System.out.println(">USE ONLY FOR        : ADULTS ");
			System.out.println(">SPECIAL FOR         : PROTECT RDICAL DAMAGES ");
			System.out.println(">SAMPLE QUALITY      : 60 CAPSULE ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 40 TO CONFIRM THE MULTI_VITAMIN");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		case 2:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING FISH_OIL");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 600.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">SPECIAL_INGREDIENTS    : EICOSAPENTAENOIC_ACID(EPA) ");
			System.out.println(">MANIFACTURED           : WOW LIFE SCIENCE ");
			System.out.println(">PRODUCT_BENIFITS       : ENERGY_MANAGEMENT ");
			System.out.println(">DOSAGE_FORM            : CAPSULE ");
			System.out.println(">SAMPLE QUALITY         : 60 CAPSULE ");
			System.out.println(">GENERIC NAME           : OMEGA 3 FATTY ACIDS ");
			System.out.println(">SEVING SIZE            : 1000mg ");
			System.out.println(">FOOD PREFERENCE        : NON-VEGETARIAN ");
			System.out.println(
					"=====================================================================================================");
			System.out.println("        ENTER THE PRODUCT_CODE : 80 TO CONFIRM THE FISH_OIL");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		case 3:
			System.out.println(
					"=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING EVION_200");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 400.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">MODEL NAME      : VITAMINE E ");
			System.out.println(">MANIFACTURED    : PROCTER ");
			System.out.println(">SEVING SIZE     : 200mg ");
			System.out.println(">TYPE            : ANTI-OXIDENTS ");
			System.out.println(">USES TIMING     : POST WORKOUTS ");
			System.out.println(">COMPOSITION     : VITAMINE E 200  ");
			System.out.println(">FOOD PREFERENCE : VEGETARIAN ");
			System.out.println(">MAX_SHELF_LIFE  : 24 MONTHS ");
			System.out.println(">SAMPLE QUALITY  : 30 CAPSULE ");
			System.out.println(
					"====================================================================================================="); /// PRICE
			System.out.println("       ENTER THE PRODUCT_CODE : 30 TO CONFIRM THE EVION_200");
			System.out.println("**********************************************************************");
			VITAMINPRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			BIG_MUSCLE();
		}
	}

	public void VITAMINPRICE() {
		System.out.println(">ENTER THE PRODUCT_CODE : ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >GO_TO_HOME_PAGE");
		System.out.println("==============================================================================");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {

		// (1)MULTI_VITAMIN (2)FISH_OIL(OMEGA-3) (3)EVION_400(VITAMIN-E)
		case 0:b();
			   //VITAMINPRICE();
			   break;

		case 68:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER MULTI_VITAMIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 67:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println(">THANK YOU!....YOU HAVE ORDER FISH_OIL(OMEGA-3).");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			 
			break;
		case 66:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EVION_400(VITAMIN-E).");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
//====================================================================================================================================================
		// (1)HAIR_MULTI_VITAMIN (2)BIOTIN (3)OMEGA 369
		case 79:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("-------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER HAIR_MULTI_VITAMIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 78:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER BIOTIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 77:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER OMEGA 369.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			System.out.println("-----------------------------------------");
			break;
//====================================================================================================================================================
		// (1)MULTI_VITAMIN (2)FISH_OIL (3)EVION_200

		case 40:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER MULTI_VITAMIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 80:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER FISH_OIL.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
		   break;
		case 30:
			System.out.println("******************************************************");
			System.out.println("                  ORDERD DETAILS             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDER EVION_200.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			VITAMINPRICE();
		}
	}
}
//====================================================================================================================================================

class PROTEIN_PRODUCT extends VITAMIN_PRODUCT {
	public void PROTEIN_PRODUCT_BRAND() //
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR >WHEY_PROTEIN ");
		System.out.println(">ENTER 2 FOR >MUSCLE_GAINNERS");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {
		case 0:
			PRODUCT.b();
			//PROTEIN_PRODUCT_BRAND();
			break;

		case 1:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING WHEY_PROTEIN");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR PROTEIN_PRODUCT'");
			System.out.println("=============================================================================");
			WHEY_PROTEIN();
			break;
		case 2:
			System.out.println("=============================================================================");
			System.out.println(">THANK YOU FOR CHOSING MUSCLE_GAINNERS");
			System.out.println("------------------------------------------------------------");
			System.out.println(">PLEASE SELECT >YOUR PROTEIN_PRODUCT'");
			System.out.println("=============================================================================");
			MUSCLE_GAINNERS();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("********************************");
			PROTEIN_PRODUCT_BRAND();
		}
	}

	public void WHEY_PROTEIN() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR WHEY_CONCENTRATE_PROTEIN");
		System.out.println(">ENTER 2 FOR WHEY_ISOLATE_PROTEIN");
		System.out.println(">ENTER 3 FOR WHEY_ESSENTIAL_PROTEIN");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {
		case 0:
			PROTEIN_PRODUCT_BRAND();
			break;

		case 1:
			System.out.println("=====================================================================================================");
			System.out.println("         >THANK YOU FOR CHOSING WHEY_CONCENTRATE_PROTEIN");
			System.out.println("   ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 3200.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT FORM        : POWDER  ");
			System.out.println(">PRODUCT MODEL NAME  : WHEY PROTEIN ");
			System.out.println(">QUANTITY WEIGHT     : 3kg ");
			System.out.println(">FOOD PREFERENCE     : VEGETATIAN ");
			System.out.println(">GENERIC NAME        : PROTEIN SUPPLEMENT ");
			System.out.println(">SERVING SIZE        : 40gm (PER SCOOP) ");
			System.out.println(">ENERGY              : 158.8 Kcal ");
			System.out.println(">PROTEIN             : 25.4 gram ");
			System.out.println(">FAT                 : 0.12gram ");
			System.out.println("====================================================================================================");
			System.out.println("        ENTER THE AMOUNT 20 FOR WHEY_CONCENTRATE_PROTEIN ");
			System.out.println("**********************************************************************");
			PROTEIN_PRODUCTPRICE();
			break;
		case 2:
			System.out.println("===========================================================================================================");
			System.out.println("           >THANK YOU FOR CHOSING WHEY_ISOLATE_PROTEIN ");
			System.out.println("   ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 4260.30  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("PRODUCT FORM       : POWDER  ");
			System.out.println("PRODUCT MODEL NAME : WHEY PROTEIN ");
			System.out.println("QUANTITY WEIGHT    : 3kg ");
			System.out.println("FOOD PREFERENCE    : VEGETATIAN ");
			System.out.println("GENERIC NAME       : PROTEIN SUPPLEMENT ");
			System.out.println("SERVING SIZE       : 30gm (PER SCOOP) ");
			System.out.println("ENERGY             : 58.8 Kcal ");
			System.out.println("PROTEIN            : 35.4 gram ");
			System.out.println("FAT                : 0.1gram ");
			System.out.println("===============================================================================================");
			System.out.println("        ENTER THE AMOUNT 60 FOR WHEY_ISOLATE_PROTEIN");
			System.out.println("****************************************************************************");
			PROTEIN_PRODUCTPRICE();
			break;
		case 3:
			System.out.println(
					"=====================================================================================================");
			System.out.println("        >THANK YOU FOR CHOSING WHEY_ESSENTIAL_PROTEIN");
			System.out.println("-------------------------------------------------------------");
			System.out.println("PRODUCT PRICE : 3200.89  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("PRODUCT FORM        : POWDER  ");
			System.out.println("PRODUCT MODEL NAME  : WHEY PROTEIN ");
			System.out.println("QUANTITY WEIGHT     : 3kg ");
			System.out.println("FOOD PREFERENCE     : VEGETATIAN ");
			System.out.println("GENERIC NAME        : PROTEIN SUPPLEMENT ");
			System.out.println("SERVING SIZE        : 40gm (PER SCOOP) ");
			System.out.println("ENERGY              : 158.8 Kcal ");
			System.out.println("PROTEIN             : 25.4 gram ");
			System.out.println("FAT                 : 0.12gram ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("    ENTER THE AMOUNT 200 FOR WHEY_ESSENTIAL_PROTEIN");
			System.out.println("**********************************************************************");
			PROTEIN_PRODUCTPRICE();
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			WHEY_PROTEIN();
		}
	}

	public void MUSCLE_GAINNERS() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">ENTER 1 FOR LEAN_MUSCLE_GAINNERS");
		System.out.println(">ENTER 2 FOR BULK_MUSCLE_GAINNERS");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK(PROTEIN_PRODUCT_BRAND)");
		System.out.println("==============================================================================");

		int n = sc.nextInt();
		switch (n) {

		case 0:
			PROTEIN_PRODUCT_BRAND();
		
			break;

		case 1:
			System.out.println(
					"========================================================================================================");
			System.out.println(">>THANK YOU FOR CHOSINGLEAN_MUSCLE_GAINNERS.");
			System.out.println("----------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 2570  ");
			System.out.println("----------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT FORM       : POWDER  ");
			System.out.println(">PRODUCT MODEL NAME : MUSCLE GAIN ");
			System.out.println(">QUANTITY WEIGHT    : 3kg ");
			System.out.println(">FOOD PREFERENCE    : VEGETATIAN ");
			System.out.println(">GENERIC NAME       : PROTEIN SUPPLEMENT ");
			System.out.println(">SERVING SIZE       : 30gm (PER SCOOP) ");
			System.out.println(">ENERGY             : 158.8 Kcal ");
			System.out.println(">PROTEIN            : 12.3 gram ");
			System.out.println(">FAT                : 1.2gram ");
			System.out.println("---------------------------------------------------------------");
			System.out.println(">ENTER THE PRODUCT_CODE : 70 TO CONFIRM THE LEAN_MUSCLE_GAINNERS.");
			System.out.println("************************************************************************");
			PROTEIN_PRODUCTPRICE();
			break;
		case 2:
			System.out.println(
					"=================================================================================================");
			System.out.println(">>THANK YOU FOR CHOSING BULK_MUSCLE_GAINNERS.");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT PRICE : 2499.00  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT DETAILS  ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">PRODUCT FORM       : POWDER  ");
			System.out.println(">PRODUCT MODEL NAME : BULK GAIN ");
			System.out.println(">QUANTITY WEIGHT    : 3kg ");
			System.out.println(">FOOD PREFERENCE    : VEGETATIAN ");
			System.out.println(">GENERIC NAME       : PROTEIN SUPPLEMENT ");
			System.out.println(">SERVING SIZE       : 40gm (PER SCOOP) ");
			System.out.println(">ENERGY             : 158.8 Kcal ");
			System.out.println(">PROTEIN            : 08 gram ");
			System.out.println(">FAT                : 3.2gram ");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(">ENTER THE PRODUCT_CODE : 99 TO CONFIRM THE BULK_MUSCLE_GAINNERS");
			System.out.println("*******************************************************************");
			PROTEIN_PRODUCTPRICE();
			break;
		default:
			System.out.println(">PLEASE ENTER VALID INPUT");
			System.out.println("************************");
			MUSCLE_GAINNERS();
		}
	}

	public void PROTEIN_PRODUCTPRICE() {
		System.out.println(">ENTER THE PRODUCT_CODE : ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(">ENTER 0 TO GO >BACK (PROTEIN_PRODUCT_BRAND)");
		System.out.println("==============================================================================");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//============================================================================================================================================================================================================
		// WHEY_CONCENTRATE_PROTEIN //WHEY_ISOLATE_PROTEIN // WHEY_ESSENTIAL_PROTEIN
//==============================================================================================================================================================================================================
		
		switch (n) {
		case 0:
			PROTEIN_PRODUCT_BRAND();
			break;
			
		case 20:
			System.out.println("******************************************************");
			System.out.println("                  > ORDERED_DETAILS <           ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDERED WHEY_CONCENTRATE_PROTEIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 60:
			System.out.println("******************************************************");
			System.out.println("                  > ORDERED_DETAILS <              ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDERED WHEY_ISOLATE_PROTEIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 200:
			System.out.println("******************************************************");
			System.out.println("                  > ORDERED_DETAILS <             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDERED WHEY_ESSENTIAL_PROTEIN.");
			System.out.println("------------------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
//==============================================================================================================================================================================================================
		// (1) LEAN_MUSCLE_GAINNERS (2) BULK_MUSCLE_GAINNERS
//==============================================================================================================================================================================================================

		case 70:
			System.out.println("******************************************************");
			System.out.println("                  > ORDERED_DETAILS <             ");
			System.out.println("******************************************************");
			System.out.println("------------------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDERED LEAN_MUSCLE_GAINNERS.");
			System.out.println("-------------------------------------------------------- ---");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("------------------------------------------------------------");
			break;
		case 99:
			System.out.println("******************************************************");
			System.out.println("                  > ORDERED_DETAILS <             ");
			System.out.println("******************************************************");
			System.out.println("----------------------------------------------------");
			System.out.println(">THANK YOU!....YOU HAVE ORDERED BULK_MUSCLE_GAINNERS.");
			System.out.println("----------------------------------------------------");
			System.out.println(">YOUR ORDER WILL BE DELIEVERED WITHIN NEXT 5 DAYS.");
			System.out.println("----------------------------------------------------");
			break;
		default:
			System.out.println(">INVALID INPUT...>PLEASE TRY AGAIN");
			System.out.println("*****************************************************");
			PROTEIN_PRODUCTPRICE();
		}
	}
}


//DRIVER NUT1

public class NUT1 {
	public static void main(String[] args) {
		Registration R1 = new Registration(); //=======================OBJECT FOE REGISTAION
		R1.regi();//===================================================NON STATIC METHOD
		
		
		NUTRITION w1 = new PRODUCT();
        w1.b(); // ====================================================METHOD SHADOWING(COMPILE TIME POLYMORPHISM)
		PRODUCT w2 = new PRODUCT();//==================================OBJ  (WE CAN USE BOTH OBJECT CREATION AND DOWNCST)
		w2.b();
		
		PROTEIN_PRODUCT s = new PROTEIN_PRODUCT();//===================NEW OBJECT 
		if (s.l == 1) //===============================================PRESS-1 CALL TO METHOD ENERGY_DRINKTYPE
		{
			PRODUCT w = new ENERGY_DRINK();// =========================UPCASTING
			w.ENERGY_DRINKTYPE();// ===================================METHOD OVERRIDING(RUN-TIME POLYMORPHISM)
			
		} 
		else if (s.l == 2) //==========================================PRESS-2 CALL TO METHOD VITAMIN_PRODUCT_BRAND
		{
			s.VITAMIN_PRODUCT_BRAND();
		} 
		else if (s.l == 3) //==========================================PRESS-3 CALL TO METHOD PROTEIN_PRODUCT_BRAND
		{
			s.PROTEIN_PRODUCT_BRAND(); //==============================METHOD CALLED
		}
		
		System.out.println("***********************************************************");
		System.out.println("               CUSTOMER DETAILS       ");
		System.out.println("***********************************************************");
		System.out.println("NAME       : " + R1.getName());
		System.out.println("ADDRDESS   : " + R1.getAdd());
		System.out.println("EMAIL      : " + R1.getEmail());
		System.out.println("MOBILE NO  : " + R1.getMob());
		System.out.println("************************************************************");
		System.out.println(">THANK YOU......!");
		System.out.println("STAY HAPPY AND STAY SAFE ");
		System.out.println("************************************************************");
		
		
		
		

	}
}
