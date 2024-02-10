class Pr10{
	public static void main(String[] args){

		int money = 50000;

		if(money < 0){
			System.out.println("Enter a valid amount of money");
		}else if(money <= 20000){
			System.out.println("Xiomi");
		}else if(money >20000 && money <= 50000){
			System.out.println("Samsung");
		}else if(money < 80000 && money > 50000){
			System.out.println("One plus");
		}else{
			System.out.println("iPhone");
		}

	}
}


