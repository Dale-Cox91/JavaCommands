class Results{
	private int Phy,Che,Mat;
	public void Physics(int P){
		if(P>=0 && P<=150){
			Phy=P;
		}
		else{
			System.out.println("Invalid score, please try again");
		}
	}
	public void Chemistry(int C){
		if(C>=0 && C<=150){
			Che=C;
		}
		else{
			System.out.println("Invalid score, please try again");
		}
	}
	public void Maths(int M){
		if(M>=0 && M<=150){
			Mat=M;
		}
		else{
			System.out.println("Invalid score, please try again");
		}
	}
	public void ShowResults(){
		int Total;
		Total=Phy+Che+Mat;
		System.out.println("Total Score is: "+Total);
		if (Total>300){
			System.out.println("You Passed");
		}
		else{
			System.out.println("You failed, I hate you");
		}
	}
}
class School2{
	public static void main(String XYZ[]){
	Results Peter;
	Peter = new Results();
	Peter.Physics(124);
	Peter.Chemistry(178);
	Peter.Maths(143);
	Peter.ShowResults();
	}
}