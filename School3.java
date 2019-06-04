class Results{
	private int Phy,Che,Mat;
	public void Physics(int P){
		if(P>=0 && P<=150){
			Phy=P;
		}
		else{
			Phy=-1;
			System.out.println("Invalid score, please try again");
		}
	}
	public void Chemistry(int C){
		if(C>=0 && C<=150){
			Che=C;
		}
		else{
			Che=-1;
			System.out.println("Invalid score, please try again");
		}
	}
	public void Maths(int M){
		if(M>=0 && M<=150){
			Mat=M;
		}
		else{
			Mat=-1;
			System.out.println("Invalid score, please try again");
		}
	}
	public void ShowResults(){
		int Total;
		if(Phy==-1||Che==-1||Mat==-1){
			System.out.println("No Results");
		}

		else{
		Total=Phy+Che+Mat;
		System.out.println("Total Score is: "+Total);
		if (Total>300){
			System.out.println("You Passed");
		}
		else{
			System.out.println("You failed, I hate you");
		}}
	}
}
class School3{
	public static void main(String XYZ[]){
	Results Peter;
	Peter = new Results();
	Peter.Physics(124);
	Peter.Chemistry(178);
	Peter.Maths(143);
	Peter.ShowResults();
	}
}