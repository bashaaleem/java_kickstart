/* 1. Buy -> List product , select buying product
   2. Pay -> Amt to pay , print the amt paid 
   3. Return ->  Buying date & Product 
   */
import java.util.*;
class Buy{
	String s[] = {"Food","Toys","Dress","Shoe"};
	int i;
	void toBuy(){
		System.out.println("Select the item number to buy from this list: "); 
		System.out.println("1 . Food\n2 . Toys\n3 . Dress\n4 . Shoe");
		System.out.print("Enter your selection :");
		Scanner sc1 = new Scanner(System.in);
		i =	sc1.nextInt();
        switch(i){
		case 1: System.out.println("You have bought :"+s[0]+"\nPlease proceed to payment"); break;
		case 2: System.out.println("You have bought :"+s[1]+"\nPlease proceed to payment"); break;
		case 3: System.out.println("You have bought : "+s[2]+"\nPlease proceed to payment"); break;
		case 4: System.out.println("You have bought : "+s[3]+"\nPlease proceed to payment"); break;
        default: System.out.println("Invalid Selection"); break;
	}
}
}
class Pay{
	int amt;
	void getAmt(int usramt)
	{
		amt = usramt;
		System.out.println("Hurray!!! You have successfully paid "+amt+" Rupees");
	}
}
class Ret{
	String date,prod;
	void processReturnDate(String d)
	{
		date = d;
		System.out.println("Entered date "+date+" is accepted");
	}
	void processReturnProd(String p)
	{
		prod = p;
		System.out.println("Product "+prod+"returned successfully");
	}
}
class TestProg{
	void primeSelect(){
		int x;
		System.out.println("Plesae select a service \n 1. BUY \n 2.PAY \n 3.RETURN");
		Scanner l = new Scanner(System.in);
		x = l.nextInt();
		switch (x)
		{
			case 1: buyBlock() ; primeSelect(); break;
			case 2: payBlock() ; primeSelect();break;
			case 3: returnBlock() ; primeSelect(); break;
			default: primeSelect(); break;
		}
	}	
	void buyBlock(){
		System.out.println("--------------Buy Product---------------");
		Buy b = new Buy();
		b.toBuy();
	}
	void payBlock(){
		System.out.println("--------------Pay for Product-----------");
		Pay p = new Pay();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount to be paid : ");
		int a1 = sc.nextInt();
		p.getAmt(a1);
	}
	void returnBlock(){
		System.out.println("--------------Return Product------------");
		Ret r = new Ret();
		System.out.println("Pls enter Date of Purchase & Name of Product to be Returned :");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String j = sc1.nextLine();
		String k = sc2.nextLine();
		r.processReturnDate(j);
		r.processReturnProd(k);
	}	
	public static void main(String[] args){
		TestProg t = new TestProg();
		t.primeSelect();
	}
}
		