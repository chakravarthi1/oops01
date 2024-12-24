package oops01;

public class demo01 {

	public static void main(String[] args) {

				float num = 5.778966666f;
				
				num = (int)(num * 100);
				System.out.println(num);
				int r = (int)(num % 10);
				num = (int)(num / 100);
				
				if(r > 5) {
					num++;
				} 
		
				System.out.println("num--->"+num);
				
				
			}

		
		
		
		
		
 
	}


