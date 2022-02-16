import java.lang.*;

class Router extends Object{
	boolean x = true;
	boolean y = false;
	static boolean z = true;
	Router(){
		System.out.println("I am Constructer");
	}

	public static void main(String[] args){
		System.out.println("My Wifi");
		Router Obj = new Router();
		System.out.println(Obj.x);
		System.out.println(Obj.y);
		System.out.println(z);

	}
}