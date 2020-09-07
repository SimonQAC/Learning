
public class conv {
	
	//thank you luke for making the simplest and easiest to follow code

	public void convert (int a) {
		//creating fixed output variable
		String output = "";
		
		//quad
		
		if (a >= 1000 && a <= 1999) {output =(output+"one thousand ");}
		if (a >= 2000 && a <= 2999) {output =(output+"two thousand ");}
		if (a >= 3000 && a <= 3999) {output =(output+"three thousand ");}
		if (a >= 4000 && a <= 4999) {output =(output+"four thousand ");}
		if (a >= 5000 && a <= 5999) {output =(output+"five thousand ");}
		if (a >= 6000 && a <= 6999) {output =(output+"six thousand ");}
		if (a >= 7000 && a <= 7999) {output =(output+"seven thousand ");}
		if (a >= 8000 && a <= 8999) {output =(output+"eight thousand ");}
		if (a >= 9000 && a <= 9999) {output =(output+"nine thousand ");}
		
		a = a%1000;
		
		//triple
		
		if  (a >=100 && a <=199 ) {output = (output +"one hundred ");}
		if  (a >=200 && a <=299 ) {output = (output +"two hundred ");}
		if  (a >=300 && a <=399 ) {output = (output +"three hundred ");}
		if  (a >=400 && a <=499 ) {output = (output +"four hundred ");}
		if  (a >=500 && a <=599 ) {output = (output +"five hundred ");}
		if  (a >=600 && a <=699 ) {output = (output +"six hundred ");}
		if  (a >=700 && a <=799 ) {output = (output +"seven hundred ");}
		if  (a >=800 && a <=899 ) {output = (output +"eight hundred ");}
		if  (a >=900 && a <=999 ) {output = (output +"nine hundred ");}
		
		a = a%100;
		
		//double
		
		if  (a >=20 && a <=29 ) {output = (output +"twenty ");}
		if  (a >=30 && a <=39 ) {output = (output +"thirty ");}
		if  (a >=40 && a <=49 ) {output = (output +"fourty ");}
		if  (a >=50 && a <=59 ) {output = (output +"fifthy ");}
		if  (a >=60 && a <=69 ) {output = (output +"sixty ");}
		if  (a >=70 && a <=79 ) {output = (output +"seventy ");}
		if  (a >=80 && a <=89 ) {output = (output +"eighty ");}
		if  (a >=90 && a <=99 ) {output = (output +"ninety ");}
		
		a = a%10;
		
		//teens and singles B)
		
		if  (a == 1) {output = (output +"one");}
		if  (a == 2) {output = (output +"two");}
		if  (a == 3) {output = (output +"three");}
		if  (a == 4) {output = (output +"four");}
		if  (a == 5) {output = (output +"five");}
		if  (a == 6) {output = (output +"six");}
		if  (a == 7) {output = (output +"seven");}
		if  (a == 8) {output = (output +"eight");}
		if  (a == 9) {output = (output +"nine");}
		if  (a == 10) {output = (output +"ten");}
		if  (a == 11) {output = (output +"eleven");}
		if  (a == 12) {output = (output +"twelve");}
		if  (a == 13) {output = (output +"thirteen");}
		if  (a == 14) {output = (output +"fourteen");}
		if  (a == 15) {output = (output +"fifthteen");}
		if  (a == 16) {output = (output +"sixteen");}
		if  (a == 17) {output = (output +"seventeen");}
		if  (a == 18) {output = (output +"eighteen");}
		if  (a == 19) {output = (output +"nineteen");}
		
		if ( a>= 10000 || a<=0) {System.out.println("number bad");}
		
		
		System.out.println(output);
	}
		
	
	
}