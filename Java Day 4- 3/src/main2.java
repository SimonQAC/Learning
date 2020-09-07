
public class main2 {
		
	public void checker(int x) {
		                              
		//initialise variables and array
				int[] nums=new int [10];
				nums[0]=main2.generateRandomInt();
				nums[1]=main2.generateRandomInt();
				nums[2]=main2.generateRandomInt();
				nums[3]=main2.generateRandomInt();
				nums[4]=main2.generateRandomInt(); 
				int high1 = nums[0];
				int high2=0;
				int high3=0;
				int high4=0;
				int high5=0;
				
				//check for highest value
				for (int a=0;a<5;a++) {
					if (nums[a]>high1) {
						high1 =nums[a];
					}
				}
				//eliminate highest value, check for next highest
				for (int a=0;a<5;a++) {
					if (nums[a]>high2 && nums[a]<high1) {
						high2=nums[a];
					}
				}
				//eliminate highest value, check for next highest
				for (int a=0;a<5;a++) {
					if (nums[a]>high3 && nums[a]<high2) {
						high3=nums[a];
					}
				}
				//eliminate highest value, check for next highest
				for (int a=0;a<5;a++) {
					if (nums[a]>high4 && nums[a]<high3) {
						high4=nums[a];
					}
				}
				//eliminate highest value, check for next highest
				for (int a=0;a<5;a++) {
					if (nums[a]>high5 && nums[a]<high4) {
						high5=nums[a];
					}
				}
				//choosing what to output
				if (x==1) {
				System.out.println(high1);}
				if (x==2) {
				System.out.println(high2);}
				if (x==3) {
				System.out.println(high3);}
				if (x==4) {
				System.out.println(high4);}
				if (x==5) {
				System.out.println(high5);}
				else {
					System.out.println("full order");
					System.out.println(high1);
					System.out.println(high2);
					System.out.println(high3);
					System.out.println(high4);
					System.out.println(high5);
				}
		
		
		
	}
	public static int generateRandomInt() {
		int randomInt = (int) (Math.random() * ((100 - 1) + 1)) + 1;
		return randomInt;
	}
}
