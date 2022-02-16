class Capgenini{
	static int NoOfEmp = 200000;
	int ProjectCount = 200;
		
	void DisplayProject(){
		System.out.println("Capgenini Project Count : " + ProjectCount);
	}
	
	static void EmpInfo(){
		System.out.println("Capgenini Employee Count : " + NoOfEmp );
	}
	
}

class TCS{
	static int NoOfEmp = 300000;
	int ProjectCount = 350;
		
	void DisplayProject(){
		System.out.println("TCS Project Count : " + ProjectCount);
	}
	
	static void EmpInfo(){
		System.out.println("TCS Employee Count : " + NoOfEmp );
	}
	
}

class IT_Company{
	public static void main(String[] args){
		Capgenini Pune = new Capgenini();
		Pune.ProjectCount= 130;
		Pune.DisplayProject();
		Pune.EmpInfo();

		Capgenini Chennai = new Capgenini();
		Chennai.ProjectCount= 70;
		Chennai.DisplayProject();
		Chennai.EmpInfo();

		TCS Mumbai = new TCS();
		Mumbai.ProjectCount= 150;
		Mumbai.DisplayProject();
		Mumbai.EmpInfo();

		TCS Banglore = new TCS();
		Banglore.ProjectCount= 200;
		Banglore.DisplayProject();
		Banglore.EmpInfo();
	}
}
