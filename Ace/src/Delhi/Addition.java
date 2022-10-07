package Delhi;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int num = 1234;
   
   int temp;
   int count=0;
   int perm=0;
   
   while (num>0)
   {
	   temp= num%10;
	   perm= perm + temp;
	   num = num / 10;
	   count ++;
	   
   }
		System.out.println(count);
		System.out.println(perm);
		
		
		
	}

}
