class HelloWorld 
{
    public static void main(String[] args) 
    {
        int n=1,sum=0,product=1;
        while(n<=100)
        {
             if(n%2==0)
             {
                sum=sum+n;
                
             }
             else
             {
                 product=product*n;
                 
             }
             
            
        n++;
        }
        System.out.println(sum+ " even sum");
        System.out.println(product+ " odd product");
	System.out.println(" i am modified");
    }
}
                 