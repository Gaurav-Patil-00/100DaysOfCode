class Iphone11{
	static int ProPrice = 106000;
	static int ProMaxPrice = 131900;
	int Weight,Camera_Front,Camera_Rear1,Camera_Rear2,Camera_Rear3;
	float DisplaySize, ScreenToBodyRatio;
	String Colors, DisplayResolution;

	
	
	void Features(){
		System.out.println("Front Camera Specification in MegaPixel : " + Camera_Front);
		System.out.println("Rear Camera Specification in MegaPixel (for each) : " + Camera_Rear1 +" X "+ Camera_Rear2 +" X "+ Camera_Rear3);
		System.out.println("Display Size (in Inches) : " + DisplaySize);
		System.out.println("Weight of Model (in grams) : " + Weight);
		System.out.println("Screen to Body ratio (in %) : " + ScreenToBodyRatio );
		System.out.println("Colors Available in Model : " + Colors);
		System.out.println("Display Resolution : " + DisplayResolution);
	}

	static void Price(){
		System.out.println("Iphone 11 pro Price (in rupees) : " + ProPrice);
		System.out.println("Iphone 11 pro max Price (in rupees) : " + ProMaxPrice);
	}
}
class SamsungS20{
	static int S20PlusPrice = 74099;
	static int S20UltraPrice = 92999;
	int Weight,Camera_Front,Camera_Rear1,Camera_Rear2,Camera_Rear3;
	float DisplaySize, ScreenToBodyRatio;
	String Colors, DisplayResolution;
	
	void Features(){
		System.out.println("Front Camera Specification in MegaPixel : " + Camera_Front);
		System.out.println("Rear Camera Specification in MegaPixel (for each) : " + Camera_Rear1 +" X "+ Camera_Rear2 +" X "+ Camera_Rear3);
		System.out.println("Display Size (in Inches) : " + DisplaySize);
		System.out.println("Weight of Model (in grams) : " + Weight);
		System.out.println("Screen to Body ratio (in %) : " + ScreenToBodyRatio );
		System.out.println("Colors Available in Model : " + Colors);
		System.out.println("Display Resolution : " + DisplayResolution);
	}
	
	static void Price(){
		System.out.println("Samsung S20 plus Price (in rupees) : " + S20PlusPrice);
		System.out.println("Samsung S20 Ultra Price (in rupees) : " + S20UltraPrice);
	}
	
}
class Mobile{
	public static void main(String[] args) {

		System.out.println("\n Features of all Mobile Models : \n " + "\n" );
		System.out.println("\n Iphone 11 Pro : \n");
		Iphone11 Pro = new Iphone11();
		Pro.Camera_Front = 12;
		Pro.Camera_Rear1 = 12;
		Pro.Camera_Rear2 = 12;
		Pro.Camera_Rear3 = 12;
		Pro.DisplaySize = 5.8f;
		Pro.Weight = 188;
		Pro.ScreenToBodyRatio = 82.1f;
		Pro.Colors = "Gold , Silver, Space Gray, Midnight Green";
		Pro.DisplayResolution = "2436 X 1125 (458 ppi)";
		Pro.Features();

		System.out.println("\n Iphone 11 ProMax : \n");
		Iphone11 ProMax = new Iphone11();
		ProMax.Camera_Front = 12;
		ProMax.Camera_Rear1 = 12;
		ProMax.Camera_Rear2 = 12;
		ProMax.Camera_Rear3 = 12;
		ProMax.DisplaySize = 6.5f;
		ProMax.Weight = 226;
		ProMax.ScreenToBodyRatio = 83.7f;
		ProMax.Colors = "Gold , Silver, Space Gray, Midnight Green";
		ProMax.DisplayResolution = "2688 X 1242 (758 ppi)";
		ProMax.Features();

		System.out.println("\n Samsung S20 Plus : \n");
		SamsungS20 Plus = new SamsungS20();
		Plus.Camera_Front = 10;
		Plus.Camera_Rear1 = 64;
		Plus.Camera_Rear2 = 12;
		Plus.Camera_Rear3 = 12;
		Plus.DisplaySize = 6.7f;
		Plus.Weight = 186;
		Plus.ScreenToBodyRatio = 90.5f;
		Plus.Colors = "Cosmic Black, Cosmic Gray, Cosmic Blue";
		Plus.DisplayResolution = "3200 X 1440 (525 ppi)";
		Plus.Features();

		System.out.println("\n Samsung S20 Ultra : \n");
		SamsungS20 Ultra = new SamsungS20();
		Ultra.Camera_Front = 12;
		Ultra.Camera_Rear1 = 108;
		Ultra.Camera_Rear2 = 48;
		Ultra.Camera_Rear3 = 12;
		Ultra.DisplaySize = 6.9f;
		Ultra.Weight = 220;
		Ultra.ScreenToBodyRatio = 89.9f;
		Ultra.Colors = "Cosmic Black, Cosmic Gray";
		Ultra.DisplayResolution = "3200 X 1125 (511 ppi)";
		Ultra.Features();
		System.out.println("\n");


		System.out.println("Prices in World (Constant) : \n");
		Iphone11.Price();
		SamsungS20.Price();

	}
}
