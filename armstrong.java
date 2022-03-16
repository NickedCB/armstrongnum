public static void main(String[] args) {
		  int num;		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			 num=sc.nextInt();
			    	if(num==armstrong(num)) 
					System.out.println("Armstrong num");
				else
					System.out.println("not armstrong");
              
			    	
			    	System.out.println(nextarmstrong(num));	
              rangeofarm(num);
               
	}

	private static void rangeofarm(int num) {
		
		for(int i=0;i<10;i++) {
			num=nextarmstrong(num);
			System.out.println(num);
		}
	}

	public static int nextarmstrong(int num) {
		do {
		num++;
		}
		while(num!=armstrong(num));
			return num;		
	}

	public static double armstrong(int num) {
		int rem=0,times=0;
		double sum=0.0;
		int temp=num;
		while (num != 0) {
			times++;
			num = num/ 10;
		   }
		   
		while(temp!=0) {
	      rem=temp%10;
	      sum=sum+(Math.pow(rem,times));
	      temp=temp/10;
		}
		return sum;
	}
	
