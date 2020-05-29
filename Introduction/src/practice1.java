public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i,j=3 ;
		for(i=0;i<args.length;i++)
		{
			try 
			{
				sum +=Integer.parseInt(args[i]);
		    }
			catch(NumberFormatException nfe)
			{
				System.err.println( j++ +"["+args[i]+"]is not an integer "+"and will not be included in the sum ." + ++j);
			}
		}
System.out.println("SUM = "+ sum) ;
	}

}
