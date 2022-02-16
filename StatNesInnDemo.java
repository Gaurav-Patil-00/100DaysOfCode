class Hospital{
	static class Doctors{
		void serviceAt(){
			System.out.println("Duty in hospital");
		}	
	}
	
	static class Patients{
		static void Admit(){
			System.out.println("Admit a patient in a ward");
		}
	}
	public static void main(String[] args){
		
		Doctors shah = new Doctors();
		shah.serviceAt();	
		Patients.Admit();
	}
}