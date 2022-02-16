class MyPhone{
	void Call(){
		System.out.println("I can call ");
	}
	void Camera(){
		System.out.println("I can capture you ");
	}
	void Game(){
		System.out.println("I can play with you ");
	}
	void Music(){
		System.out.println("I can sing for you ");
	}

	public static void main(String[] args){
		System.out.println("I am Android ");
		MyPhone me = new MyPhone();
		me.Call();
		me.Camera();
		me.Game();
		me.Music();
	}
}