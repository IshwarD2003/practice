class pr3{
	public static void main(String[] args){

		char ch='d';
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
			System.out.println("char is vowel ");
		}else if(ch>65 && ch<90  || ch>97 &&ch<122){
			System.out.println("consonant");
		}else{
			System.out.println("invalid input");
		}
	}
}
