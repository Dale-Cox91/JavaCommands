class Results{
	int Phy,Che,Mat;
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
class School{
	public static void main(String xyz[]){
		Results Peter,James;

		Peter = new Results();
		James = new Results();
		
		Peter.Mat=50;
		Peter.Phy=143;
		Peter.Che=98;
		
		James.Mat=97;
		James.Phy=76;
		James.Che=112;
		
		Peter.ShowResults();
		James.ShowResults();
	}
}