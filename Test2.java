class Second{
	int Phy,Che;
	public void message(){
		System.out.println("Hello");
		System.out.println("My Friends");
	}
}
class Test2{
	public static void main(String XYZ[]){
		Second X;
		X = new Second();
		X.Phy=75;
		X.message();
	}
}