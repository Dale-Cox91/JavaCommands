class Results{
	public static void main(String XYZ[]){
		int Phy,Che,Mat,Total;
		float Per;
		Phy=100;Che=124;Mat=148;
		Total=Phy+Che+Mat;
		Per=Total*100/450;
		System.out.println("The Total Marks is: "+ Total);
		System.out.println("The Percentage is: "+ Per);
		if(Per>=75){
			System.out.println("Congrats, you have passed");
		}
		else{
			System.out.println("Unlucky, you failed.");
		}
	}
}