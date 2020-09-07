
public class asda {
	public void showDetails(int bill, int paid) {
		int fifty=0, twenty=0, ten=0, five=0, two=0, one=0;
		if (paid<bill) {
			System.out.println("Not paid enough");
		}
		else {
			if ((bill/50)>=1) {
				fifty=bill/50;
				bill=bill-(fifty*50);
				System.out.println("£50: "+fifty);
				
				if (bill==0) {
					System.out.println("test");
			}
				if ((bill/20)>=1) {
					twenty=bill/20;
					bill=bill-(twenty*20);
					System.out.println("£20: "+twenty);
					
						if (bill==0) {
							System.out.println("test");
						}
						
						if ((bill/10)>=1) {
							ten=bill/10;
							bill=bill-(ten*20);
							System.out.println("£10: "+ten);
							
							if (bill==0) {
								System.out.println("test");
							}
							
							if ((bill/5)>=1) {
								five=bill/5;
								bill=bill-(five*5);
								System.out.println("£5: "+five);
								
								if (bill==0) {
									System.out.println("test");
								}
								
								if((bill/2)>=1) {
									two=bill/2;
									bill=bill-(two*2);
									System.out.println("£2: "+two);
									
										if (bill==0) {
											System.out.println("test");
										}
										if ((bill/1)>=1) {
											one=bill/1;
											bill=bill-(one*1);
											System.out.println("£1: "+one);
										}
								}
								
							}
						}
				}
			
			}
		}
	}


	public void showDetails2(int bill, int paid) {
		if (paid<bill) {
			System.out.println("Not paid enough");
		}
		int dif=paid-bill;
		System.out.println("balance due: £"+dif);
		int £50=0,£20=0,£10=0,£5=0,£2=0,£1=0;
		
		if(dif>=50) {£50=dif/50;
		dif=dif-(£50*50);
		}
		if(dif>=20) {£20=dif/20;
		dif=dif-(£20*20);
		}
		if(dif>=10) {£10=dif/10;
		dif=dif-(£10*10);
		}
		if(dif>=5) {£5=dif/5;
		dif=dif-(£5*5);
		}
		if(dif>=2) {£2=dif/2;
		dif=dif-(£2*2);
		}
		if(dif>=1) {£50=dif/1;
		dif=dif-(£1*1);
		}
		System.out.println("Change required");
		if (£50 !=0) System.out.println("£50: "+£50);
		if (£20 !=0) System.out.println("£20: "+£20);
		if (£10 !=0) System.out.println("£10: "+£10);
		if (£5 !=0) System.out.println("£5: "+£5);
		if (£2 !=0) System.out.println("£2: "+£2);
		if (£1 !=0) System.out.println("£1: "+£1);
	}
	
}	