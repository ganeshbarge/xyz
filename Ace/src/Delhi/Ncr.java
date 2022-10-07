package Delhi;

public class Ncr {
	public   int a= 10;
	         int b= 20;
	private  int c= 30;
	protected int d= 40;
	
    Ncr ()
    {
    	
    }
    Ncr (int x)
    {
    	
    }
    
	public static void main(String[] args) {
// without argument
     System.out.println(new Ncr().a);
     System.out.println(new Ncr().b);
     System.out.println(new Ncr().c);
     System.out.println(new Ncr().d);
	
  // with argument
     System.out.println(new Ncr(1).a);
     System.out.println(new Ncr(1).b);
     System.out.println(new Ncr(1).c);
     System.out.println(new Ncr(1).d);
	}

}
