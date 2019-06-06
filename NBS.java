class Bank{
	private int Amount;
	public void Deposit(int Money){
		Amount+=Money;
	}
	public void Withdraw(int Money){
		if(Money<Amount){
			Amount-=Money;
		}
		else{
			System.out.println("Not Enough Funds");
		}
	}
	public void Balance(){
		System.out.println("Your Balance is: "+Amount);
	}
}
class NBS{
    public static void main(String XYZ[]){
        Bank Ref;
        Ref = new Bank();
        Ref.Deposit(1000);
        Ref.Withdraw(250);
        Ref.Balance();
    }
}