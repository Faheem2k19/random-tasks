
public class ConditionalSatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int min=1, max=20;
		int rn=(int)(min+Math.random()*(max-min+1));
		
		System.out.println(); */
		
		
		/*int mark=93;
		String grade="";
				if(mark>=90) {
					grade="A";	
				} else if(mark >= 80 && mark <90) {
					grade = "B";
				} else if(mark>=70 && mark <80) {
					grade="C";
				} else {
					grade="D";
				}
				
				System.out.println(""+grade); */
				
				String grade1 ="y";
				
				switch(grade1) {
				case "A":
					System.out.println("the mark obtained is greater than 90");
					break;
				case "B":
					System.out.println("the mark obtained is greater than 80 but less than 90");
					break;
				case "C":
					System.out.println("the mark obtained is greater than 70 but less than 80");
					break;
				case "D":
					System.out.println("the mark obtained is greater than 70");
					break;
				default:
					System.out.println("INVALID Grade");
				
				}
				
				int number=1;
				String msg=(number=!1)?
						"number is 1":
						"is not 1";
		

	}

}
